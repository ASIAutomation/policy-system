package Automation.PS.pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Automation.PS.testBase.TestBase;

public class AgencyPortal extends TestBase {
	
	public static final Logger log = Logger.getLogger(AgencyPortal.class.getName());
	
	WebDriver driver;
	
	@FindBy(xpath="//div[@title='Lookup a quote or policy']")//Button
	WebElement lookup;
	
	//Constructor
	public AgencyPortal(WebDriver driver)	{
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
	
	//Clicks the "Lookup" button
	public void ClickLookup() {
		lookup.click();
			Log("Clicked the \"Lookup\" button on the Agency Portal page");
	}
}