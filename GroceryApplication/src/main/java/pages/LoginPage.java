package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.PageUtility;

public class LoginPage {
	public WebDriver driver;
	PageUtility pageutility = new PageUtility();
	public LoginPage(WebDriver driver) { //constructor
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//input[@name='username']") WebElement username;
	public void enterUserName(String usernameValue) {
		pageutility.sendDataToElement(username, usernameValue);
	}
	@FindBy(xpath = "//input[@name='password']") WebElement password;
    public void enterPassword(String passwordValue) {
    	pageutility.sendDataToElement(password,passwordValue);	
    	
    }
    @FindBy(xpath="//button[text()='Sign In']") WebElement signin;
    public void clickonSignin() {
    	pageutility.clickElement(signin);
    }
    
    //Web element for assertion
    @FindBy(xpath = "//div[@class=\"alert alert-danger alert-dismissible\"]") WebElement loginAlert;
    public boolean isLoginalertDisplayed() {
    	return loginAlert.isDisplayed();		
    }
}
