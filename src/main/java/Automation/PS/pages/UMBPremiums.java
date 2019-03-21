package Automation.PS.pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import Automation.PS.testBase.TestBase;

public class UMBPremiums extends TestBase {	
	
	public static final Logger log = Logger.getLogger(UMBPremiums.class.getName());
	
	WebDriver driver;
	
	@FindBy(id="tdPolicyID")//Button
	WebElement policyid;
	
	@FindBy(id="lblTotalPrem")//Button
	WebElement totalpremium;
	
	@FindBy(id="btnNext")//Button
	WebElement next;
	
	@FindBy(id="btnSave")//Button
	WebElement save;
	
	//Constructor
	public UMBPremiums(WebDriver driver)	{
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
	
	//Returns the PolicyID
	public String ReturnPolicyID(String log) {
		if(log.toUpperCase().equals("Y") || log.toUpperCase().equals("YES")) {
			Log("PolicyID is " + policyid.getText());
		}
		return policyid.getText();
	}
	
	//Returns the Policy Total Premium
	public String ReturnTotalPremium(String log) {
		if(log.toUpperCase().equals("Y") || log.toUpperCase().equals("YES")) {
			Log(policyid.getText() + " has a total premium of " + totalpremium.getText());
		}
		return totalpremium.getText();
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
}