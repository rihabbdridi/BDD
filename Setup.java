package Hooks;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Setup {
	public static WebDriver driver;

	@Before
	public void initial() {

		driver = DriverManager.getdriver();

	}

	@After
	public void finale() {
		driver.close();
	}
}
