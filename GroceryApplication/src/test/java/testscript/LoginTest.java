package testscript;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import base.TestNGBase;
import pages.LoginPage;
import utilities.ExcelUtility;

public class LoginTest extends TestNGBase{
	@Test(priority = 1, description = "Login with valid credentials")
public void verifyloginwithValidCredentials() throws IOException {
		String usernameValue=ExcelUtility.getStringData(1, 0, "LoginPage");
		String passwordValue=ExcelUtility.getStringData(1, 1, "LoginPage");
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
		
	}
	@Test(priority = 2)
	public void validusernameinvalidpassword() throws IOException {
		String usernameValue=ExcelUtility.getStringData(2, 0, "LoginPage");
		String passwordValue=ExcelUtility.getStringData(2, 1, "LoginPage");
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
	}
	@Test(priority = 3)
	public void inalidusernameValidpassword1() throws IOException {
		String usernameValue=ExcelUtility.getStringData(3, 0, "LoginPage");
		String passwordValue=ExcelUtility.getStringData(3, 1, "LoginPage");
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
	}
	@Test(priority = 4)
	public void invalidusernameInvalidpassword2() throws IOException {
		String usernameValue=ExcelUtility.getStringData(4, 0, "LoginPage");
		String passwordValue=ExcelUtility.getStringData(4, 1, "LoginPage");
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
	}
	@Test(priority = 5)
	public void invalidusernameInvalidpassword3() throws IOException {
		String usernameValue=ExcelUtility.getStringData(5, 0, "LoginPage");
		String passwordValue=ExcelUtility.getStringData(5, 1, "LoginPage");
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
	}
}
