package Automation.PS.pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import Automation.PS.testBase.TestBase;

public class AddNote extends TestBase {	
	
	public static final Logger log = Logger.getLogger(AddNote.class.getName());
	
	WebDriver driver;
	
	@FindBy(id="ddlCategory")//Drop Down
	WebElement category;
	
	@FindBy(id="txtNote")//Text Box
	WebElement note;
	
	@FindBy(id="btnNext")//Button
	WebElement save;	
	
	//Constructor
	public AddNote(WebDriver driver)	{
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}

	//Selects "Category" from drop down
	public void SelectCategory(String SelectCategory) {
		if(!SelectCategory.toUpperCase().equals("N/A")) {
			new Select(category).selectByVisibleText(SelectCategory);
				Log("Entered Note Category: " + SelectCategory);
		}
	}
	
	//Types into "Note" text box
	public void TypeNote(String TypeNote) {
		note.clear();
		note.sendKeys(TypeNote);
			Log("Entered Note: " + TypeNote);
	}
	
	//Clicks the "Save" button
	public void ClickSave() {
		save.click();
			Log("Clicked the \"Save\" button on the Add Note page");
	}
}