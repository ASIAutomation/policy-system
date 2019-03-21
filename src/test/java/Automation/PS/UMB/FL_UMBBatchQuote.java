package Automation.PS.UMB;

import org.apache.log4j.Logger;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import Automation.PS.pages.PlanAndResidenceType;
import Automation.PS.pages.RatingAndPolicyLookup;
import Automation.PS.pages.UMBGetStarted;
import Automation.PS.pages.UMBPremiums;
import Automation.PS.pages.UMBRating;
import Automation.PS.testBase.TestBase;

@Listeners(Automation.PS.customListeners.CustomListeners.class)
public class FL_UMBBatchQuote extends TestBase{

	public static final Logger log = Logger.getLogger(FL_UMBBatchQuote.class.getName());

	ExtentReports extent = new ExtentReports();
	ExtentHtmlReporter reporter = new ExtentHtmlReporter("T:\\Automations\\ExtentReports\\PS\\UMB\\UMBBatchQuote-" + GetDateTime() + ".html");	
	PlanAndResidenceType PRT;
	RatingAndPolicyLookup RPL;
	UMBGetStarted UGS;
	UMBRating UR;
	UMBPremiums UP;

	@DataProvider(name="UMB_BatchQuote")
	public String[][] GetUMB_BatchQuoteData() {
		String[][] data = GetData("FL_UMB", "UMB_BatchQuote", ".xlsx");
		return data;
	}

	@BeforeTest
	public void SetUp() {
		RunBatches();
		SetLog();
			Log("====================================== Starting UMB_BatchQuote ======================================");
		InitAgentLogin("Chrome", "Live");
		//Initialize Drivers		
		RPL = new RatingAndPolicyLookup(driver);
		PRT = new PlanAndResidenceType(driver);
		UGS = new UMBGetStarted(driver);
		UR = new UMBRating(driver);
		UP = new UMBPremiums(driver);
	}
	
	@Test(dataProvider="UMB_BatchQuote")
	public void Run_UMB_BatchQuote(String casenum, String firstname, String lastname, String middlename, String locationaddress, String unit, String city, 
		String state, String zip, String residencetype, String producttype, String selectagent, String effectivedate, String DOB, String homephone,
		String desiredlimit, String $1miluninsuredmotorist,String residentialproperties1or2family, String residentialproperties3or4family, String pool, 
		String autos, String motorcycles,String motorhomes, String watercraft0to150, String watercraft151to300, String watercraftover300, String adultsaged22to79,
		String under22cleanrecord, String under22withoutcleanrecord, String licensedlessthan1year, String adultsover80, String atfaultaccidents,
		String movingviolations, String increasedunderlyingpropliab, String asippd, String epolicydiscount, String autoliabsurcharge) throws InterruptedException {
		reporter.config().setTheme(Theme.DARK);
		extent.attachReporter(reporter);
		ExtentTest logger=extent.createTest("UMB_BatchQuote");
		try {
					Log("============================== Starting " + casenum + " ==============================");				
				GetURL("https://policy.americanstrategic.com/Policy/Lookup.aspx");
				
				//Rating And Policy Lookup				
				RPL.SelectStateForNewQuote("FL|");
				RPL.ClickCreateNewQuote();
				
				//Plan And Resident Type Page
				PRT.TypeFirstName(firstname);
				PRT.TypeLastName(lastname);
				PRT.TypeMiddleName(middlename);
				PRT.TypeLocationAddress(locationaddress);
				PRT.TypeUnitSuite(unit);
				PRT.TypeCity(city);
				PRT.SelectState(state);
				PRT.SelectPlanTypeByPlan("UMB", "ASI");
				PRT.SelectResidenceType(residencetype);
				PRT.SelectProductType(producttype);
				PRT.CheckKnockouts();
				PRT.ClickNextAndCheckOverrides();
				
				//Get Started
				UGS.SelectAgent(selectagent);
				UGS.TypeEffectiveDate(effectivedate);
				UGS.TypeDateofBirth(DOB);
				UGS.TypeHomePhone(homephone);
				UGS.ClickNext();
				
				//Rating Page
				String policyid = UR.ReturnPolicyID("N");
				UR.SelectDesiredLimit(desiredlimit);
				UR.Select1MillionUninsuredUnderinsuredMotorist($1miluninsuredmotorist);
				UR.SelectResidentialProperties1to2Family(residentialproperties1or2family);
				UR.SelectResidentialProperties3to4Family(residentialproperties3or4family);
				UR.SelectSwimmingPoolSpas(pool);
				UR.SelectAutos(autos);
				UR.SelectMotorcyclesMopeds(motorcycles);
				UR.SelectMotorhomesAndOtherRecreationalVehicles(motorhomes);
				UR.Select0to150HPWithMaximumSpeedOf75MPH(watercraft0to150);
				UR.Select151to300HPWithMaximumSpeedOf75MPH(watercraft151to300);
				UR.SelectOver300HPWithMaximumSpeedOf75MPH(watercraftover300);
				UR.SelectAdultsAged(adultsaged22to79);
				UR.SelectUnderWithCleanDrivingRecord(under22cleanrecord);
				UR.SelectUnderWithoutCleanDrivingRecord(under22withoutcleanrecord);
				UR.SelectLicensedLessThan(licensedlessthan1year);
				UR.SelectAdultsAged80AndOlder(adultsover80);
				UR.SelectAtFaultAccidents(atfaultaccidents);
				UR.SelectMovingViolation(movingviolations);
				UR.SelectIncreasedUnderlyingLiability(increasedunderlyingpropliab);
				UR.CheckASIPackagePolicyDiscount(asippd);
				UR.CheckEPolicyDiscount(epolicydiscount);
				UR.CheckUnderlyingAutoLiabilitySurcharge(autoliabsurcharge);
				UR.ClickNext();
				if(driver.getPageSource().contains("Rating")) {
						Log(casenum + "-" + policyid + ": contains edits. Unable to proceed and save.");
					SetZoom("0.65");
					GetFailScreenShot(casenum + "-" + policyid + "-UMB_BatchQuote_Edit");
					return;					
				}
		
				//Premiums Page										
				String totalpremium = UP.ReturnTotalPremium("N");
				UP.ClickSave();
				if(driver.getPageSource().contains("Policy Documents") && driver.getPageSource().contains("Policy Processing Page")) {
						Log(casenum + "-" + policyid + ": saved with a premium of " + totalpremium);
				}
				else {
						Log(casenum + "-" + policyid + ": not able to be saved.");
				}
					Log("============================== End " + casenum + " ===================================");				
		}			
		catch(Exception e) {
			e.printStackTrace();
			GetFailScreenShot(casenum + "-UMB_BatchQuote_Error");
				Log(casenum + ": Script has failed. Please rerun.");
				logger.log(Status.FAIL, "casenum" + ": Script has failed. Please rerun.");
				Log("============================== End " + casenum + " ===================================");			
		}
	}
	
	@AfterTest
	public void EndBatch() {
		QuitBrowser();
		extent.flush();
			Log("====================================== End UMB_BatchQuote Batch ===========================================");
	}
}