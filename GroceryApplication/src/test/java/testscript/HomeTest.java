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
import pages.HomePage;
import pages.LoginPage;
import utilities.ExcelUtility;

public class HomeTest extends TestNGBase{
	@Test(priority = 1, description = "Verify the navigation to home page and logout successfully")
	public void verifyTest() throws IOException {
		String usernameValue=ExcelUtility.getStringData(1, 0,  Constants.LOGINSHEET);
		String passwordValue=ExcelUtility.getStringData(1, 1,  Constants.LOGINSHEET);
		LoginPage loginpage=new LoginPage(driver);
		loginpage.enterUserName(usernameValue);
		loginpage.enterPassword(passwordValue);
		loginpage.clickonSignin();	
		HomePage homepage = new HomePage(driver);
		homepage.clickAdminicon();
		homepage.clickLogout();
		
		String actual=driver.getCurrentUrl();
		String expected="https://groceryapp.uniqassosiates.com/admin/login";
		Assert.assertEquals(actual,expected,Messages.LOGOUTERROR);
		
	}
}
