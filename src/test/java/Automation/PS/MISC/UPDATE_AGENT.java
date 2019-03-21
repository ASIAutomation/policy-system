package Automation.PS.MISC;

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
import Automation.PS.pages.ApplicationPage;
import Automation.PS.pages.PlanAndResidenceType;
import Automation.PS.pages.PolicyPremiums;
import Automation.PS.pages.PolicyRatingPage1;
import Automation.PS.pages.PolicyRatingPage2;
import Automation.PS.pages.RatingAndPolicyLookup;
import Automation.PS.testBase.TestBase;

@Listeners(Automation.PS.customListeners.CustomListeners.class)
public class UPDATE_AGENT extends TestBase {
	
	public static final Logger log = Logger.getLogger(UPDATE_AGENT.class.getName());
	
	RatingAndPolicyLookup RPL;
	PlanAndResidenceType PRT;
	PolicyRatingPage1 PRP1;
	PolicyRatingPage2 PRP2;
	PolicyPremiums PP;
	ApplicationPage AP;
	ExtentReports extent = new ExtentReports();
	ExtentHtmlReporter reporter = new ExtentHtmlReporter("T:\\Automations\\ExtentReports\\PS\\UPDATE_AGENT\\UPDATE_AGENT-" + GetDateTime() + ".html");
	
	@DataProvider(name="UPDATE_AGENT")
	public String[][] GetUPDATE_AGENTDataCall() {
		String[][] data = GetData("Data", "UPDATE_AGENT", ".xlsx");
		return data;
	}	
	
	@BeforeTest
	public void SetUp() {
		RunBatches();
		SetLog();
			Log("====================================== Starting UPDATE_AGENT Batch ======================================");
		InitAgentLogin("Chrome", "Live");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//Initialize Drivers
		RPL = new RatingAndPolicyLookup(driver);
		PRT = new PlanAndResidenceType(driver);
		PRP1 = new PolicyRatingPage1(driver);
		PRP2 = new PolicyRatingPage2(driver);
		PP = new PolicyPremiums(driver);
		AP = new ApplicationPage(driver);
	}
	
	@Test(dataProvider="UPDATE_AGENT")
	public void RunUPDATE_AGENT(String casenum, String policyid, String agent) {
		reporter.config().setTheme(Theme.DARK);
		extent.attachReporter(reporter);
		ExtentTest logger=extent.createTest("UPDATE_AGENT");
		try {
				Log("============================== Starting " + casenum + " ==============================");
			GetURL("https://policy.americanstrategic.com/Policy/Lookup.aspx");
			RPL.TypeQuotePolicy(policyid);
			RPL.ClickLookup();
			if(!driver.getPageSource().contains("Plan and Residence Type")) {
					Log(casenum + "-" + policyid + ": This quote was bound");
					logger.log(Status.SKIP, casenum + "-" + policyid + ": This quote was bound");
					Log("============================== End " + casenum + " ===================================");
				return;
			}
			PRT.ClickNext();
			if(driver.getPageSource().contains("This address has a split protection class")) {
				PRT.SelectSplitPC();
			}
			PRP1.SelectAgent(agent);
			PRP1.ClickSave();
			if(driver.getPageSource().contains("Policy Documents") ) {
				Log(casenum + "-" + policyid + ": agent updated successfully to: " + agent);
				logger.log(Status.PASS, casenum + "-" + policyid + ": agent updated successfully to: " + agent);
			}
			else {
				Log(casenum + "-" + policyid + ": unable to update agent. Edits on page: " + PRP1.ReturnEdits("N"));
			}
				Log("============================== End " + casenum + " ===================================");		
		}
		catch(Exception e) {
				GetFailScreenShot(casenum + "-UPDATE_AGENT_Error");
				Log(casenum + "-" + policyid + ": Script has failed. Please rerun.");
				logger.log(Status.FAIL, casenum + "-" + policyid + ": Script has failed. Please rerun.");
				Log("============================== End " + casenum + " ===================================");			
		}
	}
	
	@AfterTest
	public void EndBatch() {
		QuitBrowser();
		extent.flush();
			Log("====================================== End UPDATE_AGENT Batch ===========================================");
	}
}