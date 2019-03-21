package Automation.PS.ACH;

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
import Automation.PS.pages.AddNote;
import Automation.PS.testBase.TestBase;

@Listeners(Automation.PS.customListeners.CustomListeners.class)
public class ACH_AddNotes extends TestBase {

	public static final Logger log = Logger.getLogger(ACH_AddNotes.class.getName());

	PolicyHistory PH;
	AddNote AN;
	ExtentReports extent = new ExtentReports();
	ExtentHtmlReporter reporter = new ExtentHtmlReporter("T:\\Automations\\ExtentReports\\PS\\ACH_AddNotes\\ACH_AddNotes-" + GetDateTime() + ".html");

	@DataProvider(name="ACH_AddNotes")
	public String[][] GetACH_AddNotesDataCall() {
		String[][] data = GetData("Data", "ACH_AddNotes", ".xlsx");
		return data;
	}	

	@BeforeTest
	public void SetUp() {
		RunBatches();
		SetLog();
			Log("====================================== Starting ACH_AddNotes Batch ======================================");
		InitAgentLogin("Chrome", "Live");
		driver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);
		//Initialize Drivers
		PH = new PolicyHistory(driver);
		AN = new AddNote(driver);
	}

	@Test(dataProvider="ACH_AddNotes")
	public void RunACH_AddNotes(String casenum, String policyid, String inceptdate, String note) {
		reporter.config().setTheme(Theme.DARK);
		extent.attachReporter(reporter);
		ExtentTest logger=extent.createTest("ACH_AddNotes");
		try {
				Log("============================== Starting " + casenum + " ==============================");
			GetURL("https://policy.americanstrategic.com/Policy/Notes.aspx?PolicyID=" + policyid + "&InceptionDate=" + inceptdate);
			AN.SelectCategory("Policy Review");
			AN.TypeNote(note);
			AN.ClickSave();		
			if(driver.getPageSource().contains(note) && driver.getPageSource().contains("Policy History")) {
					Log(casenum + "-" + policyid + ": completed and placed note " + note);
				logger.log(Status.PASS,  casenum + "-" + policyid + ": completed and placed note " + note);
			}
			else {
					Log(casenum + "-" + policyid + ": failed, please take closer look");
				logger.log(Status.FAIL,  casenum + "-" + policyid + ": failed, please take closer look");
			}
				Log("============================== End " + casenum + " ===================================");	
		}
		catch(Exception e) {
			logger.log(Status.FAIL,  casenum + "-" + policyid + ": Script has failed. Please rerun.");
				Log("============================== End " + casenum + " ===================================");			
		}
	}

	@AfterTest
	public void EndBatch() {
		QuitBrowser();
		extent.flush();
			Log("====================================== End ACH_AddNotes Batch ===========================================");
	}
}