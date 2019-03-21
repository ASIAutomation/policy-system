
package Automation.PS.pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import Automation.PS.testBase.TestBase;

public class PolicyRatingPage1 extends TestBase {

	public static final Logger log = Logger.getLogger(PolicyRatingPage1.class.getName());

	WebDriver driver;

	@FindBy(id="Form_PLMaster_AgentID")//Drop Down
	WebElement agentid;

	@FindBy(id="Form_PLInsured_LastName")//Text Box
	WebElement insuredlastname;

	@FindBy(id="Form_PLInsured_FirstName")//Text Box
	WebElement insuredfirstname;

	@FindBy(id="Form_PLInsured_MiddleInit")//Text Box
	WebElement insuredmiddlename;

	@FindBy(id="Form_PLInsured_Occupation")//Drop Down
	WebElement occupation;

	@FindBy(id="Form_PLMaster_BirthDate")//Text Box
	WebElement dateofbirth;

	@FindBy(id="Form_PLInsured_HomePhone")//Text Box
	WebElement homephone;

	@FindBy(id="Form_PLInsured_WorkPhone")//Text Box
	WebElement mobilephone;

	@FindBy(id="Form_PLLocation_locAddress")//Text Box
	WebElement locationaddress;

	@FindBy(id="Form_PLLocation_locApartmentNumber")//Text Box
	WebElement unitnumber;

	@FindBy(id="Form_PLLocation_locCity")//Text Box
	WebElement locationcity;

	@FindBy(id="Form_PLLocation_locState")//Text Box
	WebElement locationstate;

	@FindBy(id="Form_PLLocation_locZipCode")//Text Box
	WebElement locationzipcode;

	@FindBy(id="Form_PLMaster_EffectiveDate")//Text Box
	WebElement effectivedate;

	@FindBy(id="Form_PLDwelling_YearBuilt")//Text Box
	WebElement yearhomebuilt;

	@FindBy(id="Form_PLDwelling_TypeConstruction")//Drop Down
	WebElement typeofconstruction;

	@FindBy(id="Form_PLMaster_CovgA")//Text Box
	WebElement dwelling;

	@FindBy(id="Form_PLCostestimator_ExteriorWalls")//Drop Down
	WebElement exteriorwalls;

	@FindBy(id="Form_PLCostestimator_numStories")//Drop Down
	WebElement numberofstories;

	@FindBy(id="Form_PLMaster_ProtectionClass")//Drop Down
	WebElement protectionclass;

	@FindBy(id="Form_PLDwelling_YearRoofInstalled")//Text Box
	WebElement yearroofinstalled;

	@FindBy(id="Form_PLInsured_PurchaseDate")//Text Box
	WebElement purchasedate;

	@FindBy(id="Form_PLCostestimator_RoofDesign")//Drop Down
	WebElement roofdesign;

	@FindBy(id="Form_PLInsured_NewPurchase")//Drop Down
	WebElement homeclosing;

	@FindBy(id="Form_PLCostestimator_RoofingMaterial")//Drop Down
	WebElement roofingmaterial;

	@FindBy(id="Form_PLMaster_PurchasePrice")//Text Box
	WebElement purchaseprice;
	
	@FindBy(id="Form_PLUnderwriting_numFamilyUnits")//Drop Down
	WebElement numoffamilies;

	@FindBy(id="Form_PlNotes_Note")//Text Box
	WebElement policynotes;

	@FindBy(id="JS_COPYLOCATIONINFORMATION")//Button
	WebElement mailingaddresssameaslocation;

	@FindBy(id="Form_PLInsured_Address1")//Text Box
	WebElement currentaddress1;

	@FindBy(id="Form_PLInsured_Address2")//Text Box
	WebElement currentaddress2;

	@FindBy(id="Form_PLInsured_City")//Text Box
	WebElement currentcity;

	@FindBy(id="Form_PLInsured_IntProvince")//Text Box
	WebElement currentstate;

	@FindBy(id="Form_PLInsured_IntPostalCode")//Text Box
	WebElement currentzipcode;

	@FindBy(id="Form_PLInsured_IntCountry")//Drop Down
	WebElement country;

	@FindBy(id="Form_PLInsured_YearsThisAddress")//Drop Down
	WebElement yearsatthisaddress;

	@FindBy(id="Form_PLInsured_SocialSec")//Text Box
	WebElement socialsecuritynumber;

	@FindBy(id="Form_PLMaster_CreditAuthority")//Drop Down
	WebElement permissionruncreditreport;

	@FindBy(id="Form_PLInsured_PreviousAddress")//Text Box
	WebElement previousaddress;

	@FindBy(id="Form_PLInsured_PreviousCity")//Text Box
	WebElement previouscity;

	@FindBy(id="Form_PLInsured_PreviousState")//Drop Down
	WebElement previousstate;

	@FindBy(id="Form_PLInsured_PreviousZipCode")//Text Box
	WebElement previouszip;

	@FindBy(id="Form_PLCostestimator_SquareFeet")//Text Box
	WebElement squarefeetlivingarea;

	@FindBy(id="Form_PLCostestimator_IrregularCorners")//Check Box
	WebElement irregularshape;

	@FindBy(id="Form_PLCostestimator_Substructure")//Drop Down
	WebElement substructure;

	@FindBy(id="Form_PLDwelling_BasementPctFinished")//Text Box
	WebElement basementpctfinished;

	@FindBy(id="Form_PLDwelling_BasementQuality")//Drop Down
	WebElement basementquality;

	@FindBy(id="Form_PLDwelling_BasementWalkout")//Text Box
	WebElement basementwalkout;

	@FindBy(id="Form_PLCostestimator_SwimmingPool")//Drop Down
	WebElement swimmingpool;

	@FindBy(id="Form_PLCostestimator_ScreenedPool")//Check Box
	WebElement screenedpool;

	@FindBy(id="Form_PLCostestimator_DivingBoard")//Check Box
	WebElement divingboard;

	@FindBy(id="Form_PLCostestimator_Garage")//Drop Down
	WebElement garage;

	@FindBy(id="Form_PLDwelling_FirePlaceType")//Drop Down
	WebElement fireplacetype;

	@FindBy(id="Form_PLCostestimator_Fireplace")//Text Box
	WebElement fireplace;

	@FindBy(id="Form_PLCostestimator_NumFullBaths")//Text Box
	WebElement numfullbaths;

	@FindBy(id="Form_PLCostestimator_NumHalfBaths")//Text Box
	WebElement numhalfbaths;

	@FindBy(id="Form_PLCostestimator_BathroomGrade")//Drop Down
	WebElement bathroomgrade;

	@FindBy(id="Form_PLCostestimator_Hottub")//Check Box
	WebElement hottub;

	@FindBy(id="Form_PLCostestimator_Jacuzzi")//Check Box
	WebElement jacuzzi;

	@FindBy(id="Form_PLCostestimator_KitchenGrade")//Drop Down
	WebElement kitchengrade;

	@FindBy(id="Form_PLCostestimator_CentralHeatAir")//Drop Down
	WebElement centralheatair;

	@FindBy(id="Form_PLDwelling_HeatSource")//Drop Down
	WebElement heatsource;

	@FindBy(id="Form_PLCostestimator_CathedralCeilingPerc")//Text Box
	WebElement cathedralceilingperc;

	@FindBy(id="Form_PLCostestimator_PorchSquareFeet")//Text Box
	WebElement porchsquarefeet;

	@FindBy(id="Form_PLCostestimator_Porch")//Text Box
	WebElement porch;

	@FindBy(id="Form_PLCostestimator_CoveredPorch")//Text Box
	WebElement coveredporch;

	@FindBy(id="Form_PLCostestimator_WoodDeck")//Drop Down
	WebElement deck;

	@FindBy(id="Form_PLCostestimator_WoodDeckSqFt")//Text Box
	WebElement decksqft;

	@FindBy(id="Form_PLCostestimator_SolarPanels")//Text Box
	WebElement solarpanels;

	@FindBy(id="Form_PLCostestimator_SiteAccess")//Drop Down
	WebElement siteaccess;

	@FindBy(id="Form_PLCostestimator_WallHeight")//Drop Down
	WebElement wallheight;

	@FindBy(id="Form_PLCostestimator_StairCaseType")//Drop Down
	WebElement staircasetype;

	@FindBy(id="Form_PLCostestimator_AlarmSystemBurglar")//Check Box
	WebElement alarmsystemburglar;

	@FindBy(id="Form_PLCostestimator_AlarmSystemFire")//Check Box
	WebElement alarmsystemfire;

	@FindBy(id="Form_PLCostestimator_CentralVac")//Check Box
	WebElement centralvac;

	@FindBy(id="Form_PLCostestimator_FireSprinklerSystem")//Check Box
	WebElement firesprinklersystem;

	@FindBy(id="Form_PLCostestimator_HomeMngmtSystem")//Check Box
	WebElement homemngmtsystem;

	@FindBy(id="Form_PLCostestimator_WirelessSecuritySystem")//Check Box
	WebElement wirelesssecuritysystem;

	@FindBy(id="Form_PLCostestimator_LiftChair")//Check Box
	WebElement liftchair;

	@FindBy(id="Form_PLCostestimator_LiftWheelchair")//Check Box
	WebElement liftwheelchair;

	@FindBy(id="Form_PLCostestimator_Elevator")//Text Box
	WebElement elevator;

	@FindBy(id="Form_PLCostestimator_FloorCoveringPercentage1")//Text Box
	WebElement floorcoveringpercentage1;

	@FindBy(id="Form_PLCostestimator_FloorCoveringType1")//Drop Down
	WebElement floorcoveringtype1;

	@FindBy(id="Form_PLCostestimator_FloorCoveringPercentage2")//Text Box
	WebElement floorcoveringpercentage2;

	@FindBy(id="Form_PLCostestimator_FloorCoveringType2")//Drop Down
	WebElement floorcoveringtype2;

	@FindBy(id="Form_PLCostestimator_FloorCoveringPercentage3")//Text Box
	WebElement floorcoveringpercentage3;

	@FindBy(id="Form_PLCostestimator_FloorCoveringType3")//Drop Down
	WebElement floorcoveringtype3;

	@FindBy(id="Form_PLCostestimator_FloorCoveringPercentage4")//Text Box
	WebElement floorcoveringpercentage4;

	@FindBy(id="Form_PLCostestimator_FloorCoveringType4")//Drop Down
	WebElement floorcoveringtype4;

	@FindBy(id="Form_PLCostestimator_WindowSkylight")//Text Box
	WebElement windowskylight;

	@FindBy(id="Form_PLCostestimator_WindowStained")//Text Box
	WebElement windowstained;

	@FindBy(id="Form_PLCostestimator_WindowBay")//Text Box
	WebElement windowbay;

	@FindBy(id="Form_PLCostestimator_WindowBow")//Text Box
	WebElement windowbow;

	@FindBy(id="Form_PLOverrideVert_OverrideName_RiskIsDeclind")//Check Box
	WebElement overridedeclinerisk;

	@FindBy(id="Form_PlMaster_ClaimsCount")//Drop Down
	WebElement overrideclaimcount;

	@FindBy(id="Form_PLOverrideVert_OverrideName_DwellingCvgCode")//Check Box
	WebElement overridedwellingcoverage;

	@FindBy(id="Form_PLOverrideVert_OverrideName_GenUW")//Check Box
	WebElement overridegeneralunderwriting;

	@FindBy(id="Form_PLOverrideVert_OverrideName_SocialSecNum")//Check Box
	WebElement overridesocialsecurity;

	@FindBy(id="Form_PLOverrideVert_OverrideName_WaterDamageExc")//Check Box
	WebElement overridewaterdamageexclusion;

	@FindBy(id="Form_PLOverrideVert_OverrideName_AnimalLiability")//Check Box
	WebElement overrideanimalliability;

	@FindBy(id="Form_PLOverrideVert_OverrideName_PurchasePrice")//Check Box
	WebElement overridepurchaseprice;

	@FindBy(id="Form_PLOverrideVert_OverrideName_ShortSaleOrForeclosure")//Check Box
	WebElement overrideshortsaleorforeclosure;

	@FindBy(id="Form_PLOverrideVert_OverrideName_EligibilityRefer")//Check Box
	WebElement overrideeligibilityreferral;

	@FindBy(id="Form_PLOverrideVert_OverrideName_FloodZone")//Check Box
	WebElement overridefloodzone;

	@FindBy(id="Form_PLOverrideNotes_Note")//Text Box
	WebElement overridenotes;

	@FindBy(id="Form_PLOverrideVert_OverrideName_CreditScore")//Text Box
	WebElement overridecreditscore;

	@FindBy(id="Form_PLOverrideVert_OverrideName_GeoLocationCode")//Check Box
	WebElement overridegeolocation;

	@FindBy(id="Form_PLOverrideVert_OverrideName_AddressCode")//Check Box
	WebElement overrideaddress;

	@FindBy(id="Form_PLOverrideVert_OverrideName_ClosedZipCode")//Check Box
	WebElement overrideclosedzipcode;

	@FindBy(id="Form_PLOverrideVert_OverrideName_LeadLiability")//Check Box
	WebElement overrideremoveleadliabilityexclusion;

	@FindBy(id="Form_PLOverrideVert_OverrideName_LWD")//Check Box
	WebElement overridelimitedwaterdamage;

	@FindBy(id="Form_PLOverrideVert_OverrideName_HomeShieldPackage")//Check Box
	WebElement overridehomeshieldpackage;

	@FindBy(id="Form_PLOverrideVert_OverrideName_HomeShieldPlusPackage")//Check Box
	WebElement overridehomeshieldpluspackage;

	@FindBy(id="Form_PLOverrideVert_OverrideName_FunctionalRC")//Check Box
	WebElement overridefunctionalreplacementcost;

	@FindBy(id="Form_PLOverrideVert_OverrideName_UpdatedHome")//Check Box
	WebElement overrideupdatedhomediscount;

	@FindBy(id="Form_PLOverrideVert_OverrideName_ASIClueCount")//Text Box
	WebElement overrideasiclaimsurcharge;

	@FindBy(id="Form_PLOverrideVert_OverrideName_PreviousClaimsCode")//Check Box
	WebElement overridepreviousclaims;

	@FindBy(id="Form_PLOverrideVert_OverrideName_FlatRoofCode")//Check Box
	WebElement overrideflatroof;

	@FindBy(id="Form_PLOverrideVert_OverrideName_AddressStandardization")//Check Box
	WebElement overrideaddressstandardization;

	@FindBy(id="Form_PLOverrideVert_OverrideName_CLUECode")//Check Box
	WebElement overrideclue;

	@FindBy(id="Form_PLOverrideVert_OverrideName_AgeOfDwelling")//Check Box
	WebElement overrideageofdwelling;

	@FindBy(id="Form_PLOverrideVert_OverrideName_LossAssessment")//Check Box
	WebElement overridelossassessment;

	@FindBy(id="Form_PLOverrideVert_OverrideName_PriorLiabilityLimit")//Check Box
	WebElement overridepriorliabilitylimit;

	@FindBy(id="Form_PLOverrideVert_OverrideName_SPP")//Check Box
	WebElement overridescheduledpersonalproperty;
	
	@FindBy(id="Form_PLUnderwriting_BusOccupancy")
	WebElement busoccupancy;
	
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
	
	@FindBy(id="Form_PLDwelling_BasementPct")
	WebElement basementpct;
	
	@FindBy(id="lblFirelineScore")
	WebElement brushfirescore;

	//Constructor
	public PolicyRatingPage1(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}

	//Selects "Agent" from drop down
	public void SelectAgent(String SelectAgent) {
		if(!SelectAgent.toUpperCase().equals("N/A")) {
			new Select(agentid).selectByValue(SelectAgent);
				Log("Entered Agent: " + SelectAgent);
		}
	}

	//Types into "Insured Last Name" text box
	public void TypeInsuredLastName(String TypeInsuredLastName) {
		if(!TypeInsuredLastName.toUpperCase().equals("N/A")) {
			insuredlastname.clear();
			insuredlastname.sendKeys(TypeInsuredLastName);
				Log("Entered Insured Last Name: " + TypeInsuredLastName);
		}
	}

	//Types into "Insured First Name" text box
	public void TypeInsuredFirstName(String TypeInsuredFirstName) {
		if(!TypeInsuredFirstName.toUpperCase().equals("N/A")) {
			insuredfirstname.clear();
			insuredfirstname.sendKeys(TypeInsuredFirstName);
				Log("Entered Insured First Name: " + TypeInsuredFirstName);
		}
	}

	//Types into "Insured Middle Name" text box
	public void TypeInsuredMiddleName(String TypeInsuredMiddleName) {
		if(!TypeInsuredMiddleName.toUpperCase().equals("N/A")) {
			insuredmiddlename.clear();
			insuredmiddlename.sendKeys(TypeInsuredMiddleName);
				Log("Entered Insured Middle Name: " + TypeInsuredMiddleName);
		}
	}

	//Selects "Occupation" from drop down
	public void SelectOccupation(String SelectOccupation) {
		if(!SelectOccupation.toUpperCase().equals("N/A")) {
			new Select(occupation).selectByVisibleText(SelectOccupation);
				Log("Entered Occupation: " + SelectOccupation);
		}
	}

	//Types into "Date of Birth" date text box "MMDDYYYY"
	public void TypeDateofBirth(String TypeDateofBirth) {
		if(!TypeDateofBirth.toUpperCase().equals("N/A")) {
			dateofbirth.clear();
			dateofbirth.sendKeys(TypeDateofBirth);
				Log("Entered Date of Birth: " + TypeDateofBirth);
		}
	}

	//Types into "Home Phone" text box
	public void TypeHomePhone(String TypeHomePhone) {
		if(!TypeHomePhone.toUpperCase().equals("N/A")) {
			homephone.clear();
			homephone.sendKeys(TypeHomePhone);
				Log("Entered Home Phone: " + TypeHomePhone);
		}
	}

	//Types into "Mobile Phone" text box
	public void TypeMobilePhone(String TypeMobilePhone) {
		if(!TypeMobilePhone.toUpperCase().equals("N/A")) {
			mobilephone.clear();
			mobilephone.sendKeys(TypeMobilePhone);
				Log("Entered Mobile Phone: " + TypeMobilePhone);	
		}
	}

	//Types into "Location Address" text box
	public void TypeLocationAddress(String TypeLocationAddress) {
		if(!TypeLocationAddress.toUpperCase().equals("N/A")) {
			locationaddress.clear();
			locationaddress.sendKeys(TypeLocationAddress);
				Log("Entered Location Address: " + TypeLocationAddress);
		}
	}

	//Types into "Unit #" text box
	public void TypeUnitNumber(String TypeUnitNumber) {
		if(!TypeUnitNumber.toUpperCase().equals("N/A")) {
			unitnumber.clear();
			unitnumber.sendKeys(TypeUnitNumber);
				Log("Entered Unit #: " + TypeUnitNumber);
		}
	}

	//Types into "Location City" text box
	public void TypeLocationCity(String TypeLocationCity) {
		if(!TypeLocationCity.toUpperCase().equals("N/A")) {
			locationcity.clear();
			locationcity.sendKeys(TypeLocationCity);
				Log("Entered Location City: " + TypeLocationCity);
		}
	}

	//Types into "Location State" text box
	public void TypeLocationState(String TypeLocationState) {
		if(!TypeLocationState.toUpperCase().equals("N/A")) {
			locationstate.clear();
			locationstate.sendKeys(TypeLocationState);
				Log("Entered Location State: " + TypeLocationState);
		}
	}

	//Types into "Location Zip Code" text box
	public void TypeLocationZipCode(String TypeLocationZipCode) {
		if(!TypeLocationZipCode.toUpperCase().equals("N/A")) {
			locationzipcode.clear();
			locationzipcode.sendKeys(TypeLocationZipCode);
				Log("Entered Location Zip Code: " + TypeLocationZipCode);
		}
	}

	//Types into "Effective Date" date text box "MMDDYYYY"
	public void TypeEffectiveDate(String TypeEffectiveDate) {
		if(!TypeEffectiveDate.toUpperCase().equals("N/A")) {
			effectivedate.clear();
			effectivedate.sendKeys(TypeEffectiveDate);
				Log("Entered Effective Date: " + TypeEffectiveDate);
		}
	}

	//Types into "Year Home Built" text box
	public void TypeYearHomeBuilt(String TypeYearHomeBuilt) {
		if(!TypeYearHomeBuilt.toUpperCase().equals("N/A")) {
			yearhomebuilt.clear();
			yearhomebuilt.sendKeys(TypeYearHomeBuilt);
				Log("Entered Year Home Built: " + TypeYearHomeBuilt);
		}
	}

	//Returns the value in the "Year Home Built" field
	public String ReturnYearHomeBuilt() {
		if(yearhomebuilt.getText().isEmpty()) {
			return "N/A";
		}
		else {
			return yearhomebuilt.getAttribute("value");
		}
	}

	//Selects "Type of Construction" from drop down
	public void SelectTypeofConstruction(String SelectTypeofConstruction) {
		if(!SelectTypeofConstruction.toUpperCase().equals("N/A")) {
			switch (SelectTypeofConstruction.toUpperCase()) {
				case "F": case "FRAME":				new Select(typeofconstruction).selectByVisibleText("Frame");
														Log("Entered Type of Construction: Frame");
													break;
	
				case "V": case "MASONRY VENEER":	new Select(typeofconstruction).selectByVisibleText("Masonry/Veneer");
														Log("Entered Type of Construction: Masonry/Veneer");
													break;
	
				case "M": case "MASONRY":			new Select(typeofconstruction).selectByVisibleText("Masonry");
														Log("Entered Type of Construction: Masonry");
													break;
	
				case "S": case "SUPERIOR":			new Select(typeofconstruction).selectByVisibleText("Superior");
														Log("Entered Type of Construction: Superior");
													break;
			}
		}
	}

	//Returns the value in the "Type of Construction" field
	public String ReturnTypeofConstruction() {
		if(new Select(typeofconstruction).getFirstSelectedOption().getText().isEmpty()) {
			return "N/A";
		}
		else {
			return typeofconstruction.getAttribute("value");
		}
	}

	//Types into "Dwelling Coverage" text box
	public void TypeDwellingCoverage(String TypeDwellingCoverage) {
		if(!TypeDwellingCoverage.toUpperCase().equals("N/A")) {
			dwelling.clear();
			dwelling.sendKeys(TypeDwellingCoverage);
				Log("Entered Dwelling Coverage: " + TypeDwellingCoverage);
		}
	}

	//Selects "Exterior Walls" drop down
	public void SelectExteriorWalls(String SelectExteriorWalls) {
		if(!SelectExteriorWalls.toUpperCase().equals("N/A")) {
			new Select(exteriorwalls).selectByVisibleText(SelectExteriorWalls);
				Log("Entered Exterior Walls: " + SelectExteriorWalls);
		}
	}

	//Returns the value in the "Exterior Walls" field
	public String ReturnExteriorWalls() {
		if(new Select(exteriorwalls).getFirstSelectedOption().getText().isEmpty()) {
			return "N/A";
		}
		else {
			return exteriorwalls.getAttribute("value");
		}
	}

	//Selects "# Stories" drop down
	public void SelectNumStories(String SelectNumStories) {
		if(!SelectNumStories.toUpperCase().equals("N/A")) {
			switch(SelectNumStories.toUpperCase()) {
				case "1": case "1 STORY / RANCH": 			driver.findElement(By.xpath("//select[@id='Form_PLCostestimator_numStories']//option[contains(text(),'1') and not(contains(text(),'Condo'))]")).click();
															break;
							
				case "1.5":	case "1.5 STORIES": 			driver.findElement(By.xpath("//select[@id='Form_PLCostestimator_numStories']//option[contains(text(),'1.5')]")).click();
															break;
								
				case "2": 	case "2 STORIES": 				driver.findElement(By.xpath("//select[@id='Form_PLCostestimator_numStories']//option[contains(text(),'2') and not(contains(text(),'Condo'))]")).click();
															break;
								
				case "2.5": case "2.5 STORIES": 			driver.findElement(By.xpath("//select[@id='Form_PLCostestimator_numStories']//option[contains(text(),'2.5')]")).click();
															break;
								
				case "3": 	case "3 STORIES": 				driver.findElement(By.xpath("//select[@id='Form_PLCostestimator_numStories']//option[contains(text(),'3') and not(contains(text(),'Condo'))]")).click();
															break;
								
				case "BL": 	case "BI LEVEL / RAISED RANCH":	driver.findElement(By.xpath("//select[@id='Form_PLCostestimator_numStories']//option[contains(text(),'Bi')]")).click();
															break;
			
				case "TL": 	case "TRI LEVEL": 				driver.findElement(By.xpath("//select[@id='Form_PLCostestimator_numStories']//option[contains(text(),'Tri')]")).click();
															break;
								
				case "C1": 	case "CONDO 1 STORY": 			driver.findElement(By.xpath("//select[@id='Form_PLCostestimator_numStories']//option[contains(text(),'1') and contains(text(),'Condo')]")).click();
															break;
								
				case "C2": 	case "CONDO 2 STORIES": 		driver.findElement(By.xpath("//select[@id='Form_PLCostestimator_numStories']//option[contains(text(),'2') and contains(text(),'Condo')]")).click();
															break;
								
				case "C3": 	case "CONDO 3 STORIES": 		driver.findElement(By.xpath("//select[@id='Form_PLCostestimator_numStories']//option[contains(text(),'3') and contains(text(),'Condo')]")).click();
															break;
			
				case "C4": 	case "CONDO 4-7 STORIES": 		driver.findElement(By.xpath("//select[@id='Form_PLCostestimator_numStories']//option[contains(text(),'4-7') and contains(text(),'Condo')]")).click();
															break;
								
				case "C8": 	case "CONDO 8-14 STORIES": 		driver.findElement(By.xpath("//select[@id='Form_PLCostestimator_numStories']//option[contains(text(),'8-14') and contains(text(),'Condo')]")).click();
															break;
								
				case "C15": case "CONDO 15+ STORIES": 		driver.findElement(By.xpath("//select[@id='Form_PLCostestimator_numStories']//option[contains(text(),'15+') and contains(text(),'Condo')]")).click();
															break;
			}
					Log("Entered # Stories: " + new Select(numberofstories).getFirstSelectedOption().getText());
		}
	}

	//Returns the value in the "Exterior Walls" field
	public String ReturnNumofStories() {
		if(new Select(numberofstories).getFirstSelectedOption().getText().isEmpty()) {
			return "N/A";
		}
		else {
			return numberofstories.getAttribute("value");
		}
	}

	//Selects "Protection Class" drop down
	public void SelectProtectionClass(String SelectProtectionClass) {
		if(!SelectProtectionClass.toUpperCase().equals("N/A")) {
			if(new Select(protectionclass).getFirstSelectedOption().getText().isEmpty()) {
				new Select(protectionclass).selectByVisibleText(SelectProtectionClass);
					Log("Entered Protection Class: " + SelectProtectionClass);
			}
			else {
					Log("Protection Class Prefilled with: " + new Select(protectionclass).getFirstSelectedOption().getText());
			}
		}
	}

	//Force selects "Protection Class" drop down
	public void ForceSelectProtectionClass(String ForceSelectProtectionClass) {
		if(!ForceSelectProtectionClass.toUpperCase().equals("N/A")) {
			new Select(protectionclass).selectByVisibleText(ForceSelectProtectionClass);
				Log("Entered Protection Class: " + ForceSelectProtectionClass);
		}
	}

	//Returns the value in the "Protection Class" field
	public String ReturnProtectionClass() {
		if(new Select(protectionclass).getFirstSelectedOption().getText().isEmpty()) {
			return "N/A";
		}
		else {
			return new Select(protectionclass).getFirstSelectedOption().getText();	
		}
	}

	//Types into "Year Roof Installed" text box
	public void TypeYearRoofInstalled(String TypeYearRoofInstalled) {
		if(!TypeYearRoofInstalled.toUpperCase().equals("N/A")) {
			yearroofinstalled.clear();
			yearroofinstalled.sendKeys(TypeYearRoofInstalled);
				Log("Entered Year Roof Installed: " + TypeYearRoofInstalled);
		}
	}

	//Returns the value in the "Year Roof Installed" field
	public String ReturnYearRoofInstalled() {
		if(yearroofinstalled.getText().isEmpty()) {
			return "N/A";
		}
		else {
			return yearroofinstalled.getAttribute("value");
		}
	}

	//Types into "Purchase Date" date text box "MMDDYYYY"
	public void TypePurchaseDate(String TypePurchaseDate) {
		if(!TypePurchaseDate.toUpperCase().equals("N/A")) {
			purchasedate.clear();
			purchasedate.sendKeys(TypePurchaseDate);
				Log("Entered Purchase Date: " + TypePurchaseDate);
		}
	}

	//Returns the value in the "Purchase Date" field
	public String ReturnPurchaseDate() {
		if(purchasedate.getText().isEmpty()) {
			return "N/A";
		}
		else {
			return purchasedate.getAttribute("value");
		}
	}

	//Selects "Roof Design" drop down
	public void SelectRoofDesign(String SelectRoofDesign) {
		if(!SelectRoofDesign.toUpperCase().equals("N/A")) {
			switch(SelectRoofDesign.toUpperCase()) {
				case "Y": case "YES": case "H": case "HIP":		new Select(roofdesign).selectByVisibleText("Hip");
																	Log("Entered Roof Design: Hip");
																break;
											
				case "N": case "NO": case "G": case "GABLE":	new Select(roofdesign).selectByVisibleText("Gable");
																	Log("Entered Roof Design: Gable");
																break;
																
				case "F": case "FLAT":							new Select(roofdesign).selectByVisibleText("Flat");
																	Log("Entered Roof Design: Flat");
																break;
																
				case "F-PC": case "FLAT - POURED CONCRETE":		new Select(roofdesign).selectByVisibleText("Flat - Poured Concrete");
																	Log("Entered Roof Design: Flat - Poured Concrete");
																break;
																
				case "F-A": case "FLAT - ADOBE":				new Select(roofdesign).selectByVisibleText("Flat - Adobe");
																	Log("Entered Roof Design: Flat - Adobe");
																break;
			}
		}
	}

	//Returns the value in the "Roof Design" field
	public String ReturnRoofDesign() {
		if(new Select(roofdesign).getFirstSelectedOption().getText().isEmpty()) {
			return "N/A";
		}
		else {
			return new Select(roofdesign).getFirstSelectedOption().getText();	
		}
	}
	
	//Selects "Is this risk for a home closing?" drop down
	public void SelectIsHomeClosing(String SelectIsHomeClosing) {
		if(!SelectIsHomeClosing.toUpperCase().equals("N/A")) {
			switch(SelectIsHomeClosing.toUpperCase()) {
				case "Y": case "YES":	new Select(homeclosing).selectByVisibleText("Yes");
											Log("Entered Is this risk for a home closing?: Yes");
										break;
										
				case "N": case "NO":	new Select(homeclosing).selectByVisibleText("No");
											Log("Entered Is this risk for a home closing?: No");
										break;
			}
		}
	}

	//Selects "Roofing Material" drop down
	public void SelectRoofingMaterial(String SelectRoofingMaterial) {
		if(!SelectRoofingMaterial.toUpperCase().equals("N/A")) {
			switch(SelectRoofingMaterial.toUpperCase()) {
				case "AB": case "ASBESTOS":						new Select(roofingmaterial).selectByVisibleText("Asbestos");
																	Log("Entered Roofing Material: Asbestos");
																break;
											
				case "AC": case "ALUMINUM CORRUGATED":			new Select(roofingmaterial).selectByVisibleText("Aluminum, Corrugated");
																	Log("Entered Roofing Material: Aluminum, Corrugated");
																break;
														
				case "AS": case "SHINGLES, ARCHITECTURAL":		new Select(roofingmaterial).selectByVisibleText("Shingles, Architectural");
																	Log("Entered Roofing Material: Shingles, Architectural");
																break;
															
				case "BT": case "BARREL TILE":					new Select(roofingmaterial).selectByVisibleText("Barrel Tile");
																	Log("Entered Roofing Material: Barrel Tile");
																break;
															
				case "CS": case "COMPOSITE SHINGLE":			new Select(roofingmaterial).selectByVisibleText("Composite Shingle");
																	Log("Entered Roofing Material: Composite Shingle");
																break;
															
				case "CT": case "CONCRETE TILE":				new Select(roofingmaterial).selectByVisibleText("Concrete Tile");
																	Log("Entered Roofing Material: Concrete Tile");
																break;
																
				case "CL": case "CLAY TILE":					new Select(roofingmaterial).selectByVisibleText("Clay Tile");
																	Log("Entered Roofing Material: " + roofingmaterial);
																break;
															
				case "FT": case "FLAT TILE":					new Select(roofingmaterial).selectByVisibleText("Flat Tile");
																	Log("Entered Roofing Material: Flat Tile");
																break;
															
				case "M": case "METAL":							new Select(roofingmaterial).selectByVisibleText("METAL");
																	Log("Entered Roofing Material: METAL");
																break;
															
				case "O": case "OTHER":							new Select(roofingmaterial).selectByVisibleText("Other");
																	Log("Entered Roofing Material: Other");
																break;
															
				case "PC": case "POURED CONCRETE":				new Select(roofingmaterial).selectByVisibleText("Poured Concrete");
																	Log("Entered Roofing Material: Poured Concrete");
																break;
															
				case "RB": case "RUBBER":						new Select(roofingmaterial).selectByVisibleText("Rubber");
																	Log("Entered Roofing Material: Rubber");
																break;
															
				case "RR": case "ROLLED ROOF":					new Select(roofingmaterial).selectByVisibleText("Rolled Roof");
																	Log("Entered Roofing Material: Rolled Roof");
																break;
															
				case "SC": case "SUPERIOR W/POURED CONCRETE":	new Select(roofingmaterial).selectByVisibleText("Superior Construction w/Poured Concrete");
																	Log("Entered Roofing Material: Superior Construction w/Poured Concrete");
																break;
																
				case "SL": case "SLATE":						new Select(roofingmaterial).selectByVisibleText("Slate");
																	Log("Entered Roofing Material: Slate");
																break;
																
				case "T": case "TILE":							new Select(roofingmaterial).selectByVisibleText("Tile");
																	Log("Entered Roofing Material: Tile");
																break;
																
				case "TG": case "TAR AND GRAVEL":				new Select(roofingmaterial).selectByVisibleText("Tar and Gravel");
																	Log("Entered Roofing Material: Tar and Gravel");
																break;
																
				case "TS": case "TAR SHINGLE":					new Select(roofingmaterial).selectByVisibleText("Tar Shingle");
																	Log("Entered Roofing Material: Tar Shingle");
																break;
																
				case "WK": case "WOOD SHAKE":					new Select(roofingmaterial).selectByVisibleText("Wood Shake");
																	Log("Entered Roofing Material: Wood Shake");
																break;
																
				case "WS": case "WOOD SHINGLE":					new Select(roofingmaterial).selectByVisibleText("Wood Shingle");
																	Log("Entered Roofing Material: Wood Shingle");
																break;
			}
		}
	}

	//Returns the value in the "Roofing Material" field
	public String ReturnRoofingMaterial() {
		if(new Select(roofingmaterial).getFirstSelectedOption().getText().isEmpty()) {
			return "N/A";
		}
		else {
			return new Select(roofingmaterial).getFirstSelectedOption().getText();	
		}
	}

	//Types into "Purchase Price" text box
	public void TypePurchasePrice(String TypePurchasePrice) {
		if(!TypePurchasePrice.toUpperCase().equals("N/A")) {
			purchaseprice.clear();
			purchaseprice.sendKeys(TypePurchasePrice);
				Log("Entered Purchase Price: " + TypePurchasePrice);
		}
	}
	
	//Selects "Number of Families" drop down
	public void SelectNumberofFamilies(String SelectNumberofFamilies) {
		if(!SelectNumberofFamilies.toUpperCase().equals("N/A")) {
			switch(SelectNumberofFamilies.toUpperCase()) {
				case "1": case "1 FAMILY":	new Select(numoffamilies).selectByVisibleText("1 Family");
												Log("Entered Number of Families: 1 Family");
											break;
											
				case "2": case "2 FAMILY":	new Select(numoffamilies).selectByVisibleText("2 Family");
												Log("Entered Number of Families: 2 Family");
											break;
				
				case "3": case "3 FAMILY":	new Select(numoffamilies).selectByVisibleText("3 Family");
												Log("Entered Number of Families: 3 Family");
											break;
			
				case "4": case "4 FAMILY":	new Select(numoffamilies).selectByVisibleText("4 Family");
												Log("Entered Number of Families: 4 Family");
											break;
			}
		}
	}

	//Returns the value in the "Number of Families" field
	public String ReturnNumberofFamilies() {
		if(new Select(numoffamilies).getFirstSelectedOption().getText().isEmpty()) {
			return "N/A";
		}
		else {
			return new Select(numoffamilies).getFirstSelectedOption().getText();	
		}
	}

	//Types into "Policy Notes" text box
	public void TypePolicyNotes(String TypePolicyNotes) {
		if(!TypePolicyNotes.toUpperCase().equals("N/A")) {
			policynotes.clear();
			policynotes.sendKeys(TypePolicyNotes);
				Log("Entered Policy Notes: " + TypePolicyNotes);
		}
	}

	//Clicks the "Mailing Address Same as Location" button
	public void ClickMailingAddressSameAsLocation() {
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click()", mailingaddresssameaslocation);
		//mailingaddresssameaslocation.click();
			Log("Clicked the \"Mailing Address Same as Location\" button");
	}

	//Types into "Current Address 1" text box
	public void TypeAddress1(String TypeAddress1) {
		if(!TypeAddress1.toUpperCase().equals("N/A")) {
			currentaddress1.clear();
			currentaddress1.sendKeys(TypeAddress1);
				Log("Entered Current Address 1: " + TypeAddress1);
		}
	}

	//Types into "Current Address 2" text box
	public void TypeAddress2(String TypeAddress2) {
		if(!TypeAddress2.toUpperCase().equals("N/A")) {
			currentaddress2.clear();
			currentaddress2.sendKeys(TypeAddress2);
				Log("Entered Current Address 2: " + TypeAddress2);
		}
	}

	//Types into "Current City" text box
	public void TypeCity(String TypeCity) {
		if(!TypeCity.toUpperCase().equals("N/A")) {
			currentcity.clear();
			currentcity.sendKeys(TypeCity);
				Log("Entered Current City: " + TypeCity);
		}
	}

	//Types into "Current State" text box
	public void TypeCurrentState(String TypeCurrentState) {
		if(!TypeCurrentState.toUpperCase().equals("N/A")) {
			currentstate.clear();
			currentstate.sendKeys(TypeCurrentState);
				Log("Entered Current State: " + TypeCurrentState);
		}
	}

	//Types into "Current Zip Code" text box
	public void TypeCurrentZipCode(String TypeCurrentZipCode) {
		if(!TypeCurrentZipCode.toUpperCase().equals("N/A")) {
			currentzipcode.clear();
			currentzipcode.sendKeys(TypeCurrentZipCode);
				Log("Entered Current Zip Code: " + TypeCurrentZipCode);
		}
	}

	//Selects "Country" drop down
	public void SelectCountry(String SelectCountry) {
		if(!SelectCountry.toUpperCase().equals("N/A")) {
			new Select(country).selectByVisibleText(SelectCountry);
				Log("Entered Roofing Material: " + SelectCountry);
		}
	}

	//Selects "# Years at this Address" drop down
	public void SelectYearsAtThisAddress(String SelectYearsAtThisAddress) {
		if(!SelectYearsAtThisAddress.toUpperCase().equals("N/A")) {
			new Select(yearsatthisaddress).selectByVisibleText(SelectYearsAtThisAddress);
				Log("Entered # Years at this Address: " + SelectYearsAtThisAddress);
		}
	}

	//Types into "Social Security Number" text box
	public void TypeSSN(String TypeSSN) {
		if(!TypeSSN.toUpperCase().equals("N/A")) {
			socialsecuritynumber.clear();
			socialsecuritynumber.sendKeys(TypeSSN);
				Log("Entered Social Security Number: " + TypeSSN);
		}
	}

	//Selects "Has the insured given permission to run a credit report" drop down
	public void SelectRunCreditReport(String SelectCreditAuthority) {
		if(!SelectCreditAuthority.toUpperCase().equals("N/A")) {
			switch(SelectCreditAuthority.toUpperCase()) {
				case "Y": case "YES":	new Select(permissionruncreditreport).selectByVisibleText("Yes");
											Log("Entered Has the insured given permission to run a credit report: Yes");
										break;
										
				case "N": case "NO":	new Select(permissionruncreditreport).selectByVisibleText("No");
											Log("Entered Has the insured given permission to run a credit report: No");
										break;
			}
		}
	}

	//Types into "Previous Address" text box
	public void TypePreviousAddress(String TypePreviousAddress) {
		if(!TypePreviousAddress.toUpperCase().equals("N/A")) {
			previousaddress.clear();
			previousaddress.sendKeys(TypePreviousAddress);
				Log("Entered Previous Address: " + TypePreviousAddress);
		}
	}

	//Types into "Previous City" text box
	public void TypePreviousCity(String TypePreviousCity) {
		if(!TypePreviousCity.toUpperCase().equals("N/A")) {
			previouscity.clear();
			previouscity.sendKeys(TypePreviousCity);
				Log("Entered Previous City: " + TypePreviousCity);
		}
	}

	//Selects "Previous State" drop down
	public void SelectPreviousState(String SelectPreviousState) {
		if(!SelectPreviousState.toUpperCase().equals("N/A")) {
			new Select(previousstate).selectByValue(SelectPreviousState);
				Log("Entered Previous State: " + new Select(previousstate).getFirstSelectedOption().getText());
		}
	}

	//Types into "Previous Zip Code" text box
	public void TypePreviousZipCode(String TypePreviousZipCode) {
		if(!TypePreviousZipCode.toUpperCase().equals("N/A")) {
			previouszip.clear();
			previouszip.sendKeys(TypePreviousZipCode);
				Log("Entered Previous Zip Code: " + TypePreviousZipCode);
		}
	}

	//Types into "Square Feet Living Area" text box
	public void TypeSquareFeetLivingArea(String TypeSquareFeetLivingArea) {
		if(!TypeSquareFeetLivingArea.toUpperCase().equals("N/A")) {
			squarefeetlivingarea.clear();
			squarefeetlivingarea.sendKeys(TypeSquareFeetLivingArea);
				Log("Entered Square Feet Living Area: " + TypeSquareFeetLivingArea);
		}
	}

	//Checks "Irregular Shape" check box 
	public void CheckIrregularShape(String CheckIrregularShape) {
		if(!CheckIrregularShape.toUpperCase().equals("N/A")) {
			if(irregularshape.isSelected()) {
				switch(CheckIrregularShape.toUpperCase()) {
					case "Y": case "YES":		Log("\"Irregular Shape\" check box marked");
											break;
											
					case "N": case "NO":	irregularshape.click();
												Log("\"Irregular Shape\" check box NOT marked");
											break;
				}
			}
			else {
				switch(CheckIrregularShape.toUpperCase()) {
					case "Y": case "YES":	irregularshape.click();
												Log("\"Irregular Shape\" check box marked");
											break;
											
					case "N": case "NO":		Log("\"Irregular Shape\" check box NOT marked");
											break;
				}			
			}
		}
	}

	//Selects "Substructure" from drop down
	public void SelectSubstructure(String SelectSubstructure) throws InterruptedException {
		if(!SelectSubstructure.toUpperCase().equals("N/A")) {
			switch(SelectSubstructure.toUpperCase()) {
				case "B": case "BASEMENT":											new Select(substructure).selectByVisibleText("Basement");				
																						Log("Entered Substructure: Basement");
																					break;
																						
				case "S": case "SLAB-ON-GROUND":									new Select(substructure).selectByVisibleText("Slab-on-Ground");
																						Log("Entered Substructure: Slab-on-ground");
																					break;
				
				case "BW": case "BASEMENT, WALKOUT":								new Select(substructure).selectByVisibleText("Basement, Walkout");   										
																						Log("Entered Substructure: " + substructure);
																					break;
																					
				case "BD": case "BASEMENT, DAYLIGHT":								new Select(substructure).selectByVisibleText("Basement, Daylight");   										
																					Log("Entered Substructure: " + substructure);
																					break;
				
				case "BBG": case "BASEMENT, BELOW GRADE":							new Select(substructure).selectByVisibleText("Basement, Daylight");   										
																					Log("Entered Substructure: " + substructure);
																					break;
																					
				case "C": case "CRAWL SPACE":										new Select(substructure).selectByVisibleText("Crawl Space");
																						Log("Entered Substructure: Crawl Space");
																					break;
					
				case "P": case "PIERS (ELEVATED)":									new Select(substructure).selectByVisibleText("Piers (Elevated)");
																						Log("Entered Substructure: Piers (Elevated)");
																					break;
														
				case "O": case "OPEN FOUNDATION":									new Select(substructure).selectByVisibleText("Open Foundation");
																						Log("Entered Substructure: Open Foundation");
																					break;
														
				case "P/O": case "PIERS/OPEN FOUNDATION - 2 - 6FT W/ NO ENCLOSURE":	new Select(substructure).selectByVisibleText("Piers/Open Foundation - 2 - 6ft w/ no enclosure");
																						Log("Entered Substructure: Piers/Open Foundation - 2 - 6ft w/ no enclosure");
																					break;
																						
				case "P/C": case "PIERS/CRAWL SPACE - 2 - 6FT W/ PERMENT MATERIAL":	new Select(substructure).selectByVisibleText("Piers/Crawl Space - 2 - 6ft w/ permanent material");
																						Log("Entered Substructure: Piers/Crawl Space - 2 - 6ft w/ permanent material");;
																					break;
																						
				case "PL": case "PILINGS 8-12 FT ELEVATION":						new Select(substructure).selectByVisibleText("Pilings 8-12 ft Elevation");
																						Log("Entered Substructure: Pilings 8-12 ft Elevation");
																					break;
				
				case "SOH": case "SUSPENDED OVER HILLSIDE":							new Select(substructure).selectByVisibleText("Suspended Over Hillside");
																						Log("Entered Substructure: Suspended Over Hillside");
																					break;
			}
		}
	}
	
	
	public void TypeBasementPct(String TypeBasementPct)
	{
		if(!TypeBasementPct.toUpperCase().equals("N/A")) {
			basementpct.clear();
			basementpct.sendKeys(TypeBasementPct);
			Log("Entered Basement Finish Type: " + TypeBasementPct);
		}
	}
	

	//Types into "% Basement Finished" text box
	public void TypeBasementPctFinished(String TypeBasementPctFinished) {
		if(!TypeBasementPctFinished.toUpperCase().equals("N/A")) {
			basementpctfinished.clear();
			basementpctfinished.sendKeys(TypeBasementPctFinished);
				Log("Entered % Basement Finished: " + TypeBasementPctFinished);
		}
	}

	//Selects "Basement Finish Type" drop down
	public void SelectBasementFinishType(String SelectBasementFinishType) {
		if(!SelectBasementFinishType.toUpperCase().equals("N/A")) {
			new Select(basementquality).selectByVisibleText(SelectBasementFinishType);
				Log("Entered Basement Finish Type: " + SelectBasementFinishType);
		}
	}

	//Checks "Walkout Basement" check box 
	public void CheckWalkoutBasement(String CheckWalkoutBasement) {
		if(!CheckWalkoutBasement.toUpperCase().equals("N/A")) {
			if(basementwalkout.isSelected()) {
				switch(CheckWalkoutBasement.toUpperCase()) {
					case "Y": case "YES":		Log("\"Walkout Basement\" check box marked");
											break;
											
					case "N": case "NO":	basementwalkout.click();
												Log("\"Walkout Basement\" check box NOT marked");
											break;
				}
			}
			else {
				switch(CheckWalkoutBasement.toUpperCase()) {
					case "Y": case "YES":	basementwalkout.click();
												Log("\"Walkout Basement\" check box marked");
											break;
											
					case "N": case "NO":		Log("\"Walkout Basement\" check box NOT marked");
											break;
				}			
			}
		}
	}

	//Selects "Swimming Pool" drop down
	public void SelectSwimmingPool(String SelectSwimmingPool) {
		if(!SelectSwimmingPool.toUpperCase().equals("N/A")) {
			new Select(swimmingpool).selectByVisibleText(SelectSwimmingPool);
				Log("Entered Swimming Pool: " + SelectSwimmingPool);
		}
	}

	//Checks "Screened/4ft Fenced Pool" check box 
	public void CheckScreenedPool(String CheckScreenedPool) {
		if(!CheckScreenedPool.toUpperCase().equals("N/A")) {
			if(screenedpool.isSelected()) {
				switch(CheckScreenedPool.toUpperCase()) {
					case "Y": case "YES":		Log("\"Screened/4ft Fenced Pool\" check box marked");
											break;
											
					case "N": case "NO":	screenedpool.click();
												Log("\"Screened/4ft Fenced Pool\" check box NOT marked");
											break;
				}
			}
			else {
				switch(CheckScreenedPool.toUpperCase()) {
					case "Y": case "YES":	screenedpool.click();
												Log("\"Screened/4ft Fenced Pool\" check box marked");
											break;
											
					case "N": case "NO":		Log("\"Screened/4ft Fenced Pool\" check box NOT marked");
											break;
				}			
			}
		}
	}

	//Checks "Diving Board/Slide" check box 
	public void CheckDivingBoardSlide(String CheckDivingBoardSlide) {
		if(!CheckDivingBoardSlide.toUpperCase().equals("N/A")) {
			if(screenedpool.isSelected()) {
				switch(CheckDivingBoardSlide.toUpperCase()) {
					case "Y": case "YES":		Log("\"Screened/4ft Fenced Pool\" check box marked");
											break;
											
					case "N": case "NO":	divingboard.click();
												Log("\"Screened/4ft Fenced Pool\" check box NOT marked");
											break;
				}
			}
			else {
				switch(CheckDivingBoardSlide.toUpperCase()) {
					case "Y": case "YES":	divingboard.click();
												Log("\"Screened/4ft Fenced Pool\" check box marked");
											break;
											
					case "N": case "NO":		Log("\"Screened/4ft Fenced Pool\" check box NOT marked");
											break;
				}			
			}
		}
	}

	//Selects "Garage" drop down
	public void SelectGarage(String SelectGarage) {
		if(!SelectGarage.toUpperCase().equals("N/A")) {
			new Select(garage).selectByVisibleText(SelectGarage);
				Log("Entered Garage: " + SelectGarage);
		}
	}

	//Selects "Type of Fireplace" drop down
	public void SelectFirePlaceType(String SelectFirePlaceType) {
		if(!SelectFirePlaceType.toUpperCase().equals("N/A")) {
			new Select(fireplacetype).selectByVisibleText(SelectFirePlaceType);
				Log("Entered Type of Fireplace: " + SelectFirePlaceType);
		}
	}

	//Types into "# of Fireplaces" text box
	public void TypeNumberOfFireplace(String TypeNumberOfFireplace) {
		if(!TypeNumberOfFireplace.toUpperCase().equals("N/A")) {
			fireplace.clear();
			fireplace.sendKeys(TypeNumberOfFireplace);
				Log("Entered # of Fireplaces: " + TypeNumberOfFireplace);
		}
	}

	//Types into "Full Baths" text box
	public void TypeNumFullBaths(String TypeNumFullBaths) {
		if(!TypeNumFullBaths.toUpperCase().equals("N/A")) {
			numfullbaths.clear();
			numfullbaths.sendKeys(TypeNumFullBaths);
				Log("Entered Full Baths: " + TypeNumFullBaths);
		}
	}

	//Types into "Half Baths" text box
	public void TypeNumHalfBaths(String TypeNumHalfBaths) {
		if(!TypeNumHalfBaths.toUpperCase().equals("N/A")) {
			numhalfbaths.clear();
			numhalfbaths.sendKeys(TypeNumHalfBaths);
				Log("Entered Half Baths: " + TypeNumHalfBaths);
		}
	}

	//Selects "Bathroom Grade" drop down
	public void SelectBathroomGrade(String SelectBathroomGrade) {
		if(!SelectBathroomGrade.toUpperCase().equals("N/A")) {
			new Select(bathroomgrade).selectByVisibleText(SelectBathroomGrade);
				Log("Entered Bathroom Grade: " + SelectBathroomGrade);
		}
	}

	//Checks "Hot Tub" check box 
	public void CheckHotTub(String CheckHotTub) {
		if(!CheckHotTub.toUpperCase().equals("N/A")) {
			if(hottub.isSelected()) {
				switch(CheckHotTub.toUpperCase()) {
					case "Y": case "YES":		Log("\"Hot Tub\" check box marked");
											break;
											
					case "N": case "NO":	hottub.click();
												Log("\"Hot Tub\" check box NOT marked");
											break;
				}
			}
			else {
				switch(CheckHotTub.toUpperCase()) {
					case "Y": case "YES":	hottub.click();
												Log("\"Hot Tub\" check box marked");
											break;
											
					case "N": case "NO":		Log("\"Hot Tub\" check box NOT marked");
											break;
				}			
			}
		}
	}

	//Checks "Jacuzzi" check box 
	public void CheckJacuzzi(String CheckJacuzzi) {
		if(!CheckJacuzzi.toUpperCase().equals("N/A")) {
			if(jacuzzi.isSelected()) {
				switch(CheckJacuzzi.toUpperCase()) {
					case "Y": case "YES":		Log("\"Jacuzzi\" check box marked");
											break;
											
					case "N": case "NO":	jacuzzi.click();
												Log("\"Jacuzzi\" check box NOT marked");
											break;
				}
			}
			else {
				switch(CheckJacuzzi.toUpperCase()) {
					case "Y": case "YES":	jacuzzi.click();
												Log("\"Jacuzzi\" check box marked");
											break;
											
					case "N": case "NO":		Log("\"Jacuzzi\" check box NOT marked");
											break;
				}			
			}
		}
	}

	//Selects "Kitchen Grade" drop down
	public void SelectKitchenGrade(String SelectKitchenGrade) {
		if(!SelectKitchenGrade.toUpperCase().equals("N/A")) {
			new Select(kitchengrade).selectByVisibleText(SelectKitchenGrade);
				Log("Entered Kitchen Grade: " + SelectKitchenGrade);
		}
	}

	//Selects "Cooling/Air" drop down
	public void SelectCentralHeatAir(String SelectCentralHeatAir) {
		if(!SelectCentralHeatAir.toUpperCase().equals("N/A")) {
			new Select(centralheatair).selectByVisibleText(SelectCentralHeatAir);
				Log("Entered Cooling/Air: " + SelectCentralHeatAir);
		}
	}

	//Selects "Permanent Heat Source" drop down
	public void SelectHeatSource(String SelectHeatSource) {
		if(!SelectHeatSource.toUpperCase().equals("N/A")) {
			new Select(heatsource).selectByVisibleText(SelectHeatSource);
				Log("Entered Permanent Heat Source: " + SelectHeatSource);
		}
	}

	//Types into "% Cathedral Ceilings" text box
	public void TypeCathedralCeilingPerc(String TypeCathedralCeilingPerc) {
		if(!TypeCathedralCeilingPerc.toUpperCase().equals("N/A")) {
			cathedralceilingperc.clear();
			cathedralceilingperc.sendKeys(TypeCathedralCeilingPerc);
				Log("Entered % Cathedral Ceilings: " + TypeCathedralCeilingPerc);
		}
	}

	//Types into "Porch Square Feet" text box
	public void TypePorchSquareFeet(String TypePorchSquareFeet) {
		if(!TypePorchSquareFeet.toUpperCase().equals("N/A")) {
			porchsquarefeet.clear();
			porchsquarefeet.sendKeys(TypePorchSquareFeet);
				Log("Entered Porch Square Feet: " + TypePorchSquareFeet);
		}
	}

	//Types into "Porch" text box
	public void TypePorch(String TypePorch) {
		if(!TypePorch.toUpperCase().equals("N/A")) {
			porch.clear();
			porch.sendKeys(TypePorch);
				Log("Entered Porch: " + TypePorch);
		}
	}

	//Types into "Covered Porch" text box
	public void TypeCoveredPorch(String TypeCoveredPorch) {
		if(!TypeCoveredPorch.toUpperCase().equals("N/A")) {
			coveredporch.clear();
			coveredporch.sendKeys(TypeCoveredPorch);
				Log("Entered Covered Porch: " + TypeCoveredPorch);
		}
	}

	//Selects "Deck" drop down
	public void SelectDeck(String SelectDeck) {
		if(!SelectDeck.toUpperCase().equals("N/A")) {
			new Select(deck).selectByVisibleText(SelectDeck);
				Log("Entered Deck: " + SelectDeck);
		}
	}

	//Types into "Deck Sq Ft" text box
	public void TypeDeckSqFt(String TypeDeckSqFt) {
		if(!TypeDeckSqFt.toUpperCase().equals("N/A")) {
			decksqft.clear();
			decksqft.sendKeys(TypeDeckSqFt);
				Log("Entered Deck Sq Ft: " + TypeDeckSqFt);
		}
	}

	//Types into "Solar Panels" text box
	public void TypeSolarPanels(String TypeSolarPanels) {
		if(!TypeSolarPanels.toUpperCase().equals("N/A")) {
			solarpanels.clear();
			solarpanels.sendKeys(TypeSolarPanels);
				Log("Entered Solar Panels: " + TypeSolarPanels);
		}
	}

	//Selects "SiteAccess" drop down
	public void SelectSiteAccess(String SelectSiteAccess) {
		if(!SelectSiteAccess.toUpperCase().equals("N/A")) {
			new Select(siteaccess).selectByVisibleText(SelectSiteAccess);
				Log("Entered Site Access: " + SelectSiteAccess);
		}
	}

	//Selects "Wall Height" drop down
	public void SelectWallHeight(String SelectWallHeight) {
		if(!SelectWallHeight.toUpperCase().equals("N/A")) {
			new Select(wallheight).selectByVisibleText(SelectWallHeight);
				Log("Entered Wall Height: " + SelectWallHeight);
		}
	}

	//Selects "Staircases" drop down
	public void SelectStaircases(String SelectStaircases) {
		if(!SelectStaircases.toUpperCase().equals("N/A")) {
			new Select(staircasetype).selectByVisibleText(SelectStaircases);
				Log("Entered Staircases: " + SelectStaircases);
		}
	}

	//Checks "Central Burglar Alarm" check box 
	public void CheckCentralBurglarAlarm(String CheckCentralBurglarAlarm) {
		if(!CheckCentralBurglarAlarm.toUpperCase().equals("N/A")) {
			if(alarmsystemburglar.isSelected()) {
				switch(CheckCentralBurglarAlarm.toUpperCase()) {
					case "Y": case "YES":		Log("\"Central Burglar Alarm\" check box marked");
											break;
											
					case "N": case "NO":	alarmsystemburglar.click();
												Log("\"Central Burglar Alarm\" check box NOT marked");
											break;
				}
			}
			else {
				switch(CheckCentralBurglarAlarm.toUpperCase()) {
					case "Y": case "YES":	alarmsystemburglar.click();
												Log("\"Central Burglar Alarm\" check box marked");
											break;
											
					case "N": case "NO":		Log("\"Central Burglar Alarm\" check box NOT marked");
											break;
				}			
			}
		}
	}

	//Checks "Central Fire Alarm" check box 
	public void CheckCentralFireAlarm(String CheckCentralFireAlarm) {
		if(!CheckCentralFireAlarm.toUpperCase().equals("N/A")) {
			if(alarmsystemfire.isSelected()) {
				switch(CheckCentralFireAlarm.toUpperCase()) {
					case "Y": case "YES":		Log("\"Central Fire Alarm\" check box marked");
											break;
											
					case "N": case "NO":	alarmsystemfire.click();
												Log("\"Central Fire Alarm\" check box NOT marked");
											break;
				}
			}
			else {
				switch(CheckCentralFireAlarm.toUpperCase()) {
					case "Y": case "YES":	alarmsystemfire.click();
												Log("\"Central Fire Alarm\" check box marked");
											break;
											
					case "N": case "NO":		Log("\"Central Fire Alarm\" check box NOT marked");
											break;
				}			
			}
		}
	}

	//Checks "Central Vac" check box 
	public void CheckCentralVac(String CheckCentralVac) {
		if(!CheckCentralVac.toUpperCase().equals("N/A")) {
			if(centralvac.isSelected()) {
				switch(CheckCentralVac.toUpperCase()) {
					case "Y": case "YES":		Log("\"Central Vac\" check box marked");
											break;
											
					case "N": case "NO":	centralvac.click();
												Log("\"Central Vac\" check box NOT marked");
											break;
				}
			}
			else {
				switch(CheckCentralVac.toUpperCase()) {
					case "Y": case "YES":	centralvac.click();
												Log("\"Central Vac\" check box marked");
											break;
											
					case "N": case "NO":		Log("\"Central Vac\" check box NOT marked");
											break;
				}			
			}
		}
	}

	//Checks "Internal Sprinkler System" check box 
	public void CheckInternalSprinklerSystem(String CheckInternalSprinklerSystem) {
		if(!CheckInternalSprinklerSystem.toUpperCase().equals("N/A")) {
			if(firesprinklersystem.isSelected()) {
				switch(CheckInternalSprinklerSystem.toUpperCase()) {
					case "Y": case "YES":		Log("\"Internal Sprinkler System\" check box marked");
											break;
											
					case "N": case "NO":	firesprinklersystem.click();
												Log("\"Internal Sprinkler System\" check box NOT marked");
											break;
				}
			}
			else {
				switch(CheckInternalSprinklerSystem.toUpperCase()) {
					case "Y": case "YES":	firesprinklersystem.click();
												Log("\"Internal Sprinkler System\" check box marked");
											break;
											
					case "N": case "NO":		Log("\"Internal Sprinkler System\" check box NOT marked");
											break;
				}			
			}
		}
	}

	//Checks "Home Management System" check box 
	public void CheckHomeManagementSystem(String CheckHomeManagementSystem) {
		if(!CheckHomeManagementSystem.toUpperCase().equals("N/A")) {
			if(homemngmtsystem.isSelected()) {
				switch(CheckHomeManagementSystem.toUpperCase()) {
					case "Y": case "YES":		Log("\"Home Management System\" check box marked");
											break;
											
					case "N": case "NO":	homemngmtsystem.click();
												Log("\"Home Management System\" check box NOT marked");
											break;
				}
			}
			else {
				switch(CheckHomeManagementSystem.toUpperCase()) {
					case "Y": case "YES":	homemngmtsystem.click();
												Log("\"Home Management System\" check box marked");
											break;
											
					case "N": case "NO":		Log("\"Home Management System\" check box NOT marked");
											break;
				}			
			}
		}
	}

	//Checks "Wireless Security System" check box 
	public void CheckWirelessSecuritySystem(String CheckWirelessSecuritySystem) {
		if(!CheckWirelessSecuritySystem.toUpperCase().equals("N/A")) {
			if(wirelesssecuritysystem.isSelected()) {
				switch(CheckWirelessSecuritySystem.toUpperCase()) {
					case "Y": case "YES":		Log("\"Wireless Security System\" check box marked");
											break;
											
					case "N": case "NO":	wirelesssecuritysystem.click();
												Log("\"Wireless Security System\" check box NOT marked");
											break;
				}
			}
			else {
				switch(CheckWirelessSecuritySystem.toUpperCase()) {
					case "Y": case "YES":	wirelesssecuritysystem.click();
												Log("\"Wireless Security System\" check box marked");
											break;
											
					case "N": case "NO":		Log("\"Wireless Security System\" check box NOT marked");
											break;
				}			
			}
		}
	}

	//Checks "Lift, Chair" check box 
	public void CheckLiftChair(String CheckLiftChair) {
		if(!CheckLiftChair.toUpperCase().equals("N/A")) {
			if(liftchair.isSelected()) {
				switch(CheckLiftChair.toUpperCase()) {
					case "Y": case "YES":		Log("\"Lift, Chair\" check box marked");
											break;
											
					case "N": case "NO":	liftchair.click();
												Log("\"Lift, Chair\" check box NOT marked");
											break;
				}
			}
			else {
				switch(CheckLiftChair.toUpperCase()) {
					case "Y": case "YES":	liftchair.click();
												Log("\"Lift, Chair\" check box marked");
											break;
											
					case "N": case "NO":		Log("\"Lift, Chair\" check box NOT marked");
											break;
				}			
			}
		}
	}

	//Checks "Lift, Wheelchair" check box 
	public void CheckLiftWheelchair(String CheckLiftWheelchair) {
		if(!CheckLiftWheelchair.toUpperCase().equals("N/A")) {
			if(liftwheelchair.isSelected()) {
				switch(CheckLiftWheelchair.toUpperCase()) {
					case "Y": case "YES":		Log("\"Lift, Wheelchair\" check box marked");
											break;
											
					case "N": case "NO":	liftwheelchair.click();
												Log("\"Lift, Wheelchair\" check box NOT marked");
											break;
				}
			}
			else {
				switch(CheckLiftWheelchair.toUpperCase()) {
					case "Y": case "YES":	liftwheelchair.click();
												Log("\"Lift, Wheelchair\" check box marked");
											break;
											
					case "N": case "NO":		Log("\"Lift, Wheelchair\" check box NOT marked");
											break;
				}			
			}
		}
	}

	//Checks "Elevator" check box 
	public void CheckElevator(String CheckElevator) {
		if(!CheckElevator.toUpperCase().equals("N/A")) {
			if(elevator.isSelected()) {
				switch(CheckElevator.toUpperCase()) {
					case "Y": case "YES":		Log("\"Elevator\" check box marked");
											break;
											
					case "N": case "NO":	elevator.click();
												Log("\"Elevator\" check box NOT marked");
											break;
				}
			}
			else {
				switch(CheckElevator.toUpperCase()) {
					case "Y": case "YES":	elevator.click();
												Log("\"Elevator\" check box marked");
											break;
											
					case "N": case "NO":		Log("\"Elevator\" check box NOT marked");
											break;
				}			
			}
		}
	}

	//Types into "Floor Covering Percentage 1" text box
	public void TypeFloorCoveringPercentage1(String TypeFloorCoveringPercentage1) {
		if(!TypeFloorCoveringPercentage1.toUpperCase().equals("N/A")) {
			floorcoveringpercentage1.clear();
			floorcoveringpercentage1.sendKeys(TypeFloorCoveringPercentage1);
				Log("Entered Floor Covering Percentage 1: " + TypeFloorCoveringPercentage1);
		}
	}

	//Selects "Floor Covering Type 1" drop down
	public void SelectFloorCoveringType1(String SelectFloorCoveringType1) {
		if(!SelectFloorCoveringType1.toUpperCase().equals("N/A")) {
			new Select(floorcoveringtype1).selectByVisibleText(SelectFloorCoveringType1);
				Log("Entered Floor Covering Type 1: " + SelectFloorCoveringType1);
		}
	}

	//Types into "Floor Covering Percentage 2" text box
	public void TypeFloorCoveringPercentage2(String TypeFloorCoveringPercentage2) {
		if(!TypeFloorCoveringPercentage2.toUpperCase().equals("N/A")) {
			floorcoveringpercentage2.clear();
			floorcoveringpercentage2.sendKeys(TypeFloorCoveringPercentage2);
				Log("Entered Floor Covering Percentage 2: " + TypeFloorCoveringPercentage2);
		}
	}

	//Selects "Floor Covering Type 2" drop down
	public void SelectFloorCoveringType2(String SelectFloorCoveringType2) {
		if(!SelectFloorCoveringType2.toUpperCase().equals("N/A")) {
			new Select(floorcoveringtype2).selectByVisibleText(SelectFloorCoveringType2);
				Log("Entered Floor Covering Type 2: " + SelectFloorCoveringType2);
		}
	}

	//Types into "Floor Covering Percentage 3" text box
	public void TypeFloorCoveringPercentage3(String TypeFloorCoveringPercentage3) {
		if(!TypeFloorCoveringPercentage3.toUpperCase().equals("N/A")) {
			floorcoveringpercentage3.clear();
			floorcoveringpercentage3.sendKeys(TypeFloorCoveringPercentage3);
				Log("Entered Floor Covering Percentage 3: " + TypeFloorCoveringPercentage3);
		}
	}

	//Selects "Floor Covering Type 3" drop down
	public void SelectFloorCoveringType3(String SelectFloorCoveringType3) {
		if(!SelectFloorCoveringType3.toUpperCase().equals("N/A")) {
			new Select(floorcoveringtype3).selectByVisibleText(SelectFloorCoveringType3);
				Log("Entered Floor Covering Type 3: " + SelectFloorCoveringType3);
		}
	}

	//Types into "Floor Covering Percentage 4" text box
	public void TypeFloorCoveringPercentage4(String TypeFloorCoveringPercentage4) {
		if(!TypeFloorCoveringPercentage4.toUpperCase().equals("N/A")) {
			floorcoveringpercentage4.clear();
			floorcoveringpercentage4.sendKeys(TypeFloorCoveringPercentage4);
				Log("Entered Floor Covering Percentage 4: " + TypeFloorCoveringPercentage4);
		}
	}

	//Selects "Floor Covering Type 4" drop down
	public void SelectFloorCoveringType4(String SelectFloorCoveringType4) {
		if(!SelectFloorCoveringType4.toUpperCase().equals("N/A")) {
			new Select(floorcoveringtype4).selectByVisibleText(SelectFloorCoveringType4);
				Log("Entered Floor Covering Type 4: " + SelectFloorCoveringType4);
		}
	}

	//Types into "Window Skylight" text box
	public void TypeWindowSkylight(String TypeWindowSkylight) {
		if(!TypeWindowSkylight.toUpperCase().equals("N/A")) {
			windowskylight.clear();
			windowskylight.sendKeys(TypeWindowSkylight);
				Log("Entered Window Skylight: " + TypeWindowSkylight);
		}
	}

	//Types into "Window Stained" text box
	public void TypeWindowStained(String TypeWindowStained) {
		if(!TypeWindowStained.toUpperCase().equals("N/A")) {
			windowstained.clear();
			windowstained.sendKeys(TypeWindowStained);
				Log("Entered Window Stained: " + TypeWindowStained);
		}
	}

	//Types into "Window Bay" text box
	public void TypeWindowBay(String TypeWindowBay) {
		if(!TypeWindowBay.toUpperCase().equals("N/A")) {
			windowbay.clear();
			windowbay.sendKeys(TypeWindowBay);
				Log("Entered Window Bay: " + TypeWindowBay);
		}
	}

	//Types into "Window Bow" text box
	public void TypeWindowBow(String TypeWindowBow) {
		if(!TypeWindowBow.toUpperCase().equals("N/A")) {
			windowbow.clear();
			windowbow.sendKeys(TypeWindowBow);
				Log("Entered Window Bow: " + TypeWindowBow);
		}
	}

	//Applies all the overrides
	public void ApplyAllOverrides(String claimcountoverride, String creditscoreoverride, String asiclaimsurchargeoverride) throws InterruptedException {
		CheckDeclineRiskOverride();
		CheckDwellingCoverageOverride();
		CheckGeneralUnderwritingOverride();
		CheckSocialSecurityOverride();
		CheckWaterDamageExclusionOverride();
		CheckAnimalLiabilityOverride();
		CheckAnimalLiabilityOverride();
		CheckPurchasePriceOverride();
		CheckShortSaleForeclosureOverride();
		CheckEligibilityReferralOverride();
		CheckFloodZoneOverride();
		CheckGeoLocationOverride();
		CheckAddressOverride();
		CheckClosedZipCodeOverride();
		CheckRemoveLeadLiabilityExclusionOverride();
		CheckLimitedWaterDamageOverride();
		CheckHomeShieldPackageOverride();
		CheckFunctionalReplacementCostOverride();
		CheckUpdatedHomeDiscountOverride();
		CheckPreviousClaimsOverride();
		CheckFlatRoofOverride();
		CheckAddressStandardizationOverride();
		CheckCLUEOverride();
		CheckAgeDwellingOverride();
		CheckLossAssessmentOverride();
		CheckHomeShieldPlusPackageOverride();
		CheckPriorLiabilityLimitOverride();
		CheckScheduledPersonalPropertyOverride();
		TypeNotesOverride("Rates Testing");
		TypeCreditScoreOverride(creditscoreoverride);
		TypeASIClaimSurchargeOverride(asiclaimsurchargeoverride);
		SelectClaimCountOverride(claimcountoverride);
			Log("All overrides have been applied");
	}

	//Checks the "Decline Risk" override check box
	public void CheckDeclineRiskOverride() {
		overridedeclinerisk.click();
			Log("\"Decline Risk\" override check box marked");
	}

	//Selects "Claim Count (Override)" from drop down
	public void SelectClaimCountOverride(String SelectClaimCount) {
		switch (SelectClaimCount.toUpperCase()) {
			case "0": case "0 CLAIMS":			new Select(overrideclaimcount).selectByVisibleText("None");
													Log("Entered Claim Count (Override): None");
												break;

			case "1": case "1 CLAIM":			new Select(overrideclaimcount).selectByVisibleText("1");
													Log("Entered Claim Count (Override): 1");
												break;

			case "2": case "2 OR MORE":			new Select(overrideclaimcount).selectByVisibleText("2");
													Log("Entered Claim Count (Override): 2");
												break;

			case "3": case "3 OR MORE CLAIMS":	new Select(overrideclaimcount).selectByVisibleText("3");
													Log("Entered Claim Count (Override): 3");
												break;
												
			default:							new Select(overrideclaimcount).selectByVisibleText(SelectClaimCount);
													Log("Entered Claim Count (Override): " + SelectClaimCount);
												break;
		}
	}

	//Checks the "Dwelling Coverage" override check box
	public void CheckDwellingCoverageOverride() {
		overridedwellingcoverage.click();
			Log("\"Dwelling Coverage\" override check box marked");
	}

	//Checks the "General Underwriting" override check box
	public void CheckGeneralUnderwritingOverride() {
		overridegeneralunderwriting.click();
			Log("\"General Underwriting\" override check box marked");
	}

	//Checks the "Social Security" override check box
	public void CheckSocialSecurityOverride() {
		overridesocialsecurity.click();
			Log("\"Social Security\" override check box marked");
	}

	//Checks the "Water Damage Exclusion" override check box
	public void CheckWaterDamageExclusionOverride() {
		overridewaterdamageexclusion.click();
			Log("\"Water Damage Exclusion\" override check box marked");
	}

	//Checks the "Animal Liability" override check box
	public void CheckAnimalLiabilityOverride() {
		overrideanimalliability.click();
			Log("\"Animal Liability\" override check box marked");
	}

	//Checks the "Purchase Price" override check box
	public void CheckPurchasePriceOverride() {
		overridepurchaseprice.click();
			Log("\"Purchase Price\" override check box marked");
	}

	//Checks the "Short Sale or Foreclosure" override check box
	public void CheckShortSaleForeclosureOverride() {
		overrideshortsaleorforeclosure.click();
			Log("\"Short Sale or Foreclosure\" override check box marked");
	}

	//Checks the "Eligibility Referral" override check box
	public void CheckEligibilityReferralOverride() {
		overrideeligibilityreferral.click();
			Log("\"Eligibility Referral\" override check box marked");
	}

	//Checks the "Flood Zone" override check box
	public void CheckFloodZoneOverride() {
		overridefloodzone.click();
			Log("\"Flood Zone\" override check box marked");
	}

	//Types into "Notes (FOR OVERRIDE PURPOSE ONLY)" text box
	public void TypeNotesOverride(String TypeNotesOverride) {
		overridenotes.clear();
		overridenotes.sendKeys(TypeNotesOverride);
			Log("Entered Notes (FOR OVERRIDE PURPOSE ONLY): " + TypeNotesOverride);
	}

	//Types into "Credit Score (Override)" text box
	public void TypeCreditScoreOverride(String TypeCreditScore) {
		if(!TypeCreditScore.toUpperCase().equals("N/A")) {
			overridecreditscore.clear();
			overridecreditscore.sendKeys(TypeCreditScore);
				Log("Entered Credit Score (Override): " + TypeCreditScore);
		}
	}

	//Checks the "Geo Location" override check box
	public void CheckGeoLocationOverride() {
		overridegeolocation.click();
			Log("\"Geo Location\" override check box marked");
	}

	//Checks the "Address" override check box
	public void CheckAddressOverride() {
		overrideaddress.click();
			Log("\"Address\" override check box marked");
	}

	//Checks the "Closed Zip Code" override check box
	public void CheckClosedZipCodeOverride() {
		overrideclosedzipcode.click();
			Log("\"Closed Zip Code\" override check box marked");
	}

	//Checks the "Remove Lead Liability Exclusion" override check box
	public void CheckRemoveLeadLiabilityExclusionOverride() {
		overrideremoveleadliabilityexclusion.click();
			Log("\"Remove Lead Liability Exclusion\" override check box marked");
	}

	//Checks the "Limited Water Damage" override check box
	public void CheckLimitedWaterDamageOverride() {
		overridelimitedwaterdamage.click();
			Log("\"Limited Water Damage\" override check box marked");
	}

	//Checks the "HomeShield Package" override check box
	public void CheckHomeShieldPackageOverride() {
		overridehomeshieldpackage.click();
			Log("\"HomeShield Package\" override check box marked");
	}

	//Checks the "Functional Replacement Cost" override check box
	public void CheckFunctionalReplacementCostOverride() {
		overridefunctionalreplacementcost.click();
			Log("\"Functional Replacement Cost\" override check box marked");
	}

	//Checks the "Updated Home Discount" override check box
	public void CheckUpdatedHomeDiscountOverride() {
		overrideupdatedhomediscount.click();
			Log("\"Updated Home Discount\" override check box marked");
	}

	//Types into "ASI Claim Surcharge (Override)" text box
	public void TypeASIClaimSurchargeOverride(String TypeASIClaimSurcharge) {
		if(!TypeASIClaimSurcharge.toUpperCase().equals("N/A")) {
			overrideasiclaimsurcharge.clear();
			overrideasiclaimsurcharge.sendKeys(TypeASIClaimSurcharge);
				Log("Entered ASI Claim Surcharge (Override): " + TypeASIClaimSurcharge);
		}
	}

	//Checks the "Previous Claims" override check box
	public void CheckPreviousClaimsOverride() {
		overridepreviousclaims.click();
			Log("\"Previous Claims\" override check box marked");
	}

	//Checks the "Flat Roof" override check box
	public void CheckFlatRoofOverride() {
		overrideflatroof.click();
			Log("\"Flat Roof\" override check box marked");
	}

	//Checks the "Address Standardization Override" override check box
	public void CheckAddressStandardizationOverride() {
		overrideaddressstandardization.click();
			Log("\"Address Standardization\" override check box marked");
	}

	//Checks the "CLUE" override check box
	public void CheckCLUEOverride() {
		overrideclue.click();
			Log("\"CLUE\" override check box marked");
	}

	//Checks the "Age of Dwelling" override check box
	public void CheckAgeDwellingOverride() {
		overrideageofdwelling.click();
			Log("\"Age of Dwelling\" override check box marked");
	}

	//Checks the "Loss Assessment" override check box
	public void CheckLossAssessmentOverride() {
		overridelossassessment.click();
			Log("\"Loss Assessment\" override check box marked");
	}

	//Checks the "HomeShield Plus Package" override check box
	public void CheckHomeShieldPlusPackageOverride() {
		overridehomeshieldpluspackage.click();
			Log("\"HomeShield Plus Package\" override check box marked");
	}

	//Checks the "Prior Liability Limit" override check box
	public void CheckPriorLiabilityLimitOverride() {
		overridepriorliabilitylimit.click();
			Log("\"Prior Liability Limit\" override check box marked");
	}

	//Checks the "Scheduled Personal Property" override check box
	public void CheckScheduledPersonalPropertyOverride() {
		overridescheduledpersonalproperty.click();
			Log("\"Scheduled Personal Property\" override check box marked");
	}
	
	public void SelectBusinessOccupancy(String selectbusinessoccupancy)
	{
		if(!selectbusinessoccupancy.toUpperCase().equals("N/A")) {
			new Select(busoccupancy).selectByVisibleText(selectbusinessoccupancy);
				Log("Entered Business Occupancy: " + selectbusinessoccupancy);
		}
	}

	//Clicks the "Back" button
	public void ClickBack() {
		back.click();
			Log("Clicked the \"Back\" button on the Policy Rating 2 page");
	}

	//Clicks the "Next" button
	public void ClickNext() {
		next.click();
			Log("Clicked the \"Next\" button on the Policy Rating 1 page");
	}

	//Clicks the "Save" button
	public void ClickSave() {
		save.click();
			Log("Clicked the \"Save\" button on the Policy Rating 1 page");
	}

	//Clicks the "Override" button
	public void ClickOverride() {
		override.click();
			Log("Clicked the \"Override\" button on the Policy Rating 1 page");
	}

	//Checks to make sure if on same page after hitting next to apply override
	public String ClickNextAndConfirmEdits(String casenum, String identifier) {
		ClickNext();
		if(driver.getPageSource().contains("Policy Rating Page 1")) {
				Log(casenum + "-" + identifier + ": edits on page read as \"" + edits.getText().trim().replaceAll("\\n", ",").replaceAll("   "," ").replaceAll("  "," ") + "\"");
			ClickOverride();
			if(driver.getPageSource().contains("Policy Rating Page 1")) {
					Log(casenum + "-" + identifier + ": There were edits that could not be overridden through on Policy Rating Page 1." + edits.getText().trim().replaceAll("\\n", ",").replaceAll("   "," ").replaceAll("  "," "));
				return "edits";
			}
			else {
					Log("Overrode through Rating Page 1");
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
			Log("Policy Rating Page 1 edits read: " + edittext);
		}
		return edittext;
	}
	
	//Returns the PolicyID
	public String ReturnPolicyID() {
		String id = policyid.getText().substring(0, policyid.getText().indexOf(" "));		
			Log("PS PolicyID is " + id);
		return id;
	}
	
	//Returns the Brushfire Score
	public String ReturnBrushfireScore() {
		String id = brushfirescore.getText().substring(0);		
			Log("Brushfire Score is " + id);
		return id;
	}
	
	
	//////////////////////////
	/// CORELOGIC SECTION ///
	/////////////////////////
	

	public void wp_typeconst()
	{
		SelectTypeofConstruction("F");
		SelectTypeofConstruction("M");
		SelectTypeofConstruction("V");
		SelectTypeofConstruction("S");
	}
	
	public void wp_exteriorwalls()
	{
		SelectExteriorWalls("Concrete Block");
		SelectExteriorWalls("Hardiplank Siding");
		SelectExteriorWalls("Wood Shake Siding");
		SelectExteriorWalls("Asbestos Siding");
		SelectExteriorWalls("Masonite Siding");
		SelectExteriorWalls("Aluminum Siding");
		SelectExteriorWalls("Vinyl Siding");
		SelectExteriorWalls("Brick Veneer");
		SelectExteriorWalls("Stone");
		SelectExteriorWalls("Stucco");
		SelectExteriorWalls("Wood");
		SelectExteriorWalls("Solid Brick");
		SelectExteriorWalls("EIFS or Dryvit Siding");
		SelectExteriorWalls("Clapboard");
		SelectExteriorWalls("Cement Fiber Shingles");
		SelectExteriorWalls("Hardboard Siding");
		SelectExteriorWalls("Logs, Solid");
	}
	
	public void wp_numStories()
	{
		SelectNumStories("1 Story / Ranch");
		SelectNumStories("1.5 Stories");
		SelectNumStories("2 Stories");
		SelectNumStories("2.5 Stories");
		SelectNumStories("3 Stories");
		SelectNumStories("Bi Level / Raised Ranch");
		SelectNumStories("Tri Level");
		SelectNumStories("Condo 1 Story");
		SelectNumStories("Condo 2 Stories");
		SelectNumStories("Condo 3 Stories");
		SelectNumStories("Condo 4-7 Stories");
		SelectNumStories("Condo 8-14 Stories");
		SelectNumStories("Condo 15+ Stories");
	}
	
	public void wp_roofdesign()
	{
		SelectRoofDesign("Gable");
		SelectRoofDesign("Hip");
		SelectRoofDesign("Flat");
		SelectRoofDesign("Flat - Poured Concrete");
		SelectRoofDesign("Flat - Adobe");
	}
	
	public void wp_roofmaterial()
	{
		SelectRoofingMaterial("Superior Construction w/Poured Concrete");
		SelectRoofingMaterial("Asbestos");
		SelectRoofingMaterial("Wood Shake");
		SelectRoofingMaterial("Concrete Tile");
		SelectRoofingMaterial("Slate");
		SelectRoofingMaterial("Rolled Roof");
		SelectRoofingMaterial("Shingles, Architectural");
		SelectRoofingMaterial("Aluminum, Corrugated");
		SelectRoofingMaterial("Rubber");
		SelectRoofingMaterial("Wood Shingle");
		SelectRoofingMaterial("Other");
		SelectRoofingMaterial("Composite Shingle");
		SelectRoofingMaterial("Barrel Tile");
	    SelectRoofingMaterial("Flat Tile");
		SelectRoofingMaterial("Clay Tile");
		SelectRoofingMaterial("Metal");
		SelectRoofingMaterial("Tar and Gravel");
		SelectRoofingMaterial("Poured Concrete");
	}
	
	public void wp_substructure() throws InterruptedException
	{
		SelectSubstructure("Slab-on-Ground");
		SelectSubstructure("Basement, Daylight");
		SelectSubstructure("Basement, Below Grade");
		SelectSubstructure("Basement, Walkout");
		SelectSubstructure("Open Foundation");
		SelectSubstructure("Crawl Space");
		SelectSubstructure("Piers (Elevated)");
		SelectSubstructure("Piers/Open Foundation - 2 - 6ft w/ no enclosure");
		SelectSubstructure("Piers/Crawl Space - 2 - 6ft w/ permanent material");
		SelectSubstructure("Pilings 8-12 ft Elevation");
		SelectSubstructure("Suspended Over Hillside");
	}
	
	public void wp_bathroomgrade()
	{
		SelectBathroomGrade("Builder's Grade");
		SelectBathroomGrade("Custom");
		SelectBathroomGrade("Designer");
		SelectBathroomGrade("Semi-Custom");
	}
	
	public void wp_garage()
	{
		SelectGarage("None");
		SelectGarage("1-Car-Attached");
		SelectGarage("2-Car-Attached");
		SelectGarage("3-Car-Attached");
		SelectGarage("1-Car-Built-in");
		SelectGarage("2-Car-Built-in");
		SelectGarage("3-Car-Built-in");
		SelectGarage("1-Car-Carport");
		SelectGarage("2-Car-Carport");
	}
	
	public void wp_kitchengrade()
	{
		SelectKitchenGrade("Custom");
		SelectKitchenGrade("Builder's Grade");
		SelectKitchenGrade("Semi Custom");
		SelectKitchenGrade("Designer");
	}
	
	public void wp_wooddeck()
	{
		SelectDeck("None");
		SelectDeck("Wood Deck");
		SelectDeck("Composite Deck");
		SelectDeck("RedWook Deck");
	}
	
	public void wp_centralair()
	{
		SelectCentralHeatAir("None");
		SelectCentralHeatAir("Central Air Conditioning");
		SelectCentralHeatAir("Evaporative Cooler");
		SelectCentralHeatAir("Whole House Fan");
		SelectCentralHeatAir("Heat Pump, HE (System)");
		SelectCentralHeatAir("Humidifier, Furnace");
	}
	
	public void wp_heatsource()
	{
		SelectHeatSource("None");
		SelectHeatSource("Radiant Floor Heating");
		SelectHeatSource("Geothermal, Closed Loop");
		SelectHeatSource("Geothermal, Open Loop");
		SelectHeatSource("Electric");
		SelectHeatSource("Gas Forced Air");
		SelectHeatSource("Heat Pump");
		SelectHeatSource("Oil Forced Air");
		SelectHeatSource("Propane Gas Forced Air");
		SelectHeatSource("Gas Hot Water");
		SelectHeatSource("Oil Hot Water");
		SelectHeatSource("Propane Gas Hot Water");
	}
	
	/////////////////////////////////////////////////////////
	////////////////////////////////////////////////////////
	///////////////////////////////////////////////////////
	
	public void edit_numStories()
	{
		String condo1storyerr = driver.findElement(By.xpath("//*[@id=\"tblErrorMessages\"]/tbody/tr/td")).getText();
		Log("***** Condo Error 1: " + condo1storyerr + " *****");
		
		SelectNumStories("Condo 2 Stories");
		ClickNext();
		String condo2storyerr = driver.findElement(By.xpath("//*[@id=\"tblErrorMessages\"]/tbody/tr/td")).getText();
		Log("***** Condo Error 2: " + condo2storyerr+ " *****");
		
		SelectNumStories("Condo 3 Stories");
		ClickNext();
		String condo3storyerr = driver.findElement(By.xpath("//*[@id=\"tblErrorMessages\"]/tbody/tr/td")).getText();
		Log("***** Condo Error 3: " + condo3storyerr + " *****");		
		
		SelectNumStories("Condo 4-7 Stories");
		ClickNext();
		String condo47storyerr = driver.findElement(By.xpath("//*[@id=\"tblErrorMessages\"]/tbody/tr/td")).getText();
		Log("***** Condo Error 2: " + condo47storyerr + " *****");
		
		SelectNumStories("Condo 8-14 Stories");
		ClickNext();
		String condo814storyerr = driver.findElement(By.xpath("//*[@id=\"tblErrorMessages\"]/tbody/tr/td")).getText();
		Log("***** Condo Error 5: " + condo814storyerr + " *****");
		
		SelectNumStories("Condo 15+ Stories");
		ClickNext();
		String cond15storyerr = driver.findElement(By.xpath("//*[@id=\"tblErrorMessages\"]/tbody/tr/td")).getText();
		Log("***** Condo Error 6: " + cond15storyerr + " *****");
		
	}
	
	public void edit_substructure() throws InterruptedException
	{
		SelectSubstructure("BD");
		ClickNext();
		String basedaylighterr = driver.findElement(By.xpath("//*[@id=\"tblErrorMessages\"]/tbody/tr/td")).getText();
		Log("Substructure Error 1: " + basedaylighterr);
		
		SelectSubstructure("BW");
		ClickNext();
		String substruct2 = driver.findElement(By.xpath("//*[@id=\"tblErrorMessages\"]/tbody/tr/td")).getText();
		Log("Substructure: " + substruct2);
		
		SelectSubstructure("BBG");
		ClickNext();
		String substruct3 = driver.findElement(By.xpath("//*[@id=\"tblErrorMessages\"]/tbody/tr/td")).getText();
		Log("Substructure: " + substruct3);
		
		TypeBasementPctFinished("0");
		SelectGarage("None");
		SelectNumStories("BL");
		
		SelectSubstructure("O");
		ClickNext();
		String substruct4 = driver.findElement(By.xpath("//*[@id=\"tblErrorMessages\"]/tbody/tr/td")).getText();
		Log("Substructure: " + substruct4);
		
		SelectSubstructure("P");
		ClickNext();
		String substruct5 = driver.findElement(By.xpath("//*[@id=\"tblErrorMessages\"]/tbody/tr/td")).getText();
		Log("Substructure: " + substruct5);
		
		SelectSubstructure("P/O");
		ClickNext();
		String substruct6 = driver.findElement(By.xpath("//*[@id=\"tblErrorMessages\"]/tbody/tr/td")).getText();
		Log("Substructure: " + substruct6);

		SelectSubstructure("P/C");
		ClickNext();
		String substruct7 = driver.findElement(By.xpath("//*[@id=\"tblErrorMessages\"]/tbody/tr/td")).getText();
		Log("Substructure Error 7: " + substruct7);
		
		SelectSubstructure("PL");
		ClickNext();
		String substruct8 = driver.findElement(By.xpath("//*[@id=\"tblErrorMessages\"]/tbody/tr/td")).getText();
		Log("Substructure Error 8: " + substruct8);
		
		SelectSubstructure("SOH");
		ClickNext();
		String substruct9 = driver.findElement(By.xpath("//*[@id=\"tblErrorMessages\"]/tbody/tr/td")).getText();
		Log("Substructure Error 9: " + substruct9);
	}
	
	public void edit_superior_roofMaterial()
	{
		SelectRoofingMaterial("AB");
		ClickNext();
		String roofmat1 = driver.findElement(By.xpath("//*[@id=\"tblErrorMessages\"]/tbody/tr/td")).getText();
		Log("Roof Material Error 1: " + roofmat1);
		
		SelectRoofingMaterial("WK");
		ClickNext();
		String roofmat2 = driver.findElement(By.xpath("//*[@id=\"tblErrorMessages\"]/tbody/tr/td")).getText();
		Log("Roof Material Error 2: " + roofmat2);
		
		SelectRoofingMaterial("CT");
		ClickNext();
		String roofmat3 = driver.findElement(By.xpath("//*[@id=\"tblErrorMessages\"]/tbody/tr/td")).getText();
		Log("Roof Material Error 3: " + roofmat3);
		
		SelectRoofingMaterial("SL");
		ClickNext();
		String roofmat4 = driver.findElement(By.xpath("//*[@id=\"tblErrorMessages\"]/tbody/tr/td")).getText();
		Log("Roof Material Error 4: " + roofmat4);
		
		SelectRoofingMaterial("RR");
		ClickNext();
		String roofmat5 = driver.findElement(By.xpath("//*[@id=\"tblErrorMessages\"]/tbody/tr/td")).getText();
		Log("Roof Material Error 5: " + roofmat5);
		
		SelectRoofingMaterial("AS");
		ClickNext();
		String roofmat6 = driver.findElement(By.xpath("//*[@id=\"tblErrorMessages\"]/tbody/tr/td")).getText();
		Log("Roof Material Error 1: " + roofmat6);
		
		SelectRoofingMaterial("AC");
		ClickNext();
		String roofmat7 = driver.findElement(By.xpath("//*[@id=\"tblErrorMessages\"]/tbody/tr/td")).getText();
		Log("Roof Material Error 5: " + roofmat7);
		
		SelectRoofingMaterial("RB");
		ClickNext();
		String roofmat8 = driver.findElement(By.xpath("//*[@id=\"tblErrorMessages\"]/tbody/tr/td")).getText();
		Log("Roof Material Error 1: " + roofmat8);
		
		SelectRoofingMaterial("WS");
		ClickNext();
		String roofmat9 = driver.findElement(By.xpath("//*[@id=\"tblErrorMessages\"]/tbody/tr/td")).getText();
		Log("Roof Material Error 1: " + roofmat9);
	
		SelectRoofingMaterial("O");
		ClickNext();
		String roofmat10 = driver.findElement(By.xpath("//*[@id=\"tblErrorMessages\"]/tbody/tr/td")).getText();
		Log("Roof Material Error 1: " + roofmat10);
		
		SelectRoofingMaterial("CS");
		ClickNext();
		String roofmat11 = driver.findElement(By.xpath("//*[@id=\"tblErrorMessages\"]/tbody/tr/td")).getText();
		Log("Roof Material Error 1: " + roofmat11);
		
		SelectRoofingMaterial("BT");
		ClickNext();
		String roofmat12 = driver.findElement(By.xpath("//*[@id=\"tblErrorMessages\"]/tbody/tr/td")).getText();
		Log("Roof Material Error 1: " + roofmat12);
	
		SelectRoofingMaterial("FT");
		ClickNext();
		String roofmat13 = driver.findElement(By.xpath("//*[@id=\"tblErrorMessages\"]/tbody/tr/td")).getText();
		Log("Roof Material Error 1: " + roofmat13);
		// Change to Clay
		SelectRoofingMaterial("CL");
		ClickNext();
		String roofmat14 = driver.findElement(By.xpath("//*[@id=\"tblErrorMessages\"]/tbody/tr/td")).getText();
		Log("Roof Material Error 1: " + roofmat14);
		
		SelectRoofingMaterial("M");
		ClickNext();
		String roofmat15 = driver.findElement(By.xpath("//*[@id=\"tblErrorMessages\"]/tbody/tr/td")).getText();
		Log("Roof Material Error 1: " + roofmat15);
	
		SelectRoofingMaterial("TG");
		ClickNext();
		String roofmat16 = driver.findElement(By.xpath("//*[@id=\"tblErrorMessages\"]/tbody/tr/td")).getText();
		Log("Roof Material Error 1: " + roofmat16);
	}
	
	
	public void edit_frame_roofMaterial()
	{
		SelectRoofingMaterial("AB");
		ClickNext();
		String roofmat1 = driver.findElement(By.xpath("//*[@id=\"tblErrorMessages\"]/tbody/tr/td")).getText();
		Log("Roof Material Error 1: " + roofmat1);
		
		SelectRoofingMaterial("WK");
		ClickNext();
		String roofmat2 = driver.findElement(By.xpath("//*[@id=\"tblErrorMessages\"]/tbody/tr/td")).getText();
		Log("Roof Material Error 2: " + roofmat2);
		
		SelectRoofingMaterial("AC");
		ClickNext();
		String roofmat7 = driver.findElement(By.xpath("//*[@id=\"tblErrorMessages\"]/tbody/tr/td")).getText();
		Log("Roof Material Error 5: " + roofmat7);
		
		SelectRoofingMaterial("WS");
		ClickNext();
		String roofmat9 = driver.findElement(By.xpath("//*[@id=\"tblErrorMessages\"]/tbody/tr/td")).getText();
		Log("Roof Material Error 1: " + roofmat9);
		
		SelectRoofingMaterial("RR");
		ClickNext();
		String roofmat5 = driver.findElement(By.xpath("//*[@id=\"tblErrorMessages\"]/tbody/tr/td")).getText();
		Log("Roof Material Error 5: " + roofmat5);
		
		SelectRoofingMaterial("TG");
		ClickNext();
		String roofmat16 = driver.findElement(By.xpath("//*[@id=\"tblErrorMessages\"]/tbody/tr/td")).getText();
		Log("Roof Material Error 1: " + roofmat16);
		
		TypeYearHomeBuilt("1985");
		TypeYearRoofInstalled("1985");
		
		SelectRoofingMaterial("CS");
		ClickNext();
		String roofmat11 = driver.findElement(By.xpath("//*[@id=\"tblErrorMessages\"]/tbody/tr/td")).getText();
		Log("Roof Material Error 1: " + roofmat11);
		
		SelectRoofingMaterial("O");
		ClickNext();
		String roofmat10 = driver.findElement(By.xpath("//*[@id=\"tblErrorMessages\"]/tbody/tr/td")).getText();
		Log("Roof Material Error 1: " + roofmat10);
		
		SelectRoofingMaterial("AS");
		ClickNext();
		String roofmat6 = driver.findElement(By.xpath("//*[@id=\"tblErrorMessages\"]/tbody/tr/td")).getText();
		Log("Roof Material Error 1: " + roofmat6);
		
		TypeYearHomeBuilt("1970");
		TypeYearRoofInstalled("1970");
		
		SelectRoofingMaterial("FT");
		ClickNext();
		String roofmat13 = driver.findElement(By.xpath("//*[@id=\"tblErrorMessages\"]/tbody/tr/td")).getText();
		Log("Roof Material Error 1: " + roofmat13);
		
		SelectRoofingMaterial("BT");
		ClickNext();
		String roofmat12 = driver.findElement(By.xpath("//*[@id=\"tblErrorMessages\"]/tbody/tr/td")).getText();
		Log("Roof Material Error 1: " + roofmat12);
		
		SelectRoofingMaterial("CT");
		ClickNext();
		String roofmat3 = driver.findElement(By.xpath("//*[@id=\"tblErrorMessages\"]/tbody/tr/td")).getText();
		Log("Roof Material Error 3: " + roofmat3);
		
		SelectRoofingMaterial("M");
		ClickNext();
		String roofmat15 = driver.findElement(By.xpath("//*[@id=\"tblErrorMessages\"]/tbody/tr/td")).getText();
		Log("Roof Material Error 1: " + roofmat15);
		
		TypeYearHomeBuilt("1950");
		TypeYearRoofInstalled("1950");
		
		SelectRoofingMaterial("PC");
		ClickNext();
		String roofmat17 = driver.findElement(By.xpath("//*[@id=\"tblErrorMessages\"]/tbody/tr/td")).getText();
		Log("Roof Material Error 1: " + roofmat17);
		
		SelectRoofingMaterial("SC");
		ClickNext();
		String roofmat18 = driver.findElement(By.xpath("//*[@id=\"tblErrorMessages\"]/tbody/tr/td")).getText();
		Log("Roof Material Error 1: " + roofmat18);
		
		SelectRoofingMaterial("SL");
		ClickNext();
		String roofmat4 = driver.findElement(By.xpath("//*[@id=\"tblErrorMessages\"]/tbody/tr/td")).getText();
		Log("Roof Material Error 4: " + roofmat4);
		
		
	}
	
	
	
	public void edit_exteriorwalls()
	{
		SelectExteriorWalls("Wood Shake Siding");
		ClickNext();
		String extwall1 = driver.findElement(By.xpath("//*[@id=\"tblErrorMessages\"]/tbody/tr/td")).getText();
		Log("Exterior Wall Error 1: " + extwall1);
		
		SelectExteriorWalls("Asbestos Siding");
		ClickNext();
		String extwall2 = driver.findElement(By.xpath("//*[@id=\"tblErrorMessages\"]/tbody/tr/td")).getText();
		Log("Exterior Wall Error 2: " + extwall2);
		
		SelectExteriorWalls("Masonite Siding");
		ClickNext();
		String extwall3 = driver.findElement(By.xpath("//*[@id=\"tblErrorMessages\"]/tbody/tr/td")).getText();
		Log("Exterior Wall Error 3: " + extwall3);
		
		
		SelectExteriorWalls("EIFS or Dryvit Siding");
		ClickNext();
		String extwall4 = driver.findElement(By.xpath("//*[@id=\"tblErrorMessages\"]/tbody/tr/td")).getText();
		Log("Exterior Wall Error 4: " + extwall4);
		
		SelectExteriorWalls("Logs, Solid");
		ClickNext();
		String extwall5 = driver.findElement(By.xpath("//*[@id=\"tblErrorMessages\"]/tbody/tr/td")).getText();
		Log("Exterior Wall Error 5: " + extwall5);	
	}
}