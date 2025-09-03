package testscript;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import base.TestNGBase;
import pages.LoginPage;
import pages.ManageNewsPage;
import utilities.ExcelUtility;

public class ManageNewsTest extends TestNGBase{
	@Test
public void  verifyAddNews() throws IOException {
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
		
		//to click on manage news more info
		//WebElement managenews= driver.findElement(By.xpath("//a [@href='https://groceryapp.uniqassosiates.com/admin/list-news' and @class='small-box-footer']"));
		//managenews.click();
		ManageNewsPage managenewspage=new ManageNewsPage(driver);
		managenewspage.clickmanageNewsPage();
		
		//WebElement newbutton=driver.findElement(By.xpath("//a [@href='https://groceryapp.uniqassosiates.com/admin/news/add']"));
		//newbutton.click();
		managenewspage.clickNewButton();
		
		
		//WebElement newsarea=driver.findElement(By.xpath("//textarea [@id='news']"));
		//newsarea.sendKeys("samplearea");
		managenewspage.enterNewsinTextarea();
		
		//WebElement savebutton=driver.findElement(By.xpath("//button [@name='create']"));
		//savebutton.click();	
		managenewspage.clickNewButton();
		
	}
	@Test
	public void verifyHomefunctionality() throws IOException {
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
		ManageNewsPage managenewspage=new ManageNewsPage(driver);
		managenewspage.clickmanageNewsPage();
		
		//to click on manage news more info
		//WebElement managenews= driver.findElement(By.xpath("//a [@href='https://groceryapp.uniqassosiates.com/admin/list-news' and @class='small-box-footer']"));
		//managenews.click();
		
		//WebElement homebutton=driver.findElement(By.xpath("//a[text()='Home']"));
		//homebutton.click();
		managenewspage.clickonHomeButton();
	}
	@Test
	public void verifySearchfunctionality() throws IOException {
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
		ManageNewsPage managenewspage=new ManageNewsPage(driver);
		managenewspage.clickmanageNewsPage();
//		
		//to click on search button
		//WebElement managenews= driver.findElement(By.xpath("//a [@href='https://groceryapp.uniqassosiates.com/admin/list-news' and @class='small-box-footer']"));
		//managenews.click()
		
		
		//WebElement search=driver.findElement(By.xpath("//a[@href='javascript:void(0)']"));
		//search.click();
		managenewspage.search();
	
		
		//WebElement searchnews=driver.findElement(By.xpath("//input[@name='un']"));
		//searchnews.sendKeys("sample news");
		managenewspage.searchnews();
		
		//WebElement searchbutton=driver.findElement(By.xpath("//button[@name='Search']"));
		//searchbutton.click();
		managenewspage.searchbutton();
		
	}
	@Test
	public void verifyResetfunctionality() throws IOException {
		String usernameValue=ExcelUtility.getStringData(1, 0, "LoginPage");
		String passwordValue=ExcelUtility.getStringData(1, 1, "LoginPage");
//		WebElement username= driver.findElement(By.xpath("//input[@name='username']"));
//		username.sendKeys(usernameValue);
//		WebElement password= driver.findElement(By.xpath("//input[@name='password']"));
//		password.sendKeys(passwordValue);
//		WebElement signin= driver.findElement(By.xpath("//button[text()='Sign In']"));
//		signin.click();
//		
//		//to click on reset button
//		WebElement managenews= driver.findElement(By.xpath("//a [@href='https://groceryapp.uniqassosiates.com/admin/list-news' and @class='small-box-footer']"));
//		managenews.click();
//		WebElement search=driver.findElement(By.xpath("//a[@href='javascript:void(0)']"));
//		search.click();
//		WebElement searchnews=driver.findElement(By.xpath("//input[@name='un']"));
//		searchnews.sendKeys("sample news");
//		WebElement searchbutton=driver.findElement(By.xpath("//button[@name='Search']"));
//		searchbutton.click();
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
		
		//WebElement resetbutton=driver.findElement(By.xpath("//a[text()='Reset']"));
		//resetbutton.click();	
	}
	
}
