package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.PageUtility;
import utilities.WaitUtility;

public class LoginPage {
	public WebDriver driver;
	PageUtility pageutility = new PageUtility();
	WaitUtility waitutility=new WaitUtility();
	public LoginPage(WebDriver driver) { //constructor
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//input[@name='username']") WebElement username;
	public LoginPage enterUserName(String usernameValue) {
		pageutility.sendDataToElement(username, usernameValue);
		return this;
	}
	@FindBy(xpath = "//input[@name='password']") WebElement password;
    public LoginPage enterPassword(String passwordValue) {
    	pageutility.sendDataToElement(password,passwordValue);
    	return this;
    	
    }
    @FindBy(xpath="//button[text()='Sign In']") WebElement signin;
    public HomePage clickonSignin() {
    	waitutility.waitUntilClickable(driver, signin);
    	pageutility.clickElement(signin);
    	return new HomePage(driver);
    }
    
    //Web element for assertion
    @FindBy(xpath = "//div[@class=\"alert alert-danger alert-dismissible\"]") WebElement loginAlert;
    public boolean isLoginalertDisplayed() {
    	return loginAlert.isDisplayed();		
    }
}
