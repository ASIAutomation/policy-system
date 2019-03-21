package Automation.PS.STATES.CA;

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
public class CA_HO3Batch extends TestBase {

	public static final Logger log = Logger.getLogger(CA_HO3Batch.class.getName());

	RatingAndPolicyLookup RPL;
	PlanAndResidenceType PRT;
	PolicyRatingPage1 PRP1;
	PolicyRatingPage2 PRP2;
	PolicyPremiums PP;
	ApplicationPage AP;

	@DataProvider(name="CA_HO3Batch")
	public String[][] GetCA_HO3BatchDataCall() {
		String[][] data = GetData("Data", "HO3Batch_CA", ".xlsx");
		return data;
	}

	@BeforeTest
	public void SetUp() {
		RunBatches();
		SetLog();
			Log("====================================== Starting CA_HO3Batch Batch ======================================");
		InitAgentLogin("Chrome", "Live");
		//Initialize Drivers
		RPL = new RatingAndPolicyLookup(driver);
		PRT = new PlanAndResidenceType(driver);
		PRP1 = new PolicyRatingPage1(driver);
		PRP2 = new PolicyRatingPage2(driver);
		PP = new PolicyPremiums(driver);
		AP = new ApplicationPage(driver);
	}

	@Test(dataProvider="CA_HO3Batch")
	public void RunND_HO3(String casenum, String agentid, String firstname, String minitial, String lastname, String companyname, String addy1, String addy2, String city,
		String zip, String occupation, String yearhome, String typeofcontruct, String pc, String extwalls, String numoffamilies, String dwellcovg,
		String otherstruct, String personalprop, String lossofuse, String liab, String medpayments, String numofstories, String roofmaterial, String roofdesign,
		String yearroof, String purchdate, String purchprice, String riskhomeclosing, String dob, String marital, String numofchildren, String reportedclaims,
		String priorliab, String allotherperils, String windhail, String eqinsurance, String newpurch, String umbrella, String woodburning, String wildfireareabuildcode,
		String hud, String permitdate, String residentsmoke, String fireprot, String burglarprot, String securedsub, String effdate, String ppd, String occupancy,
		String eqcovg, String eqpp, String eqlossofuse, String eqol, String eqdeduct, String eqfoundationtype, String eqhazardreduction, String eqcontentsdeduct,
		String eqmasonryveneerexterior, String eqbreakables, String preexistingeqdamage, String dwellingsecured, String dwellinghavecripplewalls, String criplewallssecured,
		String waterheatersecrued, String dwellinghavepost, String postfoundationmodified, String chimneys, String inservants, String occasional, String outservants,
		String nshl, String limitedwaterdmg, String personalinj,String pprc, String spp, String homecomputer, String incjwf, String increpcost, String lossassessment,
		String ol, String animalliab, String golfcart, String waterbackup, String hs, String antiques, String bicycles, String camerasandprojectionequipment,
		String coins, String fineartsbreakage, String fineartsnobreakage, String furs, String golfersequipment, String gunscollectible, String gunsfired,
		String jewelry, String miscpersonalproperty, String musicalinstruments, String othersportsequipment, String silverware, String stamps) throws InterruptedException {
			Log("============================== Starting " + casenum + " ==============================");
		GetURL("https://policy.americanstrategic.com/Policy/Lookup.aspx");

		//Rating And Policy Lookup
		RPL.SelectStateForNewQuote("CA|");
		RPL.ClickCreateNewQuote();

		//Plan And Residence Type
		PRT.TypeFirstName(firstname);
		PRT.TypeLastName(lastname);
		PRT.TypeMiddleName(minitial);
		PRT.TypeCompanyName(companyname);
		PRT.TypeLocationAddress(addy1);
		PRT.TypeUnitSuite(addy2);
		PRT.TypeCity(city);
		PRT.TypeZip(zip);
		PRT.SelectPlanType("[CA] HO3 - ASI Select");
		PRT.SelectResidenceType("Single Family");
		PRT.CheckKnockouts();
		PRT.ClickNext();
		if(driver.getPageSource().contains("This address has a split protection class")) {
			PRT.SelectSplitPC();
		}
		if(driver.getPageSource().contains("Plan and Residence Type")) {
				Log(casenum + "-: There are edits that need to be manually handled on the Plan and Residence Type page: " + PRT.ReturnEdits("N"));
				Log("============================== End " + casenum + " ==============================");
			return;
		}

		//Policy Rating Page 1
		String quoteid = PRP1.ReturnPolicyID();
		//PRP1.SelectAgent(agentid);
		PRP1.SelectAgent("439784");
		PRP1.TypeEffectiveDate(effdate);
		PRP1.SelectOccupation(occupation);
		PRP1.TypeDateofBirth(dob);
		PRP1.TypeDwellingCoverage(dwellcovg);
		PRP1.TypeYearHomeBuilt(yearhome);
		if(yearhome.toUpperCase().equals("N/A")) {
			if(PRP1.ReturnYearHomeBuilt().equals("N/A")) {
				PRP1.TypeYearHomeBuilt("2000"); //DEFAULT VALUE
			}
		}
		PRP1.SelectProtectionClass(pc);
		PRP1.SelectTypeofConstruction(typeofcontruct);
		if(PRP1.ReturnTypeofConstruction().equals("N/A")) {
			PRP1.SelectTypeofConstruction("Frame"); //DEFAULT VALUE
		}
		PRP1.SelectExteriorWalls(extwalls);
		if(PRP1.ReturnExteriorWalls().equals("N/A")) {
			PRP1.SelectExteriorWalls("Concrete Block"); //DEFAULT VALUE
		}
		PRP1.SelectNumStories(numofstories);
		if(PRP1.ReturnNumofStories().equals("N/A")) {
			PRP1.SelectNumStories("1 Story / Ranch"); //DEFAULT VALUE
		}
		PRP1.TypeYearRoofInstalled(yearroof);
		if(yearroof.toUpperCase().equals("N/A")) {
			if(PRP1.ReturnYearRoofInstalled().equals("N/A")) {
				PRP1.TypeYearRoofInstalled("2010"); //DEFAULT VALUE
			}
		}
		PRP1.SelectRoofDesign(roofdesign);
		PRP1.SelectRoofingMaterial(roofmaterial);
		if(PRP1.ReturnRoofingMaterial().equals("N/A")) {
			PRP1.SelectRoofingMaterial("Composite Shingle"); //DEFAULT VALUE
		}
		PRP1.TypePurchaseDate(purchdate);
		PRP1.TypePurchasePrice(purchprice);
		PRP1.SelectIsHomeClosing(riskhomeclosing);
		PRP1.SelectNumberofFamilies(numoffamilies);
		PRP1.ClickNext();
		if(driver.getPageSource().contains("Policy Rating Page 1")) {
				Log(casenum + "-" + quoteid + ": Edits on Policy Rating Page 1. Can not proceed: " + PRP1.ReturnEdits("N"));
				Log("============================== End " + casenum + " ==============================");
			return;			
		}

		//Policy Rating Page 2		
		//Claims and Rating Information
		PRP2.SelectMaritalStatus(marital);
		PRP2.SelectNumberOfChildrenInHousehold(numofchildren);
		PRP2.SelectPriorLiabilityLimit(priorliab);
		PRP2.SelectReportEClaims(reportedclaims);
		
		//Increase / Decrease Limits
		PRP2.SelectOtherStructures(otherstruct);
		PRP2.SelectPersonalProperty(personalprop);
		PRP2.SelectLossOfUse(lossofuse);
		PRP2.SelectLiability(liab);
		PRP2.SelectMedicalPaymentsLimit(medpayments);
		
		//Discounts and Surcharges
		PRP2.CheckEarthquakeInsurance(eqinsurance);
		PRP2.CheckNewPurchaseDiscount(newpurch);
		PRP2.CheckSecuredSubdivision(securedsub);
		PRP2.CheckUmbrellaDiscount(umbrella);
		PRP2.CheckWoodBurningStove(woodburning);
		PRP2.SelectBurglarProtection(burglarprot);
		PRP2.SelectDoAnyResidentsSmoke(residentsmoke);
		PRP2.SelectFireProtection(fireprot);
		PRP2.SelectOccupancy(occupancy);
		PRP2.SelectPackagePolicyDiscount(ppd);		
		
		//Deductibles
		PRP2.SelectAllOtherPerilsDeductible(allotherperils);
		PRP2.SelectWindHailDeductible(windhail);
		
		//Earthquake Coverage - California Earthquake Authority (CEA)
		PRP2.SelectEarthquakeCoverage(eqcovg);
		PRP2.SelectEarthquakePersonalPropertyIncreasedLimit(eqpp);
		PRP2.SelectEarthquakeLossofUse(eqlossofuse);
		PRP2.SelectEarthquakeOrdinanceOrLaw(eqol);
		PRP2.SelectEarthquakeDeductible(eqdeduct);
		PRP2.SelectEarthquakeFoundationType(eqfoundationtype);
		PRP2.SelectEarthquakeHazardReductionDiscount(eqhazardreduction);
		PRP2.SelectEarthquakeContentsDeductible(eqcontentsdeduct);
		PRP2.CheckEarthquakeMasonryVeneerExteriorCoverage(eqmasonryveneerexterior);
		PRP2.CheckEarthquakeBreakablesCoverage(eqbreakables);
		PRP2.SelectPreExistingEarthquakeDamage(preexistingeqdamage);
		PRP2.SelectDwellingSecured(dwellingsecured);
		PRP2.SelectDoesTheDwellingHaveCrippleWalls(dwellinghavecripplewalls);
		PRP2.SelectCrippleWallsBraced(criplewallssecured);
		PRP2.SelectWaterHeaterSecured(waterheatersecrued);
		PRP2.SelectDwellingHavePost(dwellinghavepost);
		PRP2.SelectPostFoundationModified(postfoundationmodified);
		PRP2.SelectNumberOfChimneys(chimneys);
		
		//Workers Compensation
		PRP2.SelectInservants(inservants);
		PRP2.SelectOccasionalIncidental(occasional);
		PRP2.SelectOutservants(outservants);
		
		//Optional Coverages
		PRP2.CheckPackage(hs);
		PRP2.CheckLimitedWaterDamageCoverage(limitedwaterdmg);
		PRP2.CheckNonStructuralHailLossLimitation(nshl);
		PRP2.CheckPersonalInjuryCoverage(personalinj);
		PRP2.CheckPersonalPropertyReplacementCost(pprc);
		PRP2.CheckSpecialPersonalPropertyCoverage(spp);
		PRP2.TypeHomeComputerCoverage(homecomputer);
		PRP2.SelectAnimalLiability(animalliab);
		PRP2.SelectGolfCart(golfcart);
		PRP2.SelectIncreaseJewelryWatchesAndFurs(incjwf);
		PRP2.SelectIncreasedReplacementCostOnDwelling(increpcost);
		PRP2.SelectLossAssessment(lossassessment);
		PRP2.SelectOrdinanceOrLaw(ol);
		PRP2.SelectWaterBackupSumpPump(waterbackup);
	
		//Scheduled Personal Property
		PRP2.SPPAntiques("1", antiques);
		PRP2.SPPBicycles("1", bicycles);
		PRP2.SPPCamerasAndProjectionEquipment("1", camerasandprojectionequipment);
		PRP2.SPPCoins("1", coins);
		PRP2.SPPFineArtsBreakage("1", fineartsbreakage);
		PRP2.SPPFineArtsNoBreakage("1", fineartsnobreakage);
		PRP2.SPPFurs("1", furs);
		PRP2.SPPGolfersEquipment("1", golfersequipment);
		PRP2.SPPGunsCollectible("1", gunscollectible);
		PRP2.SPPGunsFired("1", gunsfired);
		PRP2.SPPJewelry("1", jewelry);
		PRP2.SPPMiscPersonalProperty("1", miscpersonalproperty);
		PRP2.SPPMusicalInstruments("1", musicalinstruments);
		PRP2.SPPOtherSportsEquipment("1", othersportsequipment);
		PRP2.SPPSilverware("1", silverware);
		PRP2.SPPStamps("1", stamps);		
		PRP2.ClickNext();
		if(driver.getPageSource().contains("Policy Rating Page 2")) {
				Log(casenum + "-" + quoteid + ": Edits on Policy Rating Page 2. Can not proceed: " + PRP2.ReturnEdits("N"));
				Log("============================== End " + casenum + " ==============================");
			return;
		}

		//Policy Premiums
		String premium = PP.ReturnTotalPremium("N");
		PP.ClickSave();
		if(driver.getPageSource().contains("Policy Processing Page")) {
				Log(casenum + "-" + quoteid + ": able to be saved with a premium of " + premium);
		}
		else {
				Log(casenum + "-" + quoteid + ": not able to be saved");
		}
			Log("============================== End " + casenum + " ==============================");
	}

	@AfterTest
	public void EndBatch() {
		QuitBrowser();
			Log("====================================== End CA_HO3Batch Batch ===========================================");
	}		
}