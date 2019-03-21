package Automation.PS.MISC;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import Automation.PS.pages.PolicyHistory;
import Automation.PS.pages.RenewalEndorsement;
import Automation.PS.testBase.TestBase;

@Listeners(Automation.PS.customListeners.CustomListeners.class)
public class OL_RN_ENDORSE extends TestBase {
	
	public static final Logger log = Logger.getLogger(OL_RN_ENDORSE.class.getName());
	
	PolicyHistory PH;
	RenewalEndorsement RE;
	
	@DataProvider(name="OL_RN_ENDORSE")
	public String[][] GetOL_RN_ENDORSEDataCall() {
		String[][] data = GetData("Data", "OL_RN_ENDORSE", ".xlsx");
		return data;
	}	
	
	@BeforeTest
	public void SetUp() {
		RunBatches();
		SetLog();
			Log("====================================== Starting OL_RN_ENDORSE Batch ======================================");
		InitAgentLogin("Chrome", "Live");
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		//Initialize Drivers
		PH = new PolicyHistory(driver);
		RE = new RenewalEndorsement(driver);
	}
	
	@Test(dataProvider="OL_RN_ENDORSE")
	public void RunOL_RN_ENDORSE(String casenum, String policyid, String inceptiondate, String olvalue) throws InterruptedException {
			Log("============================== Starting " + casenum + " ==============================");
		GetURL("https://policy.americanstrategic.com/Policy/History.aspx?PolicyID=" + policyid + "&InceptionDate=" + inceptiondate);
		if(PH.ReturnPolicyStatus("N").equals("Cancelled")) {
			Log(casenum + "-" + policyid + ": is a cancelled");
			Log("============================== End " + casenum + " ===================================");
			return;			
		}
		PH.ClickRNEndorse();
		RE.SelectOrdinanceOrLaw(olvalue);
		RE.ClickPostEndorsement();
		if(driver.getPageSource().contains("Post Endorsement")) {
			Log(casenum + "-" + policyid + ": contains edits. Please take closer look");
		}
		else {
			Log(casenum + "-" + policyid + ": completed and changed to " + olvalue);
		}
			Log("============================== End " + casenum + " ===================================");		
	}
	
	@AfterTest
	public void EndBatch() {
		QuitBrowser();
			Log("====================================== End OL_RN_ENDORSE Batch ===========================================");
	}
}