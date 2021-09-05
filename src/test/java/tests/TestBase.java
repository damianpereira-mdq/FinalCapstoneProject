package tests;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class TestBase {
	public static WebDriver driver = null;
	String driverPath = "E:\\Simplilearn\\FinalProjectCapstone\\webdriver\\chromedriver.exe";

	@BeforeSuite
	public void initialize() throws IOException {
		System.setProperty("webdriver.chrome.driver", driverPath);
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://localhost:8080/medicare/");
		System.out.println("-------- Before Suite");
	}

	@AfterSuite
	public void TeardownTest() {

		System.out.println("-------- After Suite");
		TestBase.driver.quit();
	}
}
