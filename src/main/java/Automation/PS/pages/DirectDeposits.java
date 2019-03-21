package Automation.PS.pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import Automation.PS.testBase.TestBase;

public class DirectDeposits extends TestBase {	
	
	public static final Logger log = Logger.getLogger(DirectDeposits.class.getName());
	
	WebDriver driver;
	
	@FindBy(id="txtSearchID")//Text Box
	WebElement searchid;

	@FindBy(id="btnLookup")//Button
	WebElement lookup;

	@FindBy(id="txtNameOnAccount")//Text Box
	WebElement nameonaccount;

	@FindBy(id="txtABANumber")//Text Box
	WebElement abanumber;

	@FindBy(id="txtAccountNumber")//Text Box
	WebElement accountnumber;

	@FindBy(id="rdoChecking")//Radio Button
	WebElement checking;

	@FindBy(id="rdoSavings")//Radio Button
	WebElement savings;

	@FindBy(id="rdoPersonal")//Radio Button
	WebElement personal;

	@FindBy(id="rdoCommercial")//Radio Button
	WebElement commercial;

	@FindBy(id="btnAddToBatch")//Button
	WebElement addtobatch;

	@FindBy(id="btnDelete")//Button
	WebElement delete;
	
	@FindBy(id="btnSubmit")//Button
	WebElement submit;
	
	@FindBy(id="btnExport")//Button
	WebElement export;
	
	//Constructor
	public DirectDeposits(WebDriver driver)	{
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}

	//Types into "AgentID or Name" text box
	public void TypeAgentID(String TypeAgentID) {
		searchid.clear();
		searchid.sendKeys(TypeAgentID);
			Log("Typed AgentID or Name: " + TypeAgentID);
	}
	
	//Clicks the "Lookup" button
	public void ClickLookup() {
		lookup.click();
			Log("Clicked the \"Lookup\" button on the Direct Deposits page");
	}
	
	//Types into "Name on Account" text box
	public void TypeNameOnAccount(String TypeNameOnAccount) {
		nameonaccount.clear();
		nameonaccount.sendKeys(TypeNameOnAccount);
			Log("Typed Name on Account: " + TypeNameOnAccount);
	}	
	
	//Types into "ABA Number" text box
	public void TypeABANumber(String TypeABANumber) {
		abanumber.clear();
		abanumber.sendKeys(TypeABANumber);
			Log("Typed ABA Number: " + TypeABANumber);
	}	
	
	//Types into "Account Number" text box
	public void TypeAccountNumber(String TypeAccountNumber) {
		accountnumber.clear();
		accountnumber.sendKeys(TypeAccountNumber);
			Log("Typed Account Number: " + TypeAccountNumber);
	}	
	
	//Clicks the appropriate "Account Type" radio button
	public void ClickAccountType(String ClickAccountType) {
		if(!ClickAccountType.toUpperCase().equals("N/A")) {
			JavascriptExecutor executor = (JavascriptExecutor)driver; 
			switch(ClickAccountType.toUpperCase()) {		 	
				case "C": case "CHECKING":		executor.executeScript("arguments[0].click()", checking);
													Log("Clicked the \"Checking\" radio button on the Direct Deposits page");
						  						break;
				  		  	
				case "S": case "SAVINGS":		executor.executeScript("arguments[0].click()", savings);
													Log("Clicked the \"Savings\" radio button on the Direct Deposits page");
												break;
			}
		}
	}
	
	//Clicks the appropriate "Personal or Commercial" radio button
	public void ClickPersonalOrCommercial(String ClickPersonalOrCommercial) {
		if(!ClickPersonalOrCommercial.toUpperCase().equals("N/A")) {
			JavascriptExecutor executor = (JavascriptExecutor)driver; 
			switch(ClickPersonalOrCommercial.toUpperCase()) {		 	
				case "P": case "PERSONAL":		executor.executeScript("arguments[0].click()", personal);
													Log("Clicked the \"Personal\" radio button on the Direct Deposits page");
						  						break;
				  		  	
				case "C": case "COMMERCIAL":	executor.executeScript("arguments[0].click()", commercial);
													Log("Clicked the \"Commercial\" radio button on the Direct Deposits page");
												break;
			}
		}
	}
/*
	//Selects the "Checking" radio button
	public void SelectChecking() {
		checking.click();
			Log("Selected \"Checking\" as Account Type from the Direct Deposits page");
	}
	
	//Selects the "Savings" radio button
	public void SelectSavings() {
		savings.click();
			Log("Selected \"Savings\" as Account Type from the Direct Deposits page");
	}
	
	//Selects the "Personal" radio button
	public void SelectPersonal() {
		personal.click();
			Log("Selected \"Personal\" from the Direct Deposits page");
	}
	
	//Selects the "Commercial" radio button
	public void SelectCommercial() {
		commercial.click();
			Log("Selected \"Commercial\" from the Direct Deposits page");
	}
*/	
	//Clicks the "Add New" button
	public void ClickAddNew() {
		addtobatch.click();
			Log("Clicked the \"Add New\" button on the Direct Deposits page");
	}	
	
	//Clicks the "Delete" button
	public void ClickDelete() {
		delete.click();
			Log("Clicked the \"Delete\" button on the Direct Deposits page");
	}
	
	//Clicks the "Submit Batch" button
	public void ClickSubmitBatch() {
		submit.click();
			Log("Clicked the \"Submit Batch\" button on the Direct Deposits page");
	}
		
	//Clicks the "Export to Excel" button
	public void ClickExportToExcel() {
		export.click();
			Log("Clicked the \"Export to Excel\" button on the Direct Deposits page");
	}	
}