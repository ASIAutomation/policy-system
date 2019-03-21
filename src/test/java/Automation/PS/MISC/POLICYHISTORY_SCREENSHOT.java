package Automation.PS.MISC;

import java.awt.AWTException;
import org.apache.log4j.Logger;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import Automation.PS.pages.PolicyHistory;
import Automation.PS.pages.RatingAndPolicyLookup;
import Automation.PS.testBase.TestBase;

@Listeners(Automation.PS.customListeners.CustomListeners.class)
public class POLICYHISTORY_SCREENSHOT extends TestBase {
	
	public static final Logger log = Logger.getLogger(POLICYHISTORY_SCREENSHOT.class.getName());
	
	RatingAndPolicyLookup RPL;
	PolicyHistory PH;
	
	@DataProvider(name="POLICYHISTORY_SCREENSHOT")
	public String[][] GetPOLICYHISTORY_SCREENSHOTDataCall() {
		String[][] data = GetData("Data", "POLICYHISTORY_SCREENSHOT", ".xlsx");
		return data;
	}	
	
	@BeforeTest
	public void SetUp() {
		RunBatches();
		SetLog();
			Log("====================================== Starting POLICYHISTORY_SCREENSHOT Batch ======================================");
		InitAgentLogin("Chrome", "Live");
		//Initialize Drivers
		RPL = new RatingAndPolicyLookup(driver);
		PH = new PolicyHistory(driver);

	}
	
	@Test(dataProvider="POLICYHISTORY_SCREENSHOT")
	public void RunPOLICYHISTORY_SCREENSHOT(String casenum, String policyid) throws AWTException {
			Log("============================== Starting " + casenum + " ==============================");
		GetURL("https://policy.americanstrategic.com/Policy/Lookup.aspx");
		RPL.TypeQuotePolicy(policyid);
		RPL.ClickLookup();
		if(driver.getPageSource().contains("Create a New Quote")) {
			RPL.ClickPolicyLink(policyid);
		}
		String url = driver.getCurrentUrl();
		PH.ClickPolicyStatusMenu();
		GetScreenShotOther(policyid + "-POLICY_STATUS","T:\\dcohen\\Screenshots\\");
		GetURL(url);
		PH.ClickCoverageInformation();
		SetZoom("0.93");
		GetScreenShotOther(policyid + "-COVERAGE_INFORMATION","T:\\dcohen\\Screenshots\\test\\");		
			Log("============================== End " + casenum + " ===================================");		
	}
	
	@AfterTest
	public void EndBatch() {
		QuitBrowser();
			Log("====================================== End POLICYHISTORY_SCREENSHOT Batch ===========================================");
	}
}