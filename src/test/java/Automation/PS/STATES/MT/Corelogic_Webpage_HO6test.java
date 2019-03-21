package Automation.PS.STATES.MT;

import org.apache.log4j.Logger;
import org.testng.annotations.*;
import Automation.PS.pages.*;

import Automation.PS.testBase.TestBase;

public class Corelogic_Webpage_HO6test extends TestBase 
{
	public static final Logger log = Logger.getLogger(Corelogic_Webpage_HO6test.class.getName());

	RatingAndPolicyLookup RPL;
	PlanAndResidenceType PRT;
	PolicyRatingPage1 PRP1;
	PolicyRatingPage2 PRP2;
	PolicyPremiums PP;
	ApplicationPage AP;

	/*@DataProvider(name="CA_HO3Batch")
	public String[][] GetCA_HO3BatchDataCall() {
		String[][] data = GetData("Data", "HO3Batch_CA");
		return data;
	}*/

	@BeforeTest
	public void SetUp() {
		RunBatches();
		SetLog();
			Log("====================================== Starting Corelogic  Batch ======================================");
		InitAgentLogin("Chrome", "Live");
		//Initialize Drivers
		RPL = new RatingAndPolicyLookup(driver);
		PRT = new PlanAndResidenceType(driver);
		PRP1 = new PolicyRatingPage1(driver);
		PRP2 = new PolicyRatingPage2(driver);

	}
	
	@Test
	public void run_corelogic_webpages() 
	{
		RPL.SelectState("MT|");
		RPL.ClickCreateNewQuote();
		PRT.TypeFirstName("Test");
		PRT.TypeLastName("Test");
		PRT.TypeLocationAddress("1795 HOMESTEAD DR");
		PRT.TypeCity("MISSOULA");
		PRT.TypeZip("59808");
		PRT.SelectPlanType("[MT] HO6 - American Strategic Insurance Corp");
		
		PRT.SelectResidenceType("Single Family");
		PRT.SelectResidenceType("Apartment");
		PRT.SelectResidenceType("Duplex");
		PRT.SelectResidenceType("Triplex");
		PRT.SelectResidenceType("Quadplex");
		PRT.SelectResidenceType("Condo");
		PRT.SelectResidenceType("Townhouse, Center");
		PRT.SelectResidenceType("Townhouse, End");
		PRT.SelectResidenceType("Rowhouse, Center");
		PRT.SelectResidenceType("Rowhouse, End");
		PRT.SelectResidenceType("Mobile Home");
		PRT.SelectResidenceType("Single Family");
		
		PRT.CheckKnockouts();
		PRT.ClickNext();
		PRP1.SelectAgent("Test Comparative - Multi-state: 445753 - [Test Agent]");
		PRP1.TypeEffectiveDate("9/16/2018");
		PRP1.SelectOccupation("Other");
		PRP1.TypeDateofBirth("1/1/1980");
		PRP1.TypeHomePhone("1234567890");
		PRP1.TypeYearHomeBuilt("2017");
		
		PRP1.SelectTypeofConstruction("Frame");
		PRP1.SelectTypeofConstruction("Masonry");
		PRP1.SelectTypeofConstruction("Masonry/Veneer");
		PRP1.SelectTypeofConstruction("Superior");
	
		PRP1.SelectNumStories("1 Story / Ranch");
		PRP1.SelectNumStories("1.5 Stories");
		PRP1.SelectNumStories("2 Stories");
		PRP1.SelectNumStories("2.5 Stories");
		PRP1.SelectNumStories("3 Stories");
		PRP1.SelectNumStories("Bi Level / Raised Ranch");
		PRP1.SelectNumStories("Tri Level");
		PRP1.SelectNumStories("Condo 1 Story");
		PRP1.SelectNumStories("Condo 2 Stories");
		PRP1.SelectNumStories("Condo 3 Stories");
		PRP1.SelectNumStories("Condo 4-7 Stories");
		PRP1.SelectNumStories("Condo 8-14 Stories");
		PRP1.SelectNumStories("Condo 15+ Stories");
		
		PRP1.TypeDwellingCoverage("250000");
		
		PRP1.SelectRoofDesign("Gable");
		PRP1.SelectRoofDesign("Hip");
		PRP1.SelectRoofDesign("Flat");
		PRP1.SelectRoofDesign("Flat - Poured Concrete");
		PRP1.SelectRoofDesign("Flat - Adobe");
	
		PRP1.TypePurchaseDate("1/1/2017");
		PRP1.TypePurchasePrice("300000");
		// new purch
		PRP1.TypeSquareFeetLivingArea("1500");
		PRP1.TypeNumFullBaths("2");
		PRP1.TypeNumHalfBaths("2");
		
		PRP1.SelectBathroomGrade("Builder's Grade");
		PRP1.SelectBathroomGrade("Custom");
		PRP1.SelectBathroomGrade("Designer");
		PRP1.SelectBathroomGrade("Semi-Custom");
		
		PRP1.SelectKitchenGrade("Custom");
		PRP1.SelectKitchenGrade("Builder's Grade");
		PRP1.SelectKitchenGrade("Semi Custom");
		PRP1.SelectKitchenGrade("Designer");
	
		PRP1.SelectDeck("None");
		PRP1.SelectDeck("Wood Deck");
		PRP1.SelectDeck("Composite Deck");
		PRP1.SelectDeck("RedWook Deck");
		
		PRP1.SelectCentralHeatAir("None");
		PRP1.SelectCentralHeatAir("Central Air Conditioning");
		PRP1.SelectCentralHeatAir("Evaporative Cooler");
		PRP1.SelectCentralHeatAir("Whole House Fan");
		PRP1.SelectCentralHeatAir("Heat Pump, HE (System)");
		PRP1.SelectCentralHeatAir("Humidifier, Furnace");
		
		PRP1.SelectHeatSource("None");
		PRP1.SelectHeatSource("Radiant Floor Heating");
		PRP1.SelectHeatSource("Geothermal, Closed Loop");
		PRP1.SelectHeatSource("Geothermal, Open Loop");
		PRP1.SelectHeatSource("Electric");
		PRP1.SelectHeatSource("Gas Forced Air");
		PRP1.SelectHeatSource("Heat Pump");
		PRP1.SelectHeatSource("Oil Forced Air");
		PRP1.SelectHeatSource("Propane Gas Forced Air");
		PRP1.SelectHeatSource("Gas Hot Water");
		PRP1.SelectHeatSource("Oil Hot Water");
		PRP1.SelectHeatSource("Propane Gas Hot Water");
		
		PRP1.TypeDeckSqFt("200");
		
		
	}
}
