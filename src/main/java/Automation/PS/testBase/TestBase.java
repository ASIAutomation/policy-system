package Automation.PS.testBase;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import java.util.Random;
import java.util.Set;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import org.apache.commons.codec.binary.Base64;
import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;
import Automation.PS.excelReader.Excel_Reader;

@SuppressWarnings("unused")
public class TestBase {
	
	public static final Logger log = Logger.getLogger(TestBase.class.getName());
	
	public static WebDriver driver;
	Excel_Reader excel;
	String browser;
	String psurl = "https://policy.americanstrategic.com/Policy/Lookup.aspx";
	String stagingpsurl = "https://uat-policy.americanstrategic.com/Policy/Lookup.aspx";
	
	//Initializes Agent Login
	public void InitAgentLogin(String Browser, String InitAgentLogin) {
		SelectBrowser(Browser);
			Log(Browser + " object created");
		if(InitAgentLogin.toUpperCase().equals("LIVE")) {
				Log("Navigating to " + psurl);
			driver.get(psurl);
		}
		else {
				Log("Navigating to " + stagingpsurl);
			driver.get(stagingpsurl);
		}
		ArrayList <String> list = new ArrayList <String>();
		BufferedReader objReader = null;
		try {
			String strCurrentLine;
			objReader = new BufferedReader(new FileReader("C:/Dev/Login.txt"));
			while ((strCurrentLine = objReader.readLine()) != null) {
				list.add(strCurrentLine);
			}
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		finally {
			try {
				if(objReader != null) {
					objReader.close();
				}
			}
			catch (IOException ex) {
				ex.printStackTrace();
			}
		}
		driver.findElement(By.id("username")).sendKeys(new String(Base64.decodeBase64(list.get(0))));//https://www.base64decode.org/
			Log("Entered username into Agent Login");
		driver.findElement(By.id("password")).sendKeys(new String(Base64.decodeBase64(list.get(1))));//https://www.base64decode.org/
			Log("Entered password into Agent Login");
		driver.findElement(By.xpath("//button[text()='Login']")).click();
			Log("Logged into Agent Login");		
	}
	
	//Logs into Agent Login within web instance
	public void InitAgentLoginInTab(String InitAgentLoginInTab) {
		if(InitAgentLoginInTab.toUpperCase().equals("LIVE")) {
				Log("Navigating to " + psurl);
			driver.get(psurl);
		}
		else {
				Log("Navigating to " + stagingpsurl);
			driver.get(stagingpsurl);
		}
		ArrayList <String> list = new ArrayList <String>();
		BufferedReader objReader = null;
		try {
			String strCurrentLine;
			objReader = new BufferedReader(new FileReader("C:/Dev/Login.txt"));
			while ((strCurrentLine = objReader.readLine()) != null) {
				list.add(strCurrentLine);
			}
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		finally {
			try {
				if(objReader != null) {
					objReader.close();
				}
			}
			catch (IOException ex) {
				ex.printStackTrace();
			}
		}
		driver.findElement(By.id("username")).sendKeys(new String(Base64.decodeBase64(list.get(0))));//https://www.base64decode.org/
			Log("Entered username into Agent Login");
		driver.findElement(By.id("password")).sendKeys(new String(Base64.decodeBase64(list.get(1))));//https://www.base64decode.org/
			Log("Entered password into Agent Login");
		driver.findElement(By.xpath("//button[text()='Login']")).click();
			Log("Logged into Agent Login");
	}
	
	//Initializes PIAL Login
	public void InitPIAL(String Browser) {
		SelectBrowser(Browser);
			Log(Browser + " object created");
		GetURL("https://rapid.pial.org/");
		driver.findElement(By.id("UserName")).sendKeys(new String(Base64.decodeBase64("bXBvd2Vyc0Bhc2ljb3JwLm9yZw==")));//https://www.base64decode.org/
			Log("Entered username into PIAL Login");
		driver.findElement(By.id("Password")).sendKeys(new String(Base64.decodeBase64("QVNJOTcyMw==")));//https://www.base64decode.org/
			Log("Entered password into PIAL Login");
		driver.findElement(By.id("RememberMe")).click();
		driver.findElement(By.xpath("//input[@value='Log In']")).click();
			Log("Logged into PIAL Login");
	}
	
	//Navigates to choosen URL
	public void GetURL(String GetURL) {
			Log("Navigating to " + GetURL);
		driver.get(GetURL);
	}

	//Sets log
	public void SetLog() {
		String log4jConfig = "log4j.properties";
		PropertyConfigurator.configure(log4jConfig);		
	}
	
	//Selects choosen browser
	public void SelectBrowser(String SelectBrowser) {
		if(SelectBrowser.equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/drivers/chromedriver.exe");
				Log("Creating object of " + SelectBrowser);
			ChromeOptions options = new ChromeOptions();
			options.setExperimentalOption("useAutomationExtension", false);
			driver = new ChromeDriver(options);
			
		}
		else if(SelectBrowser.equalsIgnoreCase("Firefox")) {
			System.setProperty("webdriver.firefox.marionette", System.getProperty("user.dir") + "/drivers/geckodriver.exe");
				Log("Creating object of " + SelectBrowser);
			driver = new FirefoxDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		browser = SelectBrowser;
	}
	
	//Gets excel data from data source
	public String[][] GetData(String SheetName, String ExcelName, String extension) {
		String path = System.getProperty("user.dir") + "/src/main/java/Automation/PS/data/" + ExcelName + extension;
		excel = new Excel_Reader(path);
		String[][] data = excel.GetDataFromSheet(SheetName, ExcelName);
		return data;
	}
	
	//Gets all window IDs and based on ID we can move to a specific window
	public Iterator<String> GetAllWindows() {
		Set<String> windows = driver.getWindowHandles();
		Iterator<String> itr = windows.iterator();
		return itr;
	}
	
	//Switches to selected tab
	public void SwitchTab(String SwitchTab) {
		Set<String> allwindows = driver.getWindowHandles();
		ArrayList<String> tabs = new ArrayList<>(allwindows);
		driver.switchTo().window(tabs.get(Integer.parseInt(SwitchTab)));
		switch(SwitchTab) {
			case "0":		Log("Driver has moved to the main tab");
						break;
						
			default:		Log("Driver has moved to tab " + SwitchTab);
						break;
		}			
	}
	
	//Quits session
	public void QuitBrowser() {
		driver.quit();
			Log(browser + " has quit");
	}
	
	public String GetDateTime() {
	    DateFormat df = new SimpleDateFormat("yyyy-MM-dd_hh-mm-ss");
	    df.setTimeZone(TimeZone.getTimeZone("US/Eastern"));
	    return df.format(new Date());
	}
	
	public String GetDate() {
	    DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
	    return df.format(new Date());
	}
	
	public String GetTime() {
	    DateFormat df = new SimpleDateFormat("hh-mm-ss");
	    df.setTimeZone(TimeZone.getTimeZone("US/Eastern"));
	    return df.format(new Date());
	}
	
	//Sets and takes screenshots
	public void GetFailScreenShot(String GetScreenShot) {
		Calendar calendar = Calendar.getInstance();
		SimpleDateFormat formater = new SimpleDateFormat("dd-MM-yyyy-hh-mm-ss");		
		File scrfile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try {
			String reportDirectory = new File(System.getProperty("user.dir")).getAbsolutePath() + "/src/main/java/Automation/PS/screenshots/screenshot_failures/";
			File destfile = new File((String)reportDirectory + GetScreenShot + "_" + formater.format(calendar.getTime()) + ".png");
			FileUtils.copyFile(scrfile, destfile);
			//This will help us to link the screenshots in TestNG report
			Reporter.log("<a href='" + destfile.getAbsolutePath() + "'> <img src='" + destfile.getAbsolutePath() + "' height='100' width='100'/> </a>");
		}
		catch(IOException ioe) {
			ioe.printStackTrace();
		}
	}
	
	//Sets and takes screenshots
	public void GetScreenShot(String GetScreenShot) {
		Calendar calendar = Calendar.getInstance();
		SimpleDateFormat formater = new SimpleDateFormat("dd-MM-yyyy-hh-mm-ss");		
		File scrfile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try {
			String reportDirectory = new File(System.getProperty("user.dir")).getAbsolutePath() + "/src/main/java/Automation/PS/screenshots/screenshot/";
			File destfile = new File((String)reportDirectory + GetScreenShot + "_" + formater.format(calendar.getTime()) + ".png");
			FileUtils.copyFile(scrfile, destfile);
			//This will help us to link the screenshots in TestNG report
			Reporter.log("<a href='" + destfile.getAbsolutePath() + "'> <img src='" + destfile.getAbsolutePath() + "' height='100' width='100'/> </a>");
		}
		catch(IOException ioe) {
			ioe.printStackTrace();
		}
	}	
	
	//Sets and takes screenshots, saves in specific location
	public void GetScreenShotOther(String GetScreenShotOther, String path) {
		Calendar calendar = Calendar.getInstance();
		SimpleDateFormat formater = new SimpleDateFormat("dd-MM-yyyy-hh-mm-ss");
		File scrfile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try {
			File destfile = new File((String)path + GetScreenShotOther + "_" + formater.format(calendar.getTime()) + ".png");
			FileUtils.copyFile(scrfile, destfile);
			//This will help us to link the screenshots in TestNG report
			Reporter.log("<a href='" + destfile.getAbsolutePath() + "'> <img src='" + destfile.getAbsolutePath() + "' height='100' width='100'/> </a>");
				Log("Screenshot taken of " + GetScreenShotOther);
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	//Logs in console and TestNG
	public void Log(String Log) {
		log.info(Log);
		Reporter.log(Log);
	}
	
	//Prints parameters passed into System.out 
	public void Print(String Print) {
		System.out.println(Print);
	}
	
	//Refreshes Page
	public void Refresh() {
		driver.navigate().refresh();
	}
	
	//Moves to specified webelement
	public void MoveToElement(WebElement MoveToElement) {
		Actions action = new Actions(driver);
		action.moveToElement(MoveToElement).build().perform();
			Log("Moved to webelement " + MoveToElement);
	}
	
	//Generates Number in given range
	public int RandomNum(int Min, int Max) {
		Random random = new Random();
		int rand = random.nextInt(Max)+Min;
		return rand;
	}
	
	//Runs any batch we have created
	public void RunBatches() {
		KillChromedriver();
		MakeTestOutputReadOnly();
	}	
	
	//Kills Chromedriver.exe
	public void KillChromedriver() {
		final Runtime rt = Runtime.getRuntime();
		try {
			rt.exec("cmd /C C:\\Dev\\killchromedriver.bat"); 
		}
		catch (final IOException e) {
			throw new RuntimeException("Failed to kill chromedriver.exe instaces");
		}
	}	
	
	//Set TestOutput to Read-only
	public void MakeTestOutputReadOnly() {
		final Runtime rt = Runtime.getRuntime();
		try {
			rt.exec("cmd /C C:\\Dev\\undo_ReadOnly_test-output.bat"); 
		}
		catch (final IOException e) {
			throw new RuntimeException("Failed to set testOutput to Read-only");
		}
	}	
	
	//Set TestOutput to Read-only
	public void RunSpecificBatch(String path) {
		final Runtime rt = Runtime.getRuntime();
		try {
			rt.exec("cmd /C " + path); 
		}
		catch (final IOException e) {
			throw new RuntimeException("Failed to run " + path + " batch");
		}
	}
	
	//Sets zoom
	public void SetZoom(String SetZoom) {
		((JavascriptExecutor)driver).executeScript("document.body.style.transform='scale(" + SetZoom + ")'");
	}
	
	//Sets sleep
	public void Pause(int Pause) throws InterruptedException {
		long starttime = System.currentTimeMillis();
		for(int count = 0;;count++) {
			long now = System.currentTimeMillis();
			if(((now-starttime) >= Pause)) break;
		}
	}
} 
