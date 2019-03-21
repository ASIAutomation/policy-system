package Automation.PS.STATES.CO;

import org.apache.log4j.Logger;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import Automation.PS.pages.ApplicationPage;
import Automation.PS.pages.PlanAndResidenceType;
import Automation.PS.pages.PolicyPremiums;
import Automation.PS.pages.PolicyRatingPage1;
import Automation.PS.pages.PolicyRatingPage2;
import Automation.PS.pages.RatingAndPolicyLookup;
import Automation.PS.testBase.TestBase;

@Listeners(Automation.PS.customListeners.CustomListeners.class)
public class CO_HO3CLUETest extends TestBase {

		public static final Logger log = Logger.getLogger(CO_HO3CLUETest.class.getName());

		RatingAndPolicyLookup RPL;
		PlanAndResidenceType PRT;
		PolicyRatingPage1 PRP1;
		PolicyRatingPage2 PRP2;
		PolicyPremiums PP;
		ApplicationPage AP;

		@DataProvider(name="CO_HO3CLUETest")
		public String[][] GetCO_HO3CLUETestDataCall() {
			String[][] data = GetData("Data", "CO_HO3CLUETest", ".xlsx");
			return data;
		}

		@BeforeTest
		public void SetUp() {
			RunBatches();
			SetLog();
			Log("====================================== Starting CO_HO3CLUETest Batch ======================================");
			InitAgentLogin("Chrome", "Live");
			//Initialize Drivers
			RPL = new RatingAndPolicyLookup(driver);
			PRT = new PlanAndResidenceType(driver);
			PRP1 = new PolicyRatingPage1(driver);
			PRP2 = new PolicyRatingPage2(driver);
			PP = new PolicyPremiums(driver);
			AP = new ApplicationPage(driver);
		}

		@Test(dataProvider="CO_HO3CLUETest")
		public void RunCO_HO3(String casenum, String firstname, String middleInit, String lastname, String addr1, String addr2, String locCity, String locZip, String ssn, String dob) {
				Log("============================== Starting " + casenum + " ==============================");
			GetURL("https://policy.americanstrategic.com/Policy/Lookup.aspx");

			//Rating And Policy Lookup
			RPL.SelectStateForNewQuote("CO|");
			RPL.ClickCreateNewQuote();

			//Plan And Residence Type
			PRT.TypeFirstName(firstname);
			PRT.TypeLastName(lastname);
			PRT.TypeMiddleName(middleInit);
			PRT.TypeLocationAddress(addr1);
			PRT.TypeUnitSuite(addr2);
			PRT.TypeCity(locCity);
			PRT.TypeZip(locZip);
			PRT.SelectPlanType("[CO] HO3 - American Strategic Insurance Corp");
			PRT.SelectResidenceType("Single Family");
			PRT.CheckKnockouts();
			PRT.ClickNextAndCheckOverrides();

			//Policy Rating Page 1
			String quoteid = PRP1.ReturnPolicyID();
			PRP1.SelectAgent("418546");
			PRP1.TypeEffectiveDate("8/10/2018");
			PRP1.SelectOccupation("Other");
			PRP1.TypeDateofBirth(dob);
			PRP1.TypeYearHomeBuilt("2010");
			PRP1.SelectTypeofConstruction("Frame");
			PRP1.SelectExteriorWalls("Concrete Block");
			PRP1.SelectNumStories("1");
			PRP1.TypeDwellingCoverage("200000");
			PRP1.TypeYearRoofInstalled("2010");
			PRP1.SelectRoofDesign("Gable");
			PRP1.SelectRoofingMaterial("Concrete Tile");
			PRP1.TypePurchaseDate("01/01/2017");
			PRP1.TypePurchasePrice("200000");
			PRP1.SelectIsHomeClosing("No");
			PRP1.ClickMailingAddressSameAsLocation();
			PRP1.TypeSSN(ssn);
			PRP1.SelectYearsAtThisAddress("2 or more years");
			PRP1.SelectRunCreditReport("Yes");
			PRP1.ClickNextAndConfirmEdits(casenum, quoteid);

//			//Policy Rating Page 2		
//			//Claims and Rating Information
			PRP2.SelectMaritalStatus("Married");
			PRP2.SelectNumberOfChildrenInHousehold("0");
			PRP2.SelectPriorLiabilityLimit("$300,000");
			PRP2.SelectReportEClaims("0 Claims");
		
//			//Discounts and Surcharges
			PRP2.SelectACVLossSettlement("Replacement Cost");
			PRP2.SelectDoAnyResidentsSmoke("No");
			PRP2.SelectFireProtection("Smoke Alarm");
			PRP2.SelectOccupancy("Primary Residence");
			PRP2.SelectPaidInFullDiscount("Insured Full Pay");
			PRP2.SelectPackagePolicyDiscount("None");
//			
//			//Deductibles
			PRP2.SelectAllOtherPerilsDeductible("$5,000");
			PRP2.SelectWindHailDeductible("$5,000");
			
			PRP2.ClickNextAndConfirmEdits(casenum, quoteid);

			//Policy Premiums
			PP.RunClue();
			GetScreenShot(casenum+quoteid+"_Screenshot");

				Log("============================== End " + casenum + " ==============================");
		}

		@AfterTest
		public void EndBatch() {
			QuitBrowser();
				Log("====================================== End CO_HO3CLUETest Batch ===========================================");
		}		
	}
