package Automation.PS.STATES.GA;

import Automation.PS.testBase.TestBase;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.testng.annotations.*;
import Automation.PS.pages.*;

public class Corelogic_GA_Edits_Test extends TestBase
{
	public static final Logger log = Logger.getLogger(Corelogic_GA_Edits_Test.class.getName());
	
	//========== CHANGE STATE PLAN ID HERE ==========//
	public static final String plan = "DP3";
	
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
		// helper
		
		PRT.SelectPlanType("[GA] DP3 - American Strategic Insurance Corp");
		PRT.SelectExcludeWind("No");
		PRT.SelectResidenceType("Single Family");
		PRT.CheckKnockouts();
		PRT.ClickNext();
		PRP1.SelectAgent("420641");
		PRP1.TypeEffectiveDate("10/15/2018");
		PRP1.SelectOccupation("Other");
		PRP1.TypeDateofBirth("1/1/1980");
		PRP1.TypeHomePhone("1234567890");
		PRP1.TypeYearHomeBuilt("2017");
		PRP1.SelectTypeofConstruction("Frame");
		PRP1.SelectExteriorWalls("Concrete Block");
		PRP1.SelectNumStories("1 Story / Ranch");
		PRP1.TypeDwellingCoverage("100000");
		PRP1.TypeYearRoofInstalled("2017");
		PRP1.SelectRoofDesign("Gable");
		PRP1.SelectRoofingMaterial("Concrete Tile");
		PRP1.TypePurchaseDate("1/1/2017");
		PRP1.TypePurchasePrice("300000");
		PRP1.SelectBusinessOccupancy("No Business Occ");
		PRP1.SelectNumberofFamilies("1");
		PRP1.SelectSubstructure("Slab-on-Ground");
		PRP1.TypeSquareFeetLivingArea("2000");
		PRP1.SelectGarage("2-Car-Attached");
		PRP1.TypeNumFullBaths("2");
		PRP1.TypeNumHalfBaths("2");
		PRP1.SelectBathroomGrade("Builder's Grade");
		PRP1.SelectKitchenGrade("Builder's Grade");
		PRP1.SelectCentralHeatAir("Central Air Conditioning");
		PRP1.SelectHeatSource("Electric");
		PRP1.SelectDeck("None");
		PRP1.ClickMailingAddressSameAsLocation();
		PRP1.SelectYearsAtThisAddress("2 or more years");
		PRP1.SelectRunCreditReport("Yes");
		PRP1.SelectNumStories("Condo 1 Story");
		PRP1.CheckSocialSecurityOverride();
		PRP1.TypeNotesOverride("Test");
		
		PRP1.ClickNext();
		PRP1.edit_numStories();
		PRP1.SelectNumStories("BL");
		PRP1.TypeBasementPct("100");
		PRP1.edit_substructure();
		PRP1.ClickBack();
		
		PRT.SelectResidenceType("Duplex");
		PRT.ClickNext();
		PRP1.SelectNumStories("Condo 1 Story");
		PRP1.ClickNext();
		PRP1.edit_numStories();
		PRP1.SelectNumStories("BL");
		PRP1.TypeBasementPct("100");
		PRP1.edit_substructure();
		PRP1.ClickBack();
		
		PRT.SelectResidenceType("Triplex");
		PRT.ClickNext();
		PRP1.SelectNumStories("Condo 1 Story");
		PRP1.ClickNext();
		PRP1.edit_numStories();
		PRP1.SelectNumStories("BL");
		PRP1.TypeBasementPct("100");
		PRP1.edit_substructure();
		PRP1.ClickBack();
		
		PRT.SelectResidenceType("Quadplex");
		PRT.ClickNext();
		PRP1.SelectNumStories("Condo 1 Story");
		PRP1.ClickNext();
		PRP1.edit_numStories();
		PRP1.SelectNumStories("BL");
		PRP1.TypeBasementPct("100");
		PRP1.edit_substructure();
		PRP1.ClickBack();
		
		PRT.SelectResidenceType("Single Family");
		PRT.ClickNext();
		PRP1.SelectGarage("None");
		PRP1.TypeBasementPct("100");
		PRP1.SelectNumStories("1 Story / Ranch");
		PRP1.SelectSubstructure("Slab-on-Ground");
		PRP1.SelectSubstructure("Frame");
		PRP1.SelectRoofingMaterial("AS");
		PRP1.TypePurchaseDate("1/1/2018");
		PRP1.TypeYearHomeBuilt("2019");
		PRP1.TypeYearRoofInstalled("2019");
		PRP1.TypeDwellingCoverage("100000");
		PRP1.ClickNext();
		String rooferr = driver.findElement(By.xpath("//*[@id=\"tblErrorMessages\"]/tbody/tr/td")).getText();
		Log("Roof Error: " + rooferr);
		PRP1.TypeYearHomeBuilt("2018");
		PRP1.TypeYearRoofInstalled("2017");
		PRP1.ClickNext();
		String rooferr2 = driver.findElement(By.xpath("//*[@id=\"tblErrorMessages\"]/tbody/tr/td")).getText();
		Log("Roof Error: " + rooferr2);
		PRP1.TypeYearHomeBuilt("2018");
		PRP1.SelectTypeofConstruction("Superior");
		PRP1.edit_superior_roofMaterial();
		PRP1.SelectTypeofConstruction("Frame");
		PRP1.edit_frame_roofMaterial();
		PRP1.TypeYearHomeBuilt("2018");
		PRP1.TypeYearRoofInstalled("2018");
		PRP1.TypeDwellingCoverage("100000");
		PRP1.SelectRoofingMaterial("CS");
		PRP1.edit_exteriorwalls();
		PRP1.SelectExteriorWalls("Concrete Block");
		
		
	}
	
	
}
















