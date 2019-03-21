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

import Automation.PS.pages.AgentACH;
import Automation.PS.testBase.TestBase;

@Listeners(Automation.PS.customListeners.CustomListeners.class)
public class Agent_ACH extends TestBase {
	
	public static final Logger log = Logger.getLogger(Agent_ACH.class.getName());
	
	AgentACH AG;
	ExtentReports extent = new ExtentReports();
	ExtentHtmlReporter reporter = new ExtentHtmlReporter("T:\\Automations\\ExtentReports\\PS\\AGENT_ACH\\AGENT_ACH-" + GetDateTime() + ".html");
	
	@DataProvider(name="Agent_ACH")
	public String[][] GetDirect_DepositsDataCall() {
		String[][] data = GetData("Data", "Agent_ACH", ".xlsx");
		return data;
	}	
	
	@BeforeTest
	public void SetUp() {
		RunBatches();
		SetLog();
			Log("====================================== Starting Agent_ACH Batch ======================================");
		InitAgentLogin("Chrome", "Live");
		GetURL("https://policy.americanstrategic.com/Maintenance/AgentACH.aspx");
		//Initialize Drivers
		AG = new AgentACH(driver);
	}
	
	@Test(dataProvider="Agent_ACH")
	public void RunDirect_Deposits(String casenum, String agentid, String checkname, String checkaddress,
	String checkcity, String checkstate, String checkzipcode, String routingnum, String accountnum) {
		reporter.config().setTheme(Theme.DARK);
		extent.attachReporter(reporter);
		ExtentTest logger=extent.createTest("Agent_ACH");
		try {
				Log("============================== Starting " + casenum + " ==============================");
			AG.TypeAgentID(agentid);
			AG.ClickLookup();
			AG.TypeCheckName(checkname);
			AG.TypeCheckAddress(checkaddress);
			AG.TypeCheckCity(checkcity);
			AG.SelectCheckState(checkstate);
			AG.TypeCheckZipCode(checkzipcode);
			AG.TypeRoutingNum(routingnum);
			AG.TypeAccountNum(accountnum);
			AG.CheckActiveAccount("YES");
			AG.CheckPermissionEnabled("NO");
			AG.ClickAddToBatch();
				logger.log(Status.PASS, casenum + "-" + agentid + ": completed.");
				Log("============================== End " + casenum + " ===================================");
		}
		catch(Exception e) {
				GetFailScreenShot(casenum + "-Agent_ACH_Error");
				logger.log(Status.FAIL, casenum + "-" + agentid + ": Script has failed. Please rerun.");
				Log("============================== End " + casenum + " ===================================");
		}
	}

	@AfterTest
	public void EndBatch() {
		AG.ClickExportToExcel();
		//AG.ClickSubmitBatch();
		//QuitBrowser();
		extent.flush();
			Log("====================================== End Agent_ACH Batch ===========================================");
	}
}