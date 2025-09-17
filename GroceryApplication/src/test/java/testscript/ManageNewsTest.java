package testscript;

import java.io.IOException;
import org.testng.Assert;
import org.testng.annotations.Test;
import base.TestNGBase;
import constant.Constants;
import constant.Messages;
import pages.HomePage;
import pages.LoginPage;
import pages.ManageNewsPage;
import utilities.ExcelUtility;

public class ManageNewsTest extends TestNGBase{
	HomePage homepage;
	@Test(description = "Verify to click on manage news more info")
public void verifyAddNews() throws IOException {
		String usernameValue=ExcelUtility.getStringData(1, 0, Constants.LOGINSHEET);
		String passwordValue=ExcelUtility.getStringData(1, 1, Constants.LOGINSHEET);
		LoginPage loginpage=new LoginPage(driver);
		loginpage.enterUserName(usernameValue).enterPassword(passwordValue);
		homepage=loginpage.clickonSignin();
		ManageNewsPage managenewspage=new ManageNewsPage(driver);
		managenewspage=homepage.clickmanageNewsPage();
		managenewspage.clickNewButton().enterNewsinTextarea().clickSaveNewsbtn();
		//Assertion
		boolean isadduseralertdisplayed = managenewspage.isaddNewsAlertDisplayed();
		Assert.assertTrue(isadduseralertdisplayed,Messages.ADDUSERALERTDISPLAYEDERROR);	
	}
	@Test(description = "Verify home functionality")
	public void verifyHomefunctionality() throws IOException {
		String usernameValue=ExcelUtility.getStringData(1, 0, Constants.LOGINSHEET);
		String passwordValue=ExcelUtility.getStringData(1, 1, Constants.LOGINSHEET);
		LoginPage loginpage=new LoginPage(driver);
		loginpage.enterUserName(usernameValue).enterPassword(passwordValue);
		homepage=loginpage.clickonSignin();
		ManageNewsPage managenewspage=new ManageNewsPage(driver);
		managenewspage=homepage.clickmanageNewsPage();
		homepage=managenewspage.clickonHomeButton();
		 //Assertion
		 String actual=driver.getCurrentUrl();
		 String expected="https://groceryapp.uniqassosiates.com/admin/home";
		 Assert.assertEquals(actual, expected,Messages.NAVIGATETOHOMEPAGEERROR);
	}
	@Test(description = "Verify search functionality")
	public void verifySearchfunctionality() throws IOException {
		String usernameValue=ExcelUtility.getStringData(1, 0, Constants.LOGINSHEET);
		String passwordValue=ExcelUtility.getStringData(1, 1, Constants.LOGINSHEET);
		LoginPage loginpage=new LoginPage(driver);
		loginpage.enterUserName(usernameValue).enterPassword(passwordValue);
		homepage=loginpage.clickonSignin();
		ManageNewsPage managenewspage=new ManageNewsPage(driver);
		managenewspage=homepage.clickmanageNewsPage();	
		managenewspage.search().searchnews().searchbutton();
		//Assertion
		String actualnewssearched=managenewspage.isSearchedNewsListedIntable();
		String expectednews="sample news";
		Assert.assertEquals(actualnewssearched,expectednews,Messages.SEARCHEDNEWSNOTFOUNDERROR);	
	}
	@Test(description = "Verify reset functionality")
	public void verifyResetfunctionality() throws IOException {
		String usernameValue=ExcelUtility.getStringData(1, 0, Constants.LOGINSHEET);
		String passwordValue=ExcelUtility.getStringData(1, 1, Constants.LOGINSHEET);
		LoginPage loginpage=new LoginPage(driver);
		loginpage.enterUserName(usernameValue).enterPassword(passwordValue);
		homepage=loginpage.clickonSignin();;
		ManageNewsPage managenewspage=new ManageNewsPage(driver);
		managenewspage=homepage.clickmanageNewsPage();	
		managenewspage.search().searchnews().resetButton();
		
		//Assertion
		boolean issearchandmangenewscarddispalyed=managenewspage.isSearchAndMangeNewsCarddisplayed();
		Assert.assertFalse(issearchandmangenewscarddispalyed,Messages.RESETERROR);		
	}
}
