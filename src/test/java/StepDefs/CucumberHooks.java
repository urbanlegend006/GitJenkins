package StepDefs;

import org.openqa.selenium.WebDriver;

import DriverInit.DriverBase;
import DriverInit.properties;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class CucumberHooks extends DriverBase {
	
	WebDriver driver;
	DriverBase dBase;
	
	
	@Before
	public void setUp() {
		
		initializeDriver();
		this.driver = DriverBase.getDriver();
		driver.get(properties.getPropInstnace().getProperty("url"));
	}
	
	@After
	public void tearDown() {
		driver.quit();
	}
}
