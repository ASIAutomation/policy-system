package Automation.PS.MISC;

import org.openqa.selenium.By;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import Automation.PS.testBase.TestBase;

public class LATLONG extends TestBase {	
	
	@DataProvider(name="LATLONG")
	public String[][] GetLATLONGDataCall() {
		String[][] data = GetData("Data", "LATLONG", ".xlsx");
		return data;
	}	
	//update
	@BeforeTest
	public void SetUp() {
		RunBatches();
		SetLog();
			Log("====================================== Starting LATLONG Batch ======================================");
		SelectBrowser("Chrome");
	}
	
	@Test(dataProvider="LATLONG")
	public void RunLatLong(String casenum, String address) throws InterruptedException {
			Log("============================== Starting " + casenum + " ==============================");
		GetURL("https://www.google.com/maps");
		driver.findElement(By.id("searchboxinput")).sendKeys(address);
			Log("Entered Address: " + address);
		driver.findElement(By.id("searchbox-searchbutton")).click();
			Log("Searched Address");
			Pause(4000);
		String url = driver.getCurrentUrl();
		int start = url.indexOf("/@");
		if(url.contains(",17z")) {
			int end = url.indexOf(",17z");
			String LatLong = url.substring(start + 2, end);
				Log(casenum + "-" + address + ": " + LatLong);
		}
		else if(url.contains(",16z")) {
			int end = url.indexOf(",16z");
			String LatLong = url.substring(start + 2, end);
				Log(casenum + "-" + address + ": " + LatLong);
		}
		else if(url.contains(",14z")) {
			int end = url.indexOf(",14z");
			String LatLong = url.substring(start + 2, end);
				Log(casenum + "-" + address + ": " + LatLong);
		}
		else if(url.contains(",13z")) {
			int end = url.indexOf(",13z");
			String LatLong = url.substring(start + 2, end);
				Log(casenum + "-" + address + ": " + LatLong);
		}
			Log("============================== End " + casenum + " ===================================");		
	}
	
	@AfterTest
	public void EndBatch() {
		QuitBrowser();
			Log("====================================== End LATLONG Batch ===========================================");
	}
}