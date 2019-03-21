package Automation.PS.ACH;

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
import Automation.PS.pages.ProcessAdjustment;
import Automation.PS.testBase.TestBase;

@Listeners(Automation.PS.customListeners.CustomListeners.class)
public class ACH_ReverseNSF extends TestBase {
	
	public static final Logger log = Logger.getLogger(ACH_ReverseNSF.class.getName());
	
	ProcessAdjustment PA;
	ExtentReports extent = new ExtentReports();
	ExtentHtmlReporter reporter = new ExtentHtmlReporter("T:\\Automations\\ExtentReports\\PS\\ACH_NonNSF\\ACH_NonNSF-" + GetDateTime() + ".html");
	
	@DataProvider(name="ACH_NonNSF")
	public String[][] GetACH_NonNSFDataCall() {
		String[][] data = GetData("Data", "ACH_ReverseNSF", ".xlsx");
		return data;
	}	
	
	@BeforeTest
	public void SetUp() {
		RunBatches();
		SetLog();
			Log("====================================== Starting ACH_NonNSF Batch ======================================");
		InitAgentLogin("Chrome", "Live");
		//Initialize Drivers
		PA = new ProcessAdjustment(driver);
	}
	
	@Test(dataProvider="ACH_NonNSF")
	public void RunACH_NonNSF(String casenum, String policyid, String inceptdate, String adjustmentcode, String adjustmentamt, String checknum) {
		reporter.config().setTheme(Theme.DARK);
		extent.attachReporter(reporter);
		ExtentTest logger=extent.createTest("ACH_ReverseNSF");
		try {
				Log("============================== Starting " + casenum + " ==============================");
			GetURL("https://policy.americanstrategic.com/CashPosting/ProcessAdjustment.aspx?PolicyID=" + policyid + "&InceptionDate=" + inceptdate);
			PA.SelectAdjustmentType("Adjustment");
			PA.SelectAdjustmentCode(adjustmentcode);
			PA.SelectDescription("Miscellaneous");
			PA.TypePaymentAmount(adjustmentamt);
			if(checknum.toUpperCase().equals("N/A")){
				Log("Check Number is blank");
			}
			else {
				PA.TypeCheckNumber(checknum);
			}
			PA.ClickAddToBatch();
				logger.log(Status.PASS,  casenum + "-" + policyid + ": completed.");
				Log("============================== End " + casenum + " ===================================");
		}
		catch(Exception e) {
				logger.log(Status.FAIL,  casenum + "-" + policyid + ": Script has failed. Please rerun.");
				Log("============================== End " + casenum + " ===================================");			
		}
	}
	
	@AfterTest
	public void EndBatch() {
		GetURL("https://policy.americanstrategic.com/CashPosting/EditBatch.aspx");
		extent.flush();
			Log("PLEASE CHECK AND MAKE SURE THAT TOTAL AMOUNT MATCHES TOTAL GIVEN BY FINANCE. CHECK THE EMAIL SENT FOR THE TOTAL");
			Log("====================================== End ACH_NonNSF Batch ===========================================");
	}
}