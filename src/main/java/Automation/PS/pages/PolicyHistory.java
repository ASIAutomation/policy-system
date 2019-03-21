package Automation.PS.pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Automation.PS.testBase.TestBase;

public class PolicyHistory extends TestBase {	
	
	public static final Logger log = Logger.getLogger(PolicyHistory.class.getName());
	
	WebDriver driver;
	
	@FindBy(xpath="//a[contains(text(),'Policy Status')]")//Button
	WebElement policystatusmenu;
	
	@FindBy(xpath="//a[contains(text(),'Coverage Information')]")//Button
	WebElement coverageinformationpage;
	
	@FindBy(id="btnEndorse")//Button
	WebElement endorse;
	
	@FindBy(id="btnReview")//Button
	WebElement review;
	
	@FindBy(id="btnCancelRewrite")//Button
	WebElement cancelrewrite;	
	
	@FindBy(id="btnRNEndorse")//Button
	WebElement rnendorse;
	
	@FindBy(id="btnNonDollarEndorse")//Button
	WebElement nondollarendorse;
	
	@FindBy(id="lblPlanID")//Text
	WebElement planid;
	
	@FindBy(id="lblInceptionDate")//Text
	WebElement inceptdate;
	
	@FindBy(xpath="//span[@class='hstStatus']")//Text
	WebElement policystatus;
	
	@FindBy(name="ctl00$ctl00$MiddleContent$RatingContent$ctl60")//Text
	WebElement premium;
	
	@FindBy(xpath="//a[text()='New Memo']")//Button
	WebElement newmemo;
	
	
	//Constructor
	public PolicyHistory(WebDriver driver)	{
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
	
	//Clicks the "Policy Status" menu button
	public void ClickPolicyStatusMenu() {
		policystatusmenu.click();
			Log("Clicked the \"Policy Status\" menu button on the Policy History page.");
	}
	
	//Clicks the "Coverage Information" menu button
	public void ClickCoverageInformation() {
		coverageinformationpage.click();
			Log("Clicked the \"Coverage Information\" menu button on the Policy History page.");
	}
	
	//Clicks the "Endorse" button
	public void ClickEndorse() {
		try {
			endorse.click();
				Log("Clicked the \"Endorse\" button on the Policy History page.");			
		}
		catch(Exception e) {
				Log("There is no Endorse button for PolicyID.");
			return;
		}
	}
	
	public void ClickReview() {
		try {
			review.click();
				Log("Clicked the \"Review\" button on the Policy History page.");			
		}
		catch(Exception e) {
				Log("There is no Review button for PolicyID.");
			return;
		}
	}
	
	//Clicks the "Cancel/Rewrite" button
	public void ClickCancelRewrite() {
		try {
			cancelrewrite.click();
				Log("Clicked the \"Cancel/Rewrite\" button on the Policy History page.");			
		}
		catch(Exception e) {
				Log("There is no Cancel/Rewrite button for PolicyID.");
			return;
		}
	}
	
	//Clicks the "RN Endorse" button
	public void ClickRNEndorse() {
		try {
			rnendorse.click();
				Log("Clicked the \"RN Endorse\" button on the Policy History page");			
		}
		catch(Exception e) {
				Log("There is no RN Endorse button for PolicyID. Policy most likely is cancelled.");
			return;
		}
	}
	
	//Clicks the "Non $ Endorsement" button
	public void ClickNonDollarEndorse() {
		try {
			nondollarendorse.click();
				Log("Clicked the \"Non $ Endorsement\" button on the Policy History page.");			
		}
		catch(Exception e) {
				Log("There is no Non $ Endorsement button for PolicyID. Unable to find button.");
			return;
		}
	}
	
	//Returns the Inception Date of the policy
	public String ReturnInceptionDate(String log) {
		if(log.equals("Y")|| log.equals("Yes")) {
			Log("The Inception date for this policy is " + inceptdate.getText());
		}
		return inceptdate.getText();	
	}
	
	//Returns the PlanID of the policy
	public String ReturnPlanID(String log) {
		if(log.equals("Y")|| log.equals("Yes")) {
			Log("The PlanID for this policy is " + planid.getText());
		}
		return planid.getText();	
	}
	
	//Returns the status of the policy
	public String ReturnPolicyStatus(String log) {
		if(log.equals("Y")|| log.equals("Yes")) {
			Log("This policy is " + policystatus.getText().substring(8));
		}
		return policystatus.getText().substring(8);		
	}
	
	//Returns the Premium of the policy
	public String ReturnPremium(String log) {
		if(log.equals("Y")|| log.equals("Yes")) {
			Log("This policy has a premium of " + premium.getAttribute("value").trim());
		}
		return premium.getAttribute("value").trim();		
	}
	
	//Clicks the "New Memo" button
	public void ClickNewMemo() {
		newmemo.click();
			Log("Clicked the \"New Memo\" button on the Policy History page");
	}
}