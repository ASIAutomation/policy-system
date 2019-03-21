package Automation.PS.pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import Automation.PS.testBase.TestBase;

public class PolicyRatingPage2 extends TestBase {
	
public static final Logger log = Logger.getLogger(PolicyRatingPage2.class.getName());
	
	WebDriver driver;
	
	@FindBy(id="Covg_24D")//Drop Down
	WebElement maritalstatus;
	
	@FindBy(id="Covg_24E")//Drop Down
	WebElement numberofchildreninhousehold;
	
	@FindBy(id="Covg_43E")//Check Box
	WebElement secondarywaterresist;
	
	@FindBy(id="Covg_43A")//Drop Down
	WebElement roofcovering;
	
	@FindBy(id="Covg_43B")//Drop Down
	WebElement roofdeckattach;
	
	@FindBy(id="Covg_43C")//Drop Down
	WebElement roofwallconnection;
	
	@FindBy(id="Covg_43D")//Drop Down
	WebElement windowandotheropening;

	@FindBy(id="Covg_47B")//Drop Down
	WebElement priorliabilitylimit;

	@FindBy(id="Covg_47A")//Drop Down
	WebElement reportedeclaims;

	@FindBy(id="Covg_03")//Drop Down
	WebElement otherstructures;

	@FindBy(id="Covg_04")//Drop Down
	WebElement personalproperty;

	@FindBy(id="Covg_05")//Drop Down
	WebElement lossofuse;

	@FindBy(id="Covg_06")//Drop Down
	WebElement liability;

	@FindBy(id="Covg_08")//Drop Down
	WebElement medicalpaymentslimit;
	
	@FindBy(id="Covg_76")//Check Box
	WebElement hardiplank;
	
	@FindBy(id="Covg_39B")//Check Box
	WebElement openwaterexposure;
	
	@FindBy(id="Covg_38")//Check Box
	WebElement accreditedbuilder;
	
	@FindBy(id="Covg_60B")//Check Box
	WebElement earthquakeinsurance;

	@FindBy(id="Covg_57")//Check Box
	WebElement epolicypaperless;

	@FindBy(id="Covg_57C")//Check Box
	WebElement esignature;

	@FindBy(id="Covg_75")//Check Box
	WebElement newpurchasediscount;

	@FindBy(id="Covg_22")//Check Box
	WebElement securedsubdivision;

	@FindBy(id="Covg_37E")//Check Box
	WebElement umbrelladiscount;
	
	@FindBy(id="Covg_11L")//Check Box
	WebElement wildlifeareabuildcode;

	@FindBy(id="Covg_25")//Check Box
	WebElement woodburningstove;

	@FindBy(id="Covg_11")//Drop Down
	WebElement bceg;
	
	@FindBy(id="Covg_32B")//Drop Down
	WebElement acvlosssettlement;

	@FindBy(id="Covg_20B")//Drop Down
	WebElement burglarprotection;

	@FindBy(id="Covg_12")//Drop Down
	WebElement doanyresidentssmoke;

	@FindBy(id="Covg_20A")//Drop Down
	WebElement fireprotection;

	@FindBy(id="Covg_29")//Drop Down
	WebElement occupancy;

	@FindBy(id="Covg_24I")//Drop Down
	WebElement paidinfulldiscount;

	@FindBy(id="Covg_13C")//Drop Down
	WebElement waterleakprotection;

	@FindBy(id="Covg_15J")//Drop Down
	WebElement homeupdatediscount;

	@FindBy(id="Form_PLDwelling_LatestPremitDate")//Text Box
	WebElement latestpermitdate;
	
	@FindBy(id="Covg_37D")//Drop Down
	WebElement ppd37D;
	
	@FindBy(id="Covg_37K")//Drop Down
	WebElement ppd37K;
	
	@FindBy(id="Covg_37")//Drop Down
	WebElement cp37;

	@FindBy(id="Covg_44N")//Drop Down
	WebElement allotherperilsdeductible;

	@FindBy(id="Covg_44H")//Drop Down
	WebElement windhaildeductible;

	@FindBy(id="Covg_20E")//Drop Down
	WebElement eqcoverage;

	@FindBy(id="Covg_44D")//Drop Down
	WebElement eqdeductible;

	@FindBy(id="Covg_31C")//Drop Down
	WebElement eqfoundationtype;
	
	@FindBy(id="Covg_61C")//Check Box
	WebElement eqsecuredwaterheater;
	
	@FindBy(id="Covg_04K")//Drop Down
	WebElement eqpersonalproperty;
	
	@FindBy(id="Covg_05L")//Drop Down
	WebElement eqlossofuse;
	
	@FindBy(id="Covg_07L")//Drop Down
	WebElement eqol;
	
	@FindBy(id="Covg_61E")//Drop Down
	WebElement eqhazardreduction;
	
	@FindBy(id="Covg_44M")//Drop Down
	WebElement eqcontents;
	
	@FindBy(id="Covg_76B")//Check Box
	WebElement eqmasonaryveneerexterior;
	
	@FindBy(id="Covg_42")//Drop Down
	WebElement incrjewfur;
	
	@FindBy(id="Covg_42A")//Drop Down
	WebElement incrsilvergoldpewter;
	
	@FindBy(id="Covg_42B")//Drop Down
	WebElement eqbreakables;
	
	@FindBy(id="Covg_66A")//Drop Down
	WebElement preexistingeqdmg;
	
	@FindBy(id="Covg_66B")//Drop Down
	WebElement dwellingsecured;
	
	@FindBy(id="Covg_66C")//Drop Down
	WebElement dwellinghavecripplewalls;
	
	@FindBy(id="Covg_66D")//Drop Down
	WebElement cripplewallsbraced;
	
	@FindBy(id="Covg_66E")//Drop Down
	WebElement waterheatersecured;
	
	@FindBy(id="Covg_66F")//Drop Down
	WebElement dwellinghavepost;
	
	@FindBy(id="Covg_66G")//Drop Down
	WebElement postfoundationmodified;
	
	@FindBy(id="Covg_66H")//Drop Down
	WebElement chimneys;
	
	@FindBy(id="Covg_49D")//Drop Down
	WebElement inservants;
	
	@FindBy(id="Covg_49G")//Drop Down
	WebElement occasional;
	
	@FindBy(id="Covg_49F")//Drop Down
	WebElement outservants;
	
	@FindBy(id="Covg_35B")//Check Box
	WebElement sinkhole;
	
	@FindBy(id="Covg_13")//Check Box
	WebElement waterdmgexclusion;
	
	@FindBy(id="Covg_34")//Check Box
	WebElement nshl;
	
	@FindBy(id="Covg_33C")//Check Box
	WebElement homeshieldpackage;
	
	@FindBy(id="Covg_33D")//Check Box
	WebElement homeshieldpluspackage;
	
	@FindBy(id="Covg_33E")//Check Box
	WebElement platinumpackage;
	
	@FindBy(id="Covg_13A")//Check Box
	WebElement limitedwaterdamagecov;

	@FindBy(id="Covg_48")//Check Box
	WebElement personalinjurycoverage;

	@FindBy(id="Covg_09")//Check Box
	WebElement personalpropreplmntcost;

	@FindBy(id="Covg_40")//Check Box
	WebElement specialpersonalpropertycoverage;
	
	@FindBy(id="Covg_47")//Text Box
	WebElement homecomputercoverage;

	@FindBy(id="Covg_26A")//Drop Down
	WebElement animalliability;

	@FindBy(id="Covg_60")//Drop Down
	WebElement golfcart;

	@FindBy(id="Covg_70")//Drop Down
	WebElement increasejewelrywatchesandfurs;

	@FindBy(id="Covg_10A")//Drop Down
	WebElement increasedreplcostondwelling;

	@FindBy(id="Covg_46")//Drop Down
	WebElement lossassessment;
	
	@FindBy(xpath="//select[@id='Covg_07']")//Drop Down
	WebElement selectol;
	
	@FindBy(xpath="//input[@id='Covg_07']")//Check Box
	WebElement clickol;

	@FindBy(id="Covg_61A")//Drop Down
	WebElement waterbackupbasement;
	
	@FindBy(id="Covg_61")//Drop Down
	WebElement waterbackup;
	
	@FindBy(id="Covg_PLScheduled_70A")//Drop Down	
	WebElement qtyantiques;

	@FindBy(id="Covg_70A")//Text Box	
	WebElement antiques;

	@FindBy(id="Covg_PLScheduled_70B")//Drop Down	
	WebElement qtybicycles;

	@FindBy(id="Covg_70B")//Text Box	
	WebElement bicycles;

	@FindBy(id="Covg_PLScheduled_70C")//Drop Down	
	WebElement qtycamerasandprojectionequip;

	@FindBy(id="Covg_70C")//Text Box	
	WebElement camerasandprojectionequip;

	@FindBy(id="Covg_PLScheduled_70D")//Drop Down	
	WebElement qtycoins;

	@FindBy(id="Covg_70D")//Text Box	
	WebElement coins;

	@FindBy(id="Covg_PLScheduled_70E")//Drop Down	
	WebElement qtyfineartsbreakage;

	@FindBy(id="Covg_70E")//Text Box	
	WebElement fineartsbreakage;

	@FindBy(id="Covg_PLScheduled_70F")//Drop Down	
	WebElement qtyfineartsnobreakage;

	@FindBy(id="Covg_70F")//Text Box	
	WebElement fineartsnobreakage;

	@FindBy(id="Covg_PLScheduled_70G")//Drop Down	
	WebElement qtyfurs;

	@FindBy(id="Covg_70G")//Text Box	
	WebElement furs;

	@FindBy(id="Covg_PLScheduled_70H")//Drop Down	
	WebElement qtygolfersequipment;

	@FindBy(id="Covg_70H")//Text Box	
	WebElement golfersequipment;

	@FindBy(id="Covg_PLScheduled_70I")//Drop Down	
	WebElement qtygunscollectible;

	@FindBy(id="Covg_70I")//Text Box	
	WebElement gunscollectible;

	@FindBy(id="Covg_PLScheduled_70J")//Drop Down	
	WebElement qtygunsfired;

	@FindBy(id="Covg_70J")//Text Box	
	WebElement gunsfired;

	@FindBy(id="Covg_PLScheduled_70K")//Drop Down	
	WebElement qtyjewelry;

	@FindBy(id="Covg_70K")//Text Box	
	WebElement jewelry;

	@FindBy(id="Covg_PLScheduled_70L")//Drop Down	
	WebElement qtymiscpersonalproperty;

	@FindBy(id="Covg_70L")//Text Box	
	WebElement miscpersonalproperty;

	@FindBy(id="Covg_PLScheduled_70M")//Drop Down	
	WebElement qtymusicalinstruments;

	@FindBy(id="Covg_70M")//Text Box	
	WebElement musicalinstruments;

	@FindBy(id="Covg_PLScheduled_70N")//Drop Down	
	WebElement qtyothersportsequip;

	@FindBy(id="Covg_70N")//Text Box	
	WebElement othersportsequip;

	@FindBy(id="Covg_PLScheduled_70Q")//Drop Down	
	WebElement qtysilverware;

	@FindBy(id="Covg_70Q")//Text Box	
	WebElement silverware;

	@FindBy(id="Covg_PLScheduled_70P")//Drop Down	
	WebElement qtystamps;

	@FindBy(id="Covg_70P")//Text Box	
	WebElement stamps;

	@FindBy(id="Form_PlUnderwriting_ScheduleDescription")//Text	
	WebElement scheduleditemsdescription;
	
	@FindBy(id="tblErrorMessages")//Text
	WebElement edits;
	
	@FindBy(id="btnBack")//Button
	WebElement back;

	@FindBy(id="btnNext")//Button
	WebElement next;

	@FindBy(id="btnSave")//Button
	WebElement save;

	@FindBy(id="btnOverride")//Button
	WebElement override;
	
	@FindBy(id="lblPolicyID")//Text
	WebElement policyid;
	
	//Constructor
	public PolicyRatingPage2(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver=driver;		
	}	
	
	//Selects "Marital Status" drop down 
	public void SelectMaritalStatus(String SelectMaritalStatus) {
		switch(SelectMaritalStatus.toUpperCase()) {
			case "S": case "SINGLE":	new Select(maritalstatus).selectByVisibleText("Single");
											Log("Entered Marital Status: Single");
										break;
										
			case "M": case "MARRIED":	new Select(maritalstatus).selectByVisibleText("Married");
											Log("Entered Marital Status: Married");
										break;
		}
	}

	//Selects "Number Of Children In Household" drop down 
	public void SelectNumberOfChildrenInHousehold(String SelectNumberOfChildrenInHousehold) {
		switch(SelectNumberOfChildrenInHousehold.toUpperCase()) {
			case "9": case "9 OR MORE":	new Select(numberofchildreninhousehold).selectByVisibleText("9 or more");
											Log("Entered Number Of Children In Household: 9 or more");
										break;
								
			default:					new Select(numberofchildreninhousehold).selectByVisibleText(SelectNumberOfChildrenInHousehold);
											Log("Entered Number Of Children In Household: " + SelectNumberOfChildrenInHousehold);
										break;					
		}
	}

	//Checks "Secondary Water Resistance" check box 
	public void CheckSecondaryWaterResistance(String CheckSecondaryWaterResistance) {
		if(!CheckSecondaryWaterResistance.toUpperCase().equals("N/A")) {
			if(secondarywaterresist.isSelected()) {
				switch(CheckSecondaryWaterResistance.toUpperCase()) {
					case "Y": case "YES":		Log("\"Secondary Water Resistance\" check box marked");
											break;
											
					case "N": case "NO":	secondarywaterresist.click();
												Log("\"Secondary Water Resistance\" check box NOT marked");
											break;
				}
			}
			else {
				switch(CheckSecondaryWaterResistance.toUpperCase()) {
					case "Y": case "YES":	secondarywaterresist.click();
												Log("\"Secondary Water Resistance\" check box marked");
											break;
											
					case "N": case "NO":		Log("\"Secondary Water Resistance\" check box NOT marked");
											break;
				}
			}
		}
	}

	//Selects "Roof Covering" drop down 
	public void SelectRoofCovering(String SelectRoofCovering) {
		switch(SelectRoofCovering.toUpperCase()) {
			case "FBC": case "MEETS FBC 2001":			new Select(roofcovering).selectByVisibleText("Meets FBC 2001");
															Log("Entered Roof Covering: Meets FBC 2001");
														break;
		
			case "UNKNOWN": case "U":					new Select(roofcovering).selectByVisibleText("Unknown");
															Log("Entered Roof Covering: Unknown");
														break;
														
			case "SFBC": case "MEETS SFBC 1994":		new Select(roofcovering).selectByVisibleText("Meets SFBC 1994");
															Log("Entered Roof Covering: Meets SFBC 1994");
														break;
		
			case "RC": case "REINF CONCRETE ROOF DECK":	new Select(roofcovering).selectByVisibleText("Reinf Concrete Roof Deck");
															Log("Entered Roof Covering: Reinf Concrete Roof Deck");
														break;
		}
	}

	//Selects "Roof Deck Attachment" drop down 
	public void SelectRoofDeckAttachment(String SelectRoofDeckAttachment) {
		switch(SelectRoofDeckAttachment.toUpperCase()) {
			case "A": case "LEVEL A":	new Select(roofdeckattach).selectByVisibleText("Level A");
											Log("Entered Roof Deck Attachment: Level A");
										break;
		
			case "B": case "LEVEL B":	new Select(roofdeckattach).selectByVisibleText("Level B");
											Log("Entered Roof Deck Attachment: Level B");
										break;
														
			case "C": case "LEVEL C":	new Select(roofdeckattach).selectByVisibleText("Level C");
											Log("Entered Roof Deck Attachment: Level C");
										break;
		
			case "UNKNOWN": case "U":	new Select(roofdeckattach).selectByVisibleText("Unknown");
											Log("Entered Roof Deck Attachment: Unknown");
										break;
		}
	}

	//Selects "Window and Other Opening Protection" drop down 
	public void SelectWindowAndOtherOpeningProtection(String SelectWindowAndOtherOpeningProtection) {
		switch(SelectWindowAndOtherOpeningProtection.toUpperCase()) {
			case "N": case "NONE":					new Select(windowandotheropening).selectByVisibleText("None");
														Log("Entered Window and Other Opening Protection: None");
													break;
		
			case "I": case "INTERMEDIATE":			new Select(windowandotheropening).selectByVisibleText("Intermediate");
														Log("Entered Window and Other Opening Protection: Intermediate");
													break;
														
			case "H": case "HURRICANE PROTECTION":	new Select(windowandotheropening).selectByVisibleText("Hurricane Protection");
														Log("Entered Window and Other Opening Protection: Hurricane Protection");
													break;
		}
	}

	//Selects "Roof Wall Connection" drop down 
	public void SelectRoofWallConnection(String SelectRoofWallConnection) {
		switch(SelectRoofWallConnection.toUpperCase()) {
			case "T": case "TN": case "TOE NAILS":		new Select(roofwallconnection).selectByVisibleText("Toe Nails");
															Log("Entered Roof Wall Connection: Toe Nails");
														break;
		
			case "C": case "CL": case "CLIPS":			new Select(roofwallconnection).selectByVisibleText("Clips");
															Log("Entered Roof Wall Connection: Clips");
														break;
														
			case "S": case "SW": case "SINGLE WRAPS":	new Select(roofwallconnection).selectByVisibleText("Single Wraps");
															Log("Entered Roof Wall Connection: Single Wraps");
														break;
										
			case "D": case "DW": case "DOUBLE WRAPS":	new Select(roofwallconnection).selectByVisibleText("Double Wraps");
															Log("Entered Roof Wall Connection: Double Wraps");
														break;
		
			case "UNKNOWN": case "U":					new Select(roofwallconnection).selectByVisibleText("Unknown");
															Log("Entered Roof Wall Connection: Unknown");
														break;
		}
	}

	//Selects "Prior Liability Limit" drop down 
	public void SelectPriorLiabilityLimit(String SelectPriorLiabilityLimit) {
		switch(SelectPriorLiabilityLimit.toUpperCase()) {
			case "300": case "$300,000": case "300000": case "$300000": case "300,000":	new Select(priorliabilitylimit).selectByVisibleText("$300,000");
																							Log("Entered Prior Liability Limit: $300,000");
																						break;
		
			case "<300": case "LESS THAN $300,000":										new Select(priorliabilitylimit).selectByVisibleText("Less than $300,000");
																							Log("Entered Prior Liability Limit: Less than $300,000");
																						break;
														
			case ">300": case "GREATER THAN $300,000":									new Select(priorliabilitylimit).selectByVisibleText("Greater than $300,000");
																							Log("Entered Prior Liability Limit: Greater than $300,000");
																						break;
		
			case "LP": case "LAPSE IN COVERAGE":										new Select(priorliabilitylimit).selectByVisibleText("Lapse in Coverage");
																							Log("Entered Prior Liability Limit: Lapse in Coverage");
																						break;
										
			case "NP": case "NO PRIOR LIABILITY LIMIT":									new Select(priorliabilitylimit).selectByVisibleText("No Prior Liability Limit");
																							Log("Entered Prior Liability Limit: No Prior Liability Limit");
																						break;
		
			case "NA": case "FIRST TIME HOME BUYER":									new Select(priorliabilitylimit).selectByVisibleText("First Time Home Buyer");
																							Log("Entered Prior Liability Limit: First Time Home Buyer");
																						break;
		}
	}

	//Selects "Report E-Claims" drop down 
	public void SelectReportEClaims(String SelectReportEClaims) {
		switch (SelectReportEClaims.toUpperCase()) {		
			case "0": case "0 CLAIMS":						driver.findElement(By.xpath("//select[@id='Covg_47A']//option[contains(text(),'0')]")).click();
															break;
		
			case "1": case "1 CLAIM":						driver.findElement(By.xpath("//select[@id='Covg_47A']//option[contains(text(),'1')]")).click();
															break;
			
			case "2": case "2 OR MORE": case "2 CLAIMS":	driver.findElement(By.xpath("//select[@id='Covg_47A']//option[contains(text(),'2')]")).click();;
															break;
										
			case "3": case "3 CLAIMS":						driver.findElement(By.xpath("//select[@id='Covg_47A']//option[contains(text(),'3')]")).click();
															break;
		
			case "4": case "4 CLAIMS":						driver.findElement(By.xpath("//select[@id='Covg_47A']//option[contains(text(),'4')]")).click();
															break;
		
			case "5": case "5 CLAIMS":						driver.findElement(By.xpath("//select[@id='Covg_47A']//option[contains(text(),'5')]")).click();
															break;
		}
			Log("Entered Report E-Claims: " + new Select(reportedeclaims).getFirstSelectedOption().getText());
	}

	//Selects "Other Structures" drop down 
	public void SelectOtherStructures(String SelectOtherStructures) {
		if(!SelectOtherStructures.toUpperCase().equals("N/A")) {
			switch(SelectOtherStructures.toUpperCase()) {
				case "0.02": case "2% COV A (INCLUDED)": case "2": case "2%":	new Select(otherstructures).selectByVisibleText("2% Cov A (Included)");
																					Log("Entered Other Structures: 2% Cov A (Included)");
																				break;
			
				case "0.1": case "10% COV A": case "10": case "10%":			new Select(otherstructures).selectByVisibleText("10% Cov A");
																					Log("Entered Other Structures: 10% Cov A");
																				break;
															
				case "0.2": case "20% COV A": case "20": case "20%":			new Select(otherstructures).selectByVisibleText("20% Cov A");
																					Log("Entered Other Structures: 20% Cov A");
																				break;
			
				case "0.3": case "30% COV A": case "30": case "30%":			new Select(otherstructures).selectByVisibleText("30% Cov A");
																					Log("Entered Other Structures: 30% Cov A");
																				break;
			
				case "0.4": case "40% COV A": case "40": case "40%":			new Select(otherstructures).selectByVisibleText("40% Cov A");
																					Log("Entered Other Structures: 40% Cov A");
																				break;
			
				case "0.5": case "50% COV A": case "50": case "50%":			new Select(otherstructures).selectByVisibleText("50% Cov A");
																					Log("Entered Other Structures: 50% Cov A");
																				break;
			}
		}
	}

	//Selects "Personal Property" drop down 
	public void SelectPersonalProperty(String SelectPersonalProperty) {
		if(!SelectPersonalProperty.toUpperCase().equals("N/A")) {
			switch(SelectPersonalProperty.toUpperCase()) {
				case "0.5": case "50% COV A (INCLUDED)": case "50": case "50%":	new Select(personalproperty).selectByVisibleText("50% Cov A (Included)");
																					Log("Entered Personal Property: 50% Cov A (Included)");
																				break;
			
				case "0": case "0% COV A": case "0%":							new Select(personalproperty).selectByVisibleText("0% Cov A");
																					Log("Entered Personal Property: 0% Cov A");
																				break;
															
				case "0.25": case "25% COV A": case "25": case "25%":			new Select(personalproperty).selectByVisibleText("25% Cov A");
																					Log("Entered Personal Property: 25% Cov A");
																				break;
														
				case "0.7": case "70% COV A": case "70": case "70%":			new Select(personalproperty).selectByVisibleText("70% Cov A");
																					Log("Entered Personal Property: 70% Cov A");
																				break;
			}
		}
	}
	
	//Selects "Loss Of Use" drop down 
	public void SelectLossOfUse(String SelectLossOfUse) {
		if(!SelectLossOfUse.toUpperCase().equals("N/A")) {
			switch(SelectLossOfUse.toUpperCase()) {
				case "0.1": case "10% COV A": case "10": case "10%":	driver.findElement(By.xpath("//select[@id='Covg_05']//option[contains(text(),'10')]")).click();
																		break;
			
				case "0.2": case "20% COV A": case "20": case "20%":	driver.findElement(By.xpath("//select[@id='Covg_05']//option[contains(text(),'20')]")).click();
																		break;
												
				case "0.3": case "30% COV A": case "30": case "30%":	driver.findElement(By.xpath("//select[@id='Covg_05']//option[contains(text(),'30')]")).click();
																		break;
			}
				Log("Entered Loss Of Use: " + new Select(lossofuse).getFirstSelectedOption().getText());
		}
	}

	//Selects "Liability" drop down 
	public void SelectLiability(String SelectLiability) {
		if(!SelectLiability.toUpperCase().equals("N/A")) {
			switch(SelectLiability.toUpperCase()) {
				case "100": case "$100,000": case "100000": case "100,000":	new Select(liability).selectByVisibleText("$100,000");
																				Log("Entered Liability: $100,000");
																			break;
			
				case "300": case "$300,000": case "300000": case "300,000":	new Select(liability).selectByVisibleText("$300,000");
																				Log("Entered Liability: $300,000");
																			break;
															
				case "500": case "$500,000": case "500000": case "500,000":	new Select(liability).selectByVisibleText("$500,000");
																				Log("Entered Liability: $500,000");
																			break;
			}
		}
	}
	
	//Selects "Medical Payments Limit" drop down 
	public void SelectMedicalPaymentsLimit(String SelectMedicalPaymentsLimit) {
		if(!SelectMedicalPaymentsLimit.toUpperCase().equals("N/A")) {
			switch(SelectMedicalPaymentsLimit.toUpperCase()) {
				case "1000": case "$1,000": case "1,000": case "$1000":	new Select(medicalpaymentslimit).selectByVisibleText("$1,000");
																			Log("Entered Medical Payments Limit: $1,000");
																		break;
			
				case "2500": case "$2,500": case "2,500": case "$2500":	new Select(medicalpaymentslimit).selectByVisibleText("$2,500");
																			Log("Entered Medical Payments Limit: $2,500");
																		break;
															
				case "5000": case "$5,000": case "5,000": case "$5000":	new Select(medicalpaymentslimit).selectByVisibleText("$5,000");
																			Log("Entered Medical Payments Limit: $5,000");
																		break;
			}
		}
	}

	//Checks "Hardiplank Siding" check box 
	public void CheckHardiplankSiding(String CheckHardiplankSiding) {
		if(!CheckHardiplankSiding.toUpperCase().equals("N/A")) {
			if(hardiplank.isSelected()) {
				switch(CheckHardiplankSiding.toUpperCase()) {
					case "Y": case "YES":		Log("\"Hardiplank Siding\" check box marked");
											break;
											
					case "N": case "NO":	hardiplank.click();
												Log("\"Hardiplank Siding\" check box NOT marked");
											break;
				}
			}
			else {
				switch(CheckHardiplankSiding.toUpperCase()) {
					case "Y": case "YES":	hardiplank.click();
												Log("\"Hardiplank Siding\" check box marked");
											break;
											
					case "N": case "NO":		Log("\"Hardiplank Siding\" check box NOT marked");
											break;
				}
			}
		}
	}

	//Checks "Open Water Exposure" check box 
	public void CheckOpenWaterExposure(String CheckOpenWaterExposure) {
		if(!CheckOpenWaterExposure.toUpperCase().equals("N/A")) {
			if(openwaterexposure.isSelected()) {
				switch(CheckOpenWaterExposure.toUpperCase()) {
					case "Y": case "YES":		Log("\"Open Water Exposure\" check box marked");
											break;
											
					case "N": case "NO":	openwaterexposure.click();
												Log("\"Open Water Exposure\" check box NOT marked");
											break;
				}
			}
			else {
				switch(CheckOpenWaterExposure.toUpperCase()) {
					case "Y": case "YES":	openwaterexposure.click();
												Log("\"Open Water Exposure\" check box marked");
											break;
											
					case "N": case "NO":		Log("\"Open Water Exposure\" check box NOT marked");
											break;
				}
			}
		}
	}

	//Checks "Accredited Builder" check box 
	public void CheckAccreditedBuilder(String CheckAccreditedBuilder) {
		if(!CheckAccreditedBuilder.toUpperCase().equals("N/A")) {
			if(accreditedbuilder.isSelected()) {
				switch(CheckAccreditedBuilder.toUpperCase()) {
					case "Y": case "YES":		Log("\"Accredited Builder\" check box marked");
											break;
											
					case "N": case "NO":	accreditedbuilder.click();
												Log("\"Accredited Builder\" check box NOT marked");
											break;
				}
			}
			else {
				switch(CheckAccreditedBuilder.toUpperCase()) {
					case "Y": case "YES":	accreditedbuilder.click();
												Log("\"Accredited Builder\" check box marked");
											break;
											
					case "N": case "NO":		Log("\"Accredited Builder\" check box NOT marked");
											break;
				}
			}
		}
	}

	//Checks "Earthquake Insurance" check box 
	public void CheckEarthquakeInsurance(String CheckEarthquakeInsurance) {
		if(!CheckEarthquakeInsurance.toUpperCase().equals("N/A")) {
			if(earthquakeinsurance.isSelected()) {
				switch(CheckEarthquakeInsurance.toUpperCase()) {
					case "Y": case "YES":		Log("\"Earthquake Insurance\" check box marked");
											break;
											
					case "N": case "NO":	earthquakeinsurance.click();
												Log("\"Earthquake Insurance\" check box NOT marked");
											break;
				}
			}
			else {
				switch(CheckEarthquakeInsurance.toUpperCase()) {
					case "Y": case "YES":	earthquakeinsurance.click();
												Log("\"Earthquake Insurance\" check box marked");
											break;
											
					case "N": case "NO":		Log("\"Earthquake Insurance\" check box NOT marked");
											break;
				}
			}
		}
	}

	//Checks "E-Policy Paperless" check box 
	public void CheckEPolicyPaperless(String CheckEPolicyPaperless) {
		if(!CheckEPolicyPaperless.toUpperCase().equals("N/A")) {
			if(epolicypaperless.isSelected()) {
				switch(CheckEPolicyPaperless.toUpperCase()) {
					case "Y": case "YES":		Log("\"E-Policy Paperless\" check box marked");
											break;
											
					case "N": case "NO":	epolicypaperless.click();
												Log("\"E-Policy Paperless\" check box NOT marked");
											break;
				}
			}
			else {
				switch(CheckEPolicyPaperless.toUpperCase()) {
					case "Y": case "YES":	epolicypaperless.click();
												Log("\"E-Policy Paperless\" check box marked");
											break;
											
					case "N": case "NO":		Log("\"E-Policy Paperless\" check box NOT marked");
											break;
				}
			}
		}
	}

	//Checks "E-Signature" check box 
	public void CheckESignature(String CheckESignature) {
		if(!CheckESignature.toUpperCase().equals("N/A")) {
			if(esignature.isSelected()) {
				switch(CheckESignature.toUpperCase()) {
					case "Y": case "YES":		Log("\"E-Signature\" check box marked");
											break;
											
					case "N": case "NO":	esignature.click();
												Log("\"E-Signature\" check box NOT marked");
											break;
				}
			}
			else {
				switch(CheckESignature.toUpperCase()) {
					case "Y": case "YES":	esignature.click();
												Log("\"E-Signature\" check box marked");
											break;
											
					case "N": case "NO":		Log("\"E-Signature\" check box NOT marked");
											break;
				}
			}
		}
	}

	//Checks "New Purchase Discount" check box 
	public void CheckNewPurchaseDiscount(String CheckNewPurchaseDiscount) {
		if(!CheckNewPurchaseDiscount.toUpperCase().equals("N/A")) {
			if(newpurchasediscount.isSelected()) {
				switch(CheckNewPurchaseDiscount.toUpperCase()) {
					case "Y": case "YES": case "1":		Log("\"New Purchase Discount\" check box marked");
													break;
											
					case "N": case "NO":			newpurchasediscount.click();
														Log("\"New Purchase Discount\" check box NOT marked");
													break;
				}
			}
			else {
				switch(CheckNewPurchaseDiscount.toUpperCase()) {
					case "Y": case "YES": case "1":	newpurchasediscount.click();
														Log("\"New Purchase Discount\" check box marked");
													break;
											
					case "N": case "NO":				Log("\"New Purchase Discount\" check box NOT marked");
													break;
				}
			}
		}
	}

	//Checks "Secured Subdivision" check box 
	public void CheckSecuredSubdivision(String CheckSecuredSubdivision) {
		if(!CheckSecuredSubdivision.toUpperCase().equals("N/A")) {
			if(securedsubdivision.isSelected()) {
				switch(CheckSecuredSubdivision.toUpperCase()) {
					case "Y": case "YES":		Log("\"Secured Subdivision\" check box marked");
											break;
											
					case "N": case "NO":	securedsubdivision.click();
												Log("\"Secured Subdivision\" check box NOT marked");
											break;
				}
			}
			else {
				switch(CheckSecuredSubdivision.toUpperCase()) {
					case "Y": case "YES":	securedsubdivision.click();
												Log("\"Secured Subdivision\" check box marked");
											break;
											
					case "N": case "NO":		Log("\"Secured Subdivision\" check box NOT marked");
											break;
				}
			}
		}
	}
	
	//Selects "Secured Community" drop down 
	public void SelectSecuredCommunity(String SelectSecuredCommunity) {
		if(!SelectSecuredCommunity.toUpperCase().equals("N/A")) {
			switch(SelectSecuredCommunity.toUpperCase()) {
				case "N": case "NONE":								Log("Entered Secured Community: None");
																break;
											
				case "S": case "SINGLE ENTRY":					new Select(securedsubdivision).selectByVisibleText("Single Entry");
																	Log("Entered Secured Community: Single Entry");
																break;
			
				case "24 HR SECURITY": case "SECURITY":			new Select(securedsubdivision).selectByVisibleText("24 hr Security");
																	Log("Entered Secured Community: 24 hr Security");
																break;
			
				case "24 HR MANNED GATE": case "MANNED GATE":	new Select(securedsubdivision).selectByVisibleText("24 hr Manned Gate");
																	Log("Entered Secured Community: 24 hr Manned Gate");
																break;
			
				case "P": case "PASSKEY GATE":					new Select(securedsubdivision).selectByVisibleText("Passkey Gate");
																	Log("Entered Secured Community: Passkey Gate");
																break;
			}
		}
	}

	//Checks "Umbrella Discount" check box 
	public void CheckUmbrellaDiscount(String CheckUmbrellaDiscount) {
		if(!CheckUmbrellaDiscount.toUpperCase().equals("N/A")) {
			if(umbrelladiscount.isSelected()) {
				switch(CheckUmbrellaDiscount.toUpperCase()) {
					case "Y": case "YES":		Log("\"Umbrella Discount\" check box marked");
											break;
											
					case "N": case "NO":	umbrelladiscount.click();
												Log("\"Umbrella Discount\" check box NOT marked");
											break;
				}
			}
			else {
				switch(CheckUmbrellaDiscount.toUpperCase()) {
					case "Y": case "YES":	umbrelladiscount.click();
												Log("\"Umbrella Discount\" check box marked");
											break;
											
					case "N": case "NO":		Log("\"Umbrella Discount\" check box NOT marked");
											break;
				}
			}
		}
	}

	//Checks "Wildfire Area Building Code" check box 
	public void CheckWildfireAreaBuildingCode(String CheckWildfireAreaBuildingCode) {
		if(!CheckWildfireAreaBuildingCode.toUpperCase().equals("N/A")) {
			if(wildlifeareabuildcode.isSelected()) {
				switch(CheckWildfireAreaBuildingCode.toUpperCase()) {
					case "Y": case "YES":		Log("\"Wildfire Area Building Code\" check box marked");
											break;
											
					case "N": case "NO":	wildlifeareabuildcode.click();
												Log("\"Wildfire Area Building Code\" check box NOT marked");
											break;
				}
			}
			else {
				switch(CheckWildfireAreaBuildingCode.toUpperCase()) {
					case "Y": case "YES":	wildlifeareabuildcode.click();
												Log("\"Wildfire Area Building Code\" check box marked");
											break;
											
					case "N": case "NO":		Log("\"Wildfire Area Building Code\" check box NOT marked");
											break;
				}
			}
		}
	}

	//Checks "Wood Burning Stove" check box 
	public void CheckWoodBurningStove(String CheckWoodBurningStove) {
		if(!CheckWoodBurningStove.toUpperCase().equals("N/A")) {
			if(woodburningstove.isSelected()) {
				switch(CheckWoodBurningStove.toUpperCase()) {
					case "Y": case "YES":		Log("\"Wood Burning Stove\" check box marked");
											break;
											
					case "N": case "NO":	woodburningstove.click();
												Log("\"Wood Burning Stove\" check box NOT marked");
											break;
				}
			}
			else {
				switch(CheckWoodBurningStove.toUpperCase()) {
					case "Y": case "YES":	woodburningstove.click();
												Log("\"Wood Burning Stove\" check box marked");
											break;
											
					case "N": case "NO":		Log("\"Wood Burning Stove\" check box NOT marked");
											break;
				}
			}
		}
	}
	
	//Selects "BCEG" drop down 
	public void SelectBCEG(String SelectBCEG) {
		if(!SelectBCEG.toUpperCase().equals("N/A")) {
			switch(SelectBCEG.toUpperCase()) {
				case "1": case "GRADE 1":	new Select(bceg).selectByVisibleText("Grade 1");
												Log("Entered BCEG: Grade 1");
											break;
											
				case "2": case "GRADE 2":	new Select(bceg).selectByVisibleText("Grade 2");
												Log("Entered BCEG: Grade 2");
											break;
			
				case "3": case "GRADE 3":	new Select(bceg).selectByVisibleText("Grade 3");
												Log("Entered BCEG: Grade 3");
											break;
			
				case "4": case "GRADE 4":	new Select(bceg).selectByVisibleText("Grade 4");
												Log("Entered BCEG: Grade 4");
											break;
			
				case "5": case "GRADE 5":	new Select(bceg).selectByVisibleText("Grade 5");
												Log("Entered BCEG: Grade 5");
											break;
			
				case "6": case "GRADE 6":	new Select(bceg).selectByVisibleText("Grade 6");
												Log("Entered BCEG: Grade 6");
											break;
			
				case "7": case "GRADE 7":	new Select(bceg).selectByVisibleText("Grade 7");
												Log("Entered BCEG: Grade 7");
											break;
			
				case "8": case "GRADE 8":	new Select(bceg).selectByVisibleText("Grade 8");
												Log("Entered BCEG: Grade 8");
											break;
			
				case "9": case "GRADE 9":	new Select(bceg).selectByVisibleText("Grade 9");
												Log("Entered BCEG: Grade 9");
											break;
			
				case "10": case "GRADE 10":	new Select(bceg).selectByVisibleText("Grade 10");
												Log("Entered BCEG: Grade 10");
											break;
			
				case "U": case "UNGRADED":	new Select(bceg).selectByVisibleText("Ungraded");
												Log("Entered BCEG: Ungraded");
											break;
			}
		}
	}
	
	//Selects "ACV Loss Settlement-Wind/Hail Losses to Roof" drop down 
	public void SelectACVLossSettlement(String SelectACVLossSettlement) {
		switch(SelectACVLossSettlement.toUpperCase()) {
			case "RC": case "REPLACEMENT COST": case "N": case "NO":	new Select(acvlosssettlement).selectByIndex(1);
																			Log("Entered ACV Loss Settlement-Wind/Hail Losses to Roof: " + new Select(acvlosssettlement).getFirstSelectedOption().getText());
																		break;
		
			case "ACV": case "ACTUAL CASH VALUE": case "Y": case "YES":	new Select(acvlosssettlement).selectByIndex(2);
																			Log("Entered ACV Loss Settlement-Wind/Hail Losses to Roof: " + new Select(acvlosssettlement).getFirstSelectedOption().getText());
																		break;
		}
	}

	//Selects "Burglar Protection" drop down 
	public void SelectBurglarProtection(String SelectBurglarProtection) {
		if(!SelectBurglarProtection.toUpperCase().equals("N/A")) {
			switch(SelectBurglarProtection.toUpperCase()) {
				case "0":  case "NONE": case "N":								Log("Entered Burglar Protection: None");
																			break;
			
				case "1": case "LOCAL BURGLAR ALARM":						new Select(burglarprotection).selectByVisibleText("Local Burglar Alarm");
																				Log("Entered Burglar Protection: Local Burglar Alarm");
																			break;
															
				case "2": case "REP TO CENTRAL STATION":					new Select(burglarprotection).selectByVisibleText("Rep to Central Station");
																				Log("Entered Burglar Protection: Rep to Central Station");
																			break;
												
				case "3": case "REP TO CENTRAL STATION WITH DATA SHARING":	new Select(burglarprotection).selectByVisibleText("Rep to Central Station with data-sharing");
																				Log("Entered Burglar Protection: Rep to Central Station with data-sharing");
																			break;
		
				case "4": case "MOTION DETECTING CAMERA":					new Select(burglarprotection).selectByVisibleText("Motion Detecting Camera");
																				Log("Entered Burglar Protection: Motion Detecting Camera");
																			break;
								
				case "5": case "MOTION DETECTING CAMERA WITH DATA SHARING":	new Select(burglarprotection).selectByVisibleText("Motion Detecting Camera with data-sharing");
																				Log("Entered Burglar Protection: Motion Detecting Camera with data-sharing");
																			break;
												
				case "6": case "SMART BURGLAR ALARM":						new Select(burglarprotection).selectByVisibleText("Smart Burglar Alarm");
																				Log("Entered Burglar Protection: Smart Burglar Alarm");
																			break;
	
				case "7": case "SMART BURGLAR ALARM WITH DATA SHARING":		new Select(burglarprotection).selectByVisibleText("Smart Burglar Alarm with data-sharing");
																				Log("Entered Burglar Protection: Smart Burglar Alarm with data-sharing");
																			break;
			}
		}
	}
	
	//Selects "Do Any Residents Smoke" drop down 
	public void SelectDoAnyResidentsSmoke(String SelectDoAnyResidentsSmoke) {
		switch(SelectDoAnyResidentsSmoke.toUpperCase()) {
			case "Y": case "YES":	new Select(doanyresidentssmoke).selectByVisibleText("Yes");
										Log("Entered Do Any Residents Smoke: Yes");
									break;
		
			case "N": case "NO":	new Select(doanyresidentssmoke).selectByVisibleText("No");
										Log("Entered Do Any Residents Smoke: No");
									break;
		}
	}	

	//Selects "Fire Protection" drop down 
	public void SelectFireProtection(String SelectFireProtection) {
		if(!SelectFireProtection.toUpperCase().equals("N/A")) {
			switch(SelectFireProtection.toUpperCase()) {
				case "N": case "NO": case "NONE":								Log("Entered Fire Protection: None");
																			break;
																			
				case "0": case "SMOKE ALARM":								new Select(fireprotection).selectByVisibleText("Smoke Alarm");
																				Log("Entered Fire Protection: Smoke Alarm");
																			break;
															
				case "1": case "REP TO CENTRAL STATION":					new Select(fireprotection).selectByVisibleText("Rep to Central Station");
																				Log("Entered Fire Protection: Rep to Central Station");
																			break;
												
				case "2": case "SPRINKLER SYSTEM":							new Select(fireprotection).selectByVisibleText("Sprinkler System");
																				Log("Entered Fire Protection: Sprinkler System");
																			break;
		
				case "3": case "REP TO CENTRAL STATION WITH DATA SHARING":	new Select(fireprotection).selectByVisibleText("Rep to Central Station with data-sharing");
																				Log("Entered Fire Protection: Rep to Central Station with data-sharing");
																			break;
								
				case "4": case "SMART SMOKE DETECTOR":						new Select(fireprotection).selectByVisibleText("Smart Smoke Detector");
																				Log("Entered Fire Protection: Smart Smoke Detector");
																			break;
												
				case "5": case "SMART SMOKE DETECTOR WITH DATA SHARING":	new Select(fireprotection).selectByVisibleText("Smart Smoke Detector with data-sharing");
																				Log("Entered Fire Protection: Smart Smoke Detector with data-sharing");
																			break;
			}
		}
	}

	//Selects "Occupancy" drop down 
	public void SelectOccupancy(String SelectOccupancy) {
		switch(SelectOccupancy.toUpperCase()) {
			case "P": case "PRIMARY RESIDENCE":				new Select(occupancy).selectByVisibleText("Primary Residence");
																Log("Entered Occupancy: Primary Residence");
															break;
		
			case "S": case "SECONDARY/SEASONAL RESIDENCE":	new Select(occupancy).selectByVisibleText("Secondary/Seasonal Residence");
																Log("Entered Occupancy: Secondary/Seasonal Residence");
															break;
															
			case "9 MONTHS OR MORE": case "9":				new Select(occupancy).selectByVisibleText("9 months or more");
																Log("Entered Months Owner Occupied: 9 months or more");
															break;
															
			case "4 - 8 MONTHS": case "4":					new Select(occupancy).selectByVisibleText("4 - 8 months");
																Log("Entered Months Owner Occupied: 4 - 8 months");
															break;
															
			case "0 - 3 MONTHS": case "0":					new Select(occupancy).selectByVisibleText("0 - 3 months");
																Log("Entered Months Owner Occupied: 0 - 3 months");
															break;
		}
	}	

	//Selects "Paid In Full Discount" drop down 
	public void SelectPaidInFullDiscount(String SelectPaidInFullDiscount) {
		switch(SelectPaidInFullDiscount.toUpperCase()) {
			case "MB": case "MORTGAGE BILLED":		new Select(paidinfulldiscount).selectByVisibleText("Mortgage Billed");
														Log("Entered Paid In Full Discount: Mortgage Billed");
													break;
		
			case "IPP": case "INSURED PAY PLAN":	new Select(paidinfulldiscount).selectByVisibleText("Insured Pay Plan");
														Log("Entered Paid In Full Discount: Insured Pay Plan");
													break;
						
			case "IFP": case "INSURED FULL PAY":	new Select(paidinfulldiscount).selectByVisibleText("Insured Full Pay");
														Log("Entered Paid In Full Discount: Insured Full Pay");
													break;
		}
	}

	//Selects "Water Leak Protection" drop down 
	public void SelectWaterLeakProtection(String SelectWaterLeakProtection) {
		if(!SelectWaterLeakProtection.toUpperCase().equals("N/A")) {
			switch(SelectWaterLeakProtection.toUpperCase()) {
				case "0": case "NONE": case "N":												Log("Entered Water Leak Protection: None");
																							break;
			
				case "1": case "WATER LEAK SENSORS":										new Select(waterleakprotection).selectByVisibleText("Water Leak Sensors");
																								Log("Entered Water Leak Protection: Water Leak Sensors");
																							break;
															
				case "2": case "WATER LEAK SENSORS WITH DATA-SHARING":						new Select(waterleakprotection).selectByVisibleText("Water Leak Sensors with data-sharing");
																								Log("Entered Water Leak Protection: Water Leak Sensors with data-sharing");
																							break;
												
				case "3": case "WATER LEAK SENSORS WITH AUTOMATIC SHUT-OFF":				new Select(waterleakprotection).selectByVisibleText("Water Leak Sensors with automatic shut-off");
																								Log("Entered Water Leak Protection: Water Leak Sensors with automatic shut-off");
																							break;
		
				case "4": case "WATER LEAK SENSORS WITH AUTOMATIC SHUT-OFF & DATA-SHARING":	new Select(waterleakprotection).selectByVisibleText("Water Leak Sensors with automatic shut-off & data-sharing");
																								Log("Entered Water Leak Protection: Water Leak Sensors with automatic shut-off & data-sharing");
																							break;
								
				case "5": case "WATER FLOW MONITOR WITH AUTOMATIC SHUT-OFF":				new Select(waterleakprotection).selectByVisibleText("Water flow Monitor with automatic shut-off");
																								Log("Entered Water Leak Protection: Water flow Monitor with automatic shut-off");
																							break;
																					
				case "6": case "WATER FLOW MONITOR WITH AUTOMATIC SHUT-OFF & DATA-SHARING":	new Select(waterleakprotection).selectByVisibleText("Water Flow Monitor with automatic shut-off & data-sharing");
																								Log("Entered Water Leak Protection: Water Flow Monitor with automatic shut-off & data-sharing");
																							break;
			}
		}
	}	

	//Selects "Home Update Discount" drop down 
	public void SelectHomeUpdateDiscount(String SelectHomeUpdateDiscount) {
		if(!SelectHomeUpdateDiscount.toUpperCase().equals("N/A")) {
			switch(SelectHomeUpdateDiscount.toUpperCase()) {
				case "Y": case "YES":	new Select(homeupdatediscount).selectByVisibleText("Yes");
											Log("Entered Home Update Discount: Yes");
										break;
			
				case "N": case "NO":	new Select(homeupdatediscount).selectByVisibleText("No");
											Log("Entered Home Update Discount: No");
										break;
			}
		}
	}

	//Types into "Latest Permit Date" text box 
	public void TypeLatestPermitDate(String TypeLatestPermitDate) {
		if(TypeLatestPermitDate.toUpperCase().equals("BLANK")) {
			latestpermitdate.clear();
				Log("Entered Latest Permit Date: Cleared out");
		}
		else if(!TypeLatestPermitDate.toUpperCase().equals("N/A")) {
			latestpermitdate.clear();
			latestpermitdate.sendKeys(TypeLatestPermitDate);
				Log("Entered Latest Permit Date: " + TypeLatestPermitDate);
		}
	}
	
	//Selects "Package Policy Discount" from drop down
	public void SelectPackagePolicyDiscount(String SelectPackagePolicyDiscount) {
		if(driver.getPageSource().contains("Covg_37D")) {
			switch(SelectPackagePolicyDiscount.toUpperCase()) {
				case "N": case "NONE": case "NO":									new Select(ppd37D).selectByVisibleText("None");
																						Log("Entered Package Policy Discount: None");
																					break;
																					
				case "AFFILIATED AUTO":												new Select(ppd37D).selectByVisibleText("Affiliated Auto");
																						Log("Entered Package Policy Discount: Affiliated Auto");
																					break;
										
				case "A": case "OTHER COMPANY AUTO":								new Select(ppd37D).selectByVisibleText("Other Company Auto");
																						Log("Entered Package Policy Discount: Other Company Auto");
																					break;
																					
				case "C": case "COMPANTION AUTO":									new Select(ppd37D).selectByVisibleText("Companion Auto");
																						Log("Entered Package Policy Discount: Companion Auto");
																					break;
																					
				case "PA": case "PROGRESSIVE AUTO":									new Select(ppd37D).selectByVisibleText("Progressive Auto");
																						Log("Entered Package Policy Discount: Progressive Auto");
																					break;
														
				case "F": case "FLOOD":												new Select(ppd37D).selectByVisibleText("Flood");
																						Log("Entered Package Policy Discount: Flood");
																					break;
														
				case "P": case "PREFERRED":											driver.findElement(By.xpath("//select[@id='Covg_37D']//option[contains(text(),'Preferred Partner')]")).click();
																						Log("Entered Package Policy Discount: " + new Select(ppd37D).getFirstSelectedOption().getText());
																					break;
														
				case "P25": case "PP25": case "PROGRESSIVE AUTO LESS THAN 50/100":	driver.findElement(By.xpath("//select[@id='Covg_37D']//option[contains(text(),'ess t')]")).click();
																						Log("Entered Package Policy Discount: " + new Select(ppd37D).getFirstSelectedOption().getText());
																					break;
																					
				case "P50": case "PP50": case "PROGRESSIVE AUTO 50/100":			driver.findElement(By.xpath("//select[@id='Covg_37D']//option[contains(text(),'Auto 50/100')]")).click();
																						Log("Entered Package Policy Discount: " + new Select(ppd37D).getFirstSelectedOption().getText());
																					break;
																			
				case "P100": case "PP100": case "PROGRESSIVE AUTO 100/300":			driver.findElement(By.xpath("//select[@id='Covg_37D']//option[contains(text(),'100/300')]")).click();
																					Log("Entered Package Policy Discount: " + new Select(ppd37D).getFirstSelectedOption().getText());
																					break;
																					
				case "P250": case "PP250": case "PROGRESSIVE AUTO 250/500":			driver.findElement(By.xpath("//select[@id='Covg_37D']//option[contains(text(),'250/500')]")).click();
																						Log("Entered Package Policy Discount: " + new Select(ppd37D).getFirstSelectedOption().getText());
																					break;
																					
				default:																Log("Invalid value for package Policy Discount: " + SelectPackagePolicyDiscount);
																					break;
			}
		}
		else if(driver.getPageSource().contains("Covg_37K")) {
			switch(SelectPackagePolicyDiscount.toUpperCase()) {
				case "N": case "NONE": case "NO":									new Select(ppd37K).selectByVisibleText("None");
																						Log("Entered Package Policy Discount: None");
																					break;
																					
				case "AFFILIATED AUTO":												new Select(ppd37K).selectByVisibleText("Affiliated Auto");
																						Log("Entered Package Policy Discount: Affiliated Auto");
																					break;
										
				case "A": case "OTHER COMPANY AUTO":								new Select(ppd37K).selectByVisibleText("Other Company Auto");
																						Log("Entered Package Policy Discount: Other Company Auto");
																					break;
																					
				case "C": case "COMPANTION AUTO":									new Select(ppd37K).selectByVisibleText("Companion Auto");
																						Log("Entered Package Policy Discount: Companion Auto");
																					break;
																					
				case "PA": case "PROGRESSIVE AUTO":									new Select(ppd37D).selectByVisibleText("Progressive Auto");
																						Log("Entered Package Policy Discount: Progressive Auto");
																					break;
														
				case "F": case "FLOOD":												new Select(ppd37K).selectByVisibleText("Flood");
																						Log("Entered Package Policy Discount: Flood");
																					break;
														
				case "P": case "PREFERRED PARTNER":									driver.findElement(By.xpath("//select[@id='Covg_37K']//option[contains(text(),'Preferred Partner')]")).click();
																						Log("Entered Package Policy Discount: " + new Select(ppd37K).getFirstSelectedOption().getText());
																					break;
														
				case "P25": case "PP25": case "PROGRESSIVE AUTO LESS THAN 50/100":	driver.findElement(By.xpath("//select[@id='Covg_37K']//option[contains(text(),'ess t')]")).click();
																						Log("Entered Package Policy Discount: " + new Select(ppd37K).getFirstSelectedOption().getText());
																					break;
																					
				case "P50": case "PP50": case "PROGRESSIVE AUTO 50/100":			driver.findElement(By.xpath("//select[@id='Covg_37K']//option[contains(text(),'Auto 50/100')]")).click();
																						Log("Entered Package Policy Discount: " + new Select(ppd37K).getFirstSelectedOption().getText());
																					break;
																			
				case "P100": case "PP100": case "PROGRESSIVE AUTO 100/300":			driver.findElement(By.xpath("//select[@id='Covg_37K']//option[contains(text(),'100/300')]")).click();
																						Log("Entered Package Policy Discount: " + new Select(ppd37K).getFirstSelectedOption().getText());
																					break;
																					
				case "P250": case "PP250": case "PROGRESSIVE AUTO 250/500":			driver.findElement(By.xpath("//select[@id='Covg_37K']//option[contains(text(),'250/500')]")).click();
																						Log("Entered Package Policy Discount: " + new Select(ppd37K).getFirstSelectedOption().getText());
																					break;
																					
				default:																Log("Invalid value for package Policy Discount: " + SelectPackagePolicyDiscount);
																					break;
			}			
		}
		else {
			new Select(cp37).selectByVisibleText(SelectPackagePolicyDiscount);
				Log("Entered Package Policy Discount: " + new Select(cp37).getFirstSelectedOption().getText());
		}
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
		else if(driver.getPageSource().contains("Covg_37K")) {
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

	//Selects "Companion Product" drop down 
	public void SelectCompanionProduct(String SelectCompanionProduct) {
		if(!SelectCompanionProduct.toUpperCase().equals("N/A")) {
			switch(SelectCompanionProduct.toUpperCase()) {
				case "H": case "HOMEOWNER":			new Select(cp37).selectByVisibleText("Homeowner");
														Log("Entered Companion Product: Homeowner");
													break;
			
				case "F": case "FLOOD":				new Select(cp37).selectByVisibleText("Flood");
														Log("Entered Companion Product: Flood");
													break;
			
				case "D": case "DWELLING":			new Select(cp37).selectByVisibleText("Dwelling");
														Log("Entered Companion Product: Dwelling");
													break;
			
				case "U": case "UMBRELLA":			new Select(cp37).selectByVisibleText("Umbrella");
														Log("Entered Companion Product: Umbrella");
													break;
			
				case "HA": case "HARTFORD AUTO":	new Select(cp37).selectByVisibleText("Hartford Auto");
														Log("Entered Companion Product: Hartford Auto");
													break;
			
				case "SA": case "SAFECO AUTO":		new Select(cp37).selectByVisibleText("Safeco Auto");
														Log("Entered Companion Product: Safeco Auto");
													break;
			}
		}
	}
	
	//Selects "All Other Perils Deductible" drop down 
	public void SelectAllOtherPerilsDeductible(String SelectAllOtherPerilsDeductible) {
		switch(SelectAllOtherPerilsDeductible.toUpperCase()) {
			case "500": case "$500":								driver.findElement(By.xpath("//select[@id='Covg_44N']//option[contains(text(),'500') and not(contains(text(),'2500')) and not(contains(text(),'5000'))]")).click();
																	break;
														
			case "1000": case "$1000": case "$1,000": case "1,000":	driver.findElement(By.xpath("//select[@id='Covg_44N']//option[contains(text(),'1') and not(contains(text(),'Cov'))]")).click();
																	break;
																		
			case "2500": case "$2500": case "$2,500": case "2,500":	driver.findElement(By.xpath("//select[@id='Covg_44N']//option[contains(text(),'2') and not(contains(text(),'Cov'))]")).click();
																	break;
																	
			case "5000": case "$5000": case "$5,000": case "5,000":	driver.findElement(By.xpath("//select[@id='Covg_44N']//option[contains(text(),'5') and not(contains(text(),'2500')) and not(contains(text(),'Included'))]")).click();
																	break;
										
			case "0.01": case "1": case "1% COV A":	case "1%":		driver.findElement(By.xpath("//select[@id='Covg_44N']//option[contains(text(),'1%')]")).click();
																	break;
														
			case "0.02": case "2": case "2% COV A":	case "2%":		driver.findElement(By.xpath("//select[@id='Covg_44N']//option[contains(text(),'2%')]")).click();
																	break;
														
			case "0.05": case "5": case "5% COV A":	case "5%":		driver.findElement(By.xpath("//select[@id='Covg_44N']//option[contains(text(),'5%')]")).click();
																	break;
		}
			Log("Entered All Other Perils Deductible: " + new Select(allotherperilsdeductible).getFirstSelectedOption().getText());
	}

	//Selects "Wind Hail Deductible" drop down 
	public void SelectWindHailDeductible(String SelectWindHailDeductible) {
		switch(SelectWindHailDeductible.toUpperCase()) {
			case "500": case "$500":								driver.findElement(By.xpath("//select[@id='Covg_44H']//option[contains(text(),'500') and not(contains(text(),'2'))]")).click();
																	break;
														
			case "1000": case "$1000": case "$1,000": case "1,000":	driver.findElement(By.xpath("//select[@id='Covg_44H']//option[contains(text(),'1') and not(contains(text(),'Cov'))]")).click();
																	break;
																		
			case "2500": case "$2500": case "$2,500": case "2,500":	driver.findElement(By.xpath("//select[@id='Covg_44H']//option[contains(text(),'2') and not(contains(text(),'Cov'))]")).click();
																	break;
										
			case "0.01": case "1": case "1% COV A":	case "1%":		driver.findElement(By.xpath("//select[@id='Covg_44H']//option[contains(text(),'1%')]")).click();
																	break;
										
			case "0.02": case "2": case "2% COV A":	case "2%":		driver.findElement(By.xpath("//select[@id='Covg_44H']//option[contains(text(),'2%')]")).click();
																	break;
														
			case "0.03": case "3": case "3% COV A":	case "3%":		driver.findElement(By.xpath("//select[@id='Covg_44H']//option[contains(text(),'3%')]")).click();
																	break;
				
			case "0.05": case "5": case "5% COV A":	case "5%":		driver.findElement(By.xpath("//select[@id='Covg_44H']//option[contains(text(),'5%')]")).click();
																	break;
																	
			case "0.10": case "10": case "10% COV A": case "10%":	driver.findElement(By.xpath("//select[@id='Covg_44H']//option[contains(text(),'10%')]")).click();
																	break;
		}
			Log("Entered Wind Hail Deductible: " + new Select(windhaildeductible).getFirstSelectedOption().getText());
	}
	
	//Selects "Earthquake Coverage" drop down 
	public void SelectEarthquakeCoverage(String SelectEarthquakeCoverage) {
		if(!SelectEarthquakeCoverage.toUpperCase().equals("N/A")) {
			switch(SelectEarthquakeCoverage.toUpperCase()) {
				case "Y": case "YES":				new Select(eqcoverage).selectByVisibleText("Yes");
														Log("Entered Earthquake Coverage: Yes");
													break;
			
				case "N": case "NO": case "NONE":	new Select(eqcoverage).selectByVisibleText("No");
														Log("Entered Earthquake Coverage: No");
													break;
										
				case "B": case "BASIC":				new Select(eqcoverage).selectByVisibleText("Basic");
														Log("Entered Earthquake Coverage: Basic");
													break;
	
				case "C": case "CHOICE":			new Select(eqcoverage).selectByVisibleText("Choice");
														Log("Entered Earthquake Coverage: Choice");
													break;
			}
		}
	}

	//Selects "Earthquake Deductible" drop down 
	public void SelectEarthquakeDeductible(String SelectEarthquakeDeductible) {
		if(!SelectEarthquakeDeductible.toUpperCase().equals("N/A")) {
			switch(SelectEarthquakeDeductible.toUpperCase()) {
				case "0.05": case "5% COV A":case "5% COV A AND B CSL": case "5%": case "5":		driver.findElement(By.xpath("//select[@id='Covg_44D']//option[contains(text(),'5') and not(contains(text(),'1')) and not(contains(text(),'2'))]")).click();
																									break;
												
				case "0.1": case "10% COV A":case "10% COV A AND B CSL": case "10%": case "10":		driver.findElement(By.xpath("//select[@id='Covg_44D']//option[contains(text(),'10')]")).click();
																									break;
			
				case "0.15": case "15% COV A":case "15% COV A AND B CSL": case "15%": case "15":	driver.findElement(By.xpath("//select[@id='Covg_44D']//option[contains(text(),'15')]")).click();
																									break;
				
				case "0.2": case "20% COV A": case "20% COV A AND B CSL": case "20%": case "20":	driver.findElement(By.xpath("//select[@id='Covg_44D']//option[contains(text(),'20')]")).click();
																									break;
												
				case "0.25": case "25% COV A": case "25% COV A AND B CSL": case "25%": case "25":	driver.findElement(By.xpath("//select[@id='Covg_44D']//option[contains(text(),'25')]")).click();
																									break;
			}
				Log("Entered Earthquake Deductible: " + new Select(eqdeductible).getFirstSelectedOption().getText());
		}
	}	
				
	//Selects "Earthquake Foundation Type" drop down 
	public void SelectEarthquakeFoundationType(String SelectEarthquakeFoundationType) {
		if(!SelectEarthquakeFoundationType.toUpperCase().equals("N/A")) {
			switch(SelectEarthquakeFoundationType.toUpperCase()) {
				case "B": case "BASEMENT":						new Select(eqfoundationtype).selectByVisibleText("Basement");
																	Log("Entered Earthquake Foundation Type: Basement");
																break;
			
				case "C": case "CRAWL SPACE":					new Select(eqfoundationtype).selectByVisibleText("Crawl Space");
																	Log("Entered Earthquake Foundation Type: Crawl Space");
																break;
				
				case "P": case "PIERS (ELEVATED)":				new Select(eqfoundationtype).selectByVisibleText("Piers (elevated)");
																	Log("Entered Earthquake Foundation Type: Piers (elevated)");
																break;
												
				case "OF": case "OPEN FOUNDATION":				new Select(eqfoundationtype).selectByVisibleText("Open Foundation");
																	Log("Entered Earthquake Foundation Type: Open Foundation");
																break;								
												
				case "P/C": case "PIERS/CRAWL SPACE":			new Select(eqfoundationtype).selectByVisibleText("Piers/Crawl space");
																	Log("Entered Earthquake Foundation Type: Piers/Crawl space");
																break;
										
				case "P/O": case "PIERS/OPEN FOUNDATION":		new Select(eqfoundationtype).selectByVisibleText("Piers/Open Foundation");
																	Log("Entered Earthquake Foundation Type: Piers/Open Foundation");
																break;
										
				case "PL": case "PILINGS 8-12 FT":				new Select(eqfoundationtype).selectByVisibleText("Pilings 8-12 ft");
																	Log("Entered Earthquake Foundation Type: Pilings 8-12 ft");
																break;
															
				case "R": case "RAISED":						new Select(eqfoundationtype).selectByVisibleText("Raised");
																	Log("Entered Earthquake Foundation Type: Raised");
																break;
															
				case "OT": case "OTHER":						new Select(eqfoundationtype).selectByVisibleText("Other");
																	Log("Entered Earthquake Foundation Type: Other");
																break;
												
				case "S": case "SLAB-ON-GROUND": case "SLAB":	driver.findElement(By.xpath("//select[@id='Covg_31C']//option[contains(text(),'Slab')]")).click();
																	Log("Entered Earthquake Foundation Type: Slab-on-ground");
																break;
			}
		}
	}

	//Checks "Earthquake Secured Water Heater" check box 
	public void CheckEarthquakeSecuredWaterHeater(String CheckEarthquakeSecuredWaterHeater) {
		if(!CheckEarthquakeSecuredWaterHeater.toUpperCase().equals("N/A")) {
			if(eqsecuredwaterheater.isSelected()) {
				switch(CheckEarthquakeSecuredWaterHeater.toUpperCase()) {
					case "Y": case "YES":		Log("\"Earthquake Secured Water Heater\" check box marked");
											break;
											
					case "N": case "NO":	eqsecuredwaterheater.click();
												Log("\"Earthquake Secured Water Heater\" check box NOT marked");
											break;
				}
			}
			else {
				switch(CheckEarthquakeSecuredWaterHeater.toUpperCase()) {
					case "Y": case "YES":	eqsecuredwaterheater.click();
												Log("\"Earthquake Secured Water Heater\" check box marked");
											break;
											
					case "N": case "NO":		Log("\"Earthquake Secured Water Heater\" check box NOT marked");
											break;
				}
			}
		}
	}
	
	//Selects "Earthquake Personal Property Increased Limit" drop down 
	public void SelectEarthquakePersonalPropertyIncreasedLimit(String SelectEarthquakePersonalPropertyIncreasedLimit) {
		if(!SelectEarthquakePersonalPropertyIncreasedLimit.toUpperCase().equals("N/A")) {
			switch(SelectEarthquakePersonalPropertyIncreasedLimit.toUpperCase()) {
				case "5000": case "5,000": case "$5000": case "$5,000":			new Select(eqpersonalproperty).selectByVisibleText("$5,000");
																					Log("Entered Earthquake Personal Property Increased Limit: $5,000");
																				break;
			
				case "25000": case "25,000": case "$25000": case "$25,000":		new Select(eqpersonalproperty).selectByVisibleText("$25,000");
																					Log("Entered Earthquake Personal Property Increased Limit: $25,000");
																				break;
										
				case "50000": case "50,000": case "$50000": case "$50,000":		new Select(eqpersonalproperty).selectByVisibleText("$50,000");
																					Log("Entered Earthquake Personal Property Increased Limit: $50,000");
																				break;
	
				case "75000": case "75,000": case "$75000": case "$75,000":		new Select(eqpersonalproperty).selectByVisibleText("$75,000");
																					Log("Entered Earthquake Personal Property Increased Limit: $75,000");
																				break;
																				
				case "100000": case "100,000": case "$100000": case "$100,000":	new Select(eqpersonalproperty).selectByVisibleText("$100,000");
																					Log("Entered Earthquake Personal Property Increased Limit: $100,000");
																				break;
			
				case "150000": case "150,000": case "$150000": case "$150,000":	new Select(eqpersonalproperty).selectByVisibleText("$150,000");
																					Log("Entered Earthquake Personal Property Increased Limit: $150,000");
																				break;
										
				case "200000": case "200,000": case "$200000": case "$200,000":	new Select(eqpersonalproperty).selectByVisibleText("$200,000");
																					Log("Entered Earthquake Personal Property Increased Limit: $200,000");
																				break;
			}
		}
	}
	
	//Selects "Earthquake Loss of Use Increased Limit" drop down 
	public void SelectEarthquakeLossofUse(String SelectEarthquakeLossofUse) {
		if(!SelectEarthquakeLossofUse.toUpperCase().equals("N/A")) {
			switch(SelectEarthquakeLossofUse.toUpperCase()) {
				case "1500": case "1,500": case "$1500": case "$1,500":			new Select(eqlossofuse).selectByVisibleText("$1,500");
																					Log("Entered Earthquake Personal Property Increased Limit: $1,500");
																				break;
			
				case "10000": case "10,000": case "$10000": case "$10,000":		new Select(eqlossofuse).selectByVisibleText("$10,000");
																					Log("Entered Earthquake Personal Property Increased Limit: $10,000");
																				break;
										
				case "15000": case "15,000": case "$15000": case "$15,000":		new Select(eqlossofuse).selectByVisibleText("$15,000");
																					Log("Entered Earthquake Personal Property Increased Limit: $15,000");
																				break;
	
				case "25000": case "25,000": case "$25000": case "$25,000":		new Select(eqlossofuse).selectByVisibleText("$25,000");
																					Log("Entered Earthquake Personal Property Increased Limit: $25,000");
																				break;
																				
				case "50000": case "50,000": case "$50000": case "$50,000":		new Select(eqlossofuse).selectByVisibleText("$50,000");
																					Log("Entered Earthquake Personal Property Increased Limit: $50,000");
																				break;
			
				case "75000": case "75,000": case "$75000": case "$75,000":		new Select(eqlossofuse).selectByVisibleText("$75,000");
																					Log("Entered Earthquake Personal Property Increased Limit: $75,000");
																				break;
										
				case "100000": case "100,000": case "$100000": case "$100,000":	new Select(eqlossofuse).selectByVisibleText("$100,000");
																					Log("Entered Earthquake Personal Property Increased Limit: $100,000");
																				break;
			}
		}
	}
	
	//Selects "Earthquake Ordinance or Law" drop down 
	public void SelectEarthquakeOrdinanceOrLaw(String SelectEarthquakeOrdinanceOrLaw) {
		if(!SelectEarthquakeOrdinanceOrLaw.toUpperCase().equals("N/A")) {
			switch(SelectEarthquakeOrdinanceOrLaw.toUpperCase()) {
				case "10000": case "10,000": case "$10000": case "$10,000":		new Select(eqol).selectByVisibleText("$10,000");
																					Log("Entered Earthquake Ordinance or Law: $10,000");
																				break;
			
				case "20000": case "20,000": case "$20000": case "$20,000":		new Select(eqol).selectByVisibleText("$20,000");
																					Log("Entered Earthquake Ordinance or Law: $20,000");
																				break;
										
				case "30000": case "30,000": case "$30000": case "$30,000":		new Select(eqol).selectByVisibleText("$30,000");
																					Log("Entered Earthquake Ordinance or Law: $30,000");
																				break;
			}
		}
	}
	
	//Selects "Earthquake Hazard Reduction Discount" drop down 
	public void SelectEarthquakeHazardReductionDiscount(String SelectEarthquakeHazardReductionDiscount) {
		if(!SelectEarthquakeHazardReductionDiscount.toUpperCase().equals("N/A")) {
			switch(SelectEarthquakeHazardReductionDiscount.toUpperCase()) {
				case "V": case "VERIFIED":					new Select(eqhazardreduction).selectByVisibleText("Verified");
																Log("Entered Earthquake Hazard Reduction Discount: Verified");
															break;
			
				case "SV": case "S": case "SELF-VERIFIED":	new Select(eqhazardreduction).selectByVisibleText("Self-Verified");
																Log("Entered Earthquake Hazard Reduction Discount: Self-Verified");
															break;
			}
		}
	}
	
	//Selects "Earthquake Contents Deductible (Choice Only)" drop down 
	public void SelectEarthquakeContentsDeductible(String SelectEarthquakeContentsDeductible) {
		if(!SelectEarthquakeContentsDeductible.toUpperCase().equals("N/A")) {
			switch(SelectEarthquakeContentsDeductible.toUpperCase()) {
				case ".05": case "5% COV C": case "5%":		new Select(eqpersonalproperty).selectByVisibleText("5% Cov C");
																Log("Entered Earthquake Contents Deductible (Choice Only): 5% Cov C");
															break;

				case ".10": case "10% COV C": case "10%":	new Select(eqpersonalproperty).selectByVisibleText("10% Cov C");
																Log("Entered Earthquake Contents Deductible (Choice Only): 10% Cov C");
															break;

				case ".15": case "15% COV C": case "15%":	new Select(eqpersonalproperty).selectByVisibleText("15% Cov C");
																Log("Entered Earthquake Contents Deductible (Choice Only): 15% Cov C");
															break;

				case ".20": case "20% COV C": case "20%":	new Select(eqpersonalproperty).selectByVisibleText("20% Cov C");
																Log("Entered Earthquake Contents Deductible (Choice Only): 20% Cov C");
															break;
		
				case ".25": case "25% COV C": case "25%":	new Select(eqpersonalproperty).selectByVisibleText("25% Cov C");
																Log("Entered Earthquake Contents Deductible (Choice Only): 25% Cov C");
															break;		
			}
		}
	}

	//Checks "Earthquake Masonry Veneer Exterior Coverage" check box 
	public void CheckEarthquakeMasonryVeneerExteriorCoverage(String CheckEarthquakeMasonryVeneerExteriorCoverage) {
		if(!CheckEarthquakeMasonryVeneerExteriorCoverage.toUpperCase().equals("N/A")) {
			if(eqmasonaryveneerexterior.isSelected()) {
				switch(CheckEarthquakeMasonryVeneerExteriorCoverage.toUpperCase()) {
					case "Y": case "YES":		Log("\"Earthquake Masonry Veneer Exterior Coverage\" check box marked");
											break;
											
					case "N": case "NO":	eqmasonaryveneerexterior.click();
												Log("\"Earthquake Masonry Veneer Exterior Coverage\" check box NOT marked");
											break;
				}
			}
			else {
				switch(CheckEarthquakeMasonryVeneerExteriorCoverage.toUpperCase()) {
					case "Y": case "YES":	eqmasonaryveneerexterior.click();
												Log("\"Earthquake Masonry Veneer Exterior Coverage\" check box marked");
											break;
											
					case "N": case "NO":		Log("\"Earthquake Masonry Veneer Exterior Coverage\" check box NOT marked");
											break;
				}			
			}
		}
	}

	//Checks "Earthquake Breakables Coverage" check box 
	public void CheckEarthquakeBreakablesCoverage(String CheckEarthquakeBreakablesCoverage) {
		if(!CheckEarthquakeBreakablesCoverage.toUpperCase().equals("N/A")) {
			if(eqbreakables.isSelected()) {
				switch(CheckEarthquakeBreakablesCoverage.toUpperCase()) {
					case "Y": case "YES":		Log("\"Earthquake Breakables Coverage\" check box marked");
											break;
											
					case "N": case "NO":	eqbreakables.click();
												Log("\"Earthquake Breakables Coverage\" check box NOT marked");
											break;
				}
			}
			else {
				switch(CheckEarthquakeBreakablesCoverage.toUpperCase()) {
					case "Y": case "YES":	eqbreakables.click();
												Log("\"Earthquake Breakables Coverage\" check box marked");
											break;
											
					case "N": case "NO":		Log("\"Earthquake Breakables Coverage\" check box NOT marked");
											break;
				}			
			}
		}
	}
	
	//Selects "Pre-Existing Earthquake Damage" drop down 
	public void SelectPreExistingEarthquakeDamage(String SelectPreExistingEarthquakeDamage) {
		if(!SelectPreExistingEarthquakeDamage.toUpperCase().equals("N/A")) {
			switch(SelectPreExistingEarthquakeDamage.toUpperCase()) {
				case "Y": case "YES":	new Select(preexistingeqdmg).selectByVisibleText("Yes");
											Log("Entered Pre-Existing Earthquake Damage: Yes");
										break;

				case "N": case "NO":	new Select(preexistingeqdmg).selectByVisibleText("No");
											Log("Entered Pre-Existing Earthquake Damage: No");
										break;	
			}
		}
	}
	
	//Selects "Dwelling secured to foundation in accordance with California Building Code?" drop down 
	public void SelectDwellingSecured(String SelectDwellingSecured) {
		if(!SelectDwellingSecured.toUpperCase().equals("N/A")) {
			switch(SelectDwellingSecured.toUpperCase()) {
				case "Y": case "YES":	new Select(dwellingsecured).selectByVisibleText("Yes");
											Log("Entered Dwelling secured to foundation in accordance with California Building Code?: Yes");
										break;

				case "N": case "NO":	new Select(dwellingsecured).selectByVisibleText("No");
											Log("Entered Dwelling secured to foundation in accordance with California Building Code?: No");
										break;
			}
		}
	}
	
	//Selects "Does the dwelling have cripple walls?" drop down 
	public void SelectDoesTheDwellingHaveCrippleWalls(String SelectDoesTheDwellingHaveCrippleWalls) {
		if(!SelectDoesTheDwellingHaveCrippleWalls.toUpperCase().equals("N/A")) {
			switch(SelectDoesTheDwellingHaveCrippleWalls.toUpperCase()) {
				case "Y": case "YES":	new Select(dwellinghavecripplewalls).selectByVisibleText("Yes");
											Log("Entered Does the dwelling have cripple walls?: Yes");
										break;

				case "N": case "NO":	new Select(dwellinghavecripplewalls).selectByVisibleText("No");
											Log("Entered Does the dwelling have cripple walls?: No");
										break;
			}
		}
	}
	
	//Selects "Cripple walls braced with plywood or equivalent in accordance with California Building Code?" drop down 
	public void SelectCrippleWallsBraced(String SelectCrippleWallsBraced) {
		if(!SelectCrippleWallsBraced.toUpperCase().equals("N/A")) {
			switch(SelectCrippleWallsBraced.toUpperCase()) {
				case "Y": case "YES":							new Select(cripplewallsbraced).selectByVisibleText("Yes");
																	Log("Entered Cripple walls braced with plywood or equivalent in accordance with California Building Code?: Yes");
																break;

				case "N": case "NO":							new Select(cripplewallsbraced).selectByVisibleText("No");
																	Log("Entered Cripple walls braced with plywood or equivalent in accordance with California Building Code?: No");
																break;


				case "NA": case "N-A": case "NOT APPLICABLE":	new Select(cripplewallsbraced).selectByVisibleText("Not applicable");
																	Log("Entered Cripple walls braced with plywood or equivalent in accordance with California Building Code?: Not applicable");
																break;
			}
		}
	}
	
	//Selects "Water heater secured to building frame in accordance with guidelines?" drop down 
	public void SelectWaterHeaterSecured(String SelectWaterHeaterSecured) {
		if(!SelectWaterHeaterSecured.toUpperCase().equals("N/A")) {
			switch(SelectWaterHeaterSecured.toUpperCase()) {
				case "Y": case "YES":	new Select(waterheatersecured).selectByVisibleText("Yes");
											Log("Entered Water heater secured to building frame in accordance with guidelines?: Yes");
										break;

				case "N": case "NO":	new Select(waterheatersecured).selectByVisibleText("No");
											Log("Entered Water heater secured to building frame in accordance with guidelines?: No");
										break;
			}
		}
	}
	
	//Selects "Does the dwelling have a post-and-pier or post-and-beam foundation?" drop down 
	public void SelectDwellingHavePost(String SelectDwellingHavePost) {
		if(!SelectDwellingHavePost.toUpperCase().equals("N/A")) {
			switch(SelectDwellingHavePost.toUpperCase()) {
				case "Y": case "YES":	new Select(dwellinghavepost).selectByVisibleText("Yes");
											Log("Entered Does the dwelling have a post-and-pier or post-and-beam foundation?: Yes");
										break;

				case "N": case "NO":	new Select(dwellinghavepost).selectByVisibleText("No");
											Log("Entered Does the dwelling have a post-and-pier or post-and-beam foundation?: No");
										break;
			}
		}
	}
	
	//Selects "Has the post-and-pier or post-and-beam foundation been modified in accordance with CA Building Code?" drop down 
	public void SelectPostFoundationModified(String SelectPostFoundationModified) {
		if(!SelectPostFoundationModified.toUpperCase().equals("N/A")) {
			switch(SelectPostFoundationModified.toUpperCase()) {
				case "Y": case "YES":	new Select(postfoundationmodified).selectByVisibleText("Yes");
											Log("Entered Has the post-and-pier or post-and-beam foundation been modified in accordance with CA Building Code?: Yes");
										break;

				case "N": case "NO":	new Select(postfoundationmodified).selectByVisibleText("No");
											Log("Entered Has the post-and-pier or post-and-beam foundation been modified in accordance with CA Building Code?: No");
										break;
			}
		}
	}
	
	//Selects "Number of Chimneys" drop down 
	public void SelectNumberOfChimneys(String SelectNumberOfChimneys) {
		if(!SelectNumberOfChimneys.toUpperCase().equals("N/A")) {
			new Select(chimneys).selectByVisibleText(SelectNumberOfChimneys);
				Log("Entered Number of Chimneys: " + SelectNumberOfChimneys);
		}
	}
	
	//Selects "Inservants" drop down 
	public void SelectInservants(String SelectInservants) {
		if(!SelectInservants.toUpperCase().equals("N/A")) {
			switch(SelectInservants.toUpperCase()) {
				case "0": case "N": case "NONE": case "NO":		Log("Entered Inservants: None");
															break;
			
				case "1": case "1 INSERVANT":				new Select(inservants).selectByVisibleText("1 Inservant");
																Log("Entered Inservants: 1 Inservant");
															break;
				
				case "2": case "2 INSERVANTS":				new Select(inservants).selectByVisibleText("2 Inservant");
																Log("Entered Inservants: 2 Inservant");
															break;
															
				case "3": case "3 INSERVANTS":				new Select(inservants).selectByVisibleText("3 Inservant");
																Log("Entered Inservants: 3 Inservant");
															break;
													
				case "4": case "4 INSERVANTS":				new Select(inservants).selectByVisibleText("4 Inservant");
																Log("Entered Inservants: 4 Inservant");
															break;
			
				case "5": case "5 INSERVANTS":				new Select(inservants).selectByVisibleText("5 Inservant");
																Log("Entered Inservants: 5 Inservant");
															break;
			}
		}
	}

	//Selects "Occasional/Incidental" drop down 
	public void SelectOccasionalIncidental(String SelectOccasionalIncidental) {
		if(!SelectOccasionalIncidental.toUpperCase().equals("N/A")) {
			switch(SelectOccasionalIncidental.toUpperCase()) {
				case "0": case "N": case "NONE": case "NO":		Log("Entered Occasional/Incidental: None");
															break;
			
				case "1": case "1 OCCASIONAL/INCIDENTAL":	new Select(occasional).selectByVisibleText("1 Occasional/Incidental");
																Log("Entered Occasional/Incidental: 1 Occasional/Incidental");
															break;
				
				case "2": case "2 OCCASIONAL/INCIDENTAL":	new Select(occasional).selectByVisibleText("2 Occasional/Incidental");
																Log("Entered Occasional/Incidental: 2 Occasional/Incidental");
															break;
															
				case "3": case "3 OCCASIONAL/INCIDENTAL":	new Select(occasional).selectByVisibleText("3 Occasional/Incidental");
																Log("Entered Occasional/Incidental: 3 Occasional/Incidental");
															break;
													
				case "4": case "4 OCCASIONAL/INCIDENTAL":	new Select(occasional).selectByVisibleText("4 Occasional/Incidental");
																Log("Entered Occasional/Incidental: 4 Occasional/Incidental");
															break;
			
				case "5": case "5 OCCASIONAL/INCIDENTAL":	new Select(occasional).selectByVisibleText("5 Occasional/Incidental");
																Log("Entered Occasional/Incidental: 5 Occasional/Incidental");
															break;
			}
		}
	}

	//Selects "Outservants" drop down 
	public void SelectOutservants(String SelectOutservants) {
		if(!SelectOutservants.toUpperCase().equals("N/A")) {
			switch(SelectOutservants.toUpperCase()) {
				case "0": case "N": case "NONE": case "NO":		Log("Entered Outservants: None");
															break;
			
				case "1": case "1 OUTSERVANT":				new Select(outservants).selectByVisibleText("1 Outservant");
																Log("Entered Outservants: 1 Outservant");
															break;
				
				case "2": case "2 OUTSERVANTS":				new Select(outservants).selectByVisibleText("2 Outservants");
																Log("Entered Outservants: 2 Outservants");
															break;
															
				case "3": case "3 OUTSERVANTS":				new Select(outservants).selectByVisibleText("3 Outservants");
																Log("Entered Outservants: 3 Outservants");
															break;
													
				case "4": case "4 OUTSERVANTS":				new Select(outservants).selectByVisibleText("4 Outservants");
																Log("Entered Outservants: 4 Outservants");
															break;
			
				case "5": case "5 OUTSERVANTS":				new Select(outservants).selectByVisibleText("5 Outservants");
																Log("Entered Outservants: 5 Outservants");
															break;
			}
		}
	}
	
	//Checks "Sinkhole Coverage" check box 
	public void CheckSinkholeCoverage(String CheckSinkholeCoverage) {
		if(!CheckSinkholeCoverage.toUpperCase().equals("N/A")) {
			if(sinkhole.isSelected()) {
				switch(CheckSinkholeCoverage.toUpperCase()) {
					case "Y": case "YES":		Log("\"Sinkhole Coverage\" check box marked");
											break;
											
					case "N": case "NO":	sinkhole.click();
												Log("\"Sinkhole Coverage\" check box NOT marked");
											break;
				}
			}
			else {
				switch(CheckSinkholeCoverage.toUpperCase()) {
					case "Y": case "YES":	sinkhole.click();
												Log("\"Sinkhole Coverage\" check box marked");
											break;
											
					case "N": case "NO":		Log("\"Sinkhole Coverage\" check box NOT marked");
											break;
				}
			}
		}
	}
	
	//Checks "Water Damage Exclusion" check box 
	public void CheckWaterDamageExclusion(String CheckWaterDamageExclusion) {
		if(!CheckWaterDamageExclusion.toUpperCase().equals("N/A")) {
			if(waterdmgexclusion.isSelected()) {
				switch(CheckWaterDamageExclusion.toUpperCase()) {
					case "Y": case "YES":		Log("\"Water Damage Exclusion\" check box marked");
											break;
											
					case "N": case "NO":	waterdmgexclusion.click();
												Log("\"Water Damage Exclusion\" check box NOT marked");
											break;
				}
			}
			else {
				switch(CheckWaterDamageExclusion.toUpperCase()) {
					case "Y": case "YES":	waterdmgexclusion.click();
												Log("\"Water Damage Exclusion\" check box marked");
											break;
											
					case "N": case "NO":		Log("\"Water Damage Exclusion\" check box NOT marked");
											break;
				}
			}
		}
	}
	
	//Checks "Non Structural Hail Loss Limitation" check box 
	public void CheckNonStructuralHailLossLimitation(String CheckNonStructuralHailLossLimitation) {
		if(!CheckNonStructuralHailLossLimitation.toUpperCase().equals("N/A")) {
			if(nshl.isSelected()) {
				switch(CheckNonStructuralHailLossLimitation.toUpperCase()) {
					case "Y": case "YES":		Log("\"Non Structural Hail Loss Limitation\" check box marked");
											break;
											
					case "N": case "NO":	nshl.click();
												Log("\"Non Structural Hail Loss Limitation\" check box NOT marked");
											break;
				}
			}
			else {
				switch(CheckNonStructuralHailLossLimitation.toUpperCase()) {
					case "Y": case "YES":	nshl.click();
												Log("\"Non Structural Hail Loss Limitation\" check box marked");
											break;
											
					case "N": case "NO":		Log("\"Non Structural Hail Loss Limitation\" check box NOT marked");
											break;
				}
			}
		}
	}

	//Checks "Home Shield Package" check box 
	public void CheckHomeShieldPackage(String CheckHomeShieldPackage) {
		if(!CheckHomeShieldPackage.toUpperCase().equals("N/A")) {
			if(homeshieldpackage.isSelected()) {
				switch(CheckHomeShieldPackage.toUpperCase()) {
					case "Y": case "YES":		Log("\"Home Shield Package\" check box marked");
											break;
											
					case "N": case "NO": 	homeshieldpackage.click();
												Log("\"Home Shield Package\" check box NOT marked");
											break;
				}
			}
			else {
				switch(CheckHomeShieldPackage.toUpperCase()) {
					case "Y": case "YES":	homeshieldpackage.click();
												Log("\"Home Shield Package\" check box marked");
											break;
											
					case "N": case "NO": 		Log("\"Home Shield Package\" check box NOT marked");
											break;
				}
			}
		}
	}

	//Checks "Home Shield Plus Package" check box 
	public void CheckHomeShieldPlusPackage(String CheckHomeShieldPlusPackage) {
		if(!CheckHomeShieldPlusPackage.toUpperCase().equals("N/A")) {
			if(homeshieldpluspackage.isSelected()) {
				switch(CheckHomeShieldPlusPackage.toUpperCase()) {
					case "Y": case "YES":		Log("\"Home Shield Plus Package\" check box marked");
											break;
											
					case "N": case "NO":	homeshieldpluspackage.click();
												Log("\"Home Shield Plus Package\" check box NOT marked");
											break;
				}
			}
			else {
				switch(CheckHomeShieldPlusPackage.toUpperCase()) {
					case "Y": case "YES":	homeshieldpluspackage.click();
												Log("\"Home Shield Plus Package\" check box marked");
											break;
											
					case "N": case "NO":		Log("\"Home Shield Plus Package\" check box NOT marked");
											break;
				}
			}
		}
	}
	
	//Checks "Platinum Package" check box 
	public void CheckPlatinumPackage(String CheckPlatinumPackage) {
		if(!CheckPlatinumPackage.toUpperCase().equals("N/A")) {
			if(platinumpackage.isSelected()) {
				switch(CheckPlatinumPackage.toUpperCase()) {
					case "Y": case "YES":		Log("\"Platinum Package\" check box marked");
											break;
											
					case "N": case "NO":	platinumpackage.click();
												Log("\"Platinum Package\" check box NOT marked");
											break;
				}
			}
			else {
				switch(CheckPlatinumPackage.toUpperCase()) {
					case "Y": case "YES":	platinumpackage.click();
												Log("\"Platinum Package\" check box marked");
											break;
											
					case "N": case "NO":		Log("\"Platinum Package\" check box NOT marked");
											break;
				}
			}
		}
	}
	
	//Checks appropriate package check box 
	public void CheckPackage(String CheckPackage) {
		if(!CheckPackage.toUpperCase().equals("N/A")) {
			switch(CheckPackage.toUpperCase()) {
				case "N": case "NONE": case "0":					Log("No packages have been selected");
																break;		
			
				case "HS": case "A": case "HOMESHEILD":			if(homeshieldpackage.isSelected()) {
																		Log("\"Home Shield Package\" check box marked");
																}
																else {
																	homeshieldpackage.click();
																		Log("\"Home Shield Package\" check box marked");
																}
																break;
										
				case "HSP": case "B": case "HOMESHIELD PLUS":	if(homeshieldpluspackage.isSelected()) {
																		Log("\"Home Shield Package\" check box marked");
																}
																else {
																	homeshieldpluspackage.click();
																		Log("\"Home Shield Package\" check box marked");
																}
																break;
										
				case "PLAT": case "P": case "PLATINUM":			if(platinumpackage.isSelected()) {
																		Log("\"Platinum Package\" check box marked");
																}
																else {
																	platinumpackage.click();
																		Log("\"Platinum Package\" check box marked");
																}
																break;
			}
		}
	}

	//Checks "Limited Water Damage Coverage" check box 
	public void CheckLimitedWaterDamageCoverage(String CheckLimitedWaterDamageCoverage) {
		if(!CheckLimitedWaterDamageCoverage.toUpperCase().equals("N/A")) {
			if(limitedwaterdamagecov.isSelected()) {
				switch(CheckLimitedWaterDamageCoverage.toUpperCase()) {
					case "Y": case "YES":		Log("\"Limited Water Damage Coverage\" check box marked");
											break;
											
					case "N": case "NO":	limitedwaterdamagecov.click();
												Log("\"Limited Water Damage Coverage\" check box NOT marked");
											break;
				}
			}
			else {
				switch(CheckLimitedWaterDamageCoverage.toUpperCase()) {
					case "Y": case "YES":	limitedwaterdamagecov.click();
												Log("\"Limited Water Damage Coverage\" check box marked");
											break;
											
					case "N": case "NO":		Log("\"Limited Water Damage Coverage\" check box NOT marked");
											break;
				}
			}
		}
	}

	//Checks "Personal Injury Coverage" check box 
	public void CheckPersonalInjuryCoverage(String CheckPersonalInjuryCoverage) {
		if(!CheckPersonalInjuryCoverage.toUpperCase().equals("N/A")) {
			if(personalinjurycoverage.isSelected()) {
				switch(CheckPersonalInjuryCoverage.toUpperCase()) {
					case "Y": case "YES":		Log("\"Personal Injury Coverage\" check box marked");
											break;
											
					case "N": case "NO":	personalinjurycoverage.click();	
												Log("\"Personal Injury Coverage\" check box NOT marked");
											break;
				}
			}
			else{
				switch(CheckPersonalInjuryCoverage.toUpperCase()) {
					case "Y": case "YES":	personalinjurycoverage.click();
												Log("\"Personal Injury Coverage\" check box marked");
											break;
											
					case "N": case "NO":		Log("\"Personal Injury Coverage\" check box NOT marked");
											break;
				}
			}
		}
	}

	//Checks "Personal Property Replacement Cost" check box 
	public void CheckPersonalPropertyReplacementCost(String CheckPersonalPropertyReplacementCost) {
		if(!CheckPersonalPropertyReplacementCost.toUpperCase().equals("N/A")) {
			if(personalpropreplmntcost.isSelected()) {
				switch(CheckPersonalPropertyReplacementCost.toUpperCase()) {
					case "Y": case "YES":		Log("\"Personal Property Replacement Cost\" check box marked");
											break;
											
					case "N": case "NO":	personalpropreplmntcost.click();
												Log("\"Personal Property Replacement Cost\" check box NOT marked");
											break;
				}
			}
			else {
				switch(CheckPersonalPropertyReplacementCost.toUpperCase()) {
					case "Y": case "YES":	personalpropreplmntcost.click();
												Log("\"Personal Property Replacement Cost\" check box marked");
											break;
											
					case "N": case "NO":		Log("\"Personal Property Replacement Cost\" check box NOT marked");
											break;
				}
			}
		}
	}

	//Checks "Special Personal Property Coverage" check box 
	public void CheckSpecialPersonalPropertyCoverage(String CheckSpecialPersonalPropertyCoverage) {
		if(!CheckSpecialPersonalPropertyCoverage.toUpperCase().equals("N/A")) {
			if(specialpersonalpropertycoverage.isSelected()) {
				switch(CheckSpecialPersonalPropertyCoverage.toUpperCase()) {
					case "Y": case "YES":		Log("\"Special Personal Property Coverage\" check box marked");
											break;
											
					case "N": case "NO":	specialpersonalpropertycoverage.click();
												Log("\"Special Personal Property Coverage\" check box NOT marked");
											break;
				}
			}
			else {
				switch(CheckSpecialPersonalPropertyCoverage.toUpperCase()) {
					case "Y": case "YES":	specialpersonalpropertycoverage.click();
												Log("\"Special Personal Property Coverage\" check box marked");
											break;
											
					case "N": case "NO":		Log("\"Special Personal Property Coverage\" check box NOT marked");
											break;
				}
			}
		}
	}

	//Types into "Home Computer Coverage" text box 
	public void TypeHomeComputerCoverage(String TypeHomeComputerCoverage) {
		if(TypeHomeComputerCoverage.toUpperCase().equals("N/A") || TypeHomeComputerCoverage.toUpperCase().equals("N") || TypeHomeComputerCoverage.toUpperCase().equals("NONE") || TypeHomeComputerCoverage.toUpperCase().equals("NO") || TypeHomeComputerCoverage.toUpperCase().equals("0") ) {
		}
		else {
			homecomputercoverage.clear();
			homecomputercoverage.sendKeys(TypeHomeComputerCoverage);
				Log("Entered Home Computer Coverage: " + TypeHomeComputerCoverage);
		}
	}

	//Selects "Animal Liability" drop down 
	public void SelectAnimalLiability(String SelectAnimalLiability) {
		if(!SelectAnimalLiability.toUpperCase().equals("N/A")) {
			switch(SelectAnimalLiability.toUpperCase()) {
				case "N": case "NONE": case "NO":								Log("Entered Animal Liability: None");
																			break;
			
				case "50": case "$50,000": case "50000": case "$50000":		new Select(animalliability).selectByVisibleText("$50,000");
																				Log("Entered Animal Liability: $50,000");
																			break;
				
				case "300": case "$300,000": case "300000":	case "$300000":	new Select(animalliability).selectByVisibleText("$300,000");
																				Log("Entered Animal Liability: $300,000");
																			break;
															
				case "500": case "$500,000": case "500000": case "$500000":	new Select(animalliability).selectByVisibleText("$500,000");
																				Log("Entered Animal Liability: $500,000");
																			break;
			}
		}
	}

	//Checks "Animal Liability" check box 
	public void CheckAnimalLiability(String CheckAnimalLiability) {
		if(!CheckAnimalLiability.toUpperCase().equals("N/A")) {
			if(animalliability.isSelected()) {
				switch(CheckAnimalLiability.toUpperCase()) {
					case "Y": case "YES":		Log("\"Animal Liability\" check box marked");
											break;
											
					case "N": case "NO":	animalliability.click();
												Log("\"Animal Liability\" check box NOT marked");
											break;
				}
			}
			else {
				switch(CheckAnimalLiability.toUpperCase()) {
					case "Y": case "YES":	animalliability.click();
												Log("\"Animal Liability\" check box marked");
											break;
											
					case "N": case "NO":		Log("\"Animal Liability\" check box NOT marked");
											break;
				}
			}
		}
	}

	//Selects "Golf Cart Physical Damage & Liability" drop down 
	public void SelectGolfCart(String SelectGolfCart) {
		if(!SelectGolfCart.toUpperCase().equals("N/A")) {
			switch(SelectGolfCart.toUpperCase()) {
				case "N": case "NONE": case "NO":								Log("Entered Golf Cart Physical Damage & Liability: None");
																			break;
			
				case "50-1": case "$50,000 - 1 CART":						new Select(golfcart).selectByValue("A");
																				Log("Entered Golf Cart Physical Damage & Liability: " + new Select(golfcart).getFirstSelectedOption().getText());
																			break;
				
				case "50-2": case "$50,000 - 2 CARTS":						new Select(golfcart).selectByValue("B");
																				Log("Entered Golf Cart Physical Damage & Liability: "  + new Select(golfcart).getFirstSelectedOption().getText());
																			break;
															
				case "100/300-1": case "$100,000 / $300,000  - 1 CART":		new Select(golfcart).selectByValue("C");
																				Log("Entered Golf Cart Physical Damage & Liability: "  + new Select(golfcart).getFirstSelectedOption().getText());
																			break;
												
				case "100/300-2": case "$100,000 / $300,000  - 2 CARTS":	new Select(golfcart).selectByValue("D");
																				Log("Entered Golf Cart Physical Damage & Liability: "  + new Select(golfcart).getFirstSelectedOption().getText());
																			break;
			}
		}
	}

	//Selects "Increase Jewelry & Furs" drop down 
	public void SelectIncreaseJewelryAndFurs(String SelectIncreaseJewelryAndFurs) {
		if(!SelectIncreaseJewelryAndFurs.toUpperCase().equals("N/A")) {
			switch(SelectIncreaseJewelryAndFurs.toUpperCase()) {
				case "0": case "N": case "NONE": case "NO":		Log("Entered Increase Jewelry & Furs: None");
															break;
			
				case "1000": case "$1000":					new Select(incrjewfur).selectByVisibleText("$1000");
																Log("Entered Increase Jewelry & Furs: $1000");
															break;
				
				case "2000": case "$2000":					new Select(incrjewfur).selectByVisibleText("$2000");
																Log("Entered Increase Jewelry & Furs: $2000");
															break;
															
				case "3000": case "$3000":					new Select(incrjewfur).selectByVisibleText("$3000");
																Log("Entered Increase Jewelry & Furs: $3000");
															break;
												
				case "4000": case "$4000":					new Select(incrjewfur).selectByVisibleText("$4000");
																Log("Entered Increase Jewelry & Furs: $4000");
															break;
			}
		}
	}

	//Selects "Increase Silverware, Goldware & Pewterware" drop down 
	public void SelectIncreaseSilverwareGoldwareAndPewterware(String SelectIncreaseSilverwareGoldwareAndPewterware) {
		if(!SelectIncreaseSilverwareGoldwareAndPewterware.toUpperCase().equals("N/A")) {
			switch(SelectIncreaseSilverwareGoldwareAndPewterware.toUpperCase()) {
				case "0": case "N": case "NONE": case "NO":					Log("Entered Increase Silverware, Goldware & Pewterware: None");
																		break;
			
				case "500": case "$500":								new Select(incrjewfur).selectByVisibleText("$500");
																			Log("Entered Increase Silverware, Goldware & Pewterware: $500");
																		break;
				
				case "1500": case "$1500": case "1,500": case "$1,500":	new Select(incrjewfur).selectByVisibleText("$1500");
																			Log("Entered Increase Silverware, Goldware & Pewterware: $1500");
																		break;
															
				case "2500": case "$2500": case "2,500": case "$2,500":	new Select(incrjewfur).selectByVisibleText("$2500");
																			Log("Entered Increase Silverware, Goldware & Pewterware: $2500");
																		break;
												
				case "3500": case "$3500": case "3,500": case "$3,500":	new Select(incrjewfur).selectByVisibleText("$3500");
																			Log("Entered Increase Silverware, Goldware & Pewterware: $3500");
																		break;
			
				case "4500": case "$4500": case "4,500": case "$4,500":	new Select(incrjewfur).selectByVisibleText("$4500");
																			Log("Entered Increase Silverware, Goldware & Pewterware: $4500");
																		break;
				
				case "5500": case "$5500": case "5,500": case "$5,500":	new Select(incrjewfur).selectByVisibleText("$5500");
																			Log("Entered Increase Silverware, Goldware & Pewterware: $5500");
																		break;
															
				case "6500": case "$6500": case "6,500": case "$6,500":	new Select(incrjewfur).selectByVisibleText("$6500");
																			Log("Entered Increase Silverware, Goldware & Pewterware: $6500");
																		break;
												
				case "7500": case "$7500": case "7,500": case "$7,500":	new Select(incrjewfur).selectByVisibleText("$7500");
														 					Log("Entered Increase Silverware, Goldware & Pewterware: $7500");
																		break;
			}
		}
	}

	//Selects "Increase Jewelry Watches And Furs" drop down 
	public void SelectIncreaseJewelryWatchesAndFurs(String SelectIncreaseJewelryWatchesAndFurs) {
		if(!SelectIncreaseJewelryWatchesAndFurs.toUpperCase().equals("N/A")) {
			switch(SelectIncreaseJewelryWatchesAndFurs.toUpperCase()) {
				case "0": case "N": case "NONE": case "NO":		Log("Entered Increase Jewelry Watches And Furs: None");
															break;
			
				case "1000": case "$1000":					new Select(increasejewelrywatchesandfurs).selectByVisibleText("$1000");
																Log("Entered Increase Jewelry Watches And Furs: $1000");
															break;
				
				case "2000": case "$2000":					new Select(increasejewelrywatchesandfurs).selectByVisibleText("$2000");
																Log("Entered Increase Jewelry Watches And Furs: $2000");
															break;
															
				case "3000": case "$3000":					new Select(increasejewelrywatchesandfurs).selectByVisibleText("$3000");
																Log("Entered Increase Jewelry Watches And Furs: $3000");
															break;
												
				case "4000": case "$4000":					new Select(increasejewelrywatchesandfurs).selectByVisibleText("$4000");
																Log("Entered Increase Jewelry Watches And Furs: $4000");
															break;
			}
		}
	}

	//Selects "Increased Replacement Cost On Dwelling" drop down 
	public void SelectIncreasedReplacementCostOnDwelling(String SelectIncreasedReplacementCostOnDwelling) {
		if(!SelectIncreasedReplacementCostOnDwelling.toUpperCase().equals("N/A")) {
			switch(SelectIncreasedReplacementCostOnDwelling.toUpperCase()) {
				case "N": case "NONE": case "NO":							Log("Entered Increased Replacement Cost On Dwelling: None");
																		break;
			
				case "0.25": case "25% COV A": case "25%": case "25":	driver.findElement(By.xpath("//select[@id='Covg_10A']//option[contains(text(),'25')]")).click();
																			Log("Entered Increased Replacement Cost On Dwelling: " + new Select(increasedreplcostondwelling).getFirstSelectedOption().getText());
																		break;
				
				case "0.5": case "50% COV A": case "50%": case "50":	driver.findElement(By.xpath("//select[@id='Covg_10A']//option[contains(text(),'50')]")).click();
																			Log("Entered Increased Replacement Cost On Dwelling: " + new Select(increasedreplcostondwelling).getFirstSelectedOption().getText());
																		break;
			}
		}
	}
	
	//Selects "Loss Assessment" drop down 
	public void SelectLossAssessment(String SelectLossAssessment) {
		if(!SelectLossAssessment.toUpperCase().equals("N/A")) {
			switch(SelectLossAssessment.toUpperCase()) {
				case "0": case "N": case "NONE": case "NO":						Log("Entered Loss Assessment: None");
																			break;
			
				case "5000": case "$5000": case "5,000": case "$5,000":		new Select(lossassessment).selectByVisibleText("$5000");
																				Log("Entered Loss Assessment: $5000");
																			break;
			
				case "10000": case "$10000": case "10,000": case "$10,000":	new Select(lossassessment).selectByVisibleText("$10,000");
																				Log("Entered Loss Assessment: $10,000");
																			break;
			}
		}
	}
	
	//Selects "Ordinance or Law" drop down 
	public void SelectOrdinanceOrLaw(String SelectOrdinanceOrLaw) {
		if(!SelectOrdinanceOrLaw.toUpperCase().equals("N/A")) {
			switch(SelectOrdinanceOrLaw.toUpperCase()) {
				case "0": case "NONE": case "N": case "NO":					driver.findElement(By.xpath("//select[@id='Covg_07']//option[contains(text(),'None')]")).click();
																			break;

				case "0.1": case "10%": case "10% (INCLUDED)": case "10":	driver.findElement(By.xpath("//select[@id='Covg_07']//option[contains(text(),'10')]")).click();
																			break;

				case "0.25": case "25%": case "25":							driver.findElement(By.xpath("//select[@id='Covg_07']//option[contains(text(),'25')]")).click();
																			break;

				case "0.50": case "50%": case "50":							driver.findElement(By.xpath("//select[@id='Covg_07']//option[contains(text(),'50')]")).click();
																			break;
			}
				Log("Entered Ordinance or Law: " + new Select(selectol).getFirstSelectedOption().getText());
		}
	}

	//Checks "Ordinance or Law" check box 
	public void CheckOrdinanceOrLaw(String CheckOrdinanceOrLaw) {
		if(!CheckOrdinanceOrLaw.toUpperCase().equals("N/A")) {
			if(clickol.isSelected()) {
				switch(CheckOrdinanceOrLaw.toUpperCase()) {
					case "Y": case "YES":		Log("\"Ordinance or Law\" check box marked");
											break;
											
					case "N": case "NO":	clickol.click();
												Log("\"Ordinance or Law\" check box NOT marked");
											break;
				}
			}
			else {
				switch(CheckOrdinanceOrLaw.toUpperCase()) {
					case "Y": case "YES":	clickol.click();
												Log("\"Ordinance or Law\" check box marked");
											break;
											
					case "N": case "NO":		Log("\"Ordinance or Law\" check box NOT marked");
											break;
				}			
			}
		}
	}
	
	//Selects or checks "Ordinance or Law" from drop down or Check Box
	public void SelectOrCheckOrdinanceOrLaw(String SelectOrdinanceOrLaw, String CheckOrdinanceOrLaw) {
		if(!SelectOrdinanceOrLaw.toUpperCase().equals("N/A") || !CheckOrdinanceOrLaw.toUpperCase().equals("N/A")) {
			if(driver.getPageSource().contains("Ordinance or Law:")) {
				switch(SelectOrdinanceOrLaw.toUpperCase()) {
					case "0": case "NONE": case "N": case "NO":					driver.findElement(By.xpath("//select[@id='Covg_07']//option[contains(text(),'None')]")).click();
																				break;
	
					case "0.1": case "10%": case "10% (INCLUDED)": case "10":	driver.findElement(By.xpath("//select[@id='Covg_07']//option[contains(text(),'10')]")).click();
																				break;
	
					case "0.25": case "25%": case "25":							driver.findElement(By.xpath("//select[@id='Covg_07']//option[contains(text(),'25')]")).click();
																				break;
							
					case "0.50": case "50%": case "50":							driver.findElement(By.xpath("//select[@id='Covg_07']//option[contains(text(),'50')]")).click();
																				break;
				}
					Log("Entered Ordinance or Law: " + new Select(selectol).getFirstSelectedOption().getText());
			}
			else {
				if(clickol.isSelected()) {
					switch(CheckOrdinanceOrLaw.toUpperCase()) {
						case "Y": case "YES":		Log("\"Ordinance or Law\" check box marked");
												break;
												
						case "N": case "NO":	clickol.click();
													Log("\"Ordinance or Law\" check box NOT marked");
												break;			
					}
				}
				else {
					switch(CheckOrdinanceOrLaw.toUpperCase()) {
						case "Y": case "YES":	clickol.click();
													Log("\"Ordinance or Law\" check box marked");
												break;
												
						case "N": case "NO":		Log("\"Ordinance or Law\" check box NOT marked");
												break;
					}
				}
			}
		}
	}
	
	//Selects "Water Backup Basement" drop down 
	public void SelectWaterBackupBasement(String SelectWaterBackupBasement, String SelectBasement) {
		if(!SelectWaterBackupBasement.toUpperCase().equals("N/A")) {
			switch(SelectWaterBackupBasement.toUpperCase()) {
				case "N": case "NONE":										Log("Entered Water Backup - Basement: None");
																		break;
			
				case "5000": case "$5,000": case "5,000": case "$5000":		if(SelectBasement.toUpperCase().equals("NONE") || SelectBasement.toUpperCase().equals("N")) {
																				new Select(waterbackupbasement).selectByVisibleText("$5,000 - None");			
																			}
																			else if(SelectBasement.toUpperCase().equals("UNF") || SelectBasement.toUpperCase().equals("UNFINISHED")) {
																				new Select(waterbackupbasement).selectByVisibleText("$5,000 - Unfinished");												
																			}
																			else if(SelectBasement.toUpperCase().equals("PART") || SelectBasement.toUpperCase().equals("PARTIALLY FINISHED")) {
																				new Select(waterbackupbasement).selectByVisibleText("$5,000 - Partially Finished");
																			}
																			else if(SelectBasement.toUpperCase().equals("FIN") || SelectBasement.toUpperCase().equals("FINISHED")) {
																				new Select(waterbackupbasement).selectByVisibleText("$5,000 - Finished");												
																			}
																				Log("Entered Water Backup - Basement: " + new Select(waterbackupbasement).getFirstSelectedOption().getText());
																			break;
												
				case "10000": case "$10,000": case "10,000": case "$10000":	if(SelectBasement.toUpperCase().equals("NONE") || SelectBasement.toUpperCase().equals("N")) {
																				new Select(waterbackupbasement).selectByVisibleText("$10,000 - None");					
																			}
																			else if(SelectBasement.toUpperCase().equals("UNF") || SelectBasement.toUpperCase().equals("UNFINISHED")) {
																				new Select(waterbackupbasement).selectByVisibleText("$10,000 - Unfinished");													
																			}
																			else if(SelectBasement.toUpperCase().equals("PART") || SelectBasement.toUpperCase().equals("PARTIALLY FINISHED")) {
																				new Select(waterbackupbasement).selectByVisibleText("$10,000 - Partially Finished");
																			}
																			else if(SelectBasement.toUpperCase().equals("FIN") || SelectBasement.toUpperCase().equals("FINISHED")) {
																				new Select(waterbackupbasement).selectByVisibleText("$10,000 - Finished");												
																			}
																				Log("Entered Water Backup - Basement: " + new Select(waterbackupbasement).getFirstSelectedOption().getText());
																			break;
					
				case "25000": case "$25,000": case "25,000": case "$25000":	if(SelectBasement.toUpperCase().equals("NONE") || SelectBasement.toUpperCase().equals("N")) {
																				new Select(waterbackupbasement).selectByVisibleText("$25,000 - None");				
																			}
																			else if(SelectBasement.toUpperCase().equals("UNF") || SelectBasement.toUpperCase().equals("UNFINISHED")) {
																				new Select(waterbackupbasement).selectByVisibleText("$25,000 - Unfinished");													
																			}
																			else if(SelectBasement.toUpperCase().equals("PART") || SelectBasement.toUpperCase().equals("PARTIALLY FINISHED")) {
																				new Select(waterbackupbasement).selectByVisibleText("$25,000 - Partially Finished");
																			}
																			else if(SelectBasement.toUpperCase().equals("FIN") || SelectBasement.toUpperCase().equals("FINISHED")) {
																				new Select(waterbackupbasement).selectByVisibleText("$25,000 - Finished");												
																			}
																				Log("Entered Water Backup - Basement: " + new Select(waterbackupbasement).getFirstSelectedOption().getText());
																			break;		
												
				case "50000": case "$50,000": case "50,000": case "$50000":	if(SelectBasement.toUpperCase().equals("NONE") || SelectBasement.toUpperCase().equals("N")) {
																				new Select(waterbackupbasement).selectByVisibleText("$50,000 - None");				
																			}
																			else if(SelectBasement.toUpperCase().equals("UNF") || SelectBasement.toUpperCase().equals("UNFINISHED")) {
																				new Select(waterbackupbasement).selectByVisibleText("$50,000 - Unfinished");													
																			}
																			else if(SelectBasement.toUpperCase().equals("PART") || SelectBasement.toUpperCase().equals("PARTIALLY FINISHED")) {
																				new Select(waterbackupbasement).selectByVisibleText("$50,000 - Partially Finished");
																			}
																			else if(SelectBasement.toUpperCase().equals("FIN") || SelectBasement.toUpperCase().equals("FINISHED")) {
																				new Select(waterbackupbasement).selectByVisibleText("$50,000 - Finished");												
																			}
																				Log("Entered Water Backup - Basement: " + new Select(waterbackupbasement).getFirstSelectedOption().getText());
																			break;
			}
		}
	}
	
	//Selects "Water Backup/Sump Pump" drop down 
	public void SelectWaterBackupSumpPump(String SelectWaterBackupSumpPump) {
		if(!SelectWaterBackupSumpPump.toUpperCase().equals("N/A")) {
			switch(SelectWaterBackupSumpPump.toUpperCase()) {
				case "N": case "NONE": case "NO":								Log("Entered Water Backup/Sump Pump: None");
																			break;
			
				case "5000": case "5,000": case "$5000": case "$5,000":		new Select(waterbackup).selectByVisibleText("$5,000");
																				Log("Entered Water Backup/Sump Pump: $5,000");
																			break;
											
												
				case "10000": case "10,000":case "$10000": case "$10,000":	new Select(waterbackup).selectByVisibleText("$10,000");
																				Log("Entered Water Backup/Sump Pump: $10,000");
																			break;
												
					
				case "25000": case "25,000":case "$25000": case "$25,000":	new Select(waterbackup).selectByVisibleText("$25,000");
																				Log("Entered Water Backup/Sump Pump: $25,000");
																			break;
			}
		}
	}

	//Selects "Qty Antiques" drop down 
	public void SelectQtyAntiques(String SelectQtyAntiques) {
		if(!SelectQtyAntiques.toUpperCase().equals("N/A")) {
			new Select(qtyantiques).selectByVisibleText(SelectQtyAntiques);
				Log("Entered Qty Antiques: " + SelectQtyAntiques);
		}
	}

	//Types into "Antiques" text box 
	public void TypeAntiques(String TypeAntiques) {
		if(!TypeAntiques.toUpperCase().equals("N/A")) {
			antiques.clear();
			antiques.sendKeys(TypeAntiques);
				Log("Entered Antiques: " + TypeAntiques);
		}
	}

	//Populates "Antiques" section of SPP
	public void SPPAntiques(String SelectQtyAntiques, String TypeAntiques) {
		if(TypeAntiques.toUpperCase().equals("N/A") || TypeAntiques.toUpperCase().equals("N") || TypeAntiques.toUpperCase().equals("NONE") || TypeAntiques.toUpperCase().equals("NO")) {
		}
		else {
			SelectQtyAntiques(SelectQtyAntiques);
			TypeAntiques(TypeAntiques);
		}
	}
	
	//Selects "Qty Bicycles" drop down 
	public void SelectQtyBicycles(String SelectQtyBicycles) {
		if(!SelectQtyBicycles.toUpperCase().equals("N/A")) {
			new Select(qtybicycles).selectByVisibleText(SelectQtyBicycles);
				Log("Entered Qty Bicycles: " + SelectQtyBicycles);
		}
	}

	//Types into "Bicycles" text box 
	public void TypeBicycles(String TypeBicycles) {
		if(!TypeBicycles.toUpperCase().equals("N/A")) {
			bicycles.clear();
			bicycles.sendKeys(TypeBicycles);
				Log("Entered Bicycles: " + TypeBicycles);
		}
	}
	
	//Populates "Bicycles" section of SPP
	public void SPPBicycles(String SelectQtyBicycles, String TypeBicycles) {
		if(TypeBicycles.toUpperCase().equals("N/A") || TypeBicycles.toUpperCase().equals("N") || TypeBicycles.toUpperCase().equals("NONE") || TypeBicycles.toUpperCase().equals("NO")) {
		}
		else {
			SelectQtyBicycles(SelectQtyBicycles);
			TypeBicycles(TypeBicycles);
		}
	}

	//Selects "Qty Cameras And Projection Equipment" drop down 
	public void SelectQtyCamerasAndProjectionEquipment(String SelectQtyCamerasAndProjectionEquipment) {
		if(!SelectQtyCamerasAndProjectionEquipment.toUpperCase().equals("N/A")) {
			new Select(qtycamerasandprojectionequip).selectByVisibleText(SelectQtyCamerasAndProjectionEquipment);
				Log("Entered Qty Cameras And Projection Equipment: " + SelectQtyCamerasAndProjectionEquipment);
		}
	}

	//Types into "Cameras and Projection Equipment" text box 
	public void TypeCamerasandProjectionEquipment(String TypeCamerasandProjectionEquipment) {
		if(!TypeCamerasandProjectionEquipment.toUpperCase().equals("N/A")) {
			camerasandprojectionequip.clear();
			camerasandprojectionequip.sendKeys(TypeCamerasandProjectionEquipment);
				Log("Entered Cameras and Projection Equipment: " + TypeCamerasandProjectionEquipment);
		}
	}
	
	//Populates "Cameras and Projection Equipment" section of SPP
	public void SPPCamerasAndProjectionEquipment(String SelectQtyCamerasAndProjectionEquipment, String TypeCamerasandProjectionEquipment) {
		if(TypeCamerasandProjectionEquipment.toUpperCase().equals("N/A") || TypeCamerasandProjectionEquipment.toUpperCase().equals("N") || TypeCamerasandProjectionEquipment.toUpperCase().equals("NONE") || TypeCamerasandProjectionEquipment.toUpperCase().equals("NO")) {
		}
		else {
			SelectQtyCamerasAndProjectionEquipment(SelectQtyCamerasAndProjectionEquipment);
			TypeCamerasandProjectionEquipment(TypeCamerasandProjectionEquipment);
		}
	}

	//Selects "Qty Coins" drop down 
	public void SelectQtyCoins(String SelectQtyCoins) {
		if(!SelectQtyCoins.toUpperCase().equals("N/A")) {
			new Select(qtycoins).selectByVisibleText(SelectQtyCoins);
				Log("Entered Qty Coins: " + SelectQtyCoins);
		}
	}

	//Types into "Coins" text box 
	public void TypeCoins(String TypeCoins) {
		if(!TypeCoins.toUpperCase().equals("N/A")) {
			coins.clear();
			coins.sendKeys(TypeCoins);
				Log("Entered Coins: " + TypeCoins);
		}
	}
	
	//Populates "Coins" section of SPP
	public void SPPCoins(String SelectQtyCoins, String TypeCoins) {
		if(TypeCoins.toUpperCase().equals("N/A") || TypeCoins.toUpperCase().equals("N") || TypeCoins.toUpperCase().equals("NONE") || TypeCoins.toUpperCase().equals("NO")) {
		}
		else {
			SelectQtyCoins(SelectQtyCoins);
			TypeCoins(TypeCoins);
		}
	}

	//Selects "Qty Fine Arts Breakage" drop down 
	public void SelectQtyFineArtsBreakage(String SelectQtyFineArtsBreakage) {
		if(!SelectQtyFineArtsBreakage.toUpperCase().equals("N/A")) {
			new Select(qtyfineartsbreakage).selectByVisibleText(SelectQtyFineArtsBreakage);
				Log("Entered Qty Fine Arts Breakage: " + SelectQtyFineArtsBreakage);
		}
	}

	//Types into "Fine Arts Breakage" text box 
	public void TypeFineArtsBreakage(String TypeFineArtsBreakage) {
		if(!TypeFineArtsBreakage.toUpperCase().equals("N/A")) {
			fineartsbreakage.clear();
			fineartsbreakage.sendKeys(TypeFineArtsBreakage);
				Log("Entered Fine Arts Breakage: " + TypeFineArtsBreakage);
		}
	}
	
	//Populates "Fine Arts Breakage" section of SPP
	public void SPPFineArtsBreakage(String SelectQtyFineArtsBreakage, String TypeFineArtsBreakage) {
		if(TypeFineArtsBreakage.toUpperCase().equals("N/A") || TypeFineArtsBreakage.toUpperCase().equals("N") || TypeFineArtsBreakage.toUpperCase().equals("NONE") || TypeFineArtsBreakage.toUpperCase().equals("NO")) {
		}
		else {
			SelectQtyFineArtsBreakage(SelectQtyFineArtsBreakage);
			TypeFineArtsBreakage(TypeFineArtsBreakage);
		}
	}

	//Selects "Qty Fine Arts No Breakage" drop down 
	public void SelectQtyFineArtsNoBreakage(String SelectQtyFineArtsNoBreakage) {
		if(!SelectQtyFineArtsNoBreakage.toUpperCase().equals("N/A")) {
			new Select(qtyfineartsnobreakage).selectByVisibleText(SelectQtyFineArtsNoBreakage);
				Log("Entered Qty Fine Arts No Breakage: " + SelectQtyFineArtsNoBreakage);
		}
	}

	//Types into "Fine Arts No Breakage" text box 
	public void TypeFineArtsNoBreakage(String TypeFineArtsNoBreakage) {
		if(!TypeFineArtsNoBreakage.toUpperCase().equals("N/A")) {
			fineartsnobreakage.clear();
			fineartsnobreakage.sendKeys(TypeFineArtsNoBreakage);
				Log("Entered Fine Arts No Breakage: " + TypeFineArtsNoBreakage);
		}
	}
	
	//Populates "Fine Arts No Breakage" section of SPP
	public void SPPFineArtsNoBreakage(String SelectQtyFineArtsNoBreakage, String TypeFineArtsNoBreakage) {
		if(TypeFineArtsNoBreakage.toUpperCase().equals("N/A") || TypeFineArtsNoBreakage.toUpperCase().equals("N") || TypeFineArtsNoBreakage.toUpperCase().equals("NONE") || TypeFineArtsNoBreakage.toUpperCase().equals("NO")) {
		}
		else {
			SelectQtyFineArtsNoBreakage(SelectQtyFineArtsNoBreakage);
			TypeFineArtsNoBreakage(TypeFineArtsNoBreakage);
		}
	}

	//Selects "Qty Furs" drop down 
	public void SelectQtyFurs(String SelectQtyFurs) {
		if(!SelectQtyFurs.toUpperCase().equals("N/A")) {
			new Select(qtyfurs).selectByVisibleText(SelectQtyFurs);
				Log("Entered Qty Furs: " + SelectQtyFurs);
		}
	}

	//Types into "Furs" text box 
	public void TypeFurs(String TypeFurs) {
		if(!TypeFurs.toUpperCase().equals("N/A")) {
			furs.clear();
			furs.sendKeys(TypeFurs);
				Log("Entered Furs: " + TypeFurs);
		}
	}
	
	//Populates "Furs" section of SPP
	public void SPPFurs(String SelectQtyFurs, String TypeFurs) {
		if(TypeFurs.toUpperCase().equals("N/A") || TypeFurs.toUpperCase().equals("N") || TypeFurs.toUpperCase().equals("NONE") || TypeFurs.toUpperCase().equals("NO")) {
		}
		else {
			SelectQtyFurs(SelectQtyFurs);
			TypeFurs(TypeFurs);
		}
	}

	//Selects "Qty Golfers Equipment" drop down 
	public void SelectQtyGolfersEquipment(String SelectQtyGolfersEquipment) {
		if(!SelectQtyGolfersEquipment.toUpperCase().equals("N/A")) {
			new Select(qtygolfersequipment).selectByVisibleText(SelectQtyGolfersEquipment);
				Log("Entered Qty Golfers Equipment: " + SelectQtyGolfersEquipment);
		}
	}

	//Types into "Golfers Equipment" text box 
	public void TypeGolfersEquipment(String TypeGolfersEquipment) {
		if(!TypeGolfersEquipment.toUpperCase().equals("N/A")) {
			golfersequipment.clear();
			golfersequipment.sendKeys(TypeGolfersEquipment);
				Log("Entered Golfers Equipment: " + TypeGolfersEquipment);
		}
	}
	
	//Populates "Golfers Equipment" section of SPP
	public void SPPGolfersEquipment(String SelectQtyGolfersEquipment, String TypeGolfersEquipment) {
		if(TypeGolfersEquipment.toUpperCase().equals("N/A") || TypeGolfersEquipment.toUpperCase().equals("N") || TypeGolfersEquipment.toUpperCase().equals("NONE") || TypeGolfersEquipment.toUpperCase().equals("NO")) {
		}
		else {
			SelectQtyGolfersEquipment(SelectQtyGolfersEquipment);
			TypeGolfersEquipment(TypeGolfersEquipment);
		}
	}

	//Selects "Qty Guns Collectible" drop down 
	public void SelectQtyGunsCollectible(String SelectQtyGunsCollectible) {
		if(!SelectQtyGunsCollectible.toUpperCase().equals("N/A")) {
			new Select(qtygunscollectible).selectByVisibleText(SelectQtyGunsCollectible);
				Log("Entered Qty Guns Collectible: " + SelectQtyGunsCollectible);
		}
	}

	//Types into "Guns Collectible" text box 
	public void TypeGunsCollectible(String TypeGunsCollectible) {
		if(!TypeGunsCollectible.toUpperCase().equals("N/A")) {
			gunscollectible.clear();
			gunscollectible.sendKeys(TypeGunsCollectible);
				Log("Entered Guns Collectible: " + TypeGunsCollectible);
		}
	}
	
	//Populates "Guns Collectible" section of SPP
	public void SPPGunsCollectible(String SelectQtyGunsCollectible, String TypeGunsCollectible) {
		if(TypeGunsCollectible.toUpperCase().equals("N/A") || TypeGunsCollectible.toUpperCase().equals("N") || TypeGunsCollectible.toUpperCase().equals("NONE") || TypeGunsCollectible.toUpperCase().equals("NO")) {
		}
		else {
			SelectQtyGunsCollectible(SelectQtyGunsCollectible);
			TypeGunsCollectible(TypeGunsCollectible);
		}
	}

	//Selects "Qty Guns Fired" drop down 
	public void SelectQtyGunsFired(String SelectQtyGunsFired) {
		if(!SelectQtyGunsFired.toUpperCase().equals("N/A")) {
			new Select(qtygunsfired).selectByVisibleText(SelectQtyGunsFired);
				Log("Entered Qty Guns Fired: " + SelectQtyGunsFired);
		}
	}

	//Types into "Guns Fired" text box 
	public void TypeGunsFired(String TypeGunsFired) {
		if(!TypeGunsFired.toUpperCase().equals("N/A")) {
			gunsfired.clear();
			gunsfired.sendKeys(TypeGunsFired);
				Log("Entered Guns Fired: " + TypeGunsFired);
		}
	}
	
	//Populates "Guns Fired" section of SPP
	public void SPPGunsFired(String SelectQtyGunsFired, String TypeGunsFired) {
		if(TypeGunsFired.toUpperCase().equals("N/A") || TypeGunsFired.toUpperCase().equals("N") || TypeGunsFired.toUpperCase().equals("NONE") || TypeGunsFired.toUpperCase().equals("NO")) {
		}
		else {
			SelectQtyGunsFired(SelectQtyGunsFired);
			TypeGunsFired(TypeGunsFired);
		}
	}

	//Selects "Qty Jewelry" drop down 
	public void SelectQtyJewelry(String SelectQtyJewelry) {
		if(!SelectQtyJewelry.toUpperCase().equals("N/A")) {
			new Select(qtyjewelry).selectByVisibleText(SelectQtyJewelry);
				Log("Entered Qty Jewelry: " + SelectQtyJewelry);
		}
	}

	//Types into "Jewelry" text box 
	public void TypeJewelry(String TypeJewelry) {
		if(!TypeJewelry.toUpperCase().equals("N/A")) {
			jewelry.clear();
			jewelry.sendKeys(TypeJewelry);
				Log("Entered Jewelry: " + TypeJewelry);
		}
	}
	
	//Populates "Jewelry" section of SPP
	public void SPPJewelry(String SelectQtyJewelry, String TypeJewelry) {
		if(TypeJewelry.toUpperCase().equals("N/A") || TypeJewelry.toUpperCase().equals("N") || TypeJewelry.toUpperCase().equals("NONE") || TypeJewelry.toUpperCase().equals("NO")) {
		}
		else {
			SelectQtyJewelry(SelectQtyJewelry);
			TypeJewelry(TypeJewelry);
		}
	}

	//Selects "Qty Misc Personal Property" drop down 
	public void SelectQtyMiscPersonalProperty(String SelectQtyMiscPersonalProperty) {
		if(!SelectQtyMiscPersonalProperty.toUpperCase().equals("N/A")) {
			new Select(qtymiscpersonalproperty).selectByVisibleText(SelectQtyMiscPersonalProperty);
				Log("Entered Qty Misc Personal Property: " + SelectQtyMiscPersonalProperty);
		}
	}

	//Types into "Misc Personal Property" text box 
	public void TypeMiscPersonalProperty(String TypeMiscPersonalProperty) {
		if(!TypeMiscPersonalProperty.toUpperCase().equals("N/A")) {
			miscpersonalproperty.clear();
			miscpersonalproperty.sendKeys(TypeMiscPersonalProperty);
				Log("Entered Misc Personal Property: " + TypeMiscPersonalProperty);
		}
	}
	
	//Populates "Misc Personal Property" section of SPP
	public void SPPMiscPersonalProperty(String SelectQtyMiscPersonalProperty, String TypeMiscPersonalProperty) {
		if(TypeMiscPersonalProperty.toUpperCase().equals("N/A") || TypeMiscPersonalProperty.toUpperCase().equals("N") || TypeMiscPersonalProperty.toUpperCase().equals("NONE") || TypeMiscPersonalProperty.toUpperCase().equals("NO")) {
		}
		else {
			SelectQtyMiscPersonalProperty(SelectQtyMiscPersonalProperty);
			TypeMiscPersonalProperty(TypeMiscPersonalProperty);
		}
	}

	//Selects "Qty Musical Instruments" drop down 
	public void SelectQtyMusicalInstruments(String SelectQtyMusicalInstruments) {
		if(!SelectQtyMusicalInstruments.toUpperCase().equals("N/A")) {
			new Select(qtymusicalinstruments).selectByVisibleText(SelectQtyMusicalInstruments);
				Log("Entered Qty Musical Instruments: " + SelectQtyMusicalInstruments);
		}
	}

	//Types into "Musical Instruments" text box 
	public void TypeMusicalInstruments(String TypeMusicalInstruments) {
		if(!TypeMusicalInstruments.toUpperCase().equals("N/A")) {
			musicalinstruments.clear();
			musicalinstruments.sendKeys(TypeMusicalInstruments);
				Log("Entered Musical Instruments: " + TypeMusicalInstruments);
		}
	}
	
	//Populates "Musical Instruments" section of SPP
	public void SPPMusicalInstruments(String SelectQtyMusicalInstruments, String TypeMusicalInstruments) {
		if(TypeMusicalInstruments.toUpperCase().equals("N/A") || TypeMusicalInstruments.toUpperCase().equals("N") || TypeMusicalInstruments.toUpperCase().equals("NONE") || TypeMusicalInstruments.toUpperCase().equals("NO")) {
		}
		else {
			SelectQtyMusicalInstruments(SelectQtyMusicalInstruments);
			TypeMusicalInstruments(TypeMusicalInstruments);
		}
	}

	//Selects "Qty Other Sports Equipment" drop down 
	public void SelectQtyOtherSportsEquipment(String SelectQtyOtherSportsEquipment) {
		if(!SelectQtyOtherSportsEquipment.toUpperCase().equals("N/A")) {
			new Select(qtyothersportsequip).selectByVisibleText(SelectQtyOtherSportsEquipment);
				Log("Entered Qty Other Sports Equipment: " + SelectQtyOtherSportsEquipment);
		}
	}

	//Types into "Other Sports Equipment" text box 
	public void TypeOtherSportsEquipment(String TypeOtherSportsEquipment) {
		if(!TypeOtherSportsEquipment.toUpperCase().equals("N/A")) {
			othersportsequip.clear();
			othersportsequip.sendKeys(TypeOtherSportsEquipment);
				Log("Entered Other Sports Equipment: " + TypeOtherSportsEquipment);
		}
	}
	
	//Populates "Other Sports Equipment" section of SPP
	public void SPPOtherSportsEquipment(String SelectQtyOtherSportsEquipment, String TypeOtherSportsEquipment) {
		if(TypeOtherSportsEquipment.toUpperCase().equals("N/A") || TypeOtherSportsEquipment.toUpperCase().equals("N") || TypeOtherSportsEquipment.toUpperCase().equals("NONE") || TypeOtherSportsEquipment.toUpperCase().equals("NO")) {
		}
		else {
			SelectQtyOtherSportsEquipment(SelectQtyOtherSportsEquipment);
			TypeOtherSportsEquipment(TypeOtherSportsEquipment);
		}
	}

	//Selects "Qty Silverware" drop down 
	public void SelectQtySilverware(String SelectQtySilverware) {
		if(!SelectQtySilverware.toUpperCase().equals("N/A")) {
			new Select(qtysilverware).selectByVisibleText(SelectQtySilverware);
				Log("Entered Qty Silverware: " + SelectQtySilverware);
		}
	}

	//Types into "Silverware" text box 
	public void TypeSilverware(String TypeSilverware) {
		if(!TypeSilverware.toUpperCase().equals("N/A")) {
			silverware.clear();
			silverware.sendKeys(TypeSilverware);
				Log("Entered Silverware: " + TypeSilverware);
		}
	}
	
	//Populates "Silverware" section of SPP
	public void SPPSilverware(String SelectQtySilverware, String TypeSilverware) {
		if(TypeSilverware.toUpperCase().equals("N/A") || TypeSilverware.toUpperCase().equals("N") || TypeSilverware.toUpperCase().equals("NONE") || TypeSilverware.toUpperCase().equals("NO")) {
		}
		else {
			SelectQtySilverware(SelectQtySilverware);
			TypeSilverware(TypeSilverware);
		}
	}

	//Selects "Qty Stamps" drop down 
	public void SelectQtyStamps(String SelectQtyStamps) {
		if(!SelectQtyStamps.toUpperCase().equals("N/A")) {
			new Select(qtystamps).selectByVisibleText(SelectQtyStamps);
				Log("Entered Qty Stamps: " + SelectQtyStamps);
		}
	}

	//Types into "Stamps" text box 
	public void TypeStamps(String TypeStamps) {
		if(!TypeStamps.toUpperCase().equals("N/A")) {
			stamps.clear();
			stamps.sendKeys(TypeStamps);
				Log("Entered Stamps: " + TypeStamps);
		}
	}
	
	//Populates "Stamps" section of SPP
	public void SPPStamps(String SelectQtyStamps, String TypeStamps) {
		if(TypeStamps.toUpperCase().equals("N/A") || TypeStamps.toUpperCase().equals("N") || TypeStamps.toUpperCase().equals("NONE") || TypeStamps.toUpperCase().equals("NO")) {
		}
		else {
			SelectQtyStamps(SelectQtyStamps);
			TypeStamps(TypeStamps);
		}
	}

	//Returns the Scheduled Item Description
	public String ReturnScheduledItemDescription() {		
			Log("Scheduled Item Description is " + scheduleditemsdescription.getText());
		return scheduleditemsdescription.getText();
	}

	//Clicks the "Back" button
	public void ClickBack() {
		back.click();
			Log("Clicked the \"Back\" button on the Policy Rating 2 page");
	}

	//Clicks the "Next" button
	public void ClickNext() {
		next.click();
			Log("Clicked the \"Next\" button on the Policy Rating 2 page");
	}

	//Clicks the "Save" button
	public void ClickSave() {
		save.click();
			Log("Clicked the \"Save\" button on the Policy Rating 2 page");
	}

	//Clicks the "Override" button
	public void ClickOverride() {
		override.click();
			Log("Clicked the \"Override\" button on the Policy Rating 2 page");
	}

	//Checks to make sure if on same page after hitting next to apply override
	public String ClickNextAndConfirmEdits(String casenum, String identifier) {
		ClickNext();
		if(driver.getPageSource().contains("Policy Rating Page 2")) {
				Log(casenum + "-" + identifier + ": edits on page read as \"" + edits.getText().trim().replaceAll("\\n", ",").replaceAll("   "," ").replaceAll("  "," ") + "\"");
			ClickOverride();
			if(driver.getPageSource().contains("Policy Rating Page 2")) {
					Log(casenum + "-" + identifier + ": There were edits that could not be overridden through on Policy Rating Page 2." + edits.getText().trim().replaceAll("\\n", ",").replaceAll("   "," ").replaceAll("  "," "));
				return "edits";
			}
			else {
					Log("Overrode through Rating Page 2");
				return "override";
			}
		}
		else {
			return "nooverride";
		}
	}
	
	//Returns Edits
	public String ReturnEdits(String log) {
		String edittext = edits.getText().trim().replaceAll("\\n", ",").replaceAll("   "," ").replaceAll("  "," ") + "\"";	
		if(log.toUpperCase().equals("Y") || log.toUpperCase().equals("YES")) {
			Log("Policy Rating Page 2 edits read: " + edittext);
		}
		return edittext;
	}

	//Returns the PolicyID
	public String ReturnPolicyID() {
		String id = policyid.getText().substring(0, policyid.getText().indexOf(" "));		
			Log("PolicyID is " + id);
		return id;
	}
}