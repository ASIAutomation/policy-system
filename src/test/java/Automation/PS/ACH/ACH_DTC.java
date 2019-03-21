package Automation.PS.ACH;

import org.apache.log4j.Logger;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import Automation.PS.testBase.TestBase;
import Automation.PS.pages.PolicyHistory;
import Automation.PS.pages.NonDollarEndorsement;

@Listeners(Automation.PS.customListeners.CustomListeners.class)
public class ACH_DTC extends TestBase {
	public static final Logger log = Logger.getLogger(ACH_DTC.class.getName());

	PolicyHistory PH;
	NonDollarEndorsement NDE;
	ExtentReports extent = new ExtentReports();
	ExtentHtmlReporter reporter = new ExtentHtmlReporter("T:\\Automations\\ExtentReports\\PS\\ACH_DTC\\ACH_DTC-" + GetDateTime() + ".html");

	@DataProvider(name="ACH_DTC")
	public String[][] GetACH_DTCDataCall() {
		String[][] data = GetData("Data", "ACH_DTC", ".xlsx");
		return data;
	}	

	@BeforeTest
	public void SetUp() {
		RunBatches();
		SetLog();
			Log("====================================== Starting ACH_DTC Batch ======================================");
		InitAgentLogin("Chrome", "Live");
		//Initialize Drivers
		PH = new PolicyHistory(driver);
		NDE = new NonDollarEndorsement(driver);
	}

	@Test(dataProvider="ACH_DTC")
	public void RunACH_DTC(String casenum, String policyid, String inceptdate) {
		reporter.config().setTheme(Theme.DARK);
		extent.attachReporter(reporter);
		ExtentTest logger=extent.createTest("ACH_DTC");
		try {
				Log("============================== Starting " + casenum + " ==============================");
			//History Page
			GetURL("https://policy.americanstrategic.com/Policy/History.aspx?PolicyID=" + policyid + "&InceptionDate=" + inceptdate);	
			if(driver.getPageSource().contains("There was an error working with your policy")) {
					Log(casenum + "-" + policyid + ": term does not currently exist.");
					logger.log(Status.SKIP,  casenum + "-" + policyid + ": term does not currently exist.");
					Log("============================== End " + casenum + " ===================================");
				return;	
			}
			if(PH.ReturnPolicyStatus("N").equals("Cancelled")) {
					Log(casenum + "-" + policyid + ": is a cancelled.");
					logger.log(Status.SKIP, casenum + "-" + policyid + ": is a cancelled.");
					Log("============================== End " + casenum + " ===================================");
				return;			
			}
			PH.ClickNonDollarEndorse();
			if(!driver.getPageSource().contains("Non Dollar Endorsement")) {
					Log(casenum + "-" + policyid + ": unable to load Non Dollar Endorsement page.");
					logger.log(Status.FAIL,  casenum + "-" + policyid + ": unable to load Non Dollar Endorsement page.");
					Log("============================== End " + casenum + " ===================================");
				QuitBrowser();
				InitAgentLogin("Chrome", "Live");
				//Initialize Drivers
				PH = new PolicyHistory(driver);
				NDE = new NonDollarEndorsement(driver);
				return;			
			}
			NDE.SelectTransactionDescr("Change Pay Plan");
			NDE.SelectNumberPayments("4");
			NDE.SelectSuppressDec("No");
			NDE.TypeNotes("Due to ACH return, policy switched to 4-pay.");
			NDE.ClickIssuePolicy();
			if(driver.getPageSource().contains("Non Dollar Endorsement")) {
				NDE.ClickOverride();
				if (driver.getPageSource().contains("Non Dollar Endorsement")) {
						Log(casenum + "-" + policyid + ": contains edits. Please take closer look.");
						logger.log(Status.SKIP,  casenum + "-" + policyid + ": contains edits. Please take closer look.");
				}
				else {
						Log(casenum + "-" + policyid + ": Non-Dollar Endorsement has posted.");
						logger.log(Status.PASS,  casenum + "-" + policyid + ": Non-Dollar Endorsement has posted.");
				}			
			}
			else {
					Log(casenum + "-" + policyid + ": Non-Dollar Endorsement has posted.");
					logger.log(Status.PASS,  casenum + "-" + policyid + ": Non-Dollar Endorsement has posted.");
			}			
				Log("============================== End " + casenum + " ===================================");
		}
		catch(Exception e) {
			GetFailScreenShot(casenum + "-ACH_DTC");
				Log(casenum + "-" + ": Script has failed. Please rerun.");
				logger.log(Status.FAIL,  casenum + "-" + policyid + ": Script has failed. Please rerun.");
				Log("============================== End " + casenum + " ===================================");
		}
	}

	@AfterTest
	public void EndBatch() {
		QuitBrowser();
		extent.flush();
			Log("====================================== End ACH_DTC Batch ===========================================");
	}
}