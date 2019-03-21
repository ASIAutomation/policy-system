package Automation.PS.STATES.GA;

import Automation.PS.testBase.TestBase;
import org.apache.log4j.Logger;
import org.testng.annotations.*;
import Automation.PS.pages.*;

public class Corelogic_GA_Webpages_Test extends TestBase
{
	public static final Logger log = Logger.getLogger(Corelogic_GA_Webpages_Test.class.getName());
	
	//========== CHANGE STATE PLAN ID HERE ==========//
	public static final String plan = "HO3";
	
	RatingAndPolicyLookup RPL;
	PlanAndResidenceType PRT;
	PolicyRatingPage1 PRP1;
	PolicyRatingPage2 PRP2;
	PolicyPremiums PP;
	ApplicationPage AP;
	
	
	@BeforeTest
	public void SetUp() 
	{
		RunBatches();
		SetLog();
			Log("====================================== Starting Corelogic  Batch ======================================");
		InitAgentLogin("Chrome", "STAGING");
		//Initialize Drivers
		RPL = new RatingAndPolicyLookup(driver);
		PRT = new PlanAndResidenceType(driver);
		PRP1 = new PolicyRatingPage1(driver);
		PRP2 = new PolicyRatingPage2(driver);

	}

	@Test
	public void run_corelogic_webpages() throws InterruptedException 
	{
		GetURL("https://uat-policy.americanstrategic.com/Policy/Lookup.aspx");
		
		RPL.SelectState("GA|");
		RPL.ClickCreateNewQuote();
		PRT.TypeFirstName("Test");
		PRT.TypeLastName("Test");
		PRT.TypeLocationAddress("555 Stoneglen Chase SW");
		PRT.TypeCity("Atlanta");
		PRT.TypeZip("30331");
		helper1();
		
	}
	
	public void helper1() throws InterruptedException
	{
		if (plan.equals("HO3"))
		{
			executeho3();
		}
		
		else if (plan.equals("HO5"))
		{
			executeho5();
		}
		
		else if (plan.equals("HO6"))
		{
			executeho6();
		}
		
		else if (plan.equals("DP3"))
		{
			executedp3();
		}
		
		else
		{
			System.out.println("LOL! Wrong Plan ID. You must have messed up. Pay attention next time");
		}
	}
	
	public void executeho3() throws InterruptedException
	{
		
		PRT.SelectPlanType("[GA] HO3 - American Strategic Insurance Corp");
		PRT.SelectExcludeWind("No");
		PRT.typeres();
		PRT.CheckKnockouts();
		PRT.ClickNext();
		PRP1.SelectAgent("420641");
		PRP1.TypeEffectiveDate("10/15/2018");
		PRP1.SelectOccupation("Other");
		PRP1.TypeDateofBirth("1/1/1980");
		PRP1.TypeHomePhone("1234567890");
		PRP1.TypeYearHomeBuilt("2017");
		PRP1.wp_typeconst();
		PRP1.wp_exteriorwalls();
		PRP1.wp_numStories();
		PRP1.TypeDwellingCoverage("250000");
		PRP1.TypeYearRoofInstalled("2017");
		PRP1.wp_roofdesign();
		PRP1.wp_roofmaterial();
		PRP1.TypePurchaseDate("1/1/2017");
		PRP1.TypePurchasePrice("300000");
		PRP1.wp_substructure();
		PRP1.TypeSquareFeetLivingArea("1500");
		PRP1.TypeBasementPct("100");
		PRP1.TypeBasementPctFinished("100");
		PRP1.SelectGarage("2-Car-Attached");
		PRP1.TypeNumFullBaths("2");
		PRP1.TypeNumHalfBaths("2");
		PRP1.wp_bathroomgrade();
		PRP1.wp_garage();
		PRP1.wp_kitchengrade();
		PRP1.wp_wooddeck();
		PRP1.wp_centralair();
		PRP1.wp_heatsource();
		PRP1.TypeDeckSqFt("200");
		PRP1.SelectTypeofConstruction("Frame");
		PRP1.SelectExteriorWalls("Concrete Block");
		PRP1.SelectNumStories("1 Story / Ranch");
		PRP1.TypeDwellingCoverage("300000");
		PRP1.SelectRoofDesign("Gable");
		PRP1.SelectRoofingMaterial("Clay Tile");
		// new purch
		PRP1.ClickMailingAddressSameAsLocation();
		PRP1.SelectYearsAtThisAddress("2 or more years");
		PRP1.SelectRunCreditReport("Yes");
		PRP1.SelectSubstructure("Slab-on-ground");
		PRP1.TypeBasementPct("0");
		PRP1.TypeBasementPctFinished("0");
		PRP1.ClickNext();
		PRP2.SelectACVLossSettlement("ACV - Clay Tile");
	}
	
	public void executeho6()
	{
		PRT.SelectPlanType("[GA] HO6 - American Strategic Insurance Corp");
		PRT.SelectExcludeWind("No");
		PRT.typeres();
		PRT.CheckKnockouts();
		PRT.ClickNext();
		
		PRP1.SelectAgent("420641");
		PRP1.TypeEffectiveDate("10/15/2018");
		PRP1.SelectOccupation("Other");
		PRP1.TypeDateofBirth("1/1/1980");
		PRP1.TypeHomePhone("1234567890");
		PRP1.TypeYearHomeBuilt("2017");
		PRP1.wp_typeconst();
		PRP1.wp_numStories();
		PRP1.wp_roofdesign();
		PRP1.TypePurchaseDate("1/1/2017");
		PRP1.TypePurchasePrice("300000");
		// new purch
		PRP1.TypeSquareFeetLivingArea("1500");
		PRP1.TypeNumFullBaths("2");
		PRP1.TypeNumHalfBaths("2");
		PRP1.wp_bathroomgrade();
		PRP1.wp_kitchengrade();
		PRP1.wp_wooddeck();
		PRP1.wp_centralair();
		PRP1.wp_heatsource();
		PRP1.TypeDeckSqFt("200");
	}
	
	public void executeho5() throws InterruptedException
	{
		PRT.SelectPlanType("[GA] HO5 - American Strategic Insurance Corp");
		PRT.SelectExcludeWind("No");
		PRT.typeres();
		PRT.CheckKnockouts();
		PRT.ClickNext();
		
		PRP1.SelectAgent("420641");
		PRP1.TypeEffectiveDate("10/15/2018");
		PRP1.SelectOccupation("Other");
		PRP1.TypeDateofBirth("1/1/1980");
		PRP1.TypeHomePhone("1234567890");
		PRP1.TypeYearHomeBuilt("2017");
		PRP1.wp_typeconst();
		PRP1.wp_exteriorwalls();
		PRP1.wp_numStories();
		PRP1.TypeDwellingCoverage("250000");
		PRP1.TypeYearRoofInstalled("2017");
		PRP1.wp_roofdesign();
		PRP1.wp_roofmaterial();
		PRP1.TypePurchaseDate("1/1/2017");
		PRP1.wp_substructure();
		PRP1.TypeSquareFeetLivingArea("1500");
		PRP1.TypeBasementPct("100");
		PRP1.TypeBasementPctFinished("100");
		PRP1.SelectGarage("2-Car-Attached");
		PRP1.TypeNumFullBaths("2");
		PRP1.TypeNumHalfBaths("2");
		PRP1.wp_bathroomgrade();
		PRP1.wp_garage();
		PRP1.wp_kitchengrade();
		PRP1.wp_wooddeck();
		PRP1.wp_centralair();
		PRP1.wp_heatsource();
		PRP1.TypeDeckSqFt("200");
	}
	
	public void executedp3() throws InterruptedException
	{
		PRT.SelectPlanType("[GA] DP3 - American Strategic Insurance Corp");
		PRT.SelectExcludeWind("No");
		PRT.typeres();
		PRT.CheckKnockouts();
		PRT.ClickNext();
		PRP1.SelectAgent("420641");
		PRP1.TypeEffectiveDate("10/15/2018");
		PRP1.SelectOccupation("Other");
		PRP1.TypeDateofBirth("1/1/1980");
		PRP1.TypeHomePhone("1234567890");
		PRP1.TypeYearHomeBuilt("2017");
		PRP1.wp_typeconst();
		PRP1.wp_exteriorwalls();
		PRP1.wp_numStories();
		PRP1.TypeDwellingCoverage("250000");
		PRP1.TypeYearRoofInstalled("2017");
		PRP1.wp_roofdesign();
		PRP1.wp_roofmaterial();
		PRP1.TypePurchaseDate("1/1/2017");
		PRP1.TypePurchasePrice("300000");
		PRP1.wp_substructure();
		PRP1.TypeSquareFeetLivingArea("1500");
		PRP1.TypeBasementPct("100");
		PRP1.TypeBasementPctFinished("100");
		PRP1.SelectGarage("2-Car-Attached");
		PRP1.TypeNumFullBaths("2");
		PRP1.TypeNumHalfBaths("2");
		PRP1.wp_bathroomgrade();
		PRP1.wp_garage();
		PRP1.wp_kitchengrade();
		PRP1.wp_wooddeck();
		PRP1.wp_centralair();
		PRP1.wp_heatsource();
		PRP1.TypeDeckSqFt("200");
	}
	
	@AfterTest
	public void EndBatch() {
		QuitBrowser();
		Log("=================================== End Corelogic GA test Batch =========================================");
	}
}










