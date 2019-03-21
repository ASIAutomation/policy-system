package Automation.PS.STATES.NE;

import java.util.concurrent.TimeUnit;
import org.apache.log4j.Logger;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import Automation.PS.pages.ApplicationPage;
import Automation.PS.pages.PlanAndResidenceType;
import Automation.PS.pages.PolicyPremiums;
import Automation.PS.pages.PolicyRatingPage1;
import Automation.PS.pages.PolicyRatingPage2;
import Automation.PS.pages.RatingAndPolicyLookup;
import Automation.PS.testBase.TestBase;

public class NE_HO3Batch extends TestBase {
	
	public static final Logger log = Logger.getLogger(NE_HO3Batch.class.getName());

	String quoteid;
	String premium;
	RatingAndPolicyLookup RPL;
	PlanAndResidenceType PRT;
	PolicyRatingPage1 PRP1;
	PolicyRatingPage2 PRP2;
	PolicyPremiums PP;
	ApplicationPage AP;
	

	@DataProvider(name="NE_HO3")
	public String[][] GetNE_HO3EDataCall() {
		String[][] data = GetData("Data", "HO3Batch_NE", ".xlsx");
		return data;
	}

	@BeforeTest
	public void SetUp() {
		RunBatches();
		SetLog();
		Log("====================================== Starting NE_HO3 Batch ======================================");
		InitAgentLogin("Chrome", "Live");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//Initialize Drivers
		RPL = new RatingAndPolicyLookup(driver);
		PRT = new PlanAndResidenceType(driver);
		PRP1 = new PolicyRatingPage1(driver);
		PRP2 = new PolicyRatingPage2(driver);
		PP = new PolicyPremiums(driver);
		AP = new ApplicationPage(driver);
	}
	
	@Test(dataProvider="NE_HO3")
	public void RunNE_HO3(String casenum, String agent, String effdate, String lastname, String firstname, String mname, String occupation, String dob, String hphone, String mphone,
		String addy1, String addy2, String city, String state, String zip, String yearhomebuilt, String typeconstr, String extwalls, String numstories, String covga, String pc,
		String yearroofinstalled, String roofdesign, String roofmaterial, String purchdate, String purchprice, String homeclosing, String ssn, String runcredit, String marital,
		String numofchildren, String priorliab, String reportedclaims, String otherstructures, String personalprop, String lossofuse, String liab, String medpay, String accred,
		String epolicy, String esign, String newpurch, String secsub, String umb, String woodburning, String packagepol, String acv, String burglar, String residentssmoke,
		String fire, String occupany, String paidinfull, String windhail, String allotherperils, String eqcovg, String eqdeduct, String eqfoundationtype, String eqsecureheater,
		String hspackage, String limitedwtrdmg, String nonstruchailoss, String personalinj, String pprc, String specialpp, String hcc, String animalliab, String golfcart,
		String incjwf, String incrplcdwell, String lossassesment, String ordlaw, String waterbackup, String basement, String antiques, String bicycles, String camerasandprojectionequipment,
		String coins, String fineartsbreakage, String fineartsnobreakage, String furs, String golfersequipment, String gunscollectible, String gunsfired, String jewelry,
		String miscpersonalproperty, String musicalinstruments, String othersportsequipment, String silverware, String stamps)	{
		try {
				Log("============================== Starting " + casenum + " ==============================");
			GetURL("https://policy.americanstrategic.com/Policy/Lookup.aspx");
	
			//Rating And Policy Lookup
			RPL.SelectStateForNewQuote("NE|");
			RPL.ClickCreateNewQuote();
	
			//Plan And Residence Type
			PRT.TypeFirstName(firstname);
			PRT.TypeLastName(lastname);
			PRT.TypeMiddleName(mname);
			PRT.TypeLocationAddress(addy1);
			PRT.TypeUnitSuite(addy2);
			PRT.TypeCity(city);
			PRT.TypeZip(zip);
			PRT.SelectPlanType("[NE] HO3 - American Strategic Insurance Corp");
			PRT.SelectResidenceType("Single Family");
			PRT.CheckKnockouts();
			PRT.ClickNext();
			
			//Policy Rating Page 1
			quoteid = PRP1.ReturnPolicyID();
			PRP1.SelectAgent(agent);
			PRP1.TypeEffectiveDate(effdate);
			PRP1.SelectOccupation(occupation);//default Other
			PRP1.TypeDateofBirth(dob);
			PRP1.TypeYearHomeBuilt(yearhomebuilt);
			PRP1.SelectTypeofConstruction(typeconstr);//default Frame
			PRP1.SelectExteriorWalls(extwalls);//default Concrete Block
			PRP1.SelectNumStories(numstories);//default 1 Story / Ranch
			PRP1.TypeDwellingCoverage(covga);
			PRP1.SelectProtectionClass(pc);
			PRP1.TypeYearRoofInstalled(yearroofinstalled);
			PRP1.SelectRoofDesign(roofdesign);//default gable
			PRP1.SelectRoofingMaterial(roofmaterial);//default composite shingle
			PRP1.TypePurchaseDate(purchdate);//default effdate-01/01/2019
			PRP1.TypePurchasePrice(purchprice);
			PRP1.SelectIsHomeClosing(homeclosing);//default no
			PRP1.ClickMailingAddressSameAsLocation();
			PRP1.SelectYearsAtThisAddress("2 or more years");
			PRP1.TypeSSN(ssn);//default 111-00-1111
			PRP1.SelectRunCreditReport(runcredit);//default yes
			PRP1.ClickNext();
			if(driver.getPageSource().contains("Policy Rating Page 1")) {
					Log("Edits on Policy Rating Page 1. Can not proceed for quoteid " + quoteid + ": " + PRP1.ReturnEdits("N"));
				PRP1.ClickSave();
				return;
			}
			
			//Policy Rating Page 2
			//Claims and Rating information
			PRP2.SelectMaritalStatus(marital);//default single
			PRP2.SelectNumberOfChildrenInHousehold(numofchildren);//default 0
			PRP2.SelectPriorLiabilityLimit(priorliab);//default $300,000
			PRP2.SelectReportEClaims(reportedclaims);//default 0 Claims
			
			//Increase / Decrease Limits
			PRP2.SelectOtherStructures(otherstructures);//default 2% Cov A (Included)
			PRP2.SelectPersonalProperty(personalprop);//default 50% Cov A (Included)
			PRP2.SelectLossOfUse(lossofuse);//default 20% Cov A (Included)
			PRP2.SelectLiability(liab);//default $100,000
			PRP2.SelectMedicalPaymentsLimit(medpay);//default $1,000
			
			//Discounts and Surcharges
			PRP2.CheckAccreditedBuilder(accred);
			PRP2.CheckEPolicyPaperless(epolicy);
			PRP2.CheckESignature(esign);
			PRP2.CheckNewPurchaseDiscount(newpurch);
			PRP2.CheckSecuredSubdivision(secsub);
			PRP2.CheckUmbrellaDiscount(umb);
			PRP2.CheckWoodBurningStove(woodburning);
			PRP2.SelectACVLossSettlement(acv);//default ACV
			PRP2.SelectBurglarProtection(burglar);
			PRP2.SelectDoAnyResidentsSmoke(residentssmoke);//default no
			PRP2.SelectFireProtection(fire);//default smoke alarm
			PRP2.SelectOccupancy(occupany);//default 9 months or more
			PRP2.SelectPackagePolicyDiscount(packagepol);//default none
			PRP2.SelectPaidInFullDiscount(paidinfull);//default Mortgage Billed
			
			//Deductibles
			PRP2.SelectAllOtherPerilsDeductible(allotherperils);//default $500
			PRP2.SelectWindHailDeductible(windhail);//default $500
			
			//Earthquake Endorsement
			PRP2.SelectEarthquakeCoverage(eqcovg);//default no
			PRP2.SelectEarthquakeDeductible(eqdeduct);//default N/A
			PRP2.SelectEarthquakeFoundationType(eqfoundationtype);//default N/A
			PRP2.CheckEarthquakeSecuredWaterHeater(eqsecureheater);//default N/A
			
			//Optional Coverages
			PRP2.CheckPackage(hspackage);//default No
			PRP2.CheckLimitedWaterDamageCoverage(limitedwtrdmg);//default No
			PRP2.CheckNonStructuralHailLossLimitation(nonstruchailoss);//default no
			PRP2.CheckPersonalInjuryCoverage(personalinj);//default no
			PRP2.CheckPersonalPropertyReplacementCost(pprc);//default no
			PRP2.CheckSpecialPersonalPropertyCoverage(specialpp);//default no
			PRP2.TypeHomeComputerCoverage(hcc);//default no
			PRP2.SelectAnimalLiability(animalliab);//default no
			PRP2.SelectIncreaseJewelryAndFurs(incjwf);//default no
			PRP2.SelectIncreasedReplacementCostOnDwelling(incrplcdwell);//default no
			PRP2.SelectLossAssessment(lossassesment);//default no
			PRP2.SelectOrdinanceOrLaw(ordlaw);//default 10% (Included)
			PRP2.SelectWaterBackupBasement(waterbackup, basement);//default None
			PRP2.SelectGolfCart(golfcart);//default no
			
			//Scheduled Personal Property
			PRP2.SPPAntiques("1", antiques);//default no
			PRP2.SPPBicycles("1", bicycles);//default no
			PRP2.SPPCamerasAndProjectionEquipment("1", camerasandprojectionequipment);//default no
			PRP2.SPPCoins("1", coins);//default no
			PRP2.SPPFineArtsBreakage("1", fineartsbreakage);//default no
			PRP2.SPPFineArtsNoBreakage("1", fineartsnobreakage);//default no
			PRP2.SPPFurs("1", furs);//default no
			PRP2.SPPGolfersEquipment("1", golfersequipment);//default no
			PRP2.SPPGunsCollectible("1", gunscollectible);//default no
			PRP2.SPPGunsFired("1", gunsfired);//default no
			PRP2.SPPJewelry("1", jewelry);//default no
			PRP2.SPPMiscPersonalProperty("1", miscpersonalproperty);//default no
			PRP2.SPPMusicalInstruments("1", musicalinstruments);//default no
			PRP2.SPPOtherSportsEquipment("1", othersportsequipment);//default no
			PRP2.SPPSilverware("1", silverware);//default no
			PRP2.SPPStamps("1", stamps);//default no	
			PRP2.ClickNext();
			if(driver.getPageSource().contains("Policy Rating Page 2")) {
					Log("Edits on Policy Rating Page 2. Can not proceed for quoteid " + quoteid + ": " + PRP2.ReturnEdits("N"));
				PRP2.ClickSave();
				return;
			}
			
			//Policy Premiums
			premium = PP.ReturnTotalPremium("Yes");
				Log(casenum + "-" + quoteid + ": " + premium);
			PP.ClickSave();
				Log("============================== End " + casenum + " ==============================");
		}	
		catch(Exception e) {
			e.printStackTrace();
			GetFailScreenShot(casenum + "-TN_HO3_Error");
				Log(casenum + ": Script has failed. Please rerun.");
				Log("============================== End " + casenum + " ===================================");
		}
	}	

	@AfterTest
	public void EndBatch() {
		QuitBrowser();
			Log("====================================== End NE_HO3 Batch ===========================================");
	}
}