package testscript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.TestNGBase;
import constant.Constants;
import constant.Messages;
import pages.HomePage;
import pages.LoginPage;
import utilities.ExcelUtility;

public class HomeTest extends TestNGBase{
	HomePage homepage;
	@Test(priority = 1, description = "Verify the navigation to home page and logout successfully")
	public void verifyTest() throws IOException {
		String usernameValue=ExcelUtility.getStringData(1, 0,  Constants.LOGINSHEET);
		String passwordValue=ExcelUtility.getStringData(1, 1,  Constants.LOGINSHEET);
		LoginPage loginpage=new LoginPage(driver);
		loginpage.enterUserName(usernameValue).enterPassword(passwordValue);
		homepage=loginpage.clickonSignin();	
		
		homepage.clickAdminicon();
		loginpage=homepage.clickLogout();
		
		//For assertion when logout action fails
		String actual=driver.getCurrentUrl();
		String expected="https://groceryapp.uniqassosiates.com/admin/login";
		Assert.assertEquals(actual,expected,Messages.LOGOUTERROR);
		
	}
}
