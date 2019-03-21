package Automation.PS.MISC;

import org.apache.log4j.Logger;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;

import Automation.PS.pages.PolicyHistory;
import Automation.PS.pages.PolicyPremiums;
import Automation.PS.pages.PolicyRatingPage1;
import Automation.PS.pages.PolicyRatingPage2;
import Automation.PS.pages.RatingAndPolicyLookup;
import Automation.PS.testBase.TestBase;

//LIIIIISSSAAAAA NICCCCCKKEELLSSSSSSS
@Listeners(Automation.PS.customListeners.CustomListeners.class)
public class PPD_CROSS_SELL extends TestBase {
	
	public static final Logger log = Logger.getLogger(PPD_CROSS_SELL.class.getName());
	
	RatingAndPolicyLookup RPL;
	PolicyHistory PH;
	PolicyRatingPage1 PRP1;
	PolicyRatingPage2 PRP2;
	PolicyPremiums PP;
	ExtentReports extent = new ExtentReports();
	ExtentHtmlReporter reporter = new ExtentHtmlReporter("T:\\Automations\\ExtentReports\\PS\\PPD_CROSS_SELL\\PPD_CROSS_SELL-" + GetDateTime() + ".html");
	
	@DataProvider(name="PPD_CROSS_SELL")
	public String[][] GetOL_ENDORSEDataCall() {
		String[][] data = GetData("Data", "PPD_CROSS_SELL", ".xlsx");
		return data;
	}	
	
	@BeforeTest
	public void SetUp() {
		RunBatches();
		SetLog();
			Log("====================================== Starting PPD_CROSS_SELL Batch ======================================");
		InitAgentLogin("Chrome", "Live");
		//Initialize Drivers
		RPL = new RatingAndPolicyLookup(driver);
		PH = new PolicyHistory(driver);
		PRP1 = new PolicyRatingPage1(driver);
		PRP2 = new PolicyRatingPage2(driver);
		PP = new PolicyPremiums(driver);
	}
	
	@Test(dataProvider="PPD_CROSS_SELL")
	public void RunPPD_CROSS_SELL(String casenum, String policyid) {
		reporter.config().setTheme(Theme.DARK);
		extent.attachReporter(reporter);
		ExtentTest logger=extent.createTest("PPD_CROSS_SELL");
		try {
				Log("============================== Starting " + casenum + " ==============================");
			GetURL("https://policy.americanstrategic.com/Policy/Lookup.aspx");
			RPL.TypeQuotePolicy(policyid);
			RPL.ClickLookup();
			if(driver.getPageSource().contains("Create a New Quote")) {
				RPL.ClickPolicyLink(policyid);
			}
			if(PH.ReturnPolicyStatus("N").equals("Cancelled")) {
					Log(casenum + "-" + policyid + ": is a cancelled");
					logger.log(Status.SKIP, casenum + "-" + policyid + ": is a cancelled");
					Log("============================== End " + casenum + " ===================================");
				return;			
			}
			String planid = PH.ReturnPlanID("Y");
			Log(casenum + "-" + policyid + "_Inception: " + PH.ReturnInceptionDate("N"));
			Log(casenum + "-" + policyid + "_Premium: " + PH.ReturnPremium("N"));
			PH.ClickEndorse();
			PRP1.ClickNext();
			if(driver.getPageSource().contains("Policy Rating Page 1")) {
					Log(casenum + "-" + policyid + "_Edit");
					logger.log(Status.SKIP, casenum + "-" + policyid + "_Edit");
					Log("============================== End " + casenum + " ===================================");
				return;
			}
			if(planid.toUpperCase().equals("HO3") || planid.toUpperCase().equals("HO4")) {			
				//Progressive Auto Less than 50/100-----------------------------------------------------------------
				PRP2.SelectPackagePolicyDiscount("P25");
				PRP2.ClickNext();
				if(driver.getPageSource().contains("Policy Rating Page 2")) {
						Log(casenum + "-" + policyid + "_Edit");
						logger.log(Status.SKIP, casenum + "-" + policyid + "_Edit");
						Log("============================== End " + casenum + " ===================================");
					return;
				}
				String P25 = PP.ReturnTotalPremium("N");
					Log(casenum + "-" + policyid + "_P25" + ": has a total premium of " + PP.ReturnTotalPremium("N"));
				PP.ClickBack();
				
				//Progressive Auto 50/100---------------------------------------------------------------------------
				PRP2.SelectPackagePolicyDiscount("P50");
				PRP2.ClickNext();
				if(driver.getPageSource().contains("Policy Rating Page 2")) {
						Log(casenum + "-" + policyid + "_Edit");
						logger.log(Status.SKIP, casenum + "-" + policyid + "_Edit");
						Log("============================== End " + casenum + " ===================================");
					return;
				}
				String P50 = PP.ReturnTotalPremium("N");
					Log(casenum + "-" + policyid + "_P50" + ": has a total premium of " + P50);
				PP.ClickBack();
				
				//Progressive Auto 100/300--------------------------------------------------------------------------
				PRP2.SelectPackagePolicyDiscount("P100");
				PRP2.ClickNext();
				if(driver.getPageSource().contains("Policy Rating Page 2")) {
						Log(casenum + "-" + policyid + "_Edit");
						logger.log(Status.SKIP, casenum + "-" + policyid + "_Edit");
						Log("============================== End " + casenum + " ===================================");
					return;
				}
				String P100 = PP.ReturnTotalPremium("N");
					Log(casenum + "-" + policyid + "_P100" + ": has a total premium of " + P100);
				PP.ClickBack();
				
				//Progressive Auto 250/500--------------------------------------------------------------------------
				PRP2.SelectPackagePolicyDiscount("P250");
				PRP2.ClickNext();
				if(driver.getPageSource().contains("Policy Rating Page 2")) {
						Log(casenum + "-" + policyid + "_Edit");
						logger.log(Status.SKIP, casenum + "-" + policyid + "_Edit");
						Log("============================== End " + casenum + " ===================================");
					return;
				}
				String P250 = PP.ReturnTotalPremium("N");
					Log(casenum + "-" + policyid + "_P250" + ": has a total premium of " + P250);
					Log(casenum + "-Final-" + policyid + ": " + P25 + "-" + P50 + "-" + P100 + "-" + P250);
					logger.log(Status.PASS, casenum + "-Final-" + policyid + ": " + P25 + "-" + P50 + "-" + P100 + "-" + P250);
			}
			else {
				//Progressive Auto----------------------------------------------------------------------------------
				PRP2.SelectPackagePolicyDiscount("PA");
				PRP2.ClickNext();
				if(driver.getPageSource().contains("Policy Rating Page 2")) {
						Log(casenum + "-" + policyid + "_Edit");
						Log("============================== End " + casenum + " ===================================");
					return;
				}
				String PA = PP.ReturnTotalPremium("N");
					Log(casenum + "-" + policyid + "_PA" + ": has a total premium of " + PA);
					Log(casenum + "-Final-" + policyid + ": " + PA);
					logger.log(Status.PASS, casenum + "-Final-" + policyid + ": " + PA);
			}	
				Log("============================== End " + casenum + " ===================================");	
		}
		catch(Exception e) {
				logger.log(Status.FAIL, casenum + "-" + policyid + ": Script has failed. Please rerun.");
				Log("============================== End " + casenum + " ===================================");				
		}
	}
	
	@AfterTest
	public void EndBatch() {
		QuitBrowser();
		extent.flush();
			Log("====================================== End PPD_CROSS_SELL Batch ===========================================");
	}
}