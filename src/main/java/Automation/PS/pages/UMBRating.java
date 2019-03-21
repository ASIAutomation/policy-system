package Automation.PS.pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import Automation.PS.testBase.TestBase;

public class UMBRating extends TestBase {	
	
	public static final Logger log = Logger.getLogger(UMBRating.class.getName());
	
	WebDriver driver;
	
	@FindBy(id="tdPolicyID")//Button
	WebElement policyid;
	
	@FindBy(id="Label_06")//Text
	WebElement desiredlimitext;

	@FindBy(id="Covg_06")//Drop Down
	WebElement desiredlimit;
	
	@FindBy(id="Covg_15U")//Drop Down
	WebElement millionmotorist;
	
	@FindBy(id="Label_04U")//Drop Down
	WebElement residentialproperties12text;
	
	@FindBy(id="Covg_04U")//Drop Down
	WebElement residentialproperties12;
	
	@FindBy(id="Covg_05U")//Drop Down
	WebElement residentialproperties34;
	
	@FindBy(id="Covg_25U")//Drop Down
	WebElement swimmingpool;
	
	@FindBy(id="Covg_03U")//Drop Down
	WebElement autos;
	
	@FindBy(id="Covg_01U")//Drop Down
	WebElement motorcyclesmopeds;
	
	@FindBy(id="Covg_27U")//Drop Down
	WebElement motorhomes;
	
	@FindBy(id="Covg_13U")//Drop Down
	WebElement watercraftmaxspeed75hp0;
	
	@FindBy(id="Covg_14U")//Drop Down
	WebElement watercraftmaxspeed75hp151;
	
	@FindBy(id="Covg_14W")//Drop Down
	WebElement watercraftmaxspeed75hp300;
	
	@FindBy(id="Label_06U")//Text
	WebElement adultstext;
	
	@FindBy(id="Covg_06U")//Drop Down
	WebElement adults;
	
	@FindBy(id="Label_07U")//Text
	WebElement underwithcleantext;
	
	@FindBy(id="Covg_07U")//Drop Down
	WebElement underwithclean;
	
	@FindBy(id="Label_08U")//Text
	WebElement underwithoutcleantext;
	
	@FindBy(id="Covg_08U")//Drop Down
	WebElement underwithoutclean;
	
	@FindBy(id="Label_09U")//Text
	WebElement licesnsedlesstext;
	
	@FindBy(id="Covg_09U")//Drop Down
	WebElement licesnsedless;
	
	@FindBy(id="Covg_30U")//Drop Down
	WebElement adults80plus;
	
	@FindBy(id="Covg_11U")//Drop Down
	WebElement atfault;
	
	@FindBy(id="Covg_10U")//Drop Down
	WebElement movingviolation;
	
	@FindBy(id="Covg_32U")//Drop Down
	WebElement majorviolation;
	
	@FindBy(id="Label_12A")//Text
	WebElement incrpropliabtext;
	
	@FindBy(id="Covg_12A")//Drop Down
	WebElement incrpropliab;
	
	@FindBy(xpath="//label[@for='Covg_22U']")//Check Box
	WebElement packagepoltext;
	
	@FindBy(id="Covg_22U")//Check Box
	WebElement packagepol;
	
	@FindBy(id="Covg_57")//Check Box
	WebElement epolicy;
	
	@FindBy(id="Covg_12B")//Check Box
	WebElement autoliabsurcharge;
	
	@FindBy(id="Covg_26H")//Check Box
	WebElement trampoline;
	
	@FindBy(id="Covg_26G")//Drop Down
	WebElement dangerdog;
	
	@FindBy(id="btnNext")//Button
	WebElement next;
	
	@FindBy(id="btnSave")//Button
	WebElement save;
	
	@FindBy(id="btnOverride")//Button
	WebElement override;
	
	//Constructor
	public UMBRating(WebDriver driver)	{
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
	
	//Selects "Desired Limit" from drop down
	public void SelectDesiredLimit(String SelectDesiredLimit) {
		if(!SelectDesiredLimit.toUpperCase().equals("N/A")) {
			switch(SelectDesiredLimit.toUpperCase()) {
				case "1": case "$1 MILLION (INCLUDED)": case "1 MILLION (INCLUDED)":	new Select(desiredlimit).selectByVisibleText("$1 million (Included)");
																							Log("Entered " + desiredlimitext.getText() + ": $1 million (Included)");
																						break;
										
				case "2": case "$2 MILLION": case "2 MILLION":							new Select(desiredlimit).selectByVisibleText("$2 million");
																							Log("Entered " + desiredlimitext.getText() + ": $2 million");
																						break;
										
				case "3": case "$3 MILLION": case "3 MILLION":							new Select(desiredlimit).selectByVisibleText("$3 million");
																							Log("Entered " + desiredlimitext.getText() + ": $3 million");
																						break;
			
				case "4": case "$4 MILLION": case "4 MILLION":							new Select(desiredlimit).selectByVisibleText("$4 million");
																							Log("Entered " + desiredlimitext.getText() + ": $4 million");
																						break;	
			
				case "5": case "$5 MILLION": case "5 MILLION":							new Select(desiredlimit).selectByVisibleText("$5 million");
																							Log("Entered " + desiredlimitext.getText() + ": $5 million");
																						break;
														
				default:																	Log("Invalid value for SelectDesiredLimit()");
																						break;
			}			
		}
	}
	
	//Selects "1 Million Uninsured/Underinsured Motorist" from drop down
	public void Select1MillionUninsuredUnderinsuredMotorist(String Select1MillionUninsuredUnderinsuredMotorist) {
		if(!Select1MillionUninsuredUnderinsuredMotorist.toUpperCase().equals("N/A")) {
			switch(Select1MillionUninsuredUnderinsuredMotorist.toUpperCase()) {
				case "Y": case "YES":	new Select(millionmotorist).selectByVisibleText("Yes");
											Log("Entered 1 Million Uninsured/Underinsured Motorist: Yes");
										break;
											
				case "N": case "NO":	new Select(millionmotorist).selectByVisibleText("No");
											Log("Entered 1 Million Uninsured/Underinsured Motorist: No");
										break;
			}
		}
	}

	//Selects "Residential Properties (1-2 Family)" from drop down
	public void SelectResidentialProperties1to2Family(String SelectResidentialProperties1to2Family) {
		if(!SelectResidentialProperties1to2Family.toUpperCase().equals("N/A")) {
			switch(SelectResidentialProperties1to2Family.toUpperCase()) {
				case "0": case "N": case "NO": case "NONE":	new Select(residentialproperties12).selectByVisibleText("0");
																Log("Entered " + residentialproperties12text.getText() + ": 0");
															break;
															
				case "1":									new Select(residentialproperties12).selectByVisibleText("1");
																Log("Entered " + residentialproperties12text.getText() + ": 1");
															break;
					
				case "2":									new Select(residentialproperties12).selectByVisibleText("2");
																Log("Entered " + residentialproperties12text.getText() + ": 2");
															break;
					
				case "3":									new Select(residentialproperties12).selectByVisibleText("3");
																Log("Entered " + residentialproperties12text.getText() + ": 3");
															break;
					
				case "4":									new Select(residentialproperties12).selectByVisibleText("4");
																Log("Entered " + residentialproperties12text.getText() + ": 4");
															break;
					
				case "5":									new Select(residentialproperties12).selectByVisibleText("5");
																Log("Entered " + residentialproperties12text.getText() + ": 5");
															break;
					
				case "6":									new Select(residentialproperties12).selectByVisibleText("6");
																Log("Entered " + residentialproperties12text.getText() + ": 6");
															break;
															
				default:										Log("Invalid value for SelectResidentialProperties1to2Family()");
															break;			
			}
		}
	}

	//Selects "Residential Properties (3-4 Family)" from drop down
	public void SelectResidentialProperties3to4Family(String SelectResidentialProperties3to4Family) {
		if(!SelectResidentialProperties3to4Family.toUpperCase().equals("N/A")) {
			switch(SelectResidentialProperties3to4Family.toUpperCase()) {
				case "0": case "N": case "NO": case "NONE":	new Select(residentialproperties34).selectByVisibleText("0");
																Log("Entered Residential Properties (3-4 Family): 0");
															break;
															
				case "1":									new Select(residentialproperties34).selectByVisibleText("1");
																Log("Entered Residential Properties (3-4 Family): 1");
															break;
					
				case "2":									new Select(residentialproperties34).selectByVisibleText("2");
																Log("Entered Residential Properties (3-4 Family): 2");
															break;
					
				case "3":									new Select(residentialproperties34).selectByVisibleText("3");
																Log("Entered Residential Properties (3-4 Family): 3");
															break;
					
				case "4":									new Select(residentialproperties34).selectByVisibleText("4");
																Log("Entered Residential Properties (3-4 Family): 4");
															break;
					
				case "5":									new Select(residentialproperties34).selectByVisibleText("5");
																Log("Entered Residential Properties (3-4 Family): 5");
															break;
					
				case "6":									new Select(residentialproperties34).selectByVisibleText("6");
																Log("Entered Residential Properties (3-4 Family): 6");
															break;
															
				default:										Log("Invalid value for SelectResidentialProperties3to4Family()");
															break;		
			}
		}
	}

	//Selects "Swimming Pool/Spas" from drop down
	public void SelectSwimmingPoolSpas(String SelectSwimmingPoolSpas) {
		if(!SelectSwimmingPoolSpas.toUpperCase().equals("N/A")) {
			switch(SelectSwimmingPoolSpas.toUpperCase()) {
				case "0": case "N": case "NO": case "NONE":	new Select(swimmingpool).selectByVisibleText("0");
																Log("Entered Swimming Pool/Spas: 0");
															break;
															
				case "1":									new Select(swimmingpool).selectByVisibleText("1");
																Log("Entered Swimming Pool/Spas: 1");
															break;
					
				case "2":									new Select(swimmingpool).selectByVisibleText("2");
																Log("Entered Swimming Pool/Spas: 2");
															break;
					
				case "3":									new Select(swimmingpool).selectByVisibleText("3");
																Log("Entered Swimming Pool/Spas: 3");
															break;
					
				case "4":									new Select(swimmingpool).selectByVisibleText("4");
																Log("Entered Swimming Pool/Spas: 4");
															break;
					
				case "5":									new Select(swimmingpool).selectByVisibleText("5");
																Log("Entered Swimming Pool/Spas: 5");
															break;
					
				case "6":									new Select(swimmingpool).selectByVisibleText("6");
																Log("Entered Swimming Pool/Spas: 6");
															break;
															
				default:										Log("Invalid value for SelectSwimmingPoolSpas()");
															break;		
			}
		}
	}

	//Selects "Autos" from drop down
	public void SelectAutos(String SelectAutos) {
		if(!SelectAutos.toUpperCase().equals("N/A")) {
			switch(SelectAutos.toUpperCase()) {
				case "0": case "N": case "NO": case "NONE":	new Select(autos).selectByVisibleText("0");
																Log("Entered Autos: 0");
															break;
															
				case "1":									new Select(autos).selectByVisibleText("1");
																Log("Entered Autos: 1");
															break;
					
				case "2":									new Select(autos).selectByVisibleText("2");
																Log("Entered Autos: 2");
															break;
					
				case "3":									new Select(autos).selectByVisibleText("3");
																Log("Entered Autos: 3");
															break;
					
				case "4":									new Select(autos).selectByVisibleText("4");
																Log("Entered Autos: 4");
															break;
					
				case "5":									new Select(autos).selectByVisibleText("5");
																Log("Entered Autos: 5");
															break;
					
				case "6":									new Select(autos).selectByVisibleText("6");
																Log("Entered Autos: 6");
															break;
															
				case "7":									new Select(autos).selectByVisibleText("7");
																Log("Entered Autos: 7");
															break;

				case "8":									new Select(autos).selectByVisibleText("8");
																Log("Entered Autos: 8");
															break;

				case "9":									new Select(autos).selectByVisibleText("9");
																Log("Entered Autos: 9");
															break;
															
				default:										Log("Invalid value for SelectAutos()");
															break;		
			}
		}
	}

	//Selects "Motorcycles/Mopeds" from drop down
	public void SelectMotorcyclesMopeds(String SelectMotorcyclesMopeds) {
		if(!SelectMotorcyclesMopeds.toUpperCase().equals("N/A")) {
			switch(SelectMotorcyclesMopeds.toUpperCase()) {
				case "0": case "N": case "NO": case "NONE":		Log("Entered Motorcycles/Mopeds: None");
															break;
															
				case "1":									new Select(motorcyclesmopeds).selectByVisibleText("1");
																Log("Entered Motorcycles/Mopeds: 1");
															break;
					
				case "2":									new Select(motorcyclesmopeds).selectByVisibleText("2");
																Log("Entered Motorcycles/Mopeds: 2");
															break;
					
				case "3":									new Select(motorcyclesmopeds).selectByVisibleText("3");
																Log("Entered Motorcycles/Mopeds: 3");
															break;
					
				case "4":									new Select(motorcyclesmopeds).selectByVisibleText("4");
																Log("Entered Motorcycles/Mopeds: 4");
															break;
					
				case "5":									new Select(motorcyclesmopeds).selectByVisibleText("5");
																Log("Entered Motorcycles/Mopeds: 5");
															break;
					
				case "6":									new Select(motorcyclesmopeds).selectByVisibleText("6");
																Log("Entered Motorcycles/Mopeds: 6");
															break;
															
				default:										Log("Invalid value for SelectMotorcyclesMopeds()");
															break;
			}
		}
	}

	//Selects "Motorhomes and other Recreational Vehicles" from drop down
	public void SelectMotorhomesAndOtherRecreationalVehicles(String SelectMotorhomesAndOtherRecreationalVehicles) {
		if(!SelectMotorhomesAndOtherRecreationalVehicles.toUpperCase().equals("N/A")) {
			switch(SelectMotorhomesAndOtherRecreationalVehicles.toUpperCase()) {
				case "0": case "N": case "NO": case "NONE":		Log("Entered Motorhomes and other Recreational Vehicles: None");
															break;
															
				case "1":									new Select(motorhomes).selectByVisibleText("1");
																Log("Entered Motorhomes and other Recreational Vehicles: 1");
															break;
					
				case "2":									new Select(motorhomes).selectByVisibleText("2");
																Log("Entered Motorhomes and other Recreational Vehicles: 2");
															break;
					
				case "3":									new Select(motorhomes).selectByVisibleText("3");
																Log("Entered Motorhomes and other Recreational Vehicles: 3");
															break;
					
				case "4":									new Select(motorhomes).selectByVisibleText("4");
																Log("Entered Motorhomes and other Recreational Vehicles: 4");
															break;
					
				case "5":									new Select(motorhomes).selectByVisibleText("5");
																Log("Entered Motorhomes and other Recreational Vehicles: 5");
															break;
															
				default:										Log("Invalid value for SelectMotorhomesAndOtherRecreationalVehicles()");
															break;
			}
		}
	}

	//Selects "0-150 hp with maximum speed of 75 mph" from drop down
	public void Select0to150HPWithMaximumSpeedOf75MPH(String Select0to150HPWithMaximumSpeedOf75MPH) {
		if(!Select0to150HPWithMaximumSpeedOf75MPH.toUpperCase().equals("N/A")) {
			switch(Select0to150HPWithMaximumSpeedOf75MPH.toUpperCase()) {
				case "0": case "N": case "NO": case "NONE":		Log("Entered 0-150 hp with maximum speed of 75 mph: None");
															break;
															
				case "1":									new Select(watercraftmaxspeed75hp0).selectByVisibleText("1");
																Log("Entered 0-150 hp with maximum speed of 75 mph: 1");
															break;
					
				case "2":									new Select(watercraftmaxspeed75hp0).selectByVisibleText("2");
																Log("Entered 0-150 hp with maximum speed of 75 mph: 2");
															break;
					
				case "3":									new Select(watercraftmaxspeed75hp0).selectByVisibleText("3");
																Log("Entered 0-150 hp with maximum speed of 75 mph: 3");
															break;
															
				default:										Log("Invalid value for Select0to150HPWithMaximumSpeedOf75MPH()");
															break;
			}
		}
	}

	//Selects "151-300 hp with maximum speed of 75 mph" from drop down
	public void Select151to300HPWithMaximumSpeedOf75MPH(String Select151to300HPWithMaximumSpeedOf75MPH) {
		if(!Select151to300HPWithMaximumSpeedOf75MPH.toUpperCase().equals("N/A")) {
			switch(Select151to300HPWithMaximumSpeedOf75MPH.toUpperCase()) {
				case "0": case "N": case "NO": case "NONE":		Log("Entered 151-300 hp with maximum speed of 75 mph: None");
															break;
															
				case "1":									new Select(watercraftmaxspeed75hp151).selectByVisibleText("1");
																Log("Entered 151-300 hp with maximum speed of 75 mph: 1");
															break;
					
				case "2":									new Select(watercraftmaxspeed75hp151).selectByVisibleText("2");
																Log("Entered 151-300 hp with maximum speed of 75 mph: 2");
															break;
					
				case "3":									new Select(watercraftmaxspeed75hp151).selectByVisibleText("3");
																Log("Entered 151-300 hp with maximum speed of 75 mph: 3");
															break;
															
				default:										Log("Invalid value for Select151to300HPWithMaximumSpeedOf75MPH()");
															break;
			}
		}
	}

	//Selects "Over 300 hp with maximum speed of 75 mph" from drop down
	public void SelectOver300HPWithMaximumSpeedOf75MPH(String SelectOver300HPWithMaximumSpeedOf75MPH) {
		if(!SelectOver300HPWithMaximumSpeedOf75MPH.toUpperCase().equals("N/A")) {
			switch(SelectOver300HPWithMaximumSpeedOf75MPH.toUpperCase()) {
				case "0": case "N": case "NO": case "NONE":		Log("Entered Over 300 hp with maximum speed of 75 mph: None");
															break;
															
				case "1":									new Select(watercraftmaxspeed75hp300).selectByVisibleText("1");
																Log("Entered Over 300 hp with maximum speed of 75 mph: 1");
															break;
					
				case "2":									new Select(watercraftmaxspeed75hp300).selectByVisibleText("2");
																Log("Entered Over 300 hp with maximum speed of 75 mph: 2");
															break;
					
				case "3":									new Select(watercraftmaxspeed75hp300).selectByVisibleText("3");
																Log("Entered Over 300 hp with maximum speed of 75 mph: 3");
															break;
															
				default:										Log("Invalid value for SelectOver300HPWithMaximumSpeedOf75MPH()");
															break;
			}
		}
	}

	//Selects "Adults Aged # to #" from drop down
	public void SelectAdultsAged(String SelectAdultsAged) {
		if(!SelectAdultsAged.toUpperCase().equals("N/A")) {
			switch(SelectAdultsAged.toUpperCase()) {
				case "0": case "N": case "NO": case "NONE":	new Select(adults).selectByVisibleText("0");
																Log("Entered " + adultstext.getText() + ": 0");
															break;
															
				case "1":									new Select(adults).selectByVisibleText("1");
																Log("Entered " + adultstext.getText() + ": 1");
															break;
					
				case "2":									new Select(adults).selectByVisibleText("2");
																Log("Entered " + adultstext.getText() + ": 2");
															break;
					
				case "3":									new Select(adults).selectByVisibleText("3");
																Log("Entered " + adultstext.getText() + ": 3");
															break;
					
				case "4":									new Select(adults).selectByVisibleText("4");
																Log("Entered " + adultstext.getText() + ": 4");
															break;
					
				case "5":									new Select(adults).selectByVisibleText("5");
																Log("Entered " + adultstext.getText() + ": 5");
															break;
					
				case "6":									new Select(adults).selectByVisibleText("6");
																Log("Entered " + adultstext.getText() + ": 6");
															break;
															
				default:										Log("Invalid value for SelectAdultsAged()");
															break;		
			}
		}
	}

	//Selects "Under # with Clean Driving Record" from drop down
	public void SelectUnderWithCleanDrivingRecord(String SelectUnderWithCleanDrivingRecord) {
		if(!SelectUnderWithCleanDrivingRecord.toUpperCase().equals("N/A")) {
			switch(SelectUnderWithCleanDrivingRecord.toUpperCase()) {
				case "0": case "N": case "NO": case "NONE":	new Select(underwithclean).selectByVisibleText("0");
																Log("Entered " + underwithcleantext.getText() + ": 0");
															break;
															
				case "1":									new Select(underwithclean).selectByVisibleText("1");
																Log("Entered " + underwithcleantext.getText() + ": 1");
															break;
					
				case "2":									new Select(underwithclean).selectByVisibleText("2");
																Log("Entered " + underwithcleantext.getText() + ": 2");
															break;
					
				case "3":									new Select(underwithclean).selectByVisibleText("3");
																Log("Entered " + underwithcleantext.getText() + ": 3");
															break;
					
				case "4":									new Select(underwithclean).selectByVisibleText("4");
																Log("Entered " + underwithcleantext.getText() + ": 4");
															break;
					
				case "5":									new Select(underwithclean).selectByVisibleText("5");
																Log("Entered " + underwithcleantext.getText() + ": 5");
															break;
					
				case "6":									new Select(underwithclean).selectByVisibleText("6");
																Log("Entered " + underwithcleantext.getText() + ": 6");
															break;
															
				default:										Log("Invalid value for SelectUnderWithCleanDrivingRecord()");
															break;		
			}
		}
	}

	//Selects "Under # without Clean Driving Record" from drop down
	public void SelectUnderWithoutCleanDrivingRecord(String SelectUnderWithoutCleanDrivingRecord) {
		if(!SelectUnderWithoutCleanDrivingRecord.toUpperCase().equals("N/A")) {
			switch(SelectUnderWithoutCleanDrivingRecord.toUpperCase()) {
				case "0": case "N": case "NO": case "NONE":	new Select(underwithoutclean).selectByVisibleText("0");
																Log("Entered " + underwithoutcleantext.getText() + ": 0");
															break;
															
				case "1":									new Select(underwithoutclean).selectByVisibleText("1");
																Log("Entered " + underwithoutcleantext.getText() + ": 1");
															break;
					
				case "2":									new Select(underwithoutclean).selectByVisibleText("2");
																Log("Entered " + underwithoutcleantext.getText() + ": 2");
															break;
					
				case "3":									new Select(underwithoutclean).selectByVisibleText("3");
																Log("Entered " + underwithoutcleantext.getText() + ": 3");
															break;
					
				case "4":									new Select(underwithoutclean).selectByVisibleText("4");
																Log("Entered " + underwithoutcleantext.getText() + ": 4");
															break;
					
				case "5":									new Select(underwithoutclean).selectByVisibleText("5");
																Log("Entered " + underwithoutcleantext.getText() + ": 5");
															break;
					
				case "6":									new Select(underwithoutclean).selectByVisibleText("6");
																Log("Entered " + underwithoutcleantext.getText() + ": 6");
															break;
															
				default:										Log("Invalid value for SelectUnderWithoutCleanDrivingRecord()");
															break;		
			}
		}
	}

	//Selects "Licensed < # Years" from drop down
	public void SelectLicensedLessThan(String SelectLicensedLessThan) {
		if(!SelectLicensedLessThan.toUpperCase().equals("N/A")) {
			switch(SelectLicensedLessThan.toUpperCase()) {
				case "0": case "N": case "NO": case "NONE":	new Select(licesnsedless).selectByVisibleText("0");
																Log("Entered " + licesnsedlesstext.getText() + ": 0");
															break;
															
				case "1":									new Select(licesnsedless).selectByVisibleText("1");
																Log("Entered " + licesnsedlesstext.getText() + ": 1");
															break;
					
				case "2":									new Select(licesnsedless).selectByVisibleText("2");
																Log("Entered " + licesnsedlesstext.getText() + ": 2");
															break;
					
				case "3":									new Select(licesnsedless).selectByVisibleText("3");
																Log("Entered " + licesnsedlesstext.getText() + ": 3");
															break;
					
				case "4":									new Select(licesnsedless).selectByVisibleText("4");
																Log("Entered " + licesnsedlesstext.getText() + ": 4");
															break;
					
				case "5":									new Select(licesnsedless).selectByVisibleText("5");
																Log("Entered " + licesnsedlesstext.getText() + ": 5");
															break;
					
				case "6":									new Select(licesnsedless).selectByVisibleText("6");
																Log("Entered " + licesnsedlesstext.getText() + ": 6");
															break;
															
				default:										Log("Invalid value for SelectLicensedLessThan()");
															break;		
			}
		}
	}

	//Selects "Adults Aged 80 and Older" from drop down
	public void SelectAdultsAged80AndOlder(String SelectAdultsAged80AndOlder) {
		if(!SelectAdultsAged80AndOlder.toUpperCase().equals("N/A")) {
			switch(SelectAdultsAged80AndOlder.toUpperCase()) {
				case "0": case "N": case "NO": case "NONE":	new Select(adults80plus).selectByVisibleText("0");
																Log("Entered Adults Aged 80 and Older: 0");
															break;
															
				case "1":									new Select(adults80plus).selectByVisibleText("1");
																Log("Entered Adults Aged 80 and Older: 1");
															break;
					
				case "2":									new Select(adults80plus).selectByVisibleText("2");
																Log("Entered Adults Aged 80 and Older: 2");
															break;
					
				case "3":									new Select(adults80plus).selectByVisibleText("3");
																Log("Entered Adults Aged 80 and Older: 3");
															break;
					
				case "4":									new Select(adults80plus).selectByVisibleText("4");
																Log("Entered Adults Aged 80 and Older: 4");
															break;
					
				case "5":									new Select(adults80plus).selectByVisibleText("5");
																Log("Entered Adults Aged 80 and Older: 5");
															break;
					
				case "6":									new Select(adults80plus).selectByVisibleText("6");
																Log("Entered Adults Aged 80 and Older: 6");
															break;
															
				default:										Log("Invalid value for SelectAdultsAged80AndOlder()");
															break;		
			}
		}
	}

	//Selects "At Fault Accidents" from drop down
	public void SelectAtFaultAccidents(String SelectAtFaultAccidents) {
		if(!SelectAtFaultAccidents.toUpperCase().equals("N/A")) {
			switch(SelectAtFaultAccidents.toUpperCase()) {
				case "0": case "N": case "NO": case "NONE":	new Select(atfault).selectByVisibleText("0");
																Log("Entered At Fault Accidents: 0");
															break;
															
				case "1":									new Select(atfault).selectByVisibleText("1");
																Log("Entered At Fault Accidents: 1");
															break;
					
				case "2":									new Select(atfault).selectByVisibleText("2");
																Log("Entered At Fault Accidents: 2");
															break;
					
				case "3":									new Select(atfault).selectByVisibleText("3");
																Log("Entered At Fault Accidents: 3");
															break;
					
				case "4":									new Select(atfault).selectByVisibleText("4");
																Log("Entered At Fault Accidents: 4");
															break;
					
				case "5":									new Select(atfault).selectByVisibleText("5");
																Log("Entered At Fault Accidents: 5");
															break;
					
				case "6":									new Select(atfault).selectByVisibleText("6");
																Log("Entered At Fault Accidents: 6");
															break;
															
				default:										Log("Invalid value for SelectAtFaultAccidents()");
															break;		
			}
		}
	}

	//Selects "Moving Violation" from drop down
	public void SelectMovingViolation(String SelectMovingViolation) {
		if(!SelectMovingViolation.toUpperCase().equals("N/A")) {
			switch(SelectMovingViolation.toUpperCase()) {
				case "0": case "N": case "NO": case "NONE":	new Select(movingviolation).selectByVisibleText("0");
																Log("Entered Moving Violation: 0");
															break;
															
				case "1":									new Select(movingviolation).selectByVisibleText("1");
																Log("Entered Moving Violation: 1");
															break;
					
				case "2":									new Select(movingviolation).selectByVisibleText("2");
																Log("Entered Moving Violation: 2");
															break;
					
				case "3":									new Select(movingviolation).selectByVisibleText("3");
																Log("Entered Moving Violation: 3");
															break;
					
				case "4":									new Select(movingviolation).selectByVisibleText("4");
																Log("Entered Moving Violation: 4");
															break;
					
				case "5":									new Select(movingviolation).selectByVisibleText("5");
																Log("Entered Moving Violation: 5");
															break;
					
				case "6":									new Select(movingviolation).selectByVisibleText("6");
																Log("Entered Moving Violation: 6");
															break;
															
				default:										Log("Invalid value for SelectMovingViolation()");
															break;		
			}
		}
	}
	
	//Selects "Major Violation" from drop down
	public void SelectMajorViolation(String SelectMajorViolation) {
		if(!SelectMajorViolation.toUpperCase().equals("N/A")) {
			switch(SelectMajorViolation.toUpperCase()) {
				case "Y": case "YES":	new Select(majorviolation).selectByVisibleText("Yes");
											Log("Entered Major Violation: Yes");
										break;
											
				case "N": case "NO":	new Select(majorviolation).selectByVisibleText("No");
											Log("Entered Major Violation: No");
										break;
			}
		}
	}
	
	//Selects "Increased Underlying Liability" from drop down
	public void SelectIncreasedUnderlyingLiability(String SelectIncreasedUnderlyingLiability) {
		if(!SelectIncreasedUnderlyingLiability.toUpperCase().equals("N/A")) {
			switch(SelectIncreasedUnderlyingLiability.toUpperCase()) {
				case "<500K": case "<500": case "LESS THAN $500K":	new Select(incrpropliab).selectByVisibleText("Less than $500k");
																		Log("Entered " + incrpropliabtext.getText() + ": Less than $500k");
																	break;
											
				case ">500K": case ">500": case "$500K OR GREATER":	new Select(incrpropliab).selectByVisibleText("$500k or greater");
																		Log("Entered " + incrpropliabtext.getText() + ": $500k or greater");
																	break;
				
				default:												Log("Invalid value for SelectIncreasedUnderlyingLiability()");
																	break;
			}
		}
	}
	
	//Checks "ASI Package Policy Discount" check box 
	public void CheckASIPackagePolicyDiscount(String CheckASIPackagePolicyDiscount) {
		if(!CheckASIPackagePolicyDiscount.toUpperCase().equals("N/A")) {
			if(packagepol.isSelected()) {
				switch(CheckASIPackagePolicyDiscount.toUpperCase()) {
					case "Y": case "YES":		Log("\"" + packagepoltext.getText() + "\" check box marked");
											break;
											
					case "N": case "NO":	packagepol.click();
												Log("\"" + packagepoltext.getText() + "\" check box NOT marked");
											break;
				}
			}
			else {
				switch(CheckASIPackagePolicyDiscount.toUpperCase()) {
					case "Y": case "YES":	packagepol.click();
												Log("\"" + packagepoltext.getText() + "\" check box marked");
											break;
											
					case "N": case "NO":		Log("\"" + packagepoltext.getText() + "\" check box NOT marked");
											break;
				}			
			}
		}
	}

	//Checks "e-Policy Discount" check box 
	public void CheckEPolicyDiscount(String CheckEPolicyDiscount) {
		if(!CheckEPolicyDiscount.toUpperCase().equals("N/A")) {
			if(epolicy.isSelected()) {
				switch(CheckEPolicyDiscount.toUpperCase()) {
					case "Y": case "YES":		Log("\"e-Policy Discount\" check box marked");
											break;
											
					case "N": case "NO":	epolicy.click();
												Log("\"e-Policy Discount\" check box NOT marked");
											break;
				}
			}
			else {
				switch(CheckEPolicyDiscount.toUpperCase()) {
					case "Y": case "YES":	epolicy.click();
												Log("\"e-Policy Discount\" check box marked");
											break;
											
					case "N": case "NO":		Log("\"e-Policy Discount\" check box NOT marked");
											break;
				}			
			}
		}
	}

	//Checks "Underlying Auto Liability Surcharge" check box 
	public void CheckUnderlyingAutoLiabilitySurcharge(String CheckUnderlyingAutoLiabilitySurcharge) {
		if(!CheckUnderlyingAutoLiabilitySurcharge.toUpperCase().equals("N/A")) {
			if(autoliabsurcharge.isSelected()) {
				switch(CheckUnderlyingAutoLiabilitySurcharge.toUpperCase()) {
					case "Y": case "YES":		Log("\"Underlying Auto Liability Surcharge\" check box marked");
											break;
											
					case "N": case "NO":	autoliabsurcharge.click();
												Log("\"Underlying Auto Liability Surcharge\" check box NOT marked");
											break;
				}
			}
			else {
				switch(CheckUnderlyingAutoLiabilitySurcharge.toUpperCase()) {
					case "Y": case "YES":	autoliabsurcharge.click();
												Log("\"Underlying Auto Liability Surcharge\" check box marked");
											break;
											
					case "N": case "NO":		Log("\"Underlying Auto Liability Surcharge\" check box NOT marked");
											break;
				}			
			}
		}
	}

	//Checks "Trampoline on Premises" check box 
	public void CheckTrampolineOnPremises(String CheckTrampolineOnPremises) {
		if(!CheckTrampolineOnPremises.toUpperCase().equals("N/A")) {
			if(trampoline.isSelected()) {
				switch(CheckTrampolineOnPremises.toUpperCase()) {
					case "Y": case "YES":		Log("\"Trampoline on Premises\" check box marked");
											break;
											
					case "N": case "NO":	trampoline.click();
												Log("\"Trampoline on Premises\" check box NOT marked");
											break;
				}
			}
			else {
				switch(CheckTrampolineOnPremises.toUpperCase()) {
					case "Y": case "YES":	trampoline.click();
												Log("\"Trampoline on Premises\" check box marked");
											break;
											
					case "N": case "NO":		Log("\"Trampoline on Premises\" check box NOT marked");
											break;
				}			
			}
		}
	}

	//Selects "Dangerous breed of dog or animal" from drop down
	public void SelectDangerousBreedOfDogOrAnimal(String SelectDangerousBreedOfDogOrAnimal) {
		if(!SelectDangerousBreedOfDogOrAnimal.toUpperCase().equals("N/A")) {
			switch(SelectDangerousBreedOfDogOrAnimal.toUpperCase()) {
				case "0": case "N": case "NO": case "NONE":	new Select(dangerdog).selectByVisibleText("0");
																Log("Entered Dangerous breed of dog or animal: 0");
															break;
															
				case "1":									new Select(dangerdog).selectByVisibleText("1");
																Log("Entered Dangerous breed of dog or animal: 1");
															break;
					
				case "2":									new Select(dangerdog).selectByVisibleText("2");
																Log("Entered Dangerous breed of dog or animal: 2");
															break;
					
				case "3":									new Select(dangerdog).selectByVisibleText("3");
																Log("Entered Dangerous breed of dog or animal: 3");
															break;
					
				case "4":									new Select(dangerdog).selectByVisibleText("4");
																Log("Entered Dangerous breed of dog or animal: 4");
															break;
					
				case "5":									new Select(dangerdog).selectByVisibleText("5");
																Log("Entered Dangerous breed of dog or animal: 5");
															break;
					
				case "6":									new Select(dangerdog).selectByVisibleText("6");
																Log("Entered Dangerous breed of dog or animal: 6");
															break;
															
				default:										Log("Invalid value for SelectDangerousBreedOfDogOrAnimal()");
															break;		
			}
		}
	}
	
	//Returns the PolicyID
	public String ReturnPolicyID(String log) {
		if(log.toUpperCase().equals("Y") || log.toUpperCase().equals("YES")) {
			Log("PolicyID is " + policyid.getText());
		}
		return policyid.getText();
	}

	//Clicks the "Next" button
	public void ClickNext() {
		next.click();
			Log("Clicked the \"Next\" button on the Rating page");
	}

	//Clicks the "Save" button
	public void ClickSave() {
		save.click();
			Log("Clicked the \"Save\" button on the Rating page");
	}

	//Clicks the "Override" button
	public void ClickOverride() {
		override.click();
			Log("Clicked the \"Override\" button on the Get Started page");
	}
}