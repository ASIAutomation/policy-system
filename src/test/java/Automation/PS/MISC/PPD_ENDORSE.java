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
public class PPD_ENDORSE extends TestBase {
	
	public static final Logger log = Logger.getLogger(PPD_ENDORSE.class.getName());
	
	PolicyRatingPage1 PRP1;
	PolicyRatingPage2 PRP2;
	PolicyPremiums PP;
	ApplicationPage AP;
	
	@DataProvider(name="PPD_ENDORSE")
	public String[][] GetPPD_ENDORSEDataCall() {
		String[][] data = GetData("Data", "PPD_ENDORSE", ".xlsx");
		return data;
	}	
	
	@BeforeTest
	public void SetUp() {
		RunBatches();
		SetLog();
			Log("====================================== Starting PPD_ENDORSE Batch ======================================");
		InitAgentLogin("Chrome", "Live");
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		//Initialize Drivers
		PRP1 = new PolicyRatingPage1(driver);
		PRP2 = new PolicyRatingPage2(driver);
		PP = new PolicyPremiums(driver);
		AP = new ApplicationPage(driver);
	}
	
	@Test(dataProvider="PPD_ENDORSE")
	public void RunPPD_ENDORSE(String casenum, String policyid, String inceptiondate, String ppdvalue) {
			Log("============================== Starting " + casenum + " ==============================");
		GetURL("https://policy.americanstrategic.com/Policy/Rating1.aspx?PolicyID=" + policyid + "&InceptionDate=" + inceptiondate + "&S=S");
		PRP1.TypeEffectiveDate(inceptiondate);
		PRP1.ClickNextAndConfirmEdits(casenum, policyid);
		PRP2.SelectPackagePolicyDiscount_PPD_ENDORSE(ppdvalue);
		PRP2.ClickNextAndConfirmEdits(casenum, policyid);
		PP.ClickOverride();
		AP.SelectTransactionDescr("Other");
		AP.SelectAgentUserNameByIndex(1);
		AP.TypeNotes("Renewal Correction: Added Package Policy Discount to Renewal");
		AP.ClickIssuePolicy();		
		if(driver.getPageSource().contains("Policy Documents") && driver.getPageSource().contains("Homeowners Policy Documents")) {
			Log(casenum + "-" + policyid + ": completed and changed to " + ppdvalue);
		}
		else {
			Log(casenum + "-" + policyid + ": unable to finish. Please take closer look");
		}
			Log("============================== End " + casenum + " ===================================");		
	}
	
	@AfterTest
	public void EndBatch() {
		QuitBrowser();
			Log("====================================== End PPD_ENDORSE Batch ===========================================");
	}
}