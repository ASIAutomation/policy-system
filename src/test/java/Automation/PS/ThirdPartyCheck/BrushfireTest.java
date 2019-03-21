package Automation.PS.ThirdPartyCheck;
//UPDATE HERE!!!!! ryan please see this!!!!!
import java.util.concurrent.TimeUnit;

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

import Automation.PS.pages.PlanAndResidenceType;
import Automation.PS.pages.PolicyRatingPage1;
import Automation.PS.pages.RatingAndPolicyLookup;
import Automation.PS.testBase.TestBase;

@Listeners(Automation.PS.customListeners.CustomListeners.class)
public class BrushfireTest extends TestBase {

	public static final Logger log = Logger.getLogger(BrushfireTest.class.getName());

	RatingAndPolicyLookup RPL;
	PlanAndResidenceType PRT;
	PolicyRatingPage1 PRP1;
	ExtentReports extent = new ExtentReports();
	ExtentHtmlReporter reporter = new ExtentHtmlReporter("T:\\Automations\\ExtentReports\\PS\\Brushfire\\Brushfire-" + GetDateTime() + ".html");

	@DataProvider(name="Brushfire_AllPlans")
	public String[][] GetBrushfireDataCall() {
		String[][] data = GetData("Data", "Brushfire",".xlsm");
		return data;
	}	

	@BeforeTest
	public void SetUp() {
		RunBatches();
		SetLog();
			Log("====================================== Starting Brushfire Batch ======================================");
		InitAgentLogin("Chrome", "Live");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//Initialize Drivers
		RPL = new RatingAndPolicyLookup(driver);
		PRT = new PlanAndResidenceType(driver);
		PRP1 = new PolicyRatingPage1(driver);
	}

	@Test(dataProvider="Brushfire_AllPlans")
	public void RunBrushfire(String casenum, String rowid, String state, String address, String city, String zip, String plantype, String agentid) {
		reporter.config().setTheme(Theme.DARK);
		extent.attachReporter(reporter);
		ExtentTest logger=extent.createTest("BrushfireTest");
		try {
				Log("============================== Starting " + casenum + " ==============================");
			GetURL("https://policy.americanstrategic.com/Policy/Lookup.aspx");
			RPL.SelectStateForNewQuote(state + "|");
			RPL.ClickCreateNewQuote();
				Pause(1000);
			if(!driver.getPageSource().contains("Plan and Residence Type")) {
					Log(casenum + "-" + ": An error has occurred. Please try again.");
					logger.log(Status.SKIP, casenum + "-" + ": An error has occurred. Please try again.");
					Log("============================== End " + casenum + " ===================================");
				return;
			}
			PRT.TypeFirstName("Test");
			PRT.TypeLastName("Test");
			PRT.TypeLocationAddress(address);
			PRT.TypeCity(city);
			PRT.TypeZip(zip);
			PRT.SelectPlanType(plantype);
			PRT.SelectResidenceType("Single Family");
			PRT.CheckKnockouts();
			PRT.ClickNextAndCheckOverrides();
				Pause(1000);
			PRP1.SelectAgent(agentid);
			String policyid = PRP1.ReturnPolicyID();
			String brushfire = PRP1.ReturnBrushfireScore();
			PRP1.ClickSave();
			if(!driver.getPageSource().contains("Policy Documents")) {
					Log(casenum + "-" + ": contains edits. Please take closer look.");
					logger.log(Status.SKIP, casenum + "-" + ": contains edits. Please take closer look.");
					Log("============================== End " + casenum + " ===================================");
			}
			else {
					Log(casenum + "-" + policyid + "-" + brushfire);
					logger.log(Status.PASS, casenum + "-" + policyid + "-" + brushfire);
					Log("============================== End " + casenum + " ===================================");
				
			}
		}
		catch(Exception e) {
			GetFailScreenShot(casenum + "-Buildfax_Error");
				Log(casenum + "-" + ": Script has failed. Please rerun.");
				logger.log(Status.FAIL, casenum + "-" + ": Script has failed. Please rerun.");
				Log("============================== End " + casenum + " ===================================");			
		}
	}
	
	@AfterTest
	public void EndBatch() {
		QuitBrowser();
		extent.flush();
			Log("====================================== End Brushfire Batch ===========================================");
	}
}