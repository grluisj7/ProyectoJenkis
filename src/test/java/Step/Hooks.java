package Step;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks {

	public static WebDriver driver;

	@Before
	public void SetupChrome() {

		System.setProperty("webdriver.chrome.driver",
				"/Users/luisgonzalez/eclipse-workspace/ss/CHROME DRIVE/chromedriver");
		driver = new ChromeDriver();
	}

	@AfterStep
	public static void takeScreenshot(Scenario scenario) {
		final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
		scenario.attach(screenshot, "image/png", "image");
	}

	@After
	public void teardown() {
		driver.close();
	}

}

