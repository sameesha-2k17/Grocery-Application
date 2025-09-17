package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.PageUtility;
import utilities.WaitUtility;

public class AdminPage {
	public WebDriver driver;
	PageUtility pageutility = new PageUtility();
	WaitUtility waitutility=new WaitUtility();
	public AdminPage(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);	
	}
@FindBy(xpath = "//a[@class='btn btn-rounded btn-danger']")WebElement newbutton;
public AdminPage clickNewButton() {
	pageutility.clickElement(newbutton);
	return this;
}
@FindBy(xpath = "//input[@id='username']")WebElement username_input;
public AdminPage enterUserInput(String randomname) {
	pageutility.sendDataToElement(username_input, randomname);
	return this;
}
@FindBy(xpath = "//input[@id='password']")WebElement password_input;
public AdminPage enterPasswordInput(String randompassword) {
pageutility.sendDataToElement(password_input, randompassword);
return this;
}
@FindBy(xpath = "//select[@name='user_type']")WebElement usertypedropdown;
public AdminPage  usertypeDropdown(String userType) {
	pageutility.selectDataWithVisibleText(usertypedropdown, userType);
	return this;
}
@FindBy(xpath = "//button[@name='Create']")WebElement savebutton;
public AdminPage clickSavebutton() {
	pageutility.clickElement(savebutton);
	return this;
}
//Assertion
@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']") WebElement addUSeralert;
public boolean isAlertDisplayed() {
	return addUSeralert.isDisplayed();
} 
}