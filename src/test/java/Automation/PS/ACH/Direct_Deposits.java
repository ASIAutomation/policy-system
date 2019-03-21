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
import Automation.PS.pages.DirectDeposits;
import Automation.PS.testBase.TestBase;

@Listeners(Automation.PS.customListeners.CustomListeners.class)
public class Direct_Deposits extends TestBase {
	
	public static final Logger log = Logger.getLogger(Direct_Deposits.class.getName());
	
	DirectDeposits DD;
	ExtentReports extent = new ExtentReports();
	ExtentHtmlReporter reporter = new ExtentHtmlReporter("T:\\Automations\\ExtentReports\\PS\\DIRECT_DEPOSITS\\DIRECT_DEPOSITS-" + GetDateTime() + ".html");
	
	@DataProvider(name="Direct_Deposits")
	public String[][] GetDirect_DepositsDataCall() {
		String[][] data = GetData("Data", "Direct_Deposits", ".xlsx");
		return data;
	}	
	
	@BeforeTest
	public void SetUp() {
		RunBatches();
		SetLog();
			Log("====================================== Starting Direct_Deposits Batch ======================================");
		InitAgentLogin("Chrome", "Live");
		GetURL("https://policy.americanstrategic.com/Maintenance/DirectDeposits.aspx");
		//Initialize Drivers
		DD = new DirectDeposits(driver);
	}
	
	@Test(dataProvider="Direct_Deposits")
	public void RunDirect_Deposits(String casenum, String agentid, String nameonaccount, String abanumber, String accountnumber) {
		reporter.config().setTheme(Theme.DARK);
		extent.attachReporter(reporter);
		ExtentTest logger=extent.createTest("Direct_Deposits");
		try {
				Log("============================== Starting " + casenum + " ==============================");
			DD.TypeAgentID(agentid);
			DD.ClickLookup();
			DD.TypeNameOnAccount(nameonaccount);	
			DD.TypeABANumber(abanumber);
			DD.TypeAccountNumber(accountnumber);
			DD.ClickAccountType("C");
			DD.ClickPersonalOrCommercial("C");
			DD.ClickAddNew();
				logger.log(Status.PASS, casenum + "-" + agentid + ": completed.");
				Log("============================== End " + casenum + " ===================================");
		}
		catch(Exception e) {
				GetFailScreenShot(casenum + "-Direct_Deposits_Error");
				logger.log(Status.FAIL, casenum + "-" + agentid + ": Script has failed. Please rerun.");
				Log("============================== End " + casenum + " ===================================");
		}
	}

	@AfterTest
	public void EndBatch() {
		DD.ClickExportToExcel();
		//DD.ClickSubmitBatch();
		//QuitBrowser();
		extent.flush();
			Log("====================================== End Direct_Deposits Batch ===========================================");
	}
}