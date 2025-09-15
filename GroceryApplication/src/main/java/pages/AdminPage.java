package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import utilities.PageUtility;

public class AdminPage {
	public WebDriver driver;
	PageUtility pageutility = new PageUtility();
	public AdminPage(WebDriver driver) {
		this.driver=driver;
	}
	
@FindBy(xpath = "//a[@href='https://groceryapp.uniqassosiates.com/admin/list-admin' and @class='small-box-footer']") WebElement adminMoreinfo;
public void clickAdminMoreInfor() {
	pageutility.clickElement(adminMoreinfo);
}

@FindBy(xpath = "//a[@class='btn btn-rounded btn-danger']")WebElement newbutton;
public void clickNewButton() {
	pageutility.clickElement(newbutton);
}

@FindBy(xpath = "//input[@id='username']")WebElement username_input;
public void enterUserInput(String randomname) {
	pageutility.sendDataToElement(username_input, randomname);
}

@FindBy(xpath = "//input[@id='password']")WebElement password_input;
public void enterPasswordInput(String randompassword) {
pageutility.sendDataToElement(password_input, randompassword);
}

@FindBy(xpath = "//select[@name='user_type']")WebElement usertypedropdown;
public void  usertypeDropdown(String userType) {
	pageutility.selectDataWithVisibleText(usertypedropdown, userType);
}

@FindBy(xpath = "//button[@name='Create']")WebElement savebutton;
public void clickSavebutton() {
	pageutility.clickElement(savebutton);
}

@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']") WebElement addUSeralert;
public boolean isAlertDisplayed() {
	return addUSeralert.isDisplayed();
} 
}