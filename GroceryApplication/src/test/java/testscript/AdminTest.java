package testscript;

import org.testng.Assert;
import org.testng.annotations.Test;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import base.TestNGBase;
import constant.Constants;
import constant.Messages;
import pages.AdminPage;
import pages.LoginPage;
import utilities.ExcelUtility;
import utilities.FakerUtility;

public class AdminTest extends TestNGBase{
	@Test(priority = 1, description = "To click on Admin users More info")
	public void AddUser() throws IOException {
		String usernameValue=ExcelUtility.getStringData(1, 0, Constants.LOGINSHEET);
		String passwordValue=ExcelUtility.getStringData(1, 1, Constants.LOGINSHEET);
		LoginPage loginpage=new LoginPage(driver);
		loginpage.enterUserName(usernameValue);
		loginpage.enterPassword(passwordValue);
		loginpage.clickonSignin();
		
		//to click on Admin users More info
		
		AdminPage adminpage=new AdminPage(driver);
		adminpage.clickAdminMoreInfor();
		
		// to generate random user name and password
		FakerUtility fakerUtility = new FakerUtility();
		String randomname=fakerUtility.createRandomUserName();
		String randompassword=fakerUtility.createRandomPassword();
		String userType=ExcelUtility.getStringData(1, 2,Constants.HOMESHEET);
		adminpage.clickNewButton();
		
		adminpage.enterUserInput(randomname);
		adminpage.enterPasswordInput(randompassword);
		
		adminpage.usertypeDropdown(userType);
		adminpage.clickSavebutton();
		
		boolean isdisplayed = adminpage.isAlertDisplayed();
		Assert.assertTrue(isdisplayed, Messages.USERNOTADDEDERROR);
	}

}
