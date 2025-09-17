package testscript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.TestNGBase;
import constant.Constants;
import constant.Messages;
import pages.AdminPage;
import pages.HomePage;
import pages.LoginPage;
import utilities.ExcelUtility;
import utilities.FakerUtility;

public class AdminTest extends TestNGBase{
	HomePage homepage;
	AdminPage adminpage;
	@Test(priority = 1, description = "To click on Admin users More info")
	public void AddUser() throws IOException {
		String usernameValue=ExcelUtility.getStringData(1, 0, Constants.LOGINSHEET);
		String passwordValue=ExcelUtility.getStringData(1, 1, Constants.LOGINSHEET);
		LoginPage loginpage=new LoginPage(driver);
		loginpage.enterUserName(usernameValue).enterPassword(passwordValue);
		homepage=loginpage.clickonSignin();
		
		//to click on Admin users More info
	    adminpage= homepage.clickAdminMoreInfor();
		
		// to generate random user name and password
		FakerUtility fakerUtility = new FakerUtility();
		String randomname=fakerUtility.createRandomUserName();
		String randompassword=fakerUtility.createRandomPassword();
		String userType=ExcelUtility.getStringData(1, 2,Constants.HOMESHEET);
		
		adminpage.clickNewButton().enterUserInput(randomname).enterPasswordInput(randompassword).usertypeDropdown(userType).clickSavebutton();
		
		//Assertion
		boolean isdisplayed = adminpage.isAlertDisplayed();
		Assert.assertTrue(isdisplayed, Messages.USERNOTADDEDERROR);
	}

}
