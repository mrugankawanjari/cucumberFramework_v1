package utilities;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumDriver {

	private static SeleniumDriver seleniumDriver;
	
	//init WebDriver
	private static WebDriver driver;
	
	private static WebDriverWait wait;
	
	private final static int TIMEOUT = 30;
	
	private final static int PAGE_LOAD_TIMEOUT = 30;
	
	private SeleniumDriver() {
	
		driver = new ChromeDriver();//singleton pattern
		driver.manage().window().maximize();
		
		wait = new WebDriverWait(driver, TIMEOUT);
		driver.manage().timeouts().implicitlyWait(TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
	}
	
	public static void openPage(String url) {
		driver.get(url);
	}
	
	public static WebDriver getDriver() {
		return driver;
	}
	
	public void setUpDriver() { //this will create object of chromeDriver
		if(seleniumDriver==null) {
			seleniumDriver = new SeleniumDriver();
		}
	}
	
	
	public static void tearDown() {
		if(driver!=null) {
			driver.close();
			driver.quit();
		}
		seleniumDriver = null;
	}
	
}
