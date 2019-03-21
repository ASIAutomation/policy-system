package Automation.PS.PIAL.pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Automation.PS.testBase.TestBase;

public class GISLocator extends TestBase {
	
	public static final Logger log = Logger.getLogger(GISLocator.class.getName());
	
	WebDriver driver;
	
	@FindBy(id="txtMapSearch")//Text Box
	WebElement addressbox;
	
	@FindBy(id="btnSearch")//Button
	WebElement search;
	
	@FindBy(className="graded_area_protclass")//Text
	WebElement pc;
	
	//Constructor
	public GISLocator(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
	
	//Types into Address Search text box
	public void TypeAddressBox(String TypeAddressBox) {
		addressbox.clear();
		addressbox.sendKeys(TypeAddressBox);
			Log("Entered Address: " + TypeAddressBox);
	}
	
	//Click the "Search" button
	public void ClickSearch() {
		search.click();
			Log("Clicked the \"Search\" button on the GIS Locator page");
	}
	
	//Returns the Protection Class of the address searched
	public String ReturnProtectionClass(String Log) {
		try {
			if(pc.getText().toUpperCase().contains("NO")) {
				if(Log.toUpperCase().equals("Y") || Log.toUpperCase().equals("YES")) {
						Log("There is no protection class available in PIAL");
				}
				return "No Protection Class available";
			}
			else {
				if(Log.toUpperCase().equals("Y") || Log.toUpperCase().equals("YES")) {
						Log("The PIAL protection class value is " + pc.getText().substring(27));
				}
				return  pc.getText().substring(27);
			}
		}
		catch(Exception e) {
			if(Log.toUpperCase().equals("Y") || Log.toUpperCase().equals("YES")) {
					Log("Address is not valid");
			}
			return  "addressnotvalid";
		}
	}
}