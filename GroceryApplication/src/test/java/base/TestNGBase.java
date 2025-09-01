package base;

import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TestNGBase {
	public WebDriver driver;
	@BeforeMethod // to invoke before each test case is executed
	  
	public void browserinitializer(){
		driver = new FirefoxDriver();
		driver.get("https://groceryapp.uniqassosiates.com/admin/login");
		driver.manage().window().maximize();
		
	}
	@AfterMethod // after executing each test case the browser is closed
	public void quitandclose() {
		//driver.close();
	}


}
