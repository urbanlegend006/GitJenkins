package DriverInit;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverBase {

	public static WebDriver driver;
	
	
	public static WebDriver getDriver() {
		return driver;
	}
	
	public void initializeDriver() {
		System.setProperty("webdriver.chrome.driver", "E:\\Eclipse\\Selenium\\WebDrivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
	}
}
