package pages;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;

import org.openqa.selenium.support.PageFactory;

public class HomePage {

	// All WebElements are identified by @FindBy annotation
	WebDriver driver;

	@FindBy(tagName = "title")
	private WebElement homeTitle;
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
	
	@FindBy(id="a_Antibiotics")
	WebElement antibiotics;  
	
	// Constructor
	public HomePage(WebDriver driver) {
		this.driver = driver;
		// This initElements method will create all WebElements
		PageFactory.initElements(driver, this);
	}

	// Get the title of Home Page
	public String getHomePageTitle() {
		return driver.getTitle();
	}
	
	public void clickLogin () {		
		loginButton.click();
	}
	
	public void clickAbout () {		
		aboutButton.click();
	}
	
	public void clickAntibiotics () {
		antibiotics.click();
		
	}

}
