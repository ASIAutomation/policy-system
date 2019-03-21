package Automation.PS.MISC;

import java.util.concurrent.TimeUnit;
import org.apache.log4j.Logger;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import Automation.PS.pages.ApplicationPage;
import Automation.PS.pages.PolicyPremiums;
import Automation.PS.pages.PolicyRatingPage1;
import Automation.PS.pages.PolicyRatingPage2;
import Automation.PS.testBase.TestBase;

@Listeners(Automation.PS.customListeners.CustomListeners.class)
public class OL_ENDORSE extends TestBase {
	
	public static final Logger log = Logger.getLogger(OL_ENDORSE.class.getName());
	
	PolicyRatingPage1 PRP1;
	PolicyRatingPage2 PRP2;
	PolicyPremiums PP;
	ApplicationPage AP;
	
	@DataProvider(name="OL_ENDORSE")
	public String[][] GetOL_ENDORSEDataCall() {
		String[][] data = GetData("Data", "OL_ENDORSE", ".xlsx");
		return data;
	}	
	
	@BeforeTest
	public void SetUp() {
		RunBatches();
		SetLog();
			Log("====================================== Starting OL_ENDORSE Batch ======================================");
		InitAgentLogin("Chrome", "Live");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//Initialize Drivers
		PRP1 = new PolicyRatingPage1(driver);
		PRP2 = new PolicyRatingPage2(driver);
		PP = new PolicyPremiums(driver);
		AP = new ApplicationPage(driver);
	}
	
	@Test(dataProvider="OL_ENDORSE")
	public void RunOL_ENDORSE(String casenum, String policyid, String inceptiondate, String olvalue) {
			Log("============================== Starting " + casenum + " ==============================");
		GetURL("https://policy.americanstrategic.com/Policy/Rating1.aspx?PolicyID=" + policyid + "&InceptionDate=" + inceptiondate + "&S=S");
		if(PRP1.ClickNextAndConfirmEdits(casenum, policyid).equals("edits")) {
			Log("============================== End " + casenum + " ===================================");
			return;
		}
		PRP2.SelectOrCheckOrdinanceOrLaw(olvalue, "Y");
		if(PRP2.ClickNextAndConfirmEdits(casenum, policyid).equals("edits")) {
			Log("============================== End " + casenum + " ===================================");
			return;
		}
		PP.ClickOverride();
		AP.SelectTransactionDescr("Other");
		AP.SelectAgentUserNameByIndex(1);
		AP.TypeNotes("KB FL: O&L endorsement");
		AP.ClickIssuePolicy();		
		if(driver.getPageSource().contains("Policy Documents") && driver.getPageSource().contains("Homeowners Policy Documents")) {
			Log(casenum + "-" + policyid + ": completed and changed to " + olvalue);
		}
		else {
			Log(casenum + "-" + policyid + ": unable to finish. Edits:" + AP.ReturnEditText("N"));
		}
			Log("============================== End " + casenum + " ===================================");		
	}
	
	@AfterTest
	public void EndBatch() {
		QuitBrowser();
			Log("====================================== End OL_ENDORSE Batch ===========================================");
	}
}