package Automation.PS.pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import Automation.PS.testBase.TestBase;

public class PlanAndResidenceType extends TestBase {	
	
	public static final Logger log = Logger.getLogger(PlanAndResidenceType.class.getName());
	
	WebDriver driver;
	
	@FindBy(id="txtFirstName")//Text Box
	WebElement firstname;
	
	@FindBy(id="txtLastName")//Text Box
	WebElement lastname;
	
	@FindBy(id="txtMiddleInitial")//Text Box
	WebElement middlename;
	
	@FindBy(id="txtCompanyName")//Text Box
	WebElement companyname;
	
	@FindBy(id="txtAddress1")//Text Box
	WebElement addy1;
	
	@FindBy(id="txtAddress2")//Text Box
	WebElement addy2;
	
	@FindBy(id="txtCity")//Text Box
	WebElement city;
	
	@FindBy(id="ddlStateList")//Drop Down
	WebElement state;
	
	@FindBy(id="txtZipCode")//Text Box
	WebElement zip;
	
	@FindBy(id="ddlAvailablePlans")//Drop Down
	WebElement plantype;
	
	@FindBy(id="ddlExcludeWind")//Drop Down
	WebElement excludewind;
	
	@FindBy(id="ddlTypeResidence")//Drop Down
	WebElement residencetype;
	
	@FindBy(id="ddlProductType")//Drop Down
	WebElement producttype;
	
	@FindBy(id="chkNewConstruction")//Check Box
	WebElement newconstruction;
	
	@FindBy(id="chkDisableDataPrefill")//Check Box
	WebElement disabledataprefill;
	
	@FindBy(id="chkEligibilityDeny")//Check Box
	WebElement eligiblebox;
	
	@FindBy(id="chkEligibilityRefer")//Check Box
	WebElement referralbox;
	
	@FindBy(id="chkTestRates")//Check Box
	WebElement testnewrates;
	
	@FindBy(xpath="//div[@id='valSummaryBlock']//ul")//Text
	WebElement edits;
	
	@FindBy(id="btnSave")//Button
	WebElement save;
	
	@FindBy(id="btnValidate")//Button
	WebElement next;
	
	@FindBy(id="AddressCode")//Check Box
	WebElement overrideaddress;
	
	@FindBy(id="AddressStandardization")//Check Box
	WebElement overrideaddressscrubber;
	
	@FindBy(id="EligibilityDeny")//Check Box
	WebElement overrideineligibleuwrules;
	
	@FindBy(id="txtOverrideNotes")//Text Box
	WebElement overridenotes;
	
	@FindBy(id="ddPPC")//Drop Down
	WebElement splitpc;
	
	@FindBy(id="Form_PLMaster_ProtectionClass")//Drop Down on page 1 - Needed for split pc return
	WebElement page1pc;
	
	@FindBy(id="dgAddress")//Table
	WebElement suiteaptnum;
	
	@FindBy(id="dgTerritorySelect")//Table
	WebElement territory;
	
	//Constructor
	public PlanAndResidenceType(WebDriver driver)	{
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
	
	//Types into "First Name" text box
	public void TypeFirstName(String TypeFirstName) {
		if(!TypeFirstName.toUpperCase().equals("N/A")) {
			firstname.clear();
			firstname.sendKeys(TypeFirstName);
				Log("Entered First Name: " + TypeFirstName);
		}
	}
	
	//Types into "Last Name" text box
	public void TypeLastName(String TypeLastName) {
		if(!TypeLastName.toUpperCase().equals("N/A")) {
			lastname.clear();
			lastname.sendKeys(TypeLastName);
				Log("Entered Last Name: " + TypeLastName);
		}
	}
	
	//Types into "Middle Name" text box
	public void TypeMiddleName(String TypeMiddleName) {
		if(!TypeMiddleName.toUpperCase().equals("N/A")) {
			middlename.clear();
			middlename.sendKeys(TypeMiddleName);
				Log("Entered Middle Name: " + TypeMiddleName);
		}
	}
	
	//Types into "Company Name" text box
	public void TypeCompanyName(String TypeCompanyName) {
		if(!TypeCompanyName.toUpperCase().equals("N/A")) {
			companyname.clear();
			companyname.sendKeys(TypeCompanyName);
				Log("Entered Company Name: " + TypeCompanyName);
		}
	}
	
	//Types into "Location Address" text box
	public void TypeLocationAddress(String TypeLocationAddress) {
		addy1.clear();
		addy1.sendKeys(TypeLocationAddress);
			Log("Entered Location Address: " + TypeLocationAddress);
	}
	
	//Types into "Unit/Suite #" text box
	public void TypeUnitSuite(String TypeUnitSuite) {
		if(!TypeUnitSuite.toUpperCase().equals("N/A")) {
			addy2.clear();
			addy2.sendKeys(TypeUnitSuite);
				Log("Entered Unit/Suite #: " + TypeUnitSuite);
		}
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
			Log("Entered State: " + SelectState);
	}
	
	//Types into "Zip" text box
	public void TypeZip(String TypeZip) {
		zip.clear();
		zip.sendKeys(TypeZip);
			Log("Entered Zip: " + TypeZip);
	}
	
	//Selects "Plan Type" from drop down
	public void SelectPlanType(String SelectPlanType) {
		new Select(plantype).selectByVisibleText(SelectPlanType);
			Log("Entered Plan Type: " + SelectPlanType);
	}
	
	//Selects "Plan Type" from drop down
	public void SelectPlanTypeByPlan(String SelectPlanType, String SelectCompany) {
		switch(SelectPlanType.toUpperCase()) {
			case "DP3":	driver.findElement(By.xpath("//select[@id='ddlAvailablePlans']//option[contains(text(),'DP3') and not(contains(text(),'Inactive'))]")).click();
						break;
				
			case "HO3":	driver.findElement(By.xpath("//select[@id='ddlAvailablePlans']//option[contains(text(),'HO3') and not(contains(text(),'Inactive'))]")).click();
						break;
				
			case "HO4":	if(SelectCompany.toUpperCase().equals("ASI")) {
							driver.findElement(By.xpath("//select[@id='ddlAvailablePlans']//option[contains(text(),'HO4') and contains(text(),'American') and not(contains(text(),'Inactive'))]")).click();
						}
						else {
							driver.findElement(By.xpath("//select[@id='ddlAvailablePlans']//option[contains(text(),'HO4') and contains(text(),'PGR') and not(contains(text(),'Inactive'))]")).click();
						}
						break;						
				
			case "HO5":	driver.findElement(By.xpath("//select[@id='ddlAvailablePlans']//option[contains(text(),'HO5') and not(contains(text(),'Inactive'))]")).click();
						break;
				
			case "HO6":	driver.findElement(By.xpath("//select[@id='ddlAvailablePlans']//option[contains(text(),'HO6') and not(contains(text(),'Inactive'))]")).click();
						break;
						
			case "UMB":	driver.findElement(By.xpath("//select[@id='ddlAvailablePlans']//option[contains(text(),'UMB') and not(contains(text(),'Inactive'))]")).click();
						break;
		}
			Log("Entered Plan Type: " + new Select(plantype).getFirstSelectedOption().getText());
	}
	
	//Selects "Exclude Wind" from drop down
	public void SelectExcludeWind(String SelectExcludeWind) {
		if(excludewind.isDisplayed()) {
			switch(SelectExcludeWind.toUpperCase()) {
				case "Y": case "YES":	new Select(excludewind).selectByVisibleText("Yes");
											Log("Entered Exclude Wind: Yes");
										break;
										
				case "N": case "NO":	new Select(excludewind).selectByVisibleText("No");
											Log("Entered Exclude Wind: No");
										break;			
			}			
		}
	}
	
	//Selects "Residence Type" from drop down
	public void SelectResidenceType(String SelectResidenceType) {
		new Select(residencetype).selectByVisibleText(SelectResidenceType);
			Log("Entered Residence Type: " + SelectResidenceType);
	}
	
	//Selects "Product Type" from drop down
	public void SelectProductType(String SelectProductType) {
		if(!SelectProductType.toUpperCase().equals("N/A")) {
			switch(SelectProductType.toUpperCase()) {
				case "FULL": case "F": case "FULL PERSONAL UMBELLA":		new Select(producttype).selectByVisibleText("Full Personal Umbrella");
																				Log("Entered Product Type: Full Personal Umbrella");
																			break;
										
				case "PREMISES": case "P": case "PREMISES ONLY UMBRELLA":	new Select(producttype).selectByVisibleText("Premises Only Umbrella");
																				Log("Entered Product Type: Premises Only Umbrella");
																			break;
																			
				default:														Log("Invalid value for SelectProductType()");
																			break;
			}
		}
	}	
	
	//Checks the "New Construction (Current Year Built)?" check box
	public void CheckNewConstruction(String CheckNewConstruction) {
		if(CheckNewConstruction.equals("Y")) {
			newconstruction.click();
				Log("Checked the \"New Construction (Current Year Built)?\" check box on the Plan and Residence Type page");			
		}
	}	
	
	//Checks the "Disable Data Prefill run?" check box
	public void CheckDisableDataPrefill(String CheckDisableDataPrefill) {
		if(CheckDisableDataPrefill.equals("Y")) {
			disabledataprefill.click();
				Log("Checked the \"Disable Data Prefill run?\" check box on the Plan and Residence Type page");			
		}
	}	
	
	//Checks the Ineligibility knockouts check boxes
	public void CheckKnockouts() {
		eligiblebox.click();
		referralbox.click();
			Log("Checked the ineligibility knockouts check boxes on the Plan and Residence Type page");	
	}	
	
	//Checks the "Test New Rates" check box
	public void CheckTestNewRates(String CheckTestNewRates) {
		if(CheckTestNewRates.equals("Y")) {
			testnewrates.click();
				Log("\"Test New Rates\" check box marked");			
		}	
		else {
				Log("\"Test New Rates\" check box NOT marked");
		}
	}
	
	//Types into "Notes" text box
	public void TypeOverrideNotes(String TypeOverrideNotes) {
		overridenotes.clear();
		overridenotes.sendKeys(TypeOverrideNotes);
			Log("Entered Override Notes: " + TypeOverrideNotes);
	}
	
	//Clicks the "Next" button
	public void ClickNext() {
		next.click();
			Log("Clicked the \"Next\" button on the Plan and Residence Type page");
	}
	
	//Checks the "Override Address?" override check boxes
	public void CheckOverrideAddress() {
		if(driver.getPageSource().contains("Override Address?")) {
			overrideaddress.click();
				Log("Checked the \"Override Address?\" check box on the Plan and Residence Type page");
		}
	}	
	
	//Checks the "Override Address Scrubber?" override check boxes
	public void CheckOverrideAddressScrubber() {
		if(driver.getPageSource().contains("Override Address Scrubber?")) {
			overrideaddressscrubber.click();
				Log("Checked the \"Override Address Scrubber?\" check box on the Plan and Residence Type page");
		}
	}	
	
	//Checks the "Override Ineligible UW Rules?" override check boxes
	public void CheckOverrideIneligibleUWRules() {
		if(driver.getPageSource().contains("Override Ineligible UW Rules?")) {
			overrideineligibleuwrules.click();
				Log("Checked the \"Override Ineligible UW Rules?\" check box on the Plan and Residence Type page");
		}
	}
	
	//Selects "Split PC" from drop down
	public void SelectSplitPC() {
		if(driver.getPageSource().contains("This address has a split protection class")) {
			new Select(splitpc).selectByIndex(1);
			if(driver.getPageSource().contains("Policy Rating Page 1")) {
				Log("Entered Split PC: " + new Select(page1pc).getFirstSelectedOption().getText());
			}
			else {
				Log("Entered Split PC: Lower PC");
			}
		}
	}
	
	//Clicks the appropriate "Split territory" button
	public void ClickSplitTerritory(String ClickSplitTerritory) {
		if(driver.getPageSource().contains("Please select the correct territory")) {
		
		}
	}
	
	//Checks the appropriate override check boxes
	public String ClickNextAndCheckOverrides() {
		ClickNext();
		SelectSplitPC();
		CheckOverrideAddress();
		CheckOverrideAddressScrubber();
		CheckOverrideIneligibleUWRules();
		if(driver.getPageSource().contains("Override Address?") || driver.getPageSource().contains("Override Address Scrubber?") || driver.getPageSource().contains("Override Ineligible UW Rules?")) {
			TypeOverrideNotes("Test");
			ClickNext();
			if(driver.getPageSource().contains("Plan and Residence Type")) {
					Log("There are edits/issues that need to be manually checked: \"" + edits.getText().trim().replaceAll("\\n", ",").replaceAll("   "," ").replaceAll("  "," ") + "\"");
				return "end";				
			}
		}
		else if(driver.getPageSource().contains("Plan and Residence Type")) {
				Log("There are edits/issues that need to be manually checked: \"" + edits.getText().trim().replaceAll("\\n", ",").replaceAll("   "," ").replaceAll("  "," ") + "\"");
			return "end";
		} 
		else {
			Log("Did not apply any overrides on the Plan and Residence Type page");
		}
		return null;
	}
	
	
	//Returns Edits
	public String ReturnEdits(String log) {
		String edittext = edits.getText().trim().replaceAll("\\n", ",").replaceAll("   "," ").replaceAll("  "," ") + "\"";	
		if(log.toUpperCase().equals("Y") || log.toUpperCase().equals("YES")) {
			Log("Plan and Residence Page: " + edittext);
		}
		return edittext;
	}
	
	//Clicks appropriate Unit/Suite # from table
	public void ClickSuiteAptNum() {

	}
	
	//Clicks appropriate territory from table
	public void ClickTerritory() {

	}		
	
	
	
	////////////////////////////
	//// Corelogic Section ////
	//////////////////////////
	
	public void typeres()
	{
		SelectResidenceType("Single Family");
		SelectResidenceType("Apartment");
		SelectResidenceType("Duplex");
		SelectResidenceType("Triplex");
		SelectResidenceType("Quadplex");
		SelectResidenceType("Condo");
		SelectResidenceType("Townhouse, Center");
		SelectResidenceType("Townhouse, End");
		SelectResidenceType("Rowhouse, Center");
		SelectResidenceType("Rowhouse, End");
		SelectResidenceType("Mobile Home");
		SelectResidenceType("Single Family");
	}
	
	
	
	
	
}