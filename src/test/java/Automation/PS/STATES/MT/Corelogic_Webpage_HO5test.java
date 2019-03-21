package Automation.PS.STATES.MT;

import org.testng.annotations.*;
import Automation.PS.testBase.*;
import Automation.PS.pages.*;

public class Corelogic_Webpage_HO5test extends TestBase
{

	RatingAndPolicyLookup RPL;
	PlanAndResidenceType PRT;
	PolicyRatingPage1 PRP1;
	PolicyRatingPage2 PRP2;
	
	@BeforeTest
	public void SetUp() 
	{
		RunBatches();
		SetLog();
			Log("====================================== Starting Corelogic HO5 Batch ======================================");
		InitAgentLogin("Chrome", "Live");
		//Initialize Drivers
		RPL = new RatingAndPolicyLookup(driver);
		PRT = new PlanAndResidenceType(driver);
		PRP1 = new PolicyRatingPage1(driver);
		PRP2 = new PolicyRatingPage2(driver);

	}
	
	@Test
	public void run_corelogic_webpages() throws InterruptedException 
	{
		
		RPL.SelectState("MT|");
		RPL.ClickCreateNewQuote();
		PRT.TypeFirstName("Test");
		PRT.TypeLastName("Test");
		PRT.TypeLocationAddress("1795 HOMESTEAD DR");
		PRT.TypeCity("MISSOULA");
		PRT.TypeZip("59808");
		PRT.SelectPlanType("[MT] HO5 - American Strategic Insurance Corp");
	
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
		
		PRP1.SelectExteriorWalls("Concrete Block");
		PRP1.SelectExteriorWalls("Hardiplank Siding");
		PRP1.SelectExteriorWalls("Wood Shake Siding");
		PRP1.SelectExteriorWalls("Asbestos Siding");
		PRP1.SelectExteriorWalls("Masonite Siding");
		PRP1.SelectExteriorWalls("Aluminum Siding");
		PRP1.SelectExteriorWalls("Vinyl Siding");
		PRP1.SelectExteriorWalls("Brick Veneer");
		PRP1.SelectExteriorWalls("Stone");
		PRP1.SelectExteriorWalls("Stucco");
		PRP1.SelectExteriorWalls("Wood");
		PRP1.SelectExteriorWalls("Solid Brick");
		PRP1.SelectExteriorWalls("EIFS or Dryvit Siding");
		PRP1.SelectExteriorWalls("Clapboard");
		PRP1.SelectExteriorWalls("Cement Fiber Shingles");
		PRP1.SelectExteriorWalls("Hardboard Siding");
		PRP1.SelectExteriorWalls("Logs, Solid");
		
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
		PRP1.TypeYearRoofInstalled("2017");
		
		PRP1.SelectRoofDesign("Gable");
		PRP1.SelectRoofDesign("Hip");
		PRP1.SelectRoofDesign("Flat");
		PRP1.SelectRoofDesign("Flat - Poured Concrete");
		PRP1.SelectRoofDesign("Flat - Adobe");
		
		PRP1.SelectRoofingMaterial("Superior Construction w/Poured Concrete");
		PRP1.SelectRoofingMaterial("Asbestos");
		PRP1.SelectRoofingMaterial("Wood Shake");
		PRP1.SelectRoofingMaterial("Concrete Tile");
		PRP1.SelectRoofingMaterial("Slate");
		PRP1.SelectRoofingMaterial("Rolled Roof");
		PRP1.SelectRoofingMaterial("Shingles, Architectural");
		PRP1.SelectRoofingMaterial("Aluminum, Corrugated");
		PRP1.SelectRoofingMaterial("Rubber");
		PRP1.SelectRoofingMaterial("Wood Shingle");
		PRP1.SelectRoofingMaterial("Other");
		PRP1.SelectRoofingMaterial("Composite Shingle");
		PRP1.SelectRoofingMaterial("Barrel Tile");
		PRP1.SelectRoofingMaterial("Flat Tile");
		PRP1.SelectRoofingMaterial("Clay Tile");
		PRP1.SelectRoofingMaterial("Metal");
		PRP1.SelectRoofingMaterial("Tar and Gravel");
		PRP1.SelectRoofingMaterial("Poured Concrete");
		
		PRP1.TypePurchaseDate("1/1/2017");
		
		PRP1.SelectSubstructure("Slab-on-Ground");
		PRP1.SelectSubstructure("Basement, Daylight");
		PRP1.SelectSubstructure("Basement, Below Grade");
		PRP1.SelectSubstructure("Basement, Walkout");
		PRP1.SelectSubstructure("Open Foundation");
		PRP1.SelectSubstructure("Crawl Space");
		PRP1.SelectSubstructure("Piers (Elevated)");
		PRP1.SelectSubstructure("Piers/Open Foundation - 2 - 6ft w/ no enclosure");
		PRP1.SelectSubstructure("Piers/Crawl Space - 2 - 6ft w/ permanent material");
		PRP1.SelectSubstructure("Pilings 8-12 ft Elevation");
		PRP1.SelectSubstructure("Suspended Over Hillside");
		
		PRP1.TypeSquareFeetLivingArea("1500");
		// basement pct
		PRP1.TypeBasementPctFinished("100");
		
		PRP1.SelectGarage("None");
		PRP1.SelectGarage("1-Car-Attached");
		PRP1.SelectGarage("2-Car-Attached");
		PRP1.SelectGarage("3-Car-Attached");
		PRP1.SelectGarage("1-Car-Built-in");
		PRP1.SelectGarage("2-Car-Built-in");
		PRP1.SelectGarage("3-Car-Built-in");
		PRP1.SelectGarage("1-Car-Carport");
		PRP1.SelectGarage("2-Car-Carport");
		
		PRP1.TypeNumFullBaths("2");
		PRP1.TypeNumHalfBaths("2");
		
		PRP1.SelectBathroomGrade("Custom");
		PRP1.SelectBathroomGrade("Designer");
		PRP1.SelectBathroomGrade("Semi-Custom");
		PRP1.SelectBathroomGrade("Builder's Grade");
		
		PRP1.SelectKitchenGrade("Custom");
		PRP1.SelectKitchenGrade("Builder's Grade");
		PRP1.SelectKitchenGrade("Semi Custom");
		PRP1.SelectKitchenGrade("Designer");
	
		PRP1.SelectDeck("None");
		PRP1.SelectDeck("Wood Deck");
		PRP1.SelectDeck("Composite Deck");
		PRP1.SelectDeck("RedWook Deck");
		
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
