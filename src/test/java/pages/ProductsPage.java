package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductsPage {

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
	
	@FindBy(xpath = "//tbody/tr[1]/td[6]/a[2]")
	private WebElement addCart;
	
	@FindBy(xpath = "//body/div[2]/div[1]/div[1]/table[1]/tfoot[1]/tr[2]/td[4]/a[1]")
	private WebElement checkout;		
	
	@FindBy(xpath = "//a[contains(text(),'Select')]")
	private WebElement addAddress;
	
	@FindBy(linkText = "Pay")
	private WebElement payment;

	// Constructor
	public ProductsPage(WebDriver driver) {
		this.driver = driver;
		// This initElements method will create all WebElements
		PageFactory.initElements(driver, this);
	}

	// Get the title of Products Page
	public String getProductsPageTitle() {
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
	
	public void addCart () {
		addCart.click();
	}
	
	public void selectCheckout () {
		checkout.click();
	}
	
	public void selectAddress () {
		addAddress.click();
	}
	
	public void makePayment () {
		payment.click();
	}

}
