package testscript;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import base.TestNGBase;
import pages.AdminPage;
import pages.LoginPage;
import utilities.ExcelUtility;
import utilities.FakerUtility;

public class AdminTest extends TestNGBase{
	@Test
	public void AddUser() throws IOException {
		String usernameValue=ExcelUtility.getStringData(1, 0, "LoginPage");
		String passwordValue=ExcelUtility.getStringData(1, 1, "LoginPage");
//		WebElement username= driver.findElement(By.xpath("//input[@name='username']"));
//		username.sendKeys(usernameValue);
//		WebElement password= driver.findElement(By.xpath("//input[@name='password']"));
//		password.sendKeys(passwordValue);
//		WebElement signin= driver.findElement(By.xpath("//button[text()='Sign In']"));
//		signin.click();
		LoginPage loginpage=new LoginPage(driver);
		loginpage.enterUserName(usernameValue);
		loginpage.enterPassword(passwordValue);
		loginpage.clickonSignin();
		
		//to click on Admin users More info
		
		//WebElement adminMoreinfo= driver.findElement(By.xpath("//a[@href='https://groceryapp.uniqassosiates.com/admin/list-admin' and @class='small-box-footer']"));
		//adminMoreinfo.click();
		AdminPage adminpage=new AdminPage(driver);
		adminpage.clickAdminMoreInfor();
		
		// to generate random user name and password
		FakerUtility fakerUtility = new FakerUtility();
		String randomname=fakerUtility.createRandomUserName();
		String randompassword=fakerUtility.createRandomPassword();
		String userType=ExcelUtility.getStringData(1, 2,"HomePage");
		
		//WebElement newbutton=driver.findElement(By.xpath("//a[@class='btn btn-rounded btn-danger']"));
		//newbutton.click();
		adminpage.clickNewButton();
		
		//WebElement username_input=driver.findElement(By.xpath("//input[@id='username']"));
		//username_input.sendKeys(randomname);
		adminpage.enterUserInput(randomname);
		
		//WebElement password_input=driver.findElement(By.xpath("//input[@id='password']"));
		//password_input.sendKeys(randompassword);
		adminpage.enterPasswordInput(randompassword);
		
		//WebElement usertypedropdown=driver.findElement(By.xpath("//select[@name='user_type']"));
		//Select select=new Select(usertypedropdown);
		//select.selectByVisibleText(userType);
		
		adminpage.usertypeDropdown(userType);
		
		//WebElement savebutton=driver.findElement(By.xpath("//button[@name='Create']"));
		//savebutton.click();
		adminpage.clickSavebutton();
	}

}
