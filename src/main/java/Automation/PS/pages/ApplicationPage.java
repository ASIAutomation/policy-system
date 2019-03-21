package Automation.PS.pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import Automation.PS.testBase.TestBase;

public class ApplicationPage extends TestBase {
	
public static final Logger log = Logger.getLogger(ApplicationPage.class.getName());
	
	WebDriver driver;
	
	@FindBy(id="Form_PLDwelling_TypeElectrical")//Drop Down
	WebElement typeelectricalsystem;
	
	@FindBy(id="Form_PLDwelling_YearElectricalReplaced")//Text Box
	WebElement yearelectricalreplaced;
	
	@FindBy(id="Form_PLDwelling_YearHeatingACReplaced")//Text Box
	WebElement yearheatingandacreplaced;
	
	@FindBy(id="Form_PLDwelling_TypePlumbing")//Drop Down
	WebElement typeplumbingsystem;
	
	@FindBy(id="Form_PLDwelling_YearPlumbingReplaced")//Text Box
	WebElement yearplumbingreplaced;
	
	@FindBy(id="Form_PLDwelling_YearWaterHeaterReplaced")//Text Box
	WebElement yearwaterheaterreplaced;
	
	@FindBy(id="Form_PLDwelling_AluminumWiring")//Drop Down
	WebElement aluminumwiring;
	
	@FindBy(id="Form_PLDwelling_AluminumWiringCorrected")//Drop Down
	WebElement aluminumwiringcorrected;
	
	@FindBy(id="Form_PLDwelling_NumHouseholdRes")//Drop Down
	WebElement numhouseholdresidents;
	
	@FindBy(id="Form_PLUnderwriting_ShortSaleOrForeclosure")//Drop Down
	WebElement shortsaleorforeclosure;	
	
	@FindBy(id="Form_PlUnderwriting_ATV")//Drop Down
	WebElement atvonpremises;	
	
	@FindBy(id="Form_PlUnderwriting_ATVInsCarrier")//Drop Down
	WebElement atvcarrier;
	
	@FindBy(id="Form_PlUnderwriting_ATVInsPolicyNum")//Text Box
	WebElement atvpolicynum;		
	
	@FindBy(id="Form_PlUnderwriting_PriorInsuranceCarrier")//Drop Down
	WebElement priorhomeinsurer;
	
	@FindBy(id="Form_PlUnderwriting_PriorPolicyID")//Text Box
	WebElement priorpolicynum;	
	
	@FindBy(id="Form_PLUnderwriting_CompanionAutoCompany")//Drop Down
	WebElement currentautoinsurer;
	
	@FindBy(id="Form_PLUnderwriting_CompanionAutoPolicyNum")//Text Box
	WebElement autopolicynum;	
	
	@FindBy(id="Form_PlUnderwriting_numAnimals")//Drop Down
	WebElement howmanydogs;	
	
	@FindBy(id="Form_PlUnderwriting_ViciousDogs")//Drop Down
	WebElement followinganimalsowned;	
	
	@FindBy(id="Form_PLUnderwriting_FloodZone")//Drop Down
	WebElement fldzone;
	
	@FindBy(id="Form_PLUnderwriting_FloodPolicyNumber")//Text Box
	WebElement currentfldpolicynum;	
	
	@FindBy(id="Form_PLMaster_TransactionDescr")//Drop Down
	WebElement trandescr;
	
	@FindBy(id="Form_PLMaster_NumberPayments")//Drop Down
	WebElement numofpayments;
	
	@FindBy(id="Form_PLMaster_SuppressDec")//Drop Down
	WebElement suppressdecprinting;
	
	@FindBy(id="Form_PLMaster_PostAsUser")//Drop Down
	WebElement agentusername;
	
	@FindBy(id="Form_PlNotes_Note")//Text Box
	WebElement notes;
	
	@FindBy(id="btnNext")//Button
	WebElement issuepolicy;
	
	@FindBy(id="btnSave")//Button
	WebElement save;
	
	@FindBy(id="btnOverride")//Button
	WebElement override;
	
	@FindBy(id="tblErrorMessages")//Text
	WebElement edits;
	
	//Constructor
	public ApplicationPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver=driver;		
	}
	
	//Selects "Type of Electrical System" from drop down
	public void SelectTypeOfElectricalSystem(String SelectTypeOfElectricalSystem) {
		switch(SelectTypeOfElectricalSystem.toUpperCase()) {
			case "CB": case "CIRCUIT BREAKERS":	new Select(typeelectricalsystem).selectByVisibleText("Circuit Breakers");
													Log("Entered Type of Electrical System: Circuit Breakers");
												break;				
				
			case "F": case "FUSES":				new Select(typeelectricalsystem).selectByVisibleText("Fuses");
													Log("Entered Type of Electrical System: Fuses");
												break;				
									
			case "KT": case "KNOB & TUBE":		new Select(typeelectricalsystem).selectByVisibleText("Knob & Tube");
													Log("Entered Type of Electrical System: Knob & Tube");
												break;
		}
	}
	
	//Types into "Year Electrical Replaced" text box
	public void TypeYearElectricalReplaced(String TypeYearElectricalReplaced) {
		yearelectricalreplaced.clear();
		yearelectricalreplaced.sendKeys(TypeYearElectricalReplaced);
			Log("Entered Year Electrical Replaced: " + TypeYearElectricalReplaced);
	}
	
	//Types into "Year Heating & A/C Replaced" text box
	public void TypeYearHeatingAndACReplaced(String TypeYearHeatingAndACReplaced) {
		yearheatingandacreplaced.clear();
		yearheatingandacreplaced.sendKeys(TypeYearHeatingAndACReplaced);
			Log("Entered Year Heating & A/C Replaced: " + TypeYearHeatingAndACReplaced);
	}
	
	//Selects "Type of Plumbing  System" from drop down
	public void SelectTypeOfPlumbingSystem(String SelectTypeOfPlumbingSystem) {
		switch(SelectTypeOfPlumbingSystem.toUpperCase()) {
			case "C": case "COPPER":			new Select(typeplumbingsystem).selectByVisibleText("Copper");
													Log("Entered Type of Plumbing System: Copper");
												break;				
				
			case "G": case "GALVANIZED":		new Select(typeplumbingsystem).selectByVisibleText("Galvanized");
													Log("Entered Type of Plumbing System: Galvanized");
												break;				
									
			case "PEX":							new Select(typeplumbingsystem).selectByVisibleText("PEX");
													Log("Entered Type of Plumbing System: PEX");
												break;				
												
			case "P": case "POLYBUTYLENE":		new Select(typeplumbingsystem).selectByVisibleText("Polybutylene");
													Log("Entered Type of Plumbing System: Polybutylene");
												break;			
															
			case "PVC/CPVC":					new Select(typeplumbingsystem).selectByVisibleText("PVC / CPVC");
													Log("Entered Type of Plumbing System: PVC / CPVC");
												break;		
																		
			case "S": case "STAINLESS STEEL":	new Select(typeplumbingsystem).selectByVisibleText("Stainless Steel");
													Log("Entered Type of Plumbing System: Stainless Steel");
												break;
		}
	}
	
	//Types into "Year Plumbing  Replaced" text box
	public void TypeYearPlumbingReplaced(String TypeYearPlumbingReplaced) {
		yearplumbingreplaced.clear();
		yearplumbingreplaced.sendKeys(TypeYearPlumbingReplaced);
			Log("Entered Year Plumbing  Replaced: " + TypeYearPlumbingReplaced);
	}
	
	//Types into "Year Water Heater Replaced" text box
	public void TypeYearWaterHeaterReplaced(String TypeYearWaterHeaterReplaced) {
		yearwaterheaterreplaced.clear();
		yearwaterheaterreplaced.sendKeys(TypeYearWaterHeaterReplaced);
			Log("Entered Year Water Heater Replaced: " + TypeYearWaterHeaterReplaced);
	}
	
	//Selects "Aluminum Wiring" from drop down
	public void SelectAluminumWiring(String SelectAluminumWiring) {
		switch(SelectAluminumWiring.toUpperCase()) {
			case "N": case "NO":	new Select(aluminumwiring).selectByVisibleText("No");
										Log("Entered Aluminum Wiring: No");
									break;				
				
			case "Y": case "YES":	new Select(aluminumwiring).selectByVisibleText("Yes");
										Log("Entered Aluminum Wiring: Yes");
									break;	
		}
	}
	
	//Returns the value in the "Aluminum Wiring" field
	public String ReturnAluminumWiring() {
		if(new Select(aluminumwiring).getFirstSelectedOption().getText().isEmpty()) {
			return "N/A";
		}
		else {
			return new Select(aluminumwiring).getFirstSelectedOption().getText();	
		}
	}
	
	//Selects "Aluminum Wiring Corrected" from drop down
	public void SelectAluminumWiringCorrected(String SelectAluminumWiringCorrected) {
		switch(SelectAluminumWiringCorrected.toUpperCase()) {
			case "N": case "NO":	new Select(aluminumwiringcorrected).selectByVisibleText("No");
										Log("Entered Aluminum Wiring Corrected: No");
									break;				
				
			case "Y": case "YES":	new Select(aluminumwiringcorrected).selectByVisibleText("Yes");
										Log("Entered Aluminum Wiring Corrected: Yes");
									break;	
		}
	}

	//Selects "# of household residents" drop down 
	public void SelectNumberOfHouseholdResidents(String SelectNumberOfHouseholdResidents) {
		switch(SelectNumberOfHouseholdResidents.toUpperCase()) {
			case "9": case "9 OR MORE":	new Select(numhouseholdresidents).selectByVisibleText("9 or more");
											Log("Entered # of household residents: 9 or more");
										break;
								
			default:					new Select(numhouseholdresidents).selectByVisibleText(SelectNumberOfHouseholdResidents);
											Log("Entered # of household residents: " + 	new Select(numhouseholdresidents).getFirstSelectedOption().getText());
										break;					
		}
	}
	
	//Selects "Is this risk currently, or was it purchased as, a short sale or foreclosure?" from drop down
	public void SelectShortSaleOrForeclosure(String SelectShortSaleOrForeclosure) {
		switch(SelectShortSaleOrForeclosure.toUpperCase()) {
			case "N": case "NO":	new Select(shortsaleorforeclosure).selectByVisibleText("No");
										Log("Entered Is this risk currently, or was it purchased as, a short sale or foreclosure?: No");
									break;				
				
			case "Y": case "YES":	new Select(shortsaleorforeclosure).selectByVisibleText("Yes");
										Log("Entered Is this risk currently, or was it purchased as, a short sale or foreclosure?: Yes");
									break;	
		}
	}
	
	//Selects "ATV/Snowmobile/Dirt Bike Owned or Kept on/off Premise?" from drop down
	public void SelectATVSnowmobileDirtBikeKeptOnOffPremise(String SelectATVSnowmobileDirtBikeKeptOnOffPremise) {
		switch(SelectATVSnowmobileDirtBikeKeptOnOffPremise.toUpperCase()) {
			case "N": case "NO":	new Select(atvonpremises).selectByVisibleText("No");
										Log("Entered ATV/Snowmobile/Dirt Bike Owned or Kept on/off Premise?: No");
									break;				
				
			case "Y": case "YES":	new Select(atvonpremises).selectByVisibleText("Yes");
										Log("Entered ATV/Snowmobile/Dirt Bike Owned or Kept on/off Premise?: Yes");
									break;
		}
	}
	
	//Selects "ATV/Snowmobile/Dirt Bike Carrier" from drop down
	public void SelectATVSnowmobileDirtBikeCarrier(String SelectATVSnowmobileDirtBikeCarrier) {
		new Select(atvcarrier).selectByVisibleText(SelectATVSnowmobileDirtBikeCarrier);
			Log("Entered ATV/Snowmobile/Dirt Bike Carrier: " + new Select(atvcarrier).getFirstSelectedOption().getText());
	}
	
	//Types into "ATV/Snowmobile/Dirt Bike Policy #" text box
	public void TypeATVSnowmobileDirtBikePolicyNum(String TypeATVSnowmobileDirtBikePolicyNum) {
		atvpolicynum.clear();
		atvpolicynum.sendKeys(TypeATVSnowmobileDirtBikePolicyNum);
			Log("Entered ATV/Snowmobile/Dirt Bike Policy #: " + TypeATVSnowmobileDirtBikePolicyNum);
	}
	
	//Selects "Prior Home Insurer" from drop down
	public void SelectPriorHomeInsurer(String SelectPriorHomeInsurer) {
		new Select(priorhomeinsurer).selectByVisibleText(SelectPriorHomeInsurer);
			Log("Entered Prior Home Insurer: " + new Select(priorhomeinsurer).getFirstSelectedOption().getText());
	}
	
	//Types into "Prior Home Policy #" text box
	public void TypePriorHomePolicyNum(String TypePriorHomePolicyNum) {
		priorpolicynum.clear();
		priorpolicynum.sendKeys(TypePriorHomePolicyNum);
			Log("Entered Prior Home Policy #: " + TypePriorHomePolicyNum);
	}
	
	//Selects "Current Auto Insurer" from drop down
	public void SelectCurrentHomeInsurer(String SelectCurrentHomeInsurer) {
		new Select(currentautoinsurer).selectByVisibleText(SelectCurrentHomeInsurer);
			Log("Entered Current Auto Insurer: " + new Select(currentautoinsurer).getFirstSelectedOption().getText());
	}
	
	//Types into "Auto Policy #" text box
	public void TypeAutoPolicyNum(String TypeAutoPolicyNum) {
		autopolicynum.clear();
		autopolicynum.sendKeys(TypeAutoPolicyNum);
			Log("Entered Auto Policy #: " + TypeAutoPolicyNum);
	}

	//Selects "How many dogs/animals owned or kept" drop down 
	public void SelectHowManyDogsOrAnimalsOwnedOrKept(String SelectHowManyDogsOrAnimalsOwnedOrKept) {
		switch(SelectHowManyDogsOrAnimalsOwnedOrKept.toUpperCase()) {
			case "N": case "NONE":		new Select(howmanydogs).selectByVisibleText("None");
											Log("Entered How many dogs/animals owned or kept: None");
										break;
										
			case "9": case "9 OR MORE":	new Select(howmanydogs).selectByVisibleText("9 or more");
											Log("Entered How many dogs/animals owned or kept: 9 or more");
										break;
								
			default:					new Select(howmanydogs).selectByVisibleText(SelectHowManyDogsOrAnimalsOwnedOrKept);
											Log("Entered How many dogs/animals owned or kept: " + new Select(howmanydogs).getFirstSelectedOption().getText());
										break;					
		}
	}
	
	//Selects "Are any of the following animals owned/kept?" from drop down
	public void SelectAreAnyOfTheFollowingAnimalsOwnedOrKept(String SelectAreAnyOfTheFollowingAnimalsOwnedOrKept) {
		new Select(followinganimalsowned).selectByVisibleText(SelectAreAnyOfTheFollowingAnimalsOwnedOrKept);
			Log("Entered Are any of the following animals owned/kept?: " + new Select(followinganimalsowned).getFirstSelectedOption().getText());
	}
	
	//Selects "Flood Zone" from drop down
	public void SelectFloodZone(String SelectFloodZone) {
		new Select(fldzone).selectByVisibleText(SelectFloodZone);
			Log("Entered Flood Zone: " + new Select(fldzone).getFirstSelectedOption().getText());
	}
	
	//Types into "Current Flood Policy Number" text box
	public void TypeCurrentFloodPolicyNum(String TypeCurrentFloodPolicyNum) {
		currentfldpolicynum.clear();
		currentfldpolicynum.sendKeys(TypeCurrentFloodPolicyNum);
			Log("Entered Current Flood Policy Number: " + TypeCurrentFloodPolicyNum);
	}
	
	//Selects "Transaction Descr" from drop down
	public void SelectTransactionDescr(String SelectTransactionDescr) {
		new Select(trandescr).selectByVisibleText(SelectTransactionDescr);
			Log("Entered Transaction Descr: " + SelectTransactionDescr);
	}
	
	//Selects "Number of Payments" from drop down
	public void SelectNumberOfPayments(String SelectNumberOfPayments) {
		new Select(numofpayments).selectByVisibleText(SelectNumberOfPayments);
			Log("Entered Number of Payments: " + SelectNumberOfPayments);
	}
	
	//Selects "Suppress Dec Page Printing" from drop down
	public void SelectSuppressDecPagePrinting(String SelectSuppressDecPagePrinting) {
		switch(SelectSuppressDecPagePrinting.toUpperCase()) {
			case "N": case "NO":	new Select(suppressdecprinting).selectByVisibleText("No");
										Log("Entered Suppress Dec Page Printing: No");
									break;				
				
			case "Y": case "YES":	new Select(suppressdecprinting).selectByVisibleText("Yes");
										Log("Entered Suppress Dec Page Printing: Yes");
									break;
		}
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
	
	//Selects "Agent/User Name" from drop down
	public void SelectAgentUserNameByText(String SelectAgentUserName) {
		new Select(agentusername).selectByVisibleText(SelectAgentUserName);
			Log("Entered Agent/User Name: " + SelectAgentUserName);
	}
	
	//Types into "Notes" text box
	public void TypeNotes(String TypeNotes) {
		notes.clear();
		notes.sendKeys(TypeNotes);
			Log("Entered Notes: " + TypeNotes);
	}
	
	//Returns Edit text
	public String ReturnEditText(String Log) {
		if(Log.toUpperCase().equals("Y") || Log.toUpperCase().equals("YES")) {
			Log("Edit(s) is(are): " + edits.getText().trim().replaceAll("\\n", ",").replaceAll("   "," ").replaceAll("  "," "));
		}
		return edits.getText().trim().replaceAll("\\n", ",").replaceAll("   "," ").replaceAll("  "," ");
	}
	
	//Clicks the "Issue Policy" button
	public void ClickIssuePolicy() {
		issuepolicy.click();
			Log("Clicked the \"Issue Policy\" button on the Application page");
	}
	
	//Clicks the "Override" button
	public void ClickOverride() {
		override.click();
			Log("Clicked the \"Override\" button on the Application page");
	}
	
	//Clicks the "Save" button
	public void ClickSave() {
		save.click();
			Log("Clicked the \"Save\" button on the Application page");
	}
}