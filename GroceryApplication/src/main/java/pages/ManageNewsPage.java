package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ManageNewsPage {
	public WebDriver driver;
	public ManageNewsPage(WebDriver driver) {
		this.driver=driver;
	}
	public void clickmanageNewsPage() {
		WebElement managenews= driver.findElement(By.xpath("//a [@href='https://groceryapp.uniqassosiates.com/admin/list-news' and @class='small-box-footer']"));
		managenews.click();
	}
	public void clickNewButton() {
		WebElement newbutton=driver.findElement(By.xpath("//a [@href='https://groceryapp.uniqassosiates.com/admin/news/add']"));
		newbutton.click();
	}
	public void enterNewsinTextarea() {
		WebElement newsarea=driver.findElement(By.xpath("//textarea [@id='news']"));
		newsarea.sendKeys("samplearea");
	}
	public void clickonHomeButton() {
		WebElement homebutton=driver.findElement(By.xpath("//a[text()='Home']"));
		homebutton.click();
	}
	public void search() {
		WebElement search=driver.findElement(By.xpath("//a[@href='javascript:void(0)']"));
		search.click();
	}
	public void searchnews() {
		WebElement searchnews=driver.findElement(By.xpath("//input[@name='un']"));
		searchnews.sendKeys("sample news");
	}
	public void searchbutton() {
	WebElement searchbutton=driver.findElement(By.xpath("//button[@name='Search']"));
	searchbutton.click();
	}
	public void resetButton() {
		WebElement resetbutton=driver.findElement(By.xpath("//a[text()='Reset']"));
		resetbutton.click();	
	}
	
	
}
