package Automation.PS.pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import Automation.PS.testBase.TestBase;

public class ProcessAdjustment extends TestBase {	
	
	public static final Logger log = Logger.getLogger(ProcessAdjustment.class.getName());
	
	WebDriver driver;
	
	@FindBy(id="ddlAdjustmentType")//Drop Down
	WebElement adjusttype;
	
	@FindBy(id="ddlAdjustmentCode")//Drop Down
	WebElement adjustcode;
	
	@FindBy(id="ddlDescription")//Drop Down
	WebElement descr;
	
	@FindBy(id="txtAdjustmentAmount")//Text Box
	WebElement paymentamt;
	
	@FindBy(id="txtCheckNumber")//Text Box
	WebElement checknum;
	
	@FindBy(id="btnPostToBatch")//Button
	WebElement addtobatch;
	
	//Constructor
	public ProcessAdjustment(WebDriver driver)	{
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
	
	//Selects "Adjustment Type" from drop down
	public void SelectAdjustmentType(String SelectAdjustmentType) {
		new Select(adjusttype).selectByVisibleText(SelectAdjustmentType);
			Log("Entered Adjustment Type: " + SelectAdjustmentType);
	}
	
	//Selects "Adjustment Code" from drop down
	public void SelectAdjustmentCode(String SelectAdjustmentCode) {
		new Select(adjustcode).selectByVisibleText(SelectAdjustmentCode);
			Log("Entered Adjustment Code: " + SelectAdjustmentCode);
	}
	
	//Selects "Description" from drop down
	public void SelectDescription(String SelectDescription) {
		new Select(descr).selectByVisibleText(SelectDescription);
			Log("Entered Description: " + SelectDescription);
	}
	
	//Types into "Payment Amount" text box
	public void TypePaymentAmount(String TypePaymentAmount) {
		paymentamt.clear();
		paymentamt.sendKeys(TypePaymentAmount);
			Log("Entered Payment Amount: " + TypePaymentAmount);
	}
	
	//Types into "Check Number" text box
	public void TypeCheckNumber(String TypeCheckNumber) {
		checknum.clear();
		checknum.sendKeys(TypeCheckNumber);
			Log("Entered Check Number: " + TypeCheckNumber);
	}
	
	//Clicks the "Add to Batch" button
	public void ClickAddToBatch() {
		addtobatch.click();
			Log("Clicked the \"Add to Batch\" button on the Process Adjustment page");
	}
}