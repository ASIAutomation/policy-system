package Automation.PS.pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import Automation.PS.testBase.TestBase;

public class RenewalEndorsement extends TestBase {
	
	public static final Logger log = Logger.getLogger(RenewalEndorsement.class.getName());
	
	WebDriver driver;
	
	@FindBy(id="Covg_37D")//Drop Down
	WebElement ppd37D;
	
	@FindBy(id="Covg_37K")//Drop Down
	WebElement ppd37K;
	
	@FindBy(id="Covg_37")//Drop Down
	WebElement cp37;
	
	@FindBy(id="Covg_07")//Drop Down
	WebElement ol;
	
	@FindBy(id="tblErrorMessages")//Text
	WebElement edits;
	
	@FindBy(id="btnNext")//Button
	WebElement postendorsement;
	
	//Constructor
	public RenewalEndorsement(WebDriver driver)	{
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
	
	//Selects "Package Policy Discount" from drop down
	public void SelectPackagePolicyDiscount_PPD_ENDORSE(String SelectPackagePolicyDiscount) {
		if(driver.getPageSource().contains("Covg_37D")) {
			if(SelectPackagePolicyDiscount.toUpperCase().contains("LESS")) {
				new Select(ppd37D).selectByValue("C0");
			}
			else {
				new Select(ppd37D).selectByVisibleText(SelectPackagePolicyDiscount);
			}
				Log("Entered Package Policy Discount: " + new Select(ppd37D).getFirstSelectedOption().getText());
		}
		else if(driver.getPageSource().contains("Covg_37K")){
			if(SelectPackagePolicyDiscount.toUpperCase().contains("LESS")) {
				new Select(ppd37K).selectByValue("C0");
			}
			else {
				new Select(ppd37K).selectByVisibleText(SelectPackagePolicyDiscount);	
			}
				Log("Entered Package Policy Discount: " + new Select(ppd37K).getFirstSelectedOption().getText());
		}
		else {
			new Select(cp37).selectByVisibleText(SelectPackagePolicyDiscount);
				Log("Entered Package Policy Discount: " + new Select(cp37).getFirstSelectedOption().getText());
		}
	}
	
	//Returns "Package Policy Discount" value from drop down
	public String ReturnPackagePolicyDiscount_PPD_ENDORSE() {
		if(driver.getPageSource().contains("Covg_37D")) {
			return new Select(ppd37D).getFirstSelectedOption().getText();
		}
		else if(driver.getPageSource().contains("Covg_37K")){
			return new Select(ppd37K).getFirstSelectedOption().getText();
		}
		else {
			return new Select(cp37).getFirstSelectedOption().getText();
		}
	}
	
	//Selects "Ordinance or Law" from drop down
	public void SelectOrdinanceOrLaw(String SelectOrdinanceOrLaw) {
		new Select(ol).selectByVisibleText(SelectOrdinanceOrLaw);		
			Log("Entered Package Policy Discount: " + SelectOrdinanceOrLaw);		
	}
	
	//Returns Edit text
	public String ReturnEditText(String Log) {
		if(Log.toUpperCase().equals("Y") || Log.toUpperCase().equals("YES")) {
			Log("Edit(s) is(are): " + edits.getText().trim().replaceAll("\\n", ",").replaceAll("   "," ").replaceAll("  "," "));
		}
		return edits.getText().trim().replaceAll("\\n", ",").replaceAll("   "," ").replaceAll("  "," ");
	}
	
	//Clicks the "Post Endorsement" button
	public void ClickPostEndorsement() {
		postendorsement.click();
			Log("Clicked the \"Post Endorsement\" button on the Renewal Endorsement page");
	}
}