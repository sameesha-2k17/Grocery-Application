package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import utilities.PageUtility;

public class ManageNewsPage {
	public WebDriver driver;
	PageUtility pageutility=new PageUtility();
	public ManageNewsPage(WebDriver driver) {
		this.driver=driver;
	}
	@FindBy(xpath = "//a [@href='https://groceryapp.uniqassosiates.com/admin/list-news' and @class='small-box-footer']") WebElement managenews;
	public void clickmanageNewsPage() {
		pageutility.clickElement(managenews);
	}
	
	@FindBy(xpath = "//a [@href='https://groceryapp.uniqassosiates.com/admin/news/add'") WebElement newbutton;
	public void clickNewButton() {
		pageutility.clickElement(newbutton);
	}
	
	@FindBy(xpath = "//textarea [@id='news'") WebElement newsarea;
	public void enterNewsinTextarea() {
		pageutility.sendDataToElement(newsarea,"sample news");
	}
	
	@FindBy(xpath = "//a[text()='Home']") WebElement homebutton;
	public void clickonHomeButton() {
		pageutility.clickElement(homebutton);
	}
	
	@FindBy(xpath = "//a[@href='javascript:void(0)']") WebElement search;
	public void search() {
		pageutility.clickElement(search);
	}
	
	@FindBy(xpath = "//input[@name='un']") WebElement searchnews;
	public void searchnews() {
		pageutility.sendDataToElement(searchnews, "sample news");
	}
	
	@FindBy(xpath = "//button[@name='Search']") WebElement searchbutton;
	public void searchbutton() {
	pageutility.clickElement(searchbutton);
	}
	
	@FindBy(xpath = "//button[@name='Search']") WebElement resetbutton;
	public void resetButton() {
		pageutility.clickElement(resetbutton);
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
	   
	@FindBy(xpath = "//form[@role='form' ]") WebElement searchandmangenewscard;
	public boolean isSearchAndMangeNewsCarddisplayed() {
			return searchandmangenewscard.isDisplayed();
			  }	
	}
	
	

