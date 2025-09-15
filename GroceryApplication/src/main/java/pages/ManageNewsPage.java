package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ManageNewsPage {
	public WebDriver driver;
	public ManageNewsPage(WebDriver driver) {
		this.driver=driver;
	}
	@FindBy(xpath = "//a [@href='https://groceryapp.uniqassosiates.com/admin/list-news' and @class='small-box-footer']") WebElement managenews;
	public void clickmanageNewsPage() {
		managenews.click();
	}
	
	@FindBy(xpath = "//a [@href='https://groceryapp.uniqassosiates.com/admin/news/add'") WebElement newbutton;
	public void clickNewButton() {
		newbutton.click();
	}
	
	@FindBy(xpath = "//textarea [@id='news'") WebElement newsarea;
	public void enterNewsinTextarea() {
		newsarea.sendKeys("samplearea");
	}
	
	@FindBy(xpath = "//a[text()='Home']") WebElement homebutton;
	public void clickonHomeButton() {
		homebutton.click();
	}
	
	@FindBy(xpath = "//a[@href='javascript:void(0)']") WebElement search;
	public void search() {
		search.click();
	}
	
	@FindBy(xpath = "//input[@name='un']") WebElement searchnews;
	public void searchnews() {
		searchnews.sendKeys("sample news");
	}
	
	@FindBy(xpath = "//button[@name='Search']") WebElement searchbutton;
	public void searchbutton() {
	searchbutton.click();
	}
	
	@FindBy(xpath = "//button[@name='Search']") WebElement resetbutton;
	public void resetButton() {
		resetbutton.click();
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
	
	

