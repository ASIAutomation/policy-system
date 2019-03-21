package Automation.PS.pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Automation.PS.testBase.TestBase;

public class AddMemo extends TestBase {	
	
	public static final Logger log = Logger.getLogger(AddMemo.class.getName());
	
	WebDriver driver;
	
	@FindBy(id="txtNote")//Text Box
	WebElement memo;
	
	@FindBy(id="chkNoReply")//Check Box
	WebElement noreply;
	
	@FindBy(id="btnNext")//Button
	WebElement save;	
	
	//Constructor
	public AddMemo(WebDriver driver)	{
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
	
	//Types into "Note" text box
	public void TypeMemo(String TypeMemo) {
		memo.clear();
		memo.sendKeys(TypeMemo);
			Log("Entered Memo: " + TypeMemo);
	}
	
	//Checks the "No Reply Necessary" check box
	public void CheckNoReplyNecessary() {
		noreply.click();
			Log("Checked the \"No Reply Necessary\" check box on the Add Memo page");
	}
	
	//Clicks the "Save" button
	public void ClickSave() {
		save.click();
			Log("Clicked the \"Save\" button on the Add Memo page");
	}
}