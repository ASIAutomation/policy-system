package Automation.PS.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import Automation.PS.testBase.TestBase;

public class NonDollarEndorsement extends TestBase {	
	
	WebDriver driver;
	
	@FindBy(id="lblPolicyID")//Text
	WebElement policyid;
	
	@FindBy(id="Form_PLUnderwriting_CompanionAutoCompany")//Drop Down
	WebElement currentautoinsurer;
	
	@FindBy(id="Form_PLUnderwriting_CompanionAutoPolicyNum")//Text Box
	WebElement autopolicynum;
	
	@FindBy(id="Form_PLMaster_TransactionDescr")//Drop Down
	WebElement trandescr;
	
	@FindBy(id="Form_PLMaster_NumberPayments")//Drop Down
	WebElement numberpayments;
	
	@FindBy(id="Form_PLMaster_SuppressDec")//Drop Down
	WebElement suppressdec;
	
	@FindBy(id="Form_PLMaster_PostAsUser")//Drop Down
	WebElement agentusername;
	
	@FindBy(id="Form_PlNotes_Note")//Text Box
	WebElement notes;
	
	@FindBy(id="btnNext")//Button
	WebElement issuepolicy;
	
	@FindBy(id="btnOverride")//Button
	WebElement override;
	
	@FindBy(id="tblErrorMessages")//Text
	WebElement edits;	
	
	//Constructor
	public NonDollarEndorsement(WebDriver driver)	{
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}

	//Selects "Current Auto Insurer" drop down
	public void SelectCurrentAutoInsurer(String SelectCurrentAutoInsurer) {
		if(!SelectCurrentAutoInsurer.toUpperCase().equals("N/A")) {
			new Select(currentautoinsurer).selectByVisibleText(SelectCurrentAutoInsurer);
				Log("Entered Current Auto Insurer: " + SelectCurrentAutoInsurer);
		}
	}
	
	//Types into "Auto Policy #" text box
	public void TypeAutoPolicyNum(String TypeAutoPolicyNum) {
		if(!TypeAutoPolicyNum.toUpperCase().equals("N/A")) {
			autopolicynum.clear();
			autopolicynum.sendKeys(TypeAutoPolicyNum);
				Log("Entered Auto Policy #: " + TypeAutoPolicyNum);
		}
	}
	
	//Selects "Transaction Descr" from drop down
	public void SelectTransactionDescr(String SelectTransactionDescr) {
		new Select(trandescr).selectByVisibleText(SelectTransactionDescr);
			Log("Entered Transaction Descr: " + SelectTransactionDescr);
	}
	
	//Selects "Number of Payments" from drop down
	public void SelectNumberPayments(String SelectNumberPayments) {
		new Select(numberpayments).selectByVisibleText(SelectNumberPayments);
			Log("Entered Number of Payments: " + SelectNumberPayments);
	}	
	
	//Selects "Suppress Dec Page Printing" from drop down
	public void SelectSuppressDec(String SelectSuppressDec) {
		new Select(suppressdec).selectByVisibleText(SelectSuppressDec);
			Log("Entered Suppress Dec Page Printing: " + SelectSuppressDec);
	}	
	
	//Selects "Agent/User Name" from drop down
	public void SelectAgentUserNameByIndex(int SelectAgentUserName) {
		String agentusernamevalue = new Select(agentusername).getFirstSelectedOption().getText();
		if(agentusernamevalue.isEmpty() || agentusernamevalue.equals("") || agentusernamevalue == null) {
			new Select(agentusername).selectByIndex(SelectAgentUserName);
				Log("Entered Agent/User Name: " + new Select(agentusername).getFirstSelectedOption().getText());
		}
		else {
				Log("Agent/User Name already entered as: " + new Select(agentusername).getFirstSelectedOption().getText());
		}
	}
	
	//Types into "Notes" text box
	public void TypeNotes(String TypeNotes) {
		if(!TypeNotes.toUpperCase().equals("N/A")) {
			notes.clear();
			notes.sendKeys(TypeNotes);
				Log("Entered Notes: " + TypeNotes);
		}
	}
	
	//Returns Edit text
	public String ReturnEditText(String Log) {
		if(Log.toUpperCase().equals("Y") || Log.toUpperCase().equals("YES")) {
			Log("Edit(s) is(are): " + edits.getText().trim().replaceAll("\\n", ",").replaceAll("   "," ").replaceAll("  "," "));
		}
		return edits.getText().trim().replaceAll("\\n", ",").replaceAll("   "," ").replaceAll("  "," ");
	}
	
	//Returns the PolicyID
	public String ReturnPolicyID() {
		String id = policyid.getText().substring(0, policyid.getText().indexOf(" "));		
			Log("PS PolicyID is " + id);
		return id;
	}
	
	//Clicks the "Issue Policy" button
	public void ClickIssuePolicy() {
		issuepolicy.click();
			Log("Clicked the \"Issue Policy\" button on the Non Dollar Endorsement page");
	}
	
	public void ClickOverride() {
		override.click();
			Log("Clicked the \"Override\" button on the Non Dollar Endorsement page");
	}
}