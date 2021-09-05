package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.LoginPage;
import pages.ProductsPage;

public class LoginPageTests extends TestBase {
	
	LoginPage objLoginPage;
	HomePage objHomePage;
	ProductsPage objProductsPage;
	
	@Test(priority=0)
    public void testLoginPageTitle () throws InterruptedException{
    //Create Home Page object    
    objLoginPage = new LoginPage(driver);
    //Verify home page
   Assert.assertTrue(objLoginPage.getLoginPageTitle().contains("Medicare - Login"));
   Thread.sleep(1000);
   
   String pageTitle = objLoginPage.getLoginPageTitle();
   System.out.println(pageTitle);
   Thread.sleep(2000);
   
   
   
    }
	
	@Test(priority=1)
	public void loginToMedicare () throws InterruptedException {
		
		objLoginPage.loginToMedicare("kn@gmail.com", "12345");
		Thread.sleep(2000);
		System.out.println("Succesfully logged");
		
	}
	
	@Test(priority=2)
	public void orderMedicare () throws InterruptedException {
		
		objHomePage = new HomePage (driver);
		objHomePage.clickAntibiotics();
		Thread.sleep(2000);
		
		objProductsPage = new ProductsPage(driver);
		objProductsPage.addCart();
		Thread.sleep(2000);
		objProductsPage.selectCheckout();
		Thread.sleep(500);
		objProductsPage.selectAddress();
		Thread.sleep(500);
		objProductsPage.makePayment();
		Thread.sleep(500);
		System.out.println("Order succesfully placed!");
	}
	
	
	

}
