package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactPage {
	WebDriver driver;

	@FindBy(id = "login")
	private WebElement loginButton;
	@FindBy(id = "about")
	private WebElement aboutButton;
	@FindBy(id = "contact")
	private WebElement contactButton;
	@FindBy(id = "listProducts")
	private WebElement productsButton;
	@FindBy(id = "signup")
	private WebElement signUpButton;

	// Constructor
	public ContactPage(WebDriver driver) {
		this.driver = driver;
		// This initElements method will create all WebElements
		PageFactory.initElements(driver, this);
	}
	
	// Get the title of Home Page	
		public String getContactPageTitle() {
			return driver.getTitle();
		}	
		
	public void clickAbout () {		
		aboutButton.click();
	}
	
	public void clickContact () {		
		contactButton.click();
	}
	
	public void clickProducts () {		
		productsButton.click();
	}
	
	public void clickLogin() {
		loginButton.click();
	}

}
