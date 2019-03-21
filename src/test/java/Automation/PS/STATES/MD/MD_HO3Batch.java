package Automation.PS.STATES.MD;

import org.apache.log4j.Logger;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import Automation.PS.testBase.TestBase;

@Listeners(Automation.PS.customListeners.CustomListeners.class)
public class MD_HO3Batch extends TestBase {

	public static final Logger log = Logger.getLogger(MD_HO3Batch.class.getName());

	@BeforeTest
	public void SetUp() {
		RunBatches();
		SetLog();
			Log("====================================== Starting MD_HO3Batch Batch ======================================");
	}

	@Test
	public void RunMD_HO3() throws InterruptedException {
			Log("============================== Starting " + "casenum" + " ==============================");
			Log("============================== End " + "casenum" + " ==============================");		
	}

	@AfterTest
	public void EndBatch() {
		QuitBrowser();
			Log("====================================== End MD_HO3Batch Batch ===========================================");
	}		
}