package Automation.PS.MISC;

import java.util.concurrent.TimeUnit;
import org.apache.log4j.Logger;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
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
public class ANIMAL_LIABILITY extends TestBase {
	
	public static final Logger log = Logger.getLogger(ANIMAL_LIABILITY.class.getName());
	
	RatingAndPolicyLookup RPL;
	PlanAndResidenceType PRT;
	PolicyRatingPage1 PRP1;
	PolicyRatingPage2 PRP2;
	PolicyPremiums PP;
	ApplicationPage AP;
	
	@DataProvider(name="ANIMAL_LIABILITY")
	public String[][] GetANIMAL_LIABILITYDataCall() {
		String[][] data = GetData("Data", "ANIMAL_LIABILITY", ".xlsx");
		return data;
	}	
	
	@BeforeTest
	public void SetUp() {
		RunBatches();
		SetLog();
			Log("====================================== Starting ANIMAL_LIABILITY Batch ======================================");
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
	
	@Test(dataProvider="ANIMAL_LIABILITY")
	public void RunANIMAL_LIABILITY(String casenum, String policyid, String endorsevalue) {
			Log("============================== Starting " + casenum + " ==============================");
		GetURL("https://policy.americanstrategic.com/Policy/Lookup.aspx");
		RPL.TypeQuotePolicy(policyid);
		RPL.ClickLookup();
		PRT.ClickNextAndCheckOverrides();
		PRP1.ClickNext();
		PRP1.ClickOverride();
		PRP2.SelectAnimalLiability(endorsevalue);
		PRP2.ClickNext();
		PRP2.ClickOverride();
		PP.ClickSave();
			Log(casenum + "-" + policyid + ": endorsed successfully");
		}		
	
	
	@AfterTest
	public void EndBatch() {
		QuitBrowser();
			Log("====================================== End ANIMAL_LIABILITY Batch ===========================================");
	}
}