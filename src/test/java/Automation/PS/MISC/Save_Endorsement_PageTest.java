package Automation.PS.MISC;

import org.apache.log4j.*;
import Automation.PS.testBase.*;
import Automation.PS.pages.*;
import org.testng.annotations.*;
import java.awt.datatransfer.*;
import java.awt.event.*;
import java.awt.*;
//import com.aventstack.extentreports.*;

public class Save_Endorsement_PageTest extends TestBase
{

	public static final Logger log = Logger.getLogger(Save_Endorsement_PageTest.class.getName());
	
	RatingAndPolicyLookup RPL;
	PolicyHistory PH;
	PolicyRatingPage1 PRP1;
	PolicyRatingPage2 PRP2;
	PolicyPremiums PP;
	ApplicationPage AP;

	@DataProvider(name="Save_Endorsement_Pages")
	public String[][] GetSaveEndorsementPagesDataCall() 
	{
		String[][] data = GetData("Data", "Save_Endorsement_Pages", ".xlsx");
		return data;
	}
	
	@BeforeTest
	public void SetUp() 
	{
		RunBatches();
		SetLog();
			Log("====================================== Starting SAVE ENDORSEMENT PAGE TEST ======================================");
		InitAgentLogin("Chrome", "Live");
		//Initialize Drivers
		RPL = new RatingAndPolicyLookup(driver);
		PH = new PolicyHistory(driver);
		PRP1 = new PolicyRatingPage1(driver);
		PRP2 = new PolicyRatingPage2(driver);
		PP = new PolicyPremiums(driver);
		AP = new ApplicationPage(driver);
	}

	@Test(dataProvider="Save_Endorsement_Pages")
	public void run_Save_Endorsement(String casenum, String policyid, String inceptiondate)
	{
		
		try 
		{
			Log("============================== Starting " + casenum + " ==============================");
			GetURL("https://policy.americanstrategic.com/Policy/Lookup.aspx");
			//GetURL("https://policy.americanstrategic.com/Policy/Rating1.aspx?PolicyID=" + policyid + "&InceptionDate=" + inceptiondate + "&S=S");
			//GetURL("https://policy.americanstrategic.com/Policy/Rating1.aspx?PolicyID=" + policyid + "&InceptionDate=" + inceptiondate);
			RPL.TypeQuotePolicy(policyid);
			RPL.ClickLookup();
		
			if(driver.getPageSource().contains("Create a New Quote")) 
			{
				RPL.ClickPolicyLink(policyid);
			}
			
			if(PH.ReturnPolicyStatus("N").equals("Cancelled")) 
			{
				Log(casenum + "-" + policyid + ": is a cancelled");
				Log("============================== End " + casenum + " ===================================");
				return;			
			}
			
			//PH.ClickEndorse();
			PH.ClickReview();
			
			Robot robo = new Robot();
			robo.setAutoDelay(1000);
			
			/* Pulls Up The Page Source */
			robo.keyPress(KeyEvent.VK_CONTROL);
			robo.keyPress(KeyEvent.VK_U);
			
			robo.keyRelease(KeyEvent.VK_CONTROL);
			robo.keyRelease(KeyEvent.VK_U);
			
			/* Clicks Save As */
			robo.keyPress(KeyEvent.VK_CONTROL);
			robo.keyPress(KeyEvent.VK_S);
			
			robo.keyRelease(KeyEvent.VK_CONTROL);
			robo.keyRelease(KeyEvent.VK_S);
			
			/* Gets File Location and Renames File */
			//StringSelection prp1str = new StringSelection("T:\\Jmilkey\\" + policyid + "_PRP1");
			StringSelection prp1str = new StringSelection("T:\\Data Warehouse 2.0\\!NonCoverageMappingPageSource\\" + policyid + "_Policy_Rating1");
			Toolkit.getDefaultToolkit().getSystemClipboard().setContents(prp1str, null);
			
			robo.keyPress(KeyEvent.VK_CONTROL);
			robo.keyPress(KeyEvent.VK_V);
			
			robo.keyRelease(KeyEvent.VK_CONTROL);
			robo.keyRelease(KeyEvent.VK_V);
			
			/* Clicks Save */
			robo.keyPress(KeyEvent.VK_ENTER);
			robo.keyRelease(KeyEvent.VK_ENTER);
			
			Log("Saved Policy Rating Page 1 for policy: " + policyid);
			
			/* Closes Current Tab */
			robo.keyPress(KeyEvent.VK_CONTROL);
			robo.keyPress(KeyEvent.VK_W);
			
			robo.keyRelease(KeyEvent.VK_CONTROL);
			robo.keyRelease(KeyEvent.VK_W);
			
			PRP1.ClickNext();
		
			robo.keyPress(KeyEvent.VK_CONTROL);
			robo.keyPress(KeyEvent.VK_U);
			
			robo.keyRelease(KeyEvent.VK_CONTROL);
			robo.keyRelease(KeyEvent.VK_U);
			
			robo.keyPress(KeyEvent.VK_CONTROL);
			robo.keyPress(KeyEvent.VK_S);
			
			robo.keyRelease(KeyEvent.VK_CONTROL);
			robo.keyRelease(KeyEvent.VK_S);
			
			StringSelection prp2str = new StringSelection("T:\\Data Warehouse 2.0\\!NonCoverageMappingPageSource\\" + policyid + "_Policy_Rating2");
			Toolkit.getDefaultToolkit().getSystemClipboard().setContents(prp2str, null);
		
			robo.keyPress(KeyEvent.VK_CONTROL);
			robo.keyPress(KeyEvent.VK_V);
			
			robo.keyRelease(KeyEvent.VK_CONTROL);
			robo.keyRelease(KeyEvent.VK_V);
			
			robo.keyPress(KeyEvent.VK_ENTER);
			robo.keyRelease(KeyEvent.VK_ENTER);
			
			Log("Saved Policy Rating Page 2 for policy: " + policyid);
			
			robo.keyPress(KeyEvent.VK_CONTROL);
			robo.keyPress(KeyEvent.VK_W);
			
			robo.keyRelease(KeyEvent.VK_CONTROL);
			robo.keyRelease(KeyEvent.VK_W);
			
			PRP2.ClickNext();
			PP.ClickNext();
			
			robo.keyPress(KeyEvent.VK_CONTROL);
			robo.keyPress(KeyEvent.VK_U);
			
			robo.keyRelease(KeyEvent.VK_CONTROL);
			robo.keyRelease(KeyEvent.VK_U);
			
			robo.keyPress(KeyEvent.VK_CONTROL);
			robo.keyPress(KeyEvent.VK_S);
			
			robo.keyRelease(KeyEvent.VK_CONTROL);
			robo.keyRelease(KeyEvent.VK_S);
			
			StringSelection apstr = new StringSelection("T:\\Data Warehouse 2.0\\!NonCoverageMappingPageSource\\" + policyid + "_Policy_AppPage");
			Toolkit.getDefaultToolkit().getSystemClipboard().setContents(apstr, null);
			
			robo.keyPress(KeyEvent.VK_CONTROL);
			robo.keyPress(KeyEvent.VK_V);
			
			robo.keyRelease(KeyEvent.VK_CONTROL);
			robo.keyRelease(KeyEvent.VK_V);
			
			robo.keyPress(KeyEvent.VK_ENTER);
			robo.keyRelease(KeyEvent.VK_ENTER);
			
			Log("Saved Application Page for policy: " + policyid);
			
			robo.keyPress(KeyEvent.VK_CONTROL);
			robo.keyPress(KeyEvent.VK_W);
			
			robo.keyRelease(KeyEvent.VK_CONTROL);
			robo.keyRelease(KeyEvent.VK_W);
			
			Log("============================== End " + casenum + " ===================================");	
			
		}
		catch(Exception e) 
		{
			//logger.log(Status.FAIL, casenum + "-" + policyid + ": Script has failed. Please rerun.");
			Log("============================== End " + casenum + " ===================================");		
		}		
	}
	
	@AfterTest
	public void EndBatch() 
	{
		QuitBrowser();
		Log("====================================== End SAVE ENDORSEMENT PAGE TEST ===========================================");
	}
}
