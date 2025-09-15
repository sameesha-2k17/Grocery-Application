package testscript;

import org.testng.Assert;
import org.testng.annotations.Test;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import base.TestNGBase;
import constant.Constants;
import constant.Messages;
import pages.LoginPage;
import pages.ManageNewsPage;
import utilities.ExcelUtility;

public class ManageNewsTest extends TestNGBase{
	@Test(description = "Verify to click on manage news more info")
public void  verifyAddNews() throws IOException {
		String usernameValue=ExcelUtility.getStringData(1, 0, Constants.LOGINSHEET);
		String passwordValue=ExcelUtility.getStringData(1, 1, Constants.LOGINSHEET);
		LoginPage loginpage=new LoginPage(driver);
		loginpage.enterUserName(usernameValue);
		loginpage.enterPassword(passwordValue);
		loginpage.clickonSignin();	
		ManageNewsPage managenewspage=new ManageNewsPage(driver);
		managenewspage.clickmanageNewsPage();
		managenewspage.clickNewButton();
		managenewspage.enterNewsinTextarea();
		managenewspage.clickNewButton();
		boolean isadduseralertdisplayed = managenewspage.isaddNewsAlertDisplayed();
		Assert.assertTrue(isadduseralertdisplayed,Messages.ADDUSERALERTDISPLAYEDERROR);
		
	}
	@Test(description = "Verify home functionality")
	public void verifyHomefunctionality() throws IOException {
		String usernameValue=ExcelUtility.getStringData(1, 0, Constants.LOGINSHEET);
		String passwordValue=ExcelUtility.getStringData(1, 1, Constants.LOGINSHEET);
		LoginPage loginpage=new LoginPage(driver);
		loginpage.enterUserName(usernameValue);
		loginpage.enterPassword(passwordValue);
		loginpage.clickonSignin();
		ManageNewsPage managenewspage=new ManageNewsPage(driver);
		managenewspage.clickmanageNewsPage();
		managenewspage.clickonHomeButton();
		 String actual=driver.getCurrentUrl();
		 String expected="https://groceryapp.uniqassosiates.com/admin/home";
		 Assert.assertEquals(actual, expected,Messages.NAVIGATETOHOMEPAGEERROR);
	}
	@Test(description = "Verify search functionality")
	public void verifySearchfunctionality() throws IOException {
		String usernameValue=ExcelUtility.getStringData(1, 0, Constants.LOGINSHEET);
		String passwordValue=ExcelUtility.getStringData(1, 1, Constants.LOGINSHEET);
		
		LoginPage loginpage=new LoginPage(driver);
		loginpage.enterUserName(usernameValue);
		loginpage.enterPassword(passwordValue);
		loginpage.clickonSignin();
		ManageNewsPage managenewspage=new ManageNewsPage(driver);
		managenewspage.clickmanageNewsPage();	
		managenewspage.search();
		managenewspage.searchnews();
		managenewspage.searchbutton();
		String actualnewssearched=managenewspage.isSearchedNewsListedIntable();
		String expectednews="sample news";
		Assert.assertEquals(actualnewssearched,expectednews,Messages.SEARCHEDNEWSNOTFOUNDERROR);
		
	}
	@Test(description = "Verify reset functionality")
	public void verifyResetfunctionality() throws IOException {
		String usernameValue=ExcelUtility.getStringData(1, 0, Constants.LOGINSHEET);
		String passwordValue=ExcelUtility.getStringData(1, 1, Constants.LOGINSHEET);
		LoginPage loginpage=new LoginPage(driver);
		loginpage.enterUserName(usernameValue);
		loginpage.enterPassword(passwordValue);
		loginpage.clickonSignin();
		ManageNewsPage managenewspage=new ManageNewsPage(driver);
		managenewspage.clickmanageNewsPage();
		managenewspage.search();
		managenewspage.searchnews();
		managenewspage.searchbutton();
		managenewspage.resetButton();
		boolean issearchandmangenewscarddispalyed=managenewspage.isSearchAndMangeNewsCarddisplayed();
		Assert.assertFalse(issearchandmangenewscarddispalyed,Messages.RESETERROR);
		
		
	}
	
}
