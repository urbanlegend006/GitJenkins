package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import DriverInit.DriverBase;

public class loginPage extends DriverBase {
	
	WebDriver driver;

	@FindBy(id="logo-icon")
	private WebElement YTLogo;
	

	public loginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public boolean isYTLogoExists() {
		if(!YTLogo.isDisplayed()) return false;
		return true;
	}
	
}
