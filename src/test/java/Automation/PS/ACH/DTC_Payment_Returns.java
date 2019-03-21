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

@Listeners(Automation.PS.customListeners.CustomListeners.class)
public class DTC_Payment_Returns extends TestBase {
	
	public static final Logger log = Logger.getLogger(DTC_Payment_Returns.class.getName());
	
	ExtentReports extent = new ExtentReports();
	ExtentHtmlReporter reporter = new ExtentHtmlReporter("T:\\Automations\\ExtentReports\\PS\\DTC_Payment_Returns\\DTC_Payment_Returns-" + GetDateTime() + ".html");
	
	@DataProvider(name="DTC_Payment_Returns")
	public String[][] GetDTC_Payment_ReturnsDataCall() {
		String[][] data = GetData("Data", "DTC_Payment_Returns", ".xlsx");
		return data;
	}	
	
	@BeforeTest
	public void SetUp() {
		RunBatches();
		SetLog();
			Log("====================================== Starting DTC_Payment_Returns Batch ======================================");
		//Initialize Drivers
	}
	
	@Test//(dataProvider="DTC_Payment_Returns")
	public void RunDTC_Payment_Returns(/*String casenum, String policyid*/) throws InterruptedException {
		reporter.config().setTheme(Theme.DARK);
		extent.attachReporter(reporter);
		ExtentTest logger=extent.createTest("DTC_Payment_Returns");
		try {
				Log("============================== Starting " + "casenum" + " ==============================");
				Log("============================== End " + "casenum" + " ===================================");
		}
		catch(Exception e) {
				GetFailScreenShot("casenum" + "-DTC_Payment_Returns_Error");
				logger.log(Status.FAIL, "casenum" + "-" + "policyid" + ": Script has failed. Please rerun.");
				Log("============================== End " + "casenum" + " ===================================");			
		}
	}
	
	@AfterTest
	public void EndBatch() {
		QuitBrowser();
		extent.flush();
			Log("====================================== End DTC_Payment_Returns Batch ===========================================");
	}
}