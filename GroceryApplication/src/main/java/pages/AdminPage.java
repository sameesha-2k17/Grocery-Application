package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class AdminPage {
	
	public WebDriver driver;
	public AdminPage(WebDriver driver) {
		this.driver=driver;
	}
public void clickAdminMoreInfor() {

	WebElement adminMoreinfo= driver.findElement(By.xpath("//a[@href='https://groceryapp.uniqassosiates.com/admin/list-admin' and @class='small-box-footer']"));
	adminMoreinfo.click();
}
public void clickNewButton() {
	WebElement newbutton=driver.findElement(By.xpath("//a[@class='btn btn-rounded btn-danger']"));
	newbutton.click();
}

public void enterUserInput(String randomname) {
	WebElement username_input=driver.findElement(By.xpath("//input[@id='username']"));
	username_input.sendKeys(randomname);
}
public void enterPasswordInput(String randompassword) {
WebElement password_input=driver.findElement(By.xpath("//input[@id='password']"));
password_input.sendKeys(randompassword);
}
public void  usertypeDropdown(String userType) {
	WebElement usertypedropdown=driver.findElement(By.xpath("//select[@name='user_type']"));
	Select select=new Select(usertypedropdown);
	select.selectByVisibleText(userType);
}
public void clickSavebutton() {
WebElement savebutton=driver.findElement(By.xpath("//button[@name='Create']"));
savebutton.click();
}
}