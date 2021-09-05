package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	WebDriver driver;

	@FindBy(id = "login")
	private WebElement loginButton;

	@FindBy(id = "username")
	private WebElement usernameInput;

	@FindBy(id = "password")
	private WebElement passwordInput;

	@FindBy(xpath = "//input[@type='submit']")
	private WebElement loginClick;

	// Constructor
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		// This initElements method will create all WebElements
		PageFactory.initElements(driver, this);
	}

	// Get the title of Home Page
	public String getLoginPageTitle() {
		return driver.getTitle();
	}

	public void loginToMedicare(String strUserName, String strPasword) {

		this.usernameInput.sendKeys(strUserName);
		this.passwordInput.sendKeys(strPasword);
		this.loginClick.click();

	}

}
