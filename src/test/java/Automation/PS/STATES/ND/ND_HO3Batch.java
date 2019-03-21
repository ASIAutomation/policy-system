package Automation.PS.STATES.ND;

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
public class ND_HO3Batch extends TestBase {

	public static final Logger log = Logger.getLogger(ND_HO3Batch.class.getName());

	RatingAndPolicyLookup RPL;
	PlanAndResidenceType PRT;
	PolicyRatingPage1 PRP1;
	PolicyRatingPage2 PRP2;
	PolicyPremiums PP;
	ApplicationPage AP;

	@DataProvider(name="ND_HO3Batch")
	public String[][] GetND_HO3BatchDataCall() {
		String[][] data = GetData("Data", "HO3Batch_ND", ".xlsx");
		return data;
	}

	@BeforeTest
	public void SetUp() {
		RunBatches();
		SetLog();
		Log("====================================== Starting ND_HO3Batch Batch ======================================");
		InitAgentLogin("Chrome", "Live");
		//Initialize Drivers
		RPL = new RatingAndPolicyLookup(driver);
		PRT = new PlanAndResidenceType(driver);
		PRP1 = new PolicyRatingPage1(driver);
		PRP2 = new PolicyRatingPage2(driver);
		PP = new PolicyPremiums(driver);
		AP = new ApplicationPage(driver);
	}

	@Test(dataProvider="ND_HO3Batch")
	public void RunND_HO3(String casenum, String agentid, String firstname, String minitial, String lastname, String addy1, String addy2, String city, String zip, String occupation,
		String yearhome, String typeofcontruct, String pc, String extwalls, String dwellcovg, String otherstruct, String personalprop, String lossofuse, String liab, String medpayments,
		String numofstories, String roofmaterial, String roofdesign, String yearroof, String purchdate, String purchprice, String riskhomeclosing, String dob, String marital, String numofchildren,
		String reportedclaims, String priorliab, String allotherperils, String windhail, String accredbuilder, String epolicy, String newpurch, String umbrella, String woodburning, String acvlosssettlement,
		String hud, String permitdate, String residentsmoke, String fireprot, String burglarprot, String waterleak, String securedsub, String paidinfull, String effdate, String ppd, String occupancy,
		String limitedwaterdmg, String personalinj,String pprc, String spp, String homecomputer, String incjwf, String increpcost, String lossassessment, String ol, String golfcart, String waterbackup,
		String basement, String hs, String antiques, String bicycles, String camerasandprojectionequipment, String coins, String fineartsbreakage, String fineartsnobreakage, String furs, String golfersequipment,
		String gunscollectible, String gunsfired, String jewelry, String miscpersonalproperty, String musicalinstruments, String othersportsequipment, String silverware, String stamps) {
			Log("============================== Starting " + casenum + " ==============================");
		GetURL("https://policy.americanstrategic.com/Policy/Lookup.aspx");

		//Rating And Policy Lookup
		RPL.SelectStateForNewQuote("ND|");
		RPL.ClickCreateNewQuote();

		//Plan And Residence Type
		PRT.TypeFirstName(firstname);
		PRT.TypeLastName(lastname);
		PRT.TypeMiddleName(minitial);
		PRT.TypeLocationAddress(addy1);
		PRT.TypeUnitSuite(addy2);
		PRT.TypeCity(city);
		PRT.TypeZip(zip);
		PRT.SelectPlanType("[ND] HO3 - American Strategic Insurance Corp");
		PRT.SelectResidenceType("Single Family");
		PRT.CheckKnockouts();
		PRT.ClickNextAndCheckOverrides();
		if(driver.getPageSource().contains("Plan and Residence Type")) {
			return;
		}

		//Policy Rating Page 1
		String quoteid = PRP1.ReturnPolicyID();
		PRP1.SelectAgent(agentid);
		//PRP1.SelectAgent("439805");
		PRP1.TypeEffectiveDate(effdate);
		PRP1.SelectOccupation(occupation);
		PRP1.TypeDateofBirth(dob);
		PRP1.TypeYearHomeBuilt(yearhome);
		PRP1.SelectTypeofConstruction(typeofcontruct);
		PRP1.SelectExteriorWalls(extwalls);
		PRP1.SelectNumStories(numofstories);
		PRP1.TypeDwellingCoverage(dwellcovg);
		PRP1.ForceSelectProtectionClass(pc);
		PRP1.TypeYearRoofInstalled(yearroof);
		PRP1.SelectRoofDesign(roofdesign);
		PRP1.SelectRoofingMaterial(roofmaterial);
		PRP1.TypePurchaseDate(purchdate);
		PRP1.TypePurchasePrice(purchprice);
		PRP1.SelectIsHomeClosing(riskhomeclosing);
		PRP1.ClickMailingAddressSameAsLocation();
		PRP1.SelectYearsAtThisAddress("2 or more years");
		PRP1.SelectRunCreditReport("No");
		PRP1.ClickNext();
		if(driver.getPageSource().contains("Policy Rating Page 1")) {
				Log("Edits on Policy Rating Page 1. Can not proceed: " + PRP1.ReturnEdits("N"));
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
		PRP2.CheckAccreditedBuilder(accredbuilder);
		PRP2.CheckEPolicyPaperless(epolicy);
		PRP2.CheckESignature(epolicy);
		PRP2.CheckNewPurchaseDiscount(newpurch);
		PRP2.CheckSecuredSubdivision(securedsub);
		PRP2.CheckUmbrellaDiscount(umbrella);
		PRP2.CheckWoodBurningStove(woodburning);
		PRP2.SelectACVLossSettlement(acvlosssettlement);
		PRP2.SelectBurglarProtection(burglarprot);
		PRP2.SelectDoAnyResidentsSmoke(residentsmoke);
		PRP2.SelectFireProtection(fireprot);
		PRP2.SelectOccupancy(occupancy);
		PRP2.SelectPaidInFullDiscount(paidinfull);
		PRP2.SelectPackagePolicyDiscount(ppd);
		PRP2.SelectWaterLeakProtection(waterleak);
		PRP2.SelectHomeUpdateDiscount(hud);
		if(hud.toUpperCase().equals("Y") || hud.toUpperCase().equals("YES")) {
			PRP2.TypeLatestPermitDate(permitdate);
		}		
		
		//Deductibles
		PRP2.SelectAllOtherPerilsDeductible(allotherperils);
		PRP2.SelectWindHailDeductible(windhail);
		
		//Optional Coverages
		PRP2.CheckPackage(hs);
		PRP2.CheckLimitedWaterDamageCoverage(limitedwaterdmg);
		PRP2.CheckPersonalInjuryCoverage(personalinj);
		PRP2.CheckPersonalPropertyReplacementCost(pprc);
		PRP2.CheckSpecialPersonalPropertyCoverage(spp);
		PRP2.TypeHomeComputerCoverage(homecomputer);
		PRP2.SelectIncreaseJewelryWatchesAndFurs(incjwf);
		PRP2.SelectIncreasedReplacementCostOnDwelling(increpcost);
		PRP2.SelectLossAssessment(lossassessment);
		PRP2.SelectOrCheckOrdinanceOrLaw(ol, "N");
		PRP2.SelectGolfCart(golfcart);
		PRP2.SelectWaterBackupBasement(waterbackup, basement);
	
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
				Log("Edits on Policy Rating Page 2. Can not proceed: " + PRP2.ReturnEdits("N"));
			return;
		}

		//Policy Premiums
		String premium = PP.ReturnTotalPremium("N");
		PP.ClickSave();
		if(driver.getPageSource().contains("Policy Processing Page")) {
			Log(casenum + "-" + quoteid + ": able to be saved with a premium of " + premium);
		}
		else {
			Log(casenum + "-" + quoteid + ": not able to be saved: "  );
		}
			Log("============================== End " + casenum + " ==============================");
	}

	@AfterTest
	public void EndBatch() {
		//QuitBrowser();
			Log("====================================== End ND_HO3Batch Batch ===========================================");
	}		
}