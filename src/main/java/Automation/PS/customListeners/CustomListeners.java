package Automation.PS.customListeners;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;
import Automation.PS.testBase.TestBase;

public class CustomListeners extends TestBase implements ITestListener{
	
	@Override
	public void onTestStart(ITestResult result) {
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		Calendar calendar = Calendar.getInstance();
		SimpleDateFormat formater = new SimpleDateFormat("dd-MM-yyyy-hh-mm-ss");
		String methodname = result.getName();		
		if(!result.isSuccess()) {
			File scrfile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			try {
				String reportDirectory = new File(System.getProperty("user.dir")).getAbsolutePath() + "/src/main/java/Automation/PS/screenshots/screenshot_failures";
				File destfile = new File((String)reportDirectory + "/screenshot_failures/" + methodname + "_" + formater.format(calendar.getTime()) + ".png");
				FileUtils.copyFile(scrfile, destfile);
				//This will help us to link the screenshots in TestNG report
				Reporter.log("<a href='" + destfile.getAbsolutePath() + "'> <img src='" + destfile.getAbsolutePath() + "' height='100' width='100'/> </a>");
			}
			catch(IOException ioe) {
				ioe.printStackTrace();
			}
		}
			Log("!!!!!!!!!!!!!!! " + methodname + " failed current case. Please check failed screenshots !!!!!!!!!!!!!!!");
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
	}

	@Override
	public void onStart(ITestContext context) {

	}

	@Override
	public void onFinish(ITestContext context) {
		
	}
}
