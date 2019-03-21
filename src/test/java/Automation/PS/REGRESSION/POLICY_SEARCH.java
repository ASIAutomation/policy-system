package Automation.PS.REGRESSION;

import java.util.concurrent.TimeUnit;
import org.apache.log4j.Logger;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import Automation.PS.pages.AgencyPortal;
import Automation.PS.pages.RatingAndPolicyLookup;
import Automation.PS.testBase.TestBase;

public class POLICY_SEARCH extends TestBase {
	
	public static final Logger log = Logger.getLogger(POLICY_SEARCH.class.getName());
	
	AgencyPortal AP;
	RatingAndPolicyLookup RPL;
	ExtentReports extent = new ExtentReports();
	ExtentHtmlReporter reporter = new ExtentHtmlReporter("T:\\Automations\\ExtentReports\\POLICY_SEARCH\\POLICY_SEARCH-" + GetDateTime() + ".html");
	
	@DataProvider(name="POLICY_SEARCH")
	public String[][] GetPOLICY_SEARCHDataCall() {
		String[][] data = GetData("Data", "POLICY_SEARCH", ".xlsx");
		return data;
	}	

	@BeforeTest
	public void SetUp() {
		RunBatches();
		SetLog();
			Log("====================================== Starting POLICY_SEARCH Batch ======================================");
		InitAgentLogin("Chrome", "Live");
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		//Initialize Drivers
		AP = new AgencyPortal(driver);
		RPL = new RatingAndPolicyLookup(driver);
	}
	
	@Test(dataProvider="POLICY_SEARCH")
	public void RunPOLICY_SEARCH(String casenum, String policyid) {
		reporter.config().setTheme(Theme.DARK);
		extent.attachReporter(reporter);
		ExtentTest logger=extent.createTest("POLICY_SEARCH");
			Log("============================== Starting " + casenum + " ==============================");
		GetURL("https://policy.americanstrategic.com/Policy/Menu.aspx");
		AP.ClickLookup();
		RPL.TypeQuotePolicy(policyid);
		RPL.ClickLookup();
		Log(casenum + "-" + policyid + ": searched for policy ID");
		logger.log(Status.PASS,  casenum+" Searched Policy ID successfully completed");
			Log("============================== End " + casenum + " ===================================");	
	}
	
	@AfterTest
	public void EndBatch() {
		QuitBrowser();
		extent.flush();
			Log("====================================== End POLICY_SEARCH Batch ===========================================");
	}
}