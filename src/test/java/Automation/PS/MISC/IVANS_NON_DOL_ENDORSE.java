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
import Automation.PS.pages.RatingAndPolicyLookup;
import Automation.PS.testBase.TestBase;

@Listeners(Automation.PS.customListeners.CustomListeners.class)
public class IVANS_NON_DOL_ENDORSE extends TestBase {
	
	public static final Logger log = Logger.getLogger(IVANS_NON_DOL_ENDORSE.class.getName());
	
	RatingAndPolicyLookup RPL;
	PolicyHistory PH;
	NonDollarEndorsement NDE;
	ExtentReports extent = new ExtentReports();
	ExtentHtmlReporter reporter = new ExtentHtmlReporter("T:\\Automations\\ExtentReports\\PS\\IVANS_NON_DOL_ENDORSE\\IVANS_NON_DOL_ENDORSE-" + GetDateTime() + ".html");
	
	@DataProvider(name="IVANS_NON_DOL_ENDORSE")
	public String[][] GetIVANS_NON_DOL_ENDORSEDataCall() {
		String[][] data = GetData("Data", "IVANS_NON_DOL_ENDORSE", ".xlsx");
		return data;
	}	
	
	@BeforeTest
	public void SetUp() {
		RunBatches();
		SetLog();
			Log("====================================== Starting IVANS_NON_DOL_ENDORSE Batch ======================================");
		InitAgentLogin("Chrome", "Live");
		//Initialize Drivers
		RPL= new RatingAndPolicyLookup(driver);
		PH = new PolicyHistory(driver);
		NDE = new NonDollarEndorsement(driver);
	}
	
	@Test(dataProvider="IVANS_NON_DOL_ENDORSE")
	public void RunIVANS_NON_DOL_ENDORSE(String casenum, String policyid) throws InterruptedException {
		reporter.config().setTheme(Theme.DARK);
		extent.attachReporter(reporter);
		ExtentTest logger=extent.createTest("IVANS_NON_DOL_ENDORSE");
		try {
				Log("============================== Starting " + casenum + " ==============================");
			GetURL("https://policy.americanstrategic.com/Policy/Lookup.aspx");
			RPL.TypeQuotePolicy(policyid);
			RPL.ClickLookup();
			if(driver.getPageSource().contains("Create a New Quote")) {
				RPL.ClickPolicyLink(policyid);
			}
			/*if(PH.ReturnPolicyStatus("N").equals("Cancelled")) {
					Log(casenum + "-" + policyid + ": is a cancelled.");
					logger.log(Status.SKIP,  casenum + "-" + policyid + ": is a cancelled.");
					Log("============================== End " + casenum + " ===================================");
				return;			
			}*/
			PH.ClickNonDollarEndorse();
			if(!driver.getPageSource().contains("Non Dollar Endorsement")) {
					Log(casenum + "-" + policyid + ": unable to load Non Dollar Endorsement page.");
					logger.log(Status.FAIL,  casenum + "-" + policyid + ": unable to load Non Dollar Endorsement page.");
					Log("============================== End " + casenum + " ===================================");
				QuitBrowser();
				InitAgentLogin("Chrome", "Live");
				//Initialize Drivers
				RPL= new RatingAndPolicyLookup(driver);
				PH = new PolicyHistory(driver);
				NDE = new NonDollarEndorsement(driver);
				return;			
			}
			NDE.SelectTransactionDescr("Other");
			NDE.SelectAgentUserNameByIndex(1);
			NDE.TypeNotes("Processed for Download");
			NDE.ClickIssuePolicy();
			if(driver.getPageSource().contains("Non Dollar Endorsement")) {
				NDE.ClickOverride();
				if(driver.getPageSource().contains("Non Dollar Endorsement")) {
					 	Log(casenum + "-" + policyid + ": Contains Edits: " + NDE.ReturnEditText("N") + ".");
					 	logger.log(Status.PASS,  casenum + "-" + policyid + ": Contains Edits: " + NDE.ReturnEditText("N") + ".");
				}
				else {
						Log(casenum + "-" + policyid + ": completed Non Dollar Endorsement.");
						logger.log(Status.PASS,  casenum + "-" + policyid + ": completed Non Dollar Endorsement.");
				}
			}
			else {
					Log(casenum + "-" + policyid + ": completed Non Dollar Endorsement.");
					logger.log(Status.PASS,  casenum + "-" + policyid + ": completed Non Dollar Endorsement.");
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
			Log("====================================== End IVANS_NON_DOL_ENDORSE Batch ===========================================");
	}
}