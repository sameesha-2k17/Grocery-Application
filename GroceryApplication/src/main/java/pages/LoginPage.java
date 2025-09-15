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
    @FindBy(xpath = "//div[@class=\"alert alert-danger alert-dismissible\"]") WebElement loginAlert2;
    public boolean isLoginalertDisplayed2() {
    	return loginAlert2.isDisplayed();		
    }
    @FindBy(xpath = "//div[@class=\"alert alert-danger alert-dismissible\"]") WebElement loginAlert3;
    public boolean isLoginalertDisplayed3() {
    	return loginAlert3.isDisplayed();		
    }
    @FindBy(xpath = "//div[@class=\"alert alert-danger alert-dismissible\"]") WebElement loginAlert4;
    public boolean isLoginalertDisplayed4() {
    	return loginAlert4.isDisplayed();		
    }
    @FindBy(xpath = "//div[@class=\"alert alert-danger alert-dismissible\"]") WebElement loginAlert5;
    public boolean isLoginalertDisplayed5() {
    	return loginAlert5.isDisplayed();		
    }
}
