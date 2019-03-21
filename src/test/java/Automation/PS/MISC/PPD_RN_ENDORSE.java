package Automation.PS.MISC;

import java.util.concurrent.TimeUnit;
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
import Automation.PS.pages.RenewalEndorsement;
import Automation.PS.testBase.TestBase;

@Listeners(Automation.PS.customListeners.CustomListeners.class)
public class PPD_RN_ENDORSE extends TestBase {
	
	public static final Logger log = Logger.getLogger(PPD_RN_ENDORSE.class.getName());
	
	String pgrautoselected;
	PolicyHistory PH;
	RenewalEndorsement RE;
	ExtentReports extent = new ExtentReports();
	ExtentHtmlReporter reporter = new ExtentHtmlReporter("T:\\Automations\\ExtentReports\\PS\\PPD_RN_ENDORSE\\PPD_RN_ENDORSE-" + GetDateTime() + ".html");
	
	@DataProvider(name="PPD_RN_ENDORSE")
	public String[][] GetPPD_RN_ENDORSEDataCall() {
		String[][] data = GetData("Data", "PPD_RN_ENDORSE", ".xlsx");
		return data;
	}	
	
	@BeforeTest
	public void SetUp() {
		RunBatches();
		SetLog();
			Log("====================================== Starting PPD_RN_ENDORSE Batch ======================================");
		InitAgentLogin("Chrome", "Live");
		//Initialize Drivers
		PH = new PolicyHistory(driver);
		RE = new RenewalEndorsement(driver);
	}
	
	@Test(dataProvider="PPD_RN_ENDORSE")
	public void RunPPD_RN_ENDORSE(String casenum, String policyid, String inceptiondate, String ppdvalue) throws InterruptedException {
		reporter.config().setTheme(Theme.DARK);
		extent.attachReporter(reporter);
		ExtentTest logger=extent.createTest("PPD_RN_ENDORSE");
		try {
				Log("============================== Starting " + casenum + " ==============================");
			GetURL("https://policy.americanstrategic.com/Policy/History.aspx?PolicyID=" + policyid + "&InceptionDate=" + inceptiondate);
			if(PH.ReturnPolicyStatus("N").equals("Cancelled")) {
					Log(casenum + "-" + policyid + ": is a cancelled.");
					logger.log(Status.SKIP, casenum + "-" + policyid + ": is a cancelled.");
					Log("============================== End " + casenum + " ===================================");
				return;			
			}
			PH.ClickRNEndorse();
				driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			try {
				RE.SelectPackagePolicyDiscount_PPD_ENDORSE(ppdvalue);
				pgrautoselected = "NO";
			}
			catch(Exception e1) {
				if(RE.ReturnPackagePolicyDiscount_PPD_ENDORSE().toUpperCase().equals("PROGRESSIVE AUTO")) {
						Log(casenum + "-" + policyid + ": Given value not found in dropdown. Already set to Progressive Auto.");
						logger.log(Status.SKIP, casenum + "-" + policyid + ": Given value not found in dropdown. Already set to Progressive Auto.");
						Log("============================== End " + casenum + " ===================================");
					driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
					return;	
				}
				try {
					RE.SelectPackagePolicyDiscount_PPD_ENDORSE("Progressive Auto");
					pgrautoselected = "YES";	
				}
				catch(Exception e2) {
						Log(casenum + "-" + policyid + ": Given value and \"Progressive Auto\" options not found in dropdown.");
						logger.log(Status.SKIP, casenum + "-" + policyid + ": Given value and \"Progressive Auto\" options not found in dropdown.");
						Log("============================== End " + casenum + " ===================================");
					driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
					return;	
				}
			}
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			RE.ClickPostEndorsement();
			if(driver.getPageSource().contains("Post Endorsement")) {
					Log(casenum + "-" + policyid + ": contains edits. Please take closer look: " + RE.ReturnEditText("N"));
					logger.log(Status.SKIP, casenum + "-" + policyid + ": contains edits. Please take closer look: " + RE.ReturnEditText("N"));
			}
			else if(pgrautoselected.equals("NO")) {
					Log(casenum + "-" + policyid + ": Completed and changed to " + ppdvalue + ".");
					logger.log(Status.PASS, casenum + "-" + policyid + ": Completed and changed to " + ppdvalue + ".");
			}
			else if(pgrautoselected.equals("YES")) {
					Log(casenum + "-" + policyid + ": Given value not found in dropdown. Completed and changed to Progressive Auto.");
					logger.log(Status.PASS, casenum + "-" + policyid + ": Given value not found in dropdown. Completed and changed to Progressive Auto.");
			}
				Log("============================== End " + casenum + " ===================================");
		}
		catch(Exception e) {
				Log(casenum + "-" + policyid + ": Script has failed. Please rerun.");
				logger.log(Status.FAIL,  casenum + "-" + policyid + ": Script has failed. Please rerun.");
				Log("============================== End " + casenum + " ===================================");			
		}
	}
	
	@AfterTest
	public void EndBatch() {
		QuitBrowser();
		extent.flush();
			Log("====================================== End PPD_RN_ENDORSE Batch ===========================================");
	}
}