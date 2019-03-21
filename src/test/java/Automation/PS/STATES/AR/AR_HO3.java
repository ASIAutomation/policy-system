package Automation.PS.STATES.AR;

import java.util.concurrent.TimeUnit;
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
public class AR_HO3 extends TestBase {

	public static final Logger log = Logger.getLogger(AR_HO3.class.getName());

	RatingAndPolicyLookup RPL;
	PlanAndResidenceType PRT;
	PolicyRatingPage1 PRP1;
	PolicyRatingPage2 PRP2;
	PolicyPremiums PP;
	ApplicationPage AP;

	@DataProvider(name="AR_HO3_Test")
	public String[][] GetAR_HO3EDataCall() {
		String[][] data = GetData("TestTabName", "AR_HO3_Test", ".xlsx");
		return data;
	}

	@BeforeTest
	public void SetUp() {
		RunBatches();
		SetLog();
		Log("====================================== Starting AR_HO3 Batch ======================================");
		InitAgentLogin("Chrome", "Live");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//Initialize Drivers
		RPL = new RatingAndPolicyLookup(driver);
		PRT = new PlanAndResidenceType(driver);
		PRP1 = new PolicyRatingPage1(driver);
		PRP2 = new PolicyRatingPage2(driver);
		PP = new PolicyPremiums(driver);
		AP = new ApplicationPage(driver);
	}

	@Test(dataProvider="AR_HO3_Test")
	public void RunAR_HO3(String casenum, String locationzipcode, String county, String terr, String eqterr, String yearhomebuilt,
			String protectionclass, String typeofconstruction, String dwellingcoverage, String coveragebotherstructures, String coveragecpersonalproperty,
			String coveragedlossofuse, String numberofstories, String roofingmaterial, String ageofroof, String yearroofinstalled, String maritalstatus,
			String numberofchildreninhousehold, String age, String dateofbirth, String reportedclaimsexcludingaog, String priorliabiltiylimit, String insurancescore,
			String credit, String tier, String coverageeliability, String coveragefmedicalpayments, String accreditedbuilder, String newpurchasediscount,
			String originalquotedate, String originaleffectivedate, String advancequotediscdays, String epolicy, String securedsubdivision, String umbrelladiscount,
			String woodburningstove, String owneroccupancy, String homeupdatediscount, String latestpermitdate, String huddropdown, String residentssmoke,
			String fireprotection, String burglarprotection, String waterleakprotection, String packagepolicydiscount, String paidinfulldiscount,
			String claimssurcharge, String allotherperils, String windhail, String homeshieldpackage, String personalinjurycoverage, String personalpropertyreplacementcost,
			String specialpersonalpropertycoverage, String homecomputercoverage, String animalliabilityendorsement, String incjwf, String increasedreplacementcostondwelling,
			String lossassessmentcoverage, String ordinanceorlaw, String waterbackupsumppump, String basementfinished, String golfcartphysicaldamageandliability,
			String antiques, String bicycles, String camerasandprojectionequipment, String coins, String fineartsnobreakage, String fineartsbreakage,
			String furs, String golfersequipment, String gunscollectible, String gunsfired, String jewelry, String miscellaneouspersonalproperty,
			String musicalinstrumentsnonprofessional, String othersportsequipment, String silverware, String stamps, String earthquakedeductible, String earthquakecoverage,
			String substructure, String securewaterheater, String premium) {
			Log("============================== Starting " + "casenum" + " ==============================");
		GetURL("https://policy.americanstrategic.com/Policy/Lookup.aspx");

		//Rating And Policy Lookup
		Print(driver.getClass().getName());
		RPL.SelectStateForNewQuote("AR|");
		RPL.ClickCreateNewQuote();

		//Plan And Residence Type
		PRT.TypeFirstName("TestFirstName");
		PRT.TypeLastName("TestLastName");
		PRT.TypeLocationAddress("123 Test Address Ave");
		PRT.TypeCity("Midway");
		PRT.TypeZip("71602");
		PRT.SelectPlanType("[AR] HO3 - American Strategic Insurance Corp");
		PRT.SelectResidenceType("Single Family");
		PRT.CheckKnockouts();
		PRT.ClickNext();
		PRT.ClickNextAndCheckOverrides();

		//Policy Rating Page 1
		String quoteid = PRP1.ReturnPolicyID();
		PRP1.SelectAgent("451667");
		PRP1.SelectOccupation("Other");
		PRP1.TypeDateofBirth("10/10/1910");
		PRP1.TypeEffectiveDate("5/28/2018");
		PRP1.TypeYearHomeBuilt("2010");
		PRP1.SelectTypeofConstruction("FRAME");
		PRP1.TypeDwellingCoverage("100000");
		PRP1.SelectExteriorWalls("Stone");
		PRP1.SelectNumStories("1");
		PRP1.TypeYearRoofInstalled("2010");
		PRP1.TypePurchaseDate("10/10/2010");
		PRP1.SelectRoofDesign("GABLE");
		PRP1.SelectIsHomeClosing("NO");
		PRP1.SelectRoofingMaterial("OTHER");
		PRP1.SelectRunCreditReport("NO");
		PRP1.ClickNextAndConfirmEdits("casenum", quoteid);

		//Policy Rating Page 2
		PRP2.SelectMaritalStatus("SINGLE");
		PRP2.SelectNumberOfChildrenInHousehold("1");
		PRP2.SelectOtherStructures("COV A (INCLUDED)");
		PRP2.SelectPersonalProperty("0% COV A");
		PRP2.SelectLossOfUse("10% COV A");
		PRP2.SelectLiability("100000");
		PRP2.SelectMedicalPaymentsLimit("1000");
		PRP2.SelectBurglarProtection("LOCAL BURGLAR ALARM");
		PRP2.SelectDoAnyResidentsSmoke("NO");
		PRP2.SelectFireProtection("REP TO CENTRAL STATION");
		PRP2.SelectOccupancy("SECONDARY/SEASONAL RESIDENCE");
		PRP2.SelectWaterLeakProtection("WATER LEAK SENSORS");
		PRP2.SelectAllOtherPerilsDeductible("500");
		PRP2.SelectWindHailDeductible("500");
		PRP2.TypeHomeComputerCoverage("1000");
		PRP2.SelectAnimalLiability("50000");
		PRP2.SelectGolfCart("$50,000 - 1 CART");
		PRP2.SelectIncreaseJewelryWatchesAndFurs("1000");
		PRP2.SelectIncreasedReplacementCostOnDwelling("25% COV A");
		PRP2.SelectLossAssessment("5000");
		PRP2.TypeLatestPermitDate("1/1/2017");
		PRP2.SelectPriorLiabilityLimit("300");
		PRP2.SelectReportEClaims("0");
		PRP2.SelectDoAnyResidentsSmoke("NO");
		PRP2.SelectOccupancy("P");
		PRP2.SelectPaidInFullDiscount("MB");
		PRP2.SelectHomeUpdateDiscount("YES");
		PRP2.SelectPackagePolicyDiscount("NONE");
		if(earthquakecoverage.toUpperCase().equals("Y") || earthquakecoverage.toUpperCase().equals("YES")) {
			PRP2.SelectEarthquakeCoverage("Yes");
			PRP2.SelectEarthquakeDeductible("10% Cov A");
			PRP2.SelectEarthquakeFoundationType("Basement");
			PRP2.CheckEarthquakeSecuredWaterHeater("Yes");
		}
		else {
			PRP2.SelectEarthquakeCoverage("No");
		}
		PRP2.SelectQtyAntiques("1");
		PRP2.TypeAntiques("100");
		PRP2.SelectQtyBicycles("1");
		PRP2.TypeBicycles("100");
		PRP2.SelectQtyCamerasAndProjectionEquipment("1");
		PRP2.TypeCamerasandProjectionEquipment("100");
		PRP2.SelectQtyCoins("1");
		PRP2.TypeCoins("100");
		PRP2.SelectQtyFineArtsBreakage("1");
		PRP2.TypeFineArtsBreakage("100");
		PRP2.SelectQtyFineArtsNoBreakage("1");
		PRP2.TypeFineArtsNoBreakage("1");
		PRP2.SelectQtyFurs("1");
		PRP2.TypeFurs("100");
		PRP2.SelectQtyGolfersEquipment("1");
		PRP2.TypeGolfersEquipment("100");
		PRP2.SelectQtyGunsCollectible("1");
		PRP2.TypeGunsCollectible("100");
		PRP2.SelectQtyGunsFired("1");
		PRP2.TypeGunsFired("100");
		PRP2.SelectQtyJewelry("1");
		PRP2.TypeJewelry("100");
		PRP2.SelectQtyMiscPersonalProperty("1");
		PRP2.TypeMiscPersonalProperty("100");
		PRP2.SelectQtyMusicalInstruments("1");
		PRP2.TypeMusicalInstruments("100");
		PRP2.SelectQtyOtherSportsEquipment("1");
		PRP2.TypeOtherSportsEquipment("100");
		PRP2.SelectQtySilverware("1");
		PRP2.TypeSilverware("100");
		PRP2.SelectQtyStamps("1");
		PRP2.TypeStamps("100");
		PRP2.ClickNextAndConfirmEdits("casenum", quoteid);

		//Policy Premiums
		GetScreenShotOther("Policy Processing Page - " + quoteid, "path");
		Log("============================== End " + "casenum" + " ==============================");
	}

	@AfterTest
	public void EndBatch() {
		QuitBrowser();
		Log("====================================== End AR_HO3 Batch ===========================================");
	}		
}