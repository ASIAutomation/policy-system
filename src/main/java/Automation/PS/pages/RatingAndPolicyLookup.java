package Automation.PS.pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import Automation.PS.testBase.TestBase;

public class RatingAndPolicyLookup extends TestBase {
	
	public static final Logger log = Logger.getLogger(RatingAndPolicyLookup.class.getName());
	
	WebDriver driver;
	
	@FindBy(id="ddlNewStateList")//Drop Down
	WebElement selectstate;
	
	@FindBy(id="btnCreateNewQuote")//Button
	WebElement createnewquote;
	
	@FindBy(id="txtPolicyID")//Text Box
	WebElement id;
	
	@FindBy(id="txtCompanyName")//Text Box
	WebElement companyname;
	
	@FindBy(id="txtFirstName")//Text Box
	WebElement fname;
	
	@FindBy(id="txtLastName")//Text Box
	WebElement lname;
	
	@FindBy(id="txtAddress1")//Text Box
	WebElement locaddy1;
	
	@FindBy(id="txtAddress2")//Text Box
	WebElement locaddy2;
	
	@FindBy(id="txtCity")//Text Box
	WebElement city;
	
	@FindBy(id="ddlStateList")//Drop Down
	WebElement state;
	
	@FindBy(id="txtZipCode")//Text Box
	WebElement zip;
	
	@FindBy(id="btnLookup")//Button
	WebElement lookupid;
	
	//Constructor
	public RatingAndPolicyLookup(WebDriver driver)	{
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
	
	//Selects "State" from drop down
	public void SelectStateForNewQuote(String SelectStateForNewQuote) {
		new Select(selectstate).selectByValue(SelectStateForNewQuote);
			Log("Entered State: " + new Select(selectstate).getFirstSelectedOption().getText());
	}
	
	//Clicks the "Create New Quote" button
	public void ClickCreateNewQuote() {
		createnewquote.click();
			Log("Clicked the \"Create New Quote\" button on the Rating & Policy Lookup page");
	}
	
	//Types into "Quote/Policy #" text box
	public void TypeQuotePolicy(String TypeQuotePolicy) {
		id.clear();
		id.sendKeys(TypeQuotePolicy);
			Log("Entered Quote/Policy #: " + TypeQuotePolicy);
	}
	
	//Types into "Company Name: (Commercial Products Only)" text box
	public void TypeCompanyName(String TypeCompanyName) {
		companyname.clear();
		companyname.sendKeys(TypeCompanyName);
			Log("Entered Company Name: (Commercial Products Only): " + TypeCompanyName);
	}
	
	//Types into "First Name" text box
	public void TypeFirstName(String TypeFirstName) {
		fname.clear();
		fname.sendKeys(TypeFirstName);
			Log("Entered First Name: " + TypeFirstName);
	}
	
	//Types into "Last Name" text box
	public void TypeLastName(String TypeLastName) {
		lname.clear();
		lname.sendKeys(TypeLastName);
			Log("Entered Last Name: " + TypeLastName);
	}
	
	//Types into "Location Address" text box
	public void TypeLocationAddress(String TypeLocationAddress) {
		locaddy1.clear();
		locaddy1.sendKeys(TypeLocationAddress);
			Log("Entered Location Address: " + TypeLocationAddress);
	}
	
	//Types into "Unit/Suite #" text box
	public void TypeUnitSuiteNum(String TypeUnitSuiteNum) {
		locaddy2.clear();
		locaddy2.sendKeys(TypeUnitSuiteNum);
			Log("Entered Unit/Suite #: " + TypeUnitSuiteNum);
	}
	
	//Types into "City" text box
	public void TypeCity(String TypeCity) {
		city.clear();
		city.sendKeys(TypeCity);
			Log("Entered City: " + TypeCity);
	}
	
	//Selects "State" from drop down
	public void SelectState(String SelectState) {
		new Select(state).selectByValue(SelectState);
			Log("Entered State: " + new Select(state).getFirstSelectedOption().getText());
	}
	
	//Types into "ZIP" text box
	public void TypeZIP(String TypeZIP) {
		zip.clear();
		zip.sendKeys(TypeZIP);
			Log("Entered ZIP: " + TypeZIP);
	}
	
	//Clicks the "Lookup" button
	public void ClickLookup() {
		lookupid.click();
			Log("Clicked the \"Lookup\" button on the Rating & Policy Lookup page");
	}
	
	//Clicks from the "Your Recent Quotes" buttons
	public void ClickYourRecentQuotes(String ClickYourRecentQuotes) {
		driver.findElement(By.xpath("//a[contains(@href,'" + ClickYourRecentQuotes + "')]")).click();;
			Log("Clicked the " + driver.findElement(By.xpath("//a[contains(@href,'" + ClickYourRecentQuotes + "')]")).getText() + " policy button on the Rating & Policy Lookup page");
	}
	
	//Clicks the most recent term for a chosen policy
	public void ClickPolicyLink(String ClickPolicyLink) {
		if(ClickPolicyLink.substring(0,3).toUpperCase().equals("PGR")) {
			String policylink = ClickPolicyLink.substring(3);
			driver.findElement(By.xpath("//a[contains(text(),'" + policylink + "')]")).click();
				Log("Clicked the the most recent term for PolicyID " + ClickPolicyLink + " on the Rating & Policy Lookup page");
		}
		else {
			driver.findElement(By.xpath("//a[contains(text(),'" + ClickPolicyLink + "')]")).click();
				Log("Clicked the the most recent term for PolicyID " + ClickPolicyLink + " on the Rating & Policy Lookup page");
		}
	}
}