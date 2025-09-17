package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.PageUtility;
import utilities.WaitUtility;

public class ManageNewsPage {
	public WebDriver driver;
	PageUtility pageutility=new PageUtility();
	WaitUtility waitutility=new WaitUtility();
	public ManageNewsPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//a[@class='btn btn-rounded btn-danger']") WebElement newbutton;
	public ManageNewsPage clickNewButton() {
		pageutility.clickElement(newbutton);
		return this;
	}
	@FindBy(xpath = "//textarea [@id='news']") WebElement newsarea;
	public ManageNewsPage enterNewsinTextarea() {
		pageutility.sendDataToElement(newsarea,"sample news");
		return this;
	}
	@FindBy(xpath = "//button[@name='create']")WebElement saveNewsbtn;
	  public ManageNewsPage clickSaveNewsbtn()
	  {
		pageutility.clickElement(saveNewsbtn);
		 return this;
	  }
	
	@FindBy(xpath = "//a[text()='Home']") WebElement homebutton;
	public HomePage clickonHomeButton() {
		pageutility.clickElement(homebutton);
		return new HomePage(driver);
	}
	
	@FindBy(xpath = "//a[@href='javascript:void(0)']") WebElement search;
	public ManageNewsPage search() {
		pageutility.clickElement(search);
		return this;
	}
	
	@FindBy(xpath = "//input[@name='un']") WebElement searchnews;
	public ManageNewsPage searchnews() {
		pageutility.sendDataToElement(searchnews, "sample news");
		return this;
	}
	@FindBy(xpath = "//button[@name='Search']") WebElement searchbutton;
	public ManageNewsPage searchbutton() {
	pageutility.clickElement(searchbutton);
	return this;
	}
	@FindBy(xpath = "//a[text()='Reset']") WebElement resetbutton;
	public ManageNewsPage resetButton() {
		pageutility.clickElement(resetbutton);
		return this;
	}
	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']") WebElement addNewsAlert;
		  
	public boolean isaddNewsAlertDisplayed() 
	{
	return addNewsAlert.isDisplayed();
	 }  
	 @FindBy(xpath = "//table[@class='table table-bordered table-hover table-sm']/tbody/tr[1]/td[1]") WebElement fistcelloftable;
	public String isSearchedNewsListedIntable() {
	 return fistcelloftable.getText();
	}
	@FindBy(xpath = "//form[@role='form']") WebElement searchandmangenewscard;
	public boolean isSearchAndMangeNewsCarddisplayed() {
	 return searchandmangenewscard.isDisplayed();
		 }
	}
	
	

