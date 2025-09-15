package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class PageUtility {
	public void sendDataToElement(WebElement element, String text) {
		element.sendKeys(text);
	}
	//method to perform click action 
	 public void clickElement(WebElement element)
	     {
		 element.click();
	     }
	 
		//method to perform electByVisibleText action 
	 public void selectDataWithVisibleText(WebElement element,String userType)
	   {
		 Select select=new Select(element);
		 select.selectByVisibleText(userType);
	   }
	 
	// below two methods are not used in this project
	 public void scrollToElement(WebDriver driver, WebElement element) {
		    Actions actions=new Actions(driver);
		    actions.moveToElement(element).perform();
		}

	public void clearElementData(WebElement element)
	    {
			element.clear();
		}

}
