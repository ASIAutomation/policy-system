package Automation.PS.MISC;

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
import Automation.PS.pages.NonDollarEndorsement;
import Automation.PS.pages.PolicyHistory;
import Automation.PS.pages.RenewalEndorsement;
import Automation.PS.testBase.TestBase;

@Listeners(Automation.PS.customListeners.CustomListeners.class)
public class PPD_NON_DOL_ENDORSE extends TestBase {
	
	public static final Logger log = Logger.getLogger(PPD_NON_DOL_ENDORSE.class.getName());
	
	PolicyHistory PH;
	RenewalEndorsement RE;
	NonDollarEndorsement NDE;
	ExtentReports extent = new ExtentReports();
	ExtentHtmlReporter reporter = new ExtentHtmlReporter("T:\\Automations\\ExtentReports\\PS\\PPD_NON_DOL_ENDORSE\\PPD_NON_DOL_ENDORSE-" + GetDateTime() + ".html");
	
	@DataProvider(name="PPD_NON_DOL_ENDORSE")
	public String[][] GetPPPD_NON_DOL_ENDORSEDataCall() {
		String[][] data = GetData("Data", "PPD_NON_DOL_ENDORSE", ".xlsx");
		return data;
	}	
	
	@BeforeTest
	public void SetUp() {
		RunBatches();
		SetLog();
			Log("====================================== Starting PPD_NON_DOL_ENDORSE Batch ======================================");
		InitAgentLogin("Chrome", "Live");
		//Initialize Drivers
		PH = new PolicyHistory(driver);
		RE = new RenewalEndorsement(driver);
		NDE = new NonDollarEndorsement(driver);
	}
	
	@Test(dataProvider="PPD_NON_DOL_ENDORSE")
	public void RunPPD_NON_DOL_ENDORSE(String casenum, String policyid, String inceptiondate, String autopolicynum) throws InterruptedException {
		reporter.config().setTheme(Theme.DARK);
		extent.attachReporter(reporter);
		ExtentTest logger=extent.createTest("PPD_NON_DOL_ENDORSE");
		try {
				Log("============================== Starting " + casenum + " ==============================");
			GetURL("https://policy.americanstrategic.com/Policy/History.aspx?PolicyID=" + policyid + "&InceptionDate=" + inceptiondate);
			if(driver.getPageSource().contains("There was an error working with your policy")) {
					Log(casenum + "-" + policyid + ": term does not currently exist.");
					logger.log(Status.SKIP,  casenum + "-" + policyid + ": term does not currently exist.");
					Log("============================== End " + casenum + " ===================================");
				return;	
				
			}
			else if(PH.ReturnPolicyStatus("N").equals("Cancelled")) {
					Log(casenum + "-" + policyid + ": is a cancelled.");
					logger.log(Status.SKIP,  casenum + "-" + policyid + ": is a cancelled.");
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
				RE = new RenewalEndorsement(driver);
				NDE = new NonDollarEndorsement(driver);
				return;			
			}
			NDE.SelectCurrentAutoInsurer("Progressive");
			NDE.TypeAutoPolicyNum(autopolicynum);
			NDE.SelectTransactionDescr("Other");
			NDE.SelectAgentUserNameByIndex(1);
			NDE.TypeNotes("Updated Auto Insurance Information");
			if(!policyid.toUpperCase().equals(NDE.ReturnPolicyID())) {
					Log(casenum + "-" + policyid + ": can not verify policyid.");
					logger.log(Status.FAIL,  casenum + "-" + policyid + ": can not verify policyid.");
					Log("============================== End " + casenum + " ===================================");
				return;				
			}
			NDE.ClickIssuePolicy();
			if(driver.getPageSource().contains("Non Dollar Endorsement")) {
					Log(casenum + "-" + policyid + ": contains edits. Please take closer look: " + NDE.ReturnEditText("N"));
					logger.log(Status.SKIP,  casenum + "-" + policyid + ": contains edits. Please take closer look: " + NDE.ReturnEditText("N"));
			}
			else {
			        Log(casenum + "-" + policyid + ": completed and changed to Progressive #" + autopolicynum + ".");
			        logger.log(Status.PASS,  casenum + "-" + policyid + ": completed and changed to Progressive #" + autopolicynum + ".");
			}
				Log("============================== End " + casenum + " ===================================");
		}
		catch(Exception e) {
				logger.log(Status.FAIL,  casenum + "-" + policyid + ": Script has failed. Please rerun.");
				Log("============================== End " + casenum + " ===================================");			
		}
	}
	
	@AfterTest
	public void EndBatch() {
		QuitBrowser();
		extent.flush();
			Log("====================================== End PPD_NON_DOL_ENDORSE Batch ===========================================");
	}
}