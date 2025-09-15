package testscript;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.TestNGBase;
import constant.Constants;
import constant.Messages;
import pages.LoginPage;
import utilities.ExcelUtility;

public class LoginTest extends TestNGBase{
	@Test(priority = 1, description = "Login with valid credentials", retryAnalyzer = retry.Retry.class)
public void verifyloginwithValidCredentials() throws IOException {
		String usernameValue=ExcelUtility.getStringData(1, 0, Constants.LOGINSHEET);
		String passwordValue=ExcelUtility.getStringData(1, 1, Constants.LOGINSHEET);
		LoginPage loginpage=new LoginPage(driver);
		loginpage.enterUserName(usernameValue);
		loginpage.enterPassword(passwordValue);
		loginpage.clickonSignin();	
		//WebElement username= driver.findElement(By.xpath("//input[@name='username']"));
		//username.sendKeys(usernameValue);
		//WebElement password= driver.findElement(By.xpath("//input[@name='password']"));
		//password.sendKeys(passwordValue);
		//WebElement signin= driver.findElement(By.xpath("//button[text()='Sign In']"));
		//signin.click();
		String actual=driver.getCurrentUrl();
		String expected= "https://groceryapp.uniqassosiates.com/admin/login";
		Assert.assertEquals(actual, expected,Messages.VALIDCRENDIALERROR);	
	}	
	@Test(priority = 2, description = "Login with valid username and invalid password")
	public void validusernameinvalidpassword() throws IOException {
		String usernameValue=ExcelUtility.getStringData(2, 0, Constants.LOGINSHEET);
		String passwordValue=ExcelUtility.getStringData(2, 1, Constants.LOGINSHEET);
		LoginPage loginpage=new LoginPage(driver);
		loginpage.enterUserName(usernameValue);
		loginpage.enterPassword(passwordValue);
		loginpage.clickonSignin();
		
		boolean isalertdisplayed = loginpage.isLoginalertDisplayed();
		Assert.assertTrue(isalertdisplayed,Messages.VALIDUSERNAMEINVALIDPASSWORDERROR);
	}
	@Test(priority = 3, description = "Login with invalid username and valid password")
	public void inalidusernameValidpassword1() throws IOException {
		String usernameValue=ExcelUtility.getStringData(3, 0, Constants.LOGINSHEET);
		String passwordValue=ExcelUtility.getStringData(3, 1, Constants.LOGINSHEET);
		LoginPage loginpage=new LoginPage(driver);
		loginpage.enterUserName(usernameValue);
		loginpage.enterPassword(passwordValue);
		loginpage.clickonSignin();	
		boolean isalertdisplayed = loginpage.isLoginalertDisplayed2();
		Assert.assertTrue(isalertdisplayed,Messages.INVALIDUSERNAMEVALIDPASSWORDERROR);	
	}
	@Test(priority = 4, description = "Login with invalid username and invalid password",dataProvider = "loginProvider")
	public void invalidusernameInvalidpassword2(String usernameValue, String passwordValue) throws IOException {
//		String usernameValue=ExcelUtility.getStringData(4, 0, Constants.LOGINSHEET);
//		String passwordValue=ExcelUtility.getStringData(4, 1, Constants.LOGINSHEET);
		LoginPage loginpage=new LoginPage(driver);
		loginpage.enterUserName(usernameValue);
		loginpage.enterPassword(passwordValue);
		loginpage.clickonSignin();
		boolean isalertdisplayed = loginpage.isLoginalertDisplayed4();
		Assert.assertTrue(isalertdisplayed,Messages.INVALIDUSERNAMEINVALIDPASSWORDERROR);
	}
	@DataProvider(name="loginProvider")
	public Object[][] getDataFromDataProvider() throws IOException
	{
		return new Object[][]
		{  
			new Object[] {"user","password"},
			new Object[] {"username","pass"},
			new Object[] {"user1","password1"}
		};
	}
}
