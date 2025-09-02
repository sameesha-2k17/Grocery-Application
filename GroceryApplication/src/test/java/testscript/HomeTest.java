package testscript;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import base.TestNGBase;
import pages.HomePage;
import pages.LoginPage;
import utilities.ExcelUtility;

public class HomeTest extends TestNGBase{
	@Test
	public void verifyTest() throws IOException {
		String usernameValue=ExcelUtility.getStringData(1, 0, "LoginPage");
		String passwordValue=ExcelUtility.getStringData(1, 1, "LoginPage");
//		WebElement username= driver.findElement(By.xpath("//input[@name='username']"));
//		username.sendKeys(usernameValue);
//		WebElement password= driver.findElement(By.xpath("//input[@name='password']"));
//		password.sendKeys(passwordValue);
//		WebElement signin= driver.findElement(By.xpath("//button[text()='Sign In']"));
//		signin.click();
		//WebElement adminicon=driver.findElement(By.xpath("//img[@src='https://groceryapp.uniqassosiates.com/public/assets/admin/dist/img/avatar5.png']"));
		//adminicon.click();
		
		LoginPage loginpage=new LoginPage(driver);
		loginpage.enterUserName(usernameValue);
		loginpage.enterPassword(passwordValue);
		loginpage.clickonSignin();	
		HomePage homepage = new HomePage(driver);
		homepage.clickAdminicon();
		homepage.clickLogout();
		
		//WebElement logout=driver.findElement(By.xpath("//i[@class='ace-icon fa fa-power-off']"));
		//logout.click();
	}
	

}
