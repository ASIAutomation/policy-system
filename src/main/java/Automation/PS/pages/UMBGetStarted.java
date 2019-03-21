package Automation.PS.pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import Automation.PS.testBase.TestBase;

public class UMBGetStarted extends TestBase {	
	
	public static final Logger log = Logger.getLogger(UMBGetStarted.class.getName());
	
	WebDriver driver;
	
	@FindBy(id="Form_PLMaster_AgentiD")//Drop Down
	WebElement agentid;
	
	@FindBy(id="Form_PLMaster_EffectiveDate")//Text Box
	WebElement effectivedate;
	
	@FindBy(id="Form_PLMaster_BirthDate")//Text Box
	WebElement dob;
	
	@FindBy(id="Form_PLInsured_HomePhone")//Text Box
	WebElement hphone;
	
	@FindBy(id="btnNext")//Button
	WebElement next;
	
	@FindBy(id="btnSave")//Button
	WebElement save;
	
	@FindBy(id="btnOverride")//Button
	WebElement override;
	
	//Constructor
	public UMBGetStarted(WebDriver driver)	{
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}

	//Selects "Agent" from drop down
	public void SelectAgent(String SelectAgent) {
		if(!SelectAgent.toUpperCase().equals("N/A")) {
			new Select(agentid).selectByValue(SelectAgent);
				Log("Entered Agent: " + SelectAgent);
		}
	}

	//Types into "Effective Date" date text box "MMDDYYYY"
	public void TypeEffectiveDate(String TypeEffectiveDate) {
		if(!TypeEffectiveDate.toUpperCase().equals("N/A")) {
			effectivedate.clear();
			effectivedate.sendKeys(TypeEffectiveDate);
				Log("Entered Effective Date: " + TypeEffectiveDate);
		}
	}

	//Types into "Date of Birth" date text box "MMDDYYYY"
	public void TypeDateofBirth(String TypeDateofBirth) {
		if(!TypeDateofBirth.toUpperCase().equals("N/A")) {
			dob.clear();
			dob.sendKeys(TypeDateofBirth);
				Log("Entered Date of Birth: " + TypeDateofBirth);
		}
	}

	//Types into "Home Phone" text box
	public void TypeHomePhone(String TypeHomePhone) {
		if(!TypeHomePhone.toUpperCase().equals("N/A")) {
			hphone.clear();
			hphone.sendKeys(TypeHomePhone);
				Log("Entered Home Phone: " + TypeHomePhone);
		}
	}

	//Clicks the "Next" button
	public void ClickNext() {
		next.click();
			Log("Clicked the \"Next\" button on the Get Started page");
	}

	//Clicks the "Save" button
	public void ClickSave() {
		save.click();
			Log("Clicked the \"Save\" button on the Get Started page");
	}

	//Clicks the "Override" button
	public void ClickOverride() {
		override.click();
			Log("Clicked the \"Override\" button on the Get Started page");
	}
}