package Automation.PS.STATES.FL;

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
import Automation.PS.pages.PolicyPremiums;
import Automation.PS.pages.PolicyRatingPage1;
import Automation.PS.pages.PolicyRatingPage2;
import Automation.PS.pages.RatingAndPolicyLookup;
import Automation.PS.testBase.TestBase;

@Listeners(Automation.PS.customListeners.CustomListeners.class)
public class FL_CLOSED_ZIPS extends TestBase {
	
	public static final Logger log = Logger.getLogger(FL_CLOSED_ZIPS.class.getName());
	
	RatingAndPolicyLookup RPL;
	PlanAndResidenceType PRT;
	PolicyRatingPage1 PRP1;
	PolicyRatingPage2 PRP2;
	PolicyPremiums PP;	
	String HO3 = "Y";
	String DP3 = "Y";
	String NH3 = "Y";
	String NH6 = "Y";
	ExtentReports extent = new ExtentReports();
	ExtentHtmlReporter reporter = new ExtentHtmlReporter("T:\\Automations\\ExtentReports\\PS\\FL_CLOSED_ZIPS\\FL_CLOSED_ZIPS-" + GetDateTime() + ".html");
	
	@DataProvider(name="FL_CLOSED_ZIPS")
	public String[][] GetFL_CLOSED_ZIPSDataCall() {
		String[][] data = GetData("Data", "FL_CLOSED_ZIPS", ".xlsx");
		return data;
	}	
	
	@BeforeTest
	public void SetUp() {
		RunBatches();
		SetLog();
			Log("====================================== Starting FL_CLOSED_ZIPS Batch ======================================");
		InitAgentLogin("Chrome", "Live");
		RPL = new RatingAndPolicyLookup(driver);
		PRT = new PlanAndResidenceType(driver);
		PRP1 = new PolicyRatingPage1(driver);
		PRP2 = new PolicyRatingPage2(driver);
		PP = new PolicyPremiums(driver);
	
	}
	
	@Test(dataProvider="FL_CLOSED_ZIPS")
	public void RunFL_CLOSED_ZIPS(String casenum, String zip, String county) throws InterruptedException {
		reporter.config().setTheme(Theme.DARK);
		extent.attachReporter(reporter);
		ExtentTest logger=extent.createTest("FL_CLOSED_ZIPS");
		try {
				Log("============================== Starting " + "casenum" + " ==============================");
			if(HO3.equals("Y")) {
				GetURL("https://policy.americanstrategic.com/Policy/Lookup.aspx");
				RPL.SelectState("FL");
				RPL.ClickCreateNewQuote();
				PRT.TypeFirstName("TestFirst");
				PRT.TypeLastName("TestLast");
				PRT.TypeLocationAddress("1234 Test Drive");
				PRT.TypeCity("TestCity");
				PRT.TypeZip(zip);
				PRT.SelectPlanType("[FL] HO3 - ASI Preferred");
				PRT.SelectExcludeWind("No");
				PRT.SelectResidenceType("Single Family");
				PRT.CheckKnockouts();
				PRT.ClickNext();
				PRT.ReturnEdits("N");
				PRT.CheckOverrideAddress();
				PRT.CheckOverrideAddressScrubber();
				PRT.TypeOverrideNotes("FL - closed zip test");
				PRT.ClickNext();
				PRT.ClickSplitTerritory(county);
				
				
			}
			if(DP3.equals("Y")) {
				GetURL("https://policy.americanstrategic.com/Policy/Lookup.aspx");
			}
			if(NH3.equals("Y")) {
				GetURL("https://policy.americanstrategic.com/Policy/Lookup.aspx");
			}
			if(NH6.equals("Y")) {
				GetURL("https://policy.americanstrategic.com/Policy/Lookup.aspx");
			}
				Log("============================== End " + "casenum" + " ===================================");
		}
		catch(Exception e) {
				Log("casenum" + ": Script has failed. Please rerun.");
				logger.log(Status.FAIL, "casenum" + ": Script has failed. Please rerun.");
				Log("============================== End " + "casenum" + " ===================================");			
		}
	}
	
	@AfterTest
	public void EndBatch() {
		QuitBrowser();
		extent.flush();
			Log("====================================== End FL_CLOSED_ZIPS Batch ===========================================");
	}
}







