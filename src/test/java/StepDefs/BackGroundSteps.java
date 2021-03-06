package StepDefs;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import DriverInit.DriverBase;
import Pages.loginPage;
import io.cucumber.java.en.Given;

public class BackGroundSteps extends DriverBase {
	WebDriver driver;
	
	@Given("YouTube home is displayed")
	public void you_tube_home_is_displayed() {
		driver = getDriver();
		loginPage lp = new loginPage(driver);
		Assert.assertTrue(lp.isYTLogoExists());
	}
	
}
