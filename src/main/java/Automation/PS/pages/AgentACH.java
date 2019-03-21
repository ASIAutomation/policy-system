package Automation.PS.pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import Automation.PS.testBase.TestBase;

public class AgentACH extends TestBase {	
	
	public static final Logger log = Logger.getLogger(AgentACH.class.getName());
	
	WebDriver driver;
	
	@FindBy(id="txtSearchID")//Text Box
	WebElement searchid;

	@FindBy(id="btnLookup")//Button
	WebElement lookup;

	@FindBy(id="txtCheckName")//Text Box
	WebElement checknames;

	@FindBy(id="txtCheckAddress")//Text Box
	WebElement checkaddress;

	@FindBy(id="txtCheckCity")//Text Box
	WebElement checkcity;

	@FindBy(id="ddlCheckState")//Drop Down
	WebElement checkstate;

	@FindBy(id="txtCheckZipCode")//Text Box
	WebElement checkzipcode;

	@FindBy(id="txtRoutingNum")//Text Box
	WebElement routingnum;

	@FindBy(id="txtAccountNum")//Text Box
	WebElement accountnum;

	@FindBy(id="chkActiveAcct")//Check Box
	WebElement activeacct;

	@FindBy(id="chkPermissionEnabled")//Check Box
	WebElement permissionenabled;

	@FindBy(id="btnAddToBatch")//Button
	WebElement addtobatch;
	
	@FindBy(id="btnExport")//Button
	WebElement export;
	
	@FindBy(id="btnSubmitBatch")//Button
	WebElement submitbatch;

	
	//Constructor
	public AgentACH(WebDriver driver) {
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
			Log("Clicked the \"Lookup\" button on the Agent ACH page");
	}
	
	//Types into "Name" text box
	public void TypeCheckName(String TypeCheckName) {
		checknames.clear();
		checknames.sendKeys(TypeCheckName);
			Log("Typed Name: " + TypeCheckName);
	}	
	
	//Types into "Address" text box
	public void TypeCheckAddress(String TypeCheckAddress) {
		checkaddress.clear();
		checkaddress.sendKeys(TypeCheckAddress);
			Log("Typed Address: " + TypeCheckAddress);
	}	
	
	//Types into "City" text box
	public void TypeCheckCity(String TypeCheckCity) {
		checkcity.clear();
		checkcity.sendKeys(TypeCheckCity);
			Log("Typed City: " + TypeCheckCity);
	}	
	
	//Selects "State" from drop down
	public void SelectCheckState(String SelectCheckState) {
		new Select(checkstate).selectByValue(SelectCheckState);
			Log("Entered State: " + new Select(checkstate).getFirstSelectedOption().getText());
	}
		
	//Types into "Zip Code" text box
	public void TypeCheckZipCode(String TypeCheckZipCode) {
		checkzipcode.clear();
		checkzipcode.sendKeys(TypeCheckZipCode);
			Log("Typed Zip Code: " + TypeCheckZipCode);
	}	
	
	//Types into "Routing #" text box
	public void TypeRoutingNum(String TypeRoutingNum) {
		routingnum.clear();
		routingnum.sendKeys(TypeRoutingNum);
			Log("Typed Routing #: " + TypeRoutingNum);
	}	
	
	//Types into "Account #" text box
	public void TypeAccountNum(String TypeAccountNum) {
		accountnum.clear();
		accountnum.sendKeys(TypeAccountNum);
			Log("Typed Account #: " + TypeAccountNum);
	}	
	
	//Checks "Active Account?" check box 
	public void CheckActiveAccount(String CheckActiveAccount) {
		if(!CheckActiveAccount.toUpperCase().equals("N/A")) {
			if(activeacct.isSelected()) {
				switch(CheckActiveAccount.toUpperCase()) {
					case "Y": case "YES":		Log("\"Active Account?\" check box marked");
											break;
											
					case "N": case "NO":	activeacct.click();
												Log("\"Active Account?\" check box NOT marked");
											break;
				}
			}
			else {
				switch(CheckActiveAccount.toUpperCase()) {
					case "Y": case "YES":	activeacct.click();
												Log("\"Active Account?\" check box marked");
											break;
											
					case "N": case "NO":		Log("\"Active Account?\" check box NOT marked");
											break;
				}			
			}
		}
	}

	//Checks "Permission Enabled?" check box 
	public void CheckPermissionEnabled(String CheckPermissionEnabled) {
		if(!CheckPermissionEnabled.toUpperCase().equals("N/A")) {
			if(permissionenabled.isSelected()) {
				switch(CheckPermissionEnabled.toUpperCase()) {
					case "Y": case "YES":		Log("\"Permission Enabled?\" check box marked");
											break;
											
					case "N": case "NO":	permissionenabled.click();
												Log("\"Permission Enabled?\" check box NOT marked");
											break;
				}
			}
			else {
				switch(CheckPermissionEnabled.toUpperCase()) {
					case "Y": case "YES":	permissionenabled.click();
												Log("\"Permission Enabled?\" check box marked");
											break;
											
					case "N": case "NO":		Log("\"Permission Enabled?\" check box NOT marked");
											break;
				}			
			}
		}
	}
	
	//Clicks the "Add To Batch" button
	public void ClickAddToBatch() {
		addtobatch.click();
			Log("Clicked the \"Add To Batch\" button on the Agent ACH page");
	}	
	
	//Clicks the "Export to Excel" button
	public void ClickExportToExcel() {
		export.click();
			Log("Clicked the \"Export to Excel\" button on the Agent ACH page");
	}
	
	//Clicks the "Submit Batch" button
	public void ClickSubmitBatch() {
		submitbatch.click();
			Log("Clicked the \"Submit Batch\" button on the Agent ACH page");
	}	
}