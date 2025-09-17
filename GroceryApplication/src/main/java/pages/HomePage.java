package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.PageUtility;

public class HomePage {
	public WebDriver driver;
	   PageUtility pageutility=new PageUtility();
	public HomePage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath ="//img[@src='https://groceryapp.uniqassosiates.com/public/assets/admin/dist/img/avatar5.png']")WebElement adminicon;
	public HomePage clickAdminicon() {
		pageutility.clickElement(adminicon);
		return this;
	}
	@FindBy(xpath ="//i[@class='ace-icon fa fa-power-off']" )WebElement logout;
	public LoginPage clickLogout() {
		pageutility.clickElement(logout);
		return new LoginPage(driver);	
	}
	//cut and moved from AdminPage
	@FindBy(xpath = "//a[@href='https://groceryapp.uniqassosiates.com/admin/list-admin' and @class='small-box-footer']") WebElement adminMoreinfo;
	public AdminPage clickAdminMoreInfor() {
		pageutility.clickElement(adminMoreinfo);
		return new AdminPage(driver);
	}
	//cut and moved from manage news page
	@FindBy(xpath = "//a [@href='https://groceryapp.uniqassosiates.com/admin/list-news' and @class='small-box-footer']") WebElement managenews;
	public ManageNewsPage clickmanageNewsPage() {
		pageutility.clickElement(managenews);
		return new ManageNewsPage(driver);
	}
}

