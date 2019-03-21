package Automation.PS.STATES.LA;

import java.util.concurrent.TimeUnit;
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
import Automation.PS.PIAL.pages.GISLocator;
import Automation.PS.pages.ApplicationPage;
import Automation.PS.pages.PolicyHistory;
import Automation.PS.pages.PolicyPremiums;
import Automation.PS.pages.PolicyRatingPage1;
import Automation.PS.pages.PolicyRatingPage2;
import Automation.PS.testBase.TestBase;

@Listeners(Automation.PS.customListeners.CustomListeners.class)
public class LA_PC_UPDATE extends TestBase {
	
	public static final Logger log = Logger.getLogger(LA_PC_UPDATE.class.getName());
	
	GISLocator GIS;
	PolicyHistory PH;
	PolicyRatingPage1 PRP1;
	PolicyRatingPage2 PRP2;
	PolicyPremiums PP;
	ApplicationPage AP;
	ExtentReports extent = new ExtentReports();
	ExtentHtmlReporter reporter = new ExtentHtmlReporter("T:\\Automations\\ExtentReports\\PS\\LA_PC_UPDATE\\LA_PC_UPDATE-" + GetDateTime() + ".html");
	
	@DataProvider(name="LA_PC_UPDATE")
	public String[][] GetLA_PC_UPDATEDataCall() {
		String[][] data = GetData("Data", "LA_PC_UPDATE", ".xlsx");
		return data;
	}
	
	@BeforeTest
	public void SetUp() {
		RunBatches();
		SetLog();
			Log("====================================== Starting LA_PC_UPDATE Batch ======================================");
		InitPIAL("Chrome");
		InitAgentLoginInTab("Live");
		//Initialize Drivers
		GIS = new GISLocator(driver);
		PH = new PolicyHistory(driver);
		PRP1 = new PolicyRatingPage1(driver);
		PRP2 = new PolicyRatingPage2(driver);
		PP = new PolicyPremiums(driver);
		AP = new ApplicationPage(driver);
	}
	
	@Test(dataProvider="LA_PC_UPDATE")
	public void RunLA_PC_UPDATE(String casenum, String policyid, String address, String inceptdate, String effdate, String morethanthirtydaywindow)	{
		reporter.config().setTheme(Theme.DARK);
		extent.attachReporter(reporter);
		ExtentTest logger=extent.createTest("LA_PC_UPDATE");
		try {
				Log("============================== Starting " + casenum + " ==============================");
			GetURL("https://rapid.pial.org/GradedArea/FindByAddress");
			GIS.TypeAddressBox(address);
			GIS.ClickSearch();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			if(GIS.ReturnProtectionClass("N").equals("addressnotvalid")) {
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
					Log(casenum + "-" + policyid + ": Address is not valid");
					logger.log(Status.SKIP, casenum + "-" + policyid + ": Address is not valid");
					Log("============================== End " + casenum + " ===================================");
				return;	
			}
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			String pialpcvalue = GIS.ReturnProtectionClass("Y");
			if(pialpcvalue.equals("No Protection Class available")) {
					Log(casenum + "-" + policyid + ": No Protection Class available in PIAL");
					logger.log(Status.SKIP, casenum + "-" + policyid + ": No Protection Class available in PIAL");
					Log("============================== End " + casenum + " ===================================");
				return;			
			}
			GetURL("https://policy.americanstrategic.com/Policy/History.aspx?PolicyID=" + policyid + "&InceptionDate=" + inceptdate);
			if(PH.ReturnPolicyStatus("N").equals("Cancelled")) {
					Log(casenum + "-" + policyid + ": Is a cancelled");
					logger.log(Status.SKIP, casenum + "-" + policyid + ": Is a cancelled");
					Log("============================== End " + casenum + " ===================================");
				return;			
			}
			String startpremium = PH.ReturnPremium("Y");
			PH.ClickEndorse();
			if(!driver.getPageSource().contains("Policy Rating Page 1")) {
					Log(casenum + "-" + policyid + ": Unable to load Endorsement page.");
					logger.log(Status.FAIL, casenum + "-" + policyid + ": Unable to load Endorsement page.");
					Log("============================== End " + casenum + " ===================================");
				QuitBrowser();
				InitPIAL("Chrome");
				InitAgentLoginInTab("Live");
				//Initialize Drivers
				GIS = new GISLocator(driver);
				PH = new PolicyHistory(driver);
				PRP1 = new PolicyRatingPage1(driver);
				PRP2 = new PolicyRatingPage2(driver);
				PP = new PolicyPremiums(driver);
				AP = new ApplicationPage(driver);
				return;			
			}
			if(Integer.parseInt(morethanthirtydaywindow) >= 30) {
				if(Integer.parseInt(pialpcvalue) > Integer.parseInt(PRP1.ReturnProtectionClass())) {
						Log(casenum + "-" + policyid + ": The PIAL PC value of " + pialpcvalue + " is greater than the PS PC value of " + PRP1.ReturnProtectionClass() + ". The inception date is more than 30 days in the past from today");
						logger.log(Status.SKIP, casenum + "-" + policyid + ": The PIAL PC value of " + pialpcvalue + " is greater than the PS PC value of " + PRP1.ReturnProtectionClass() + ". The inception date is more than 30 days in the past from today");
						Log("============================== End " + casenum + " ===================================");
					return;			
				}			
			}
				Log("PS Protection Class: " + PRP1.ReturnProtectionClass());
			if(PRP1.ReturnProtectionClass().equals(pialpcvalue)) {
					Log(casenum + "-" + policyid + ": The PS PC value matches the PIAL PC value");
					logger.log(Status.SKIP, casenum + "-" + policyid + ": The PS PC value matches the PIAL PC value");
					Log("============================== End " + casenum + " ===================================");
				return;	
			}
			PRP1.TypeEffectiveDate(effdate);
			PRP1.ForceSelectProtectionClass(pialpcvalue);
			if(PRP1.ClickNextAndConfirmEdits(casenum, policyid).equals("edits")) {
					logger.log(Status.SKIP, casenum + "-" + policyid + ": There were edits that could not be overridden through on Policy Rating Page 1.");
					Log("============================== End " + casenum + " ===================================");
				return;
			}
			if(PRP2.ClickNextAndConfirmEdits(casenum, policyid).equals("edits")) {
					logger.log(Status.SKIP, casenum + "-" + policyid + ": There were edits that could not be overridden through on Policy Rating Page 2.");
					Log("============================== End " + casenum + " ===================================");
				return;
			}
			String endpremium = PP.ReturnTotalPremium("Y").replace("$", "");
			PP.ClickOverride();
			if(driver.getPageSource().contains("Aluminum Wiring")) {
				if(AP.ReturnAluminumWiring().equals("N/A")) {
					AP.SelectAluminumWiring("No");
				}
			}
			AP.SelectTransactionDescr("Other");
			Log(startpremium + "-" + endpremium);
			if(startpremium.equals(endpremium)) {
				AP.SelectSuppressDecPagePrinting("Yes");
			}
			AP.TypeNotes("PIAL PC Update");
			AP.ClickIssuePolicy();
			if(driver.getPageSource().contains("Policy Documents") && driver.getPageSource().contains("Homeowners Policy Documents")) {
					Log(casenum + "-" + policyid + ": Completed and PC changed to " + pialpcvalue);
					logger.log(Status.PASS, casenum + "-" + policyid + ": Completed and PC changed to " + pialpcvalue);
			}
			else {
				AP.ClickOverride();			
				if(driver.getPageSource().contains("Policy Documents") && driver.getPageSource().contains("Homeowners Policy Documents")) {
						Log(casenum + "-" + policyid + ": Completed and PC changed to " + pialpcvalue);
						logger.log(Status.PASS, casenum + "-" + policyid + ": Completed and PC changed to " + pialpcvalue);
				}
				else {
						Log(casenum + "-" + policyid + ": Unable to finish. Edits:" + AP.ReturnEditText("N"));
						logger.log(Status.FAIL, casenum + "-" + policyid + ": Unable to finish. Edits: " + AP.ReturnEditText("N"));
				}
			}		
				Log("============================== End " + casenum + " ===================================");
		}
		catch(Exception e) {
				GetFailScreenShot(casenum + "-LA_PC_UPDATE");
				Log(casenum + "-" + policyid + ": Script has failed. Please rerun.");
				logger.log(Status.FAIL, casenum + "-" + policyid + ": Script has failed. Please rerun.");
				Log("============================== End " + casenum + " ===================================");				
		}
	}	
	
	@AfterTest
	public void EndBatch() {
		QuitBrowser();
		extent.flush();
			Log("====================================== End LA_PC_UPDATE Batch ===========================================");
	}
}