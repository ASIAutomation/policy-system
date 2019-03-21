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

import Automation.PS.pages.NSFProcessing;
import Automation.PS.testBase.TestBase;

@Listeners(Automation.PS.customListeners.CustomListeners.class)
public class ACH_NSF extends TestBase {
	
	public static final Logger log = Logger.getLogger(ACH_NSF.class.getName());
	
	NSFProcessing NSF;
	ExtentReports extent = new ExtentReports();
	ExtentHtmlReporter reporter = new ExtentHtmlReporter("T:\\Automations\\ExtentReports\\PS\\ACH_NSF\\ACH_NSF-" + GetDateTime() + ".html");
	
	@DataProvider(name="ACH_NSF")
	public String[][] GetACH_NSFDataCall() {
		String[][] data = GetData("Data", "ACH_NSF", ".xlsx");
		return data;
	}	
	
	@BeforeTest
	public void SetUp() {
		RunBatches();
		SetLog();
			Log("====================================== Starting ACH_NSF Batch ======================================");
		InitAgentLogin("Chrome", "Live");
		GetURL("https://policy.americanstrategic.com/CashPosting/Lookup_NSF.aspx");
		//Initialize Drivers
		NSF = new NSFProcessing(driver);
	}
	
	@Test(dataProvider="ACH_NSF")
	public void RunACH_NSF(String casenum, String policyid, String authcode) {
		reporter.config().setTheme(Theme.DARK);
		extent.attachReporter(reporter);
		ExtentTest logger=extent.createTest("ACH_NSF");
		try {
				Log("============================== Starting " + casenum + " ==============================");
			NSF.TypePolicy(policyid);
			NSF.ClickLookup();
			NSF.ClickPostNSF(authcode);	
				logger.log(Status.PASS,  casenum + "-" + policyid + ": completed.");
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
			Log("====================================== End ACH_NSF Batch ===========================================");
	}
}