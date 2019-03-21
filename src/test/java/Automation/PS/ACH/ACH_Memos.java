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
import Automation.PS.pages.AddMemo;
import Automation.PS.pages.PolicyHistory;
import Automation.PS.pages.RatingAndPolicyLookup;
import Automation.PS.testBase.TestBase;

@Listeners(Automation.PS.customListeners.CustomListeners.class)
public class ACH_Memos extends TestBase {

	public static final Logger log = Logger.getLogger(ACH_Memos.class.getName());

	RatingAndPolicyLookup RPL;
	PolicyHistory PH;
	AddMemo AM;
	ExtentReports extent = new ExtentReports();
	ExtentHtmlReporter reporter = new ExtentHtmlReporter("T:\\Automations\\ExtentReports\\PS\\ACH_Memos\\ACH_Memos-" + GetDateTime() + ".html");
 
	@DataProvider(name="ACH_Memos")
	public String[][] GetACH_MemosDataCall() {
		String[][] data = GetData("Data", "ACH_Memos", ".xlsx");
		return data;
	}	

	@BeforeTest
	public void SetUp() {
		RunBatches();
		SetLog();
			Log("====================================== Starting ACH_Memos Batch ======================================");
		InitAgentLogin("Chrome", "Live");
		driver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);
		//Initialize Drivers
		RPL = new RatingAndPolicyLookup(driver);
		PH = new PolicyHistory(driver);
		AM = new AddMemo(driver);
	}

	@Test(dataProvider="ACH_Memos")
	public void RunACH_Memos(String casenum, String policyid, String inceptdate, String memo) {
		reporter.config().setTheme(Theme.DARK);
		extent.attachReporter(reporter);
		ExtentTest logger=extent.createTest("ACH_Memos");
		try {
				Log("============================== Starting " + casenum + " ==============================");
			GetURL("https://policy.americanstrategic.com/Policy/Memos.aspx?PolicyID=" + policyid + "&InceptionDate=" + inceptdate);
			AM.TypeMemo(memo);
			AM.CheckNoReplyNecessary();
			AM.ClickSave();		
			if(driver.getPageSource().contains(memo) && driver.getPageSource().contains("Policy History")) {
					Log(casenum + "-" + policyid + ": completed and placed note " + memo);
				logger.log(Status.PASS,  casenum + "-" + policyid + ": completed and placed note " + memo);
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
			Log("====================================== End ACH_Memos Batch ===========================================");
	}
}