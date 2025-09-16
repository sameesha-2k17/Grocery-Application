package base;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import constant.Constants;
import utilities.ScreenshotUtility;

public class TestNGBase {
	Properties prop;
	FileInputStream f;
	public WebDriver driver;
	@BeforeMethod (alwaysRun = true) // to invoke before each test case is executed
	@Parameters("browser")
	  
	public void browserinitializer(String browser) throws Exception{
		prop = new Properties();
		f= new FileInputStream(Constants.CONFIGFILE);
		prop.load(f);
		if(browser.equalsIgnoreCase("Chrome")) {
			//driver=new ChromeDriver();
			ChromeOptions options = new ChromeOptions(); //ChromeOptions` allows you to customize how Chrome starts — such as setting preferences, enabling headless mode, disabling extensions, etc.
			Map<String,Object> prefs=new HashMap<>(); //Create a map that has the key as password leak detection , and value to be false so that leak detect is turned off while launching browser.
			prefs.put("profile.password_manager_leak_detection", false);//Set the above pref as "Experimental option" so that it is reflected in user preferences
			options.setExperimentalOption("prefs", prefs);//Launch the driver with customized preference with "options"
			driver=new ChromeDriver(options);
		}
		else if(browser.equalsIgnoreCase("Firefox")) {
			driver=new FirefoxDriver();
		}
else {
			throw new Exception("Invalid browser name");
		}

		//driver.get("https://groceryapp.uniqassosiates.com/admin/login");
		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
	}
	@AfterMethod // after executing each test case the browser is closed
	public void quitandclose() {
		//driver.close();
	}
	
	@AfterMethod(alwaysRun = true)
	public void driverQuit(ITestResult iTestResult) throws IOException
	{
		if(iTestResult.getStatus()==ITestResult.FAILURE)
		{
			ScreenshotUtility screenShot=new ScreenshotUtility();
			screenShot.getScreenshot(driver, iTestResult.getName());
		}
		driver.quit();

	}
	
	
	


}
