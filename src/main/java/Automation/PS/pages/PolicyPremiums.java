package Automation.PS.pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import Automation.PS.testBase.TestBase;

public class PolicyPremiums extends TestBase {
	
public static final Logger log = Logger.getLogger(PolicyPremiums.class.getName());
	
	WebDriver driver;
	
	@FindBy(id="lblPolicyID")//Text
	WebElement policyid;
	
	@FindBy(id="lblTotalPrem")//Text
	WebElement totalprem;
	
	@FindBy(id="lblReplacementCost")//Text
	WebElement rpcamount;
	
	@FindBy(id="lblCreditScore")//Text
	WebElement creditscore;
	
	@FindBy(id="btnRunClue")//Button
	WebElement runclue;
	
	@FindBy(id="btnBack")//Button
	WebElement back;
	
	@FindBy(id="btnNext")//Button
	WebElement next;
	
	@FindBy(id="btnSave")//Button
	WebElement save;
	
	@FindBy(id="btnOverride")//Button
	WebElement override;
	
	//Constructor
	public PolicyPremiums(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver=driver;		
	}
	
	//Returns the PolicyID
	public String ReturnPolicyID() {
		String id = policyid.getText().substring(0, policyid.getText().indexOf(" "));		
			Log("PolicyID is " + id);
		return id;
	}
	
	//Returns the Policy Total Premium
	public String ReturnTotalPremium(String log) {
		if(log.toUpperCase().equals("Y") || log.toUpperCase().equals("YES")) {
			Log(policyid.getText() + " has a total premium of " + totalprem.getText());
		}
		return totalprem.getText();
	}
	
	//Returns the Replacement Cost Amount
	public String ReturnRPCAmount() {
			Log(policyid.getText() + " has a replacement cost value of " + rpcamount.getText());
		return rpcamount.getText();
	}
	
	//Returns the Insurance/Credit Score
	public String ReturnCreditScore() {
			Log(policyid.getText() + " has a insurance/credit score of " + creditscore.getText());
		return creditscore.getText();
	}
	
	//Clicks the "Run CLUE" button
	public void RunClue() {
		runclue.click();
			Log("Clicked the \"Run CLUE\" button on the Policy Premiums page");
	}
	
	//Clicks the "Back" button
	public void ClickBack() {
		back.click();
			Log("Clicked the \"Back\" button on the Policy Premiums page");
	}
	
	//Clicks the "Next" button
	public void ClickNext() {
		next.click();
			Log("Clicked the \"Next\" button on the Policy Premiums page");
	}
	
	//Clicks the "Save" button
	public void ClickSave() {
		save.click();
			Log("Clicked the \"Save\" button on the Policy Premiums page");
	}
	
	//Clicks the "Override" button
	public void ClickOverride() {
		override.click();
			Log("Clicked the \"Override\" button on the Policy Premiums page");
	}
}