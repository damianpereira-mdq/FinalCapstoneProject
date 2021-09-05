package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.ContactPage;
import pages.LoginPage;
import pages.ProductsPage;

public class ProductsPageTests extends TestBase {
	
ProductsPage objProductsPage;

LoginPage objLoginPage;
    
    @Test(priority=0)
    public void testAboutPageTitle () throws InterruptedException{
    //Create Home Page object    
    objProductsPage = new ProductsPage(driver);
    //Verify home page
   Assert.assertTrue(objProductsPage.getProductsPageTitle().contains("Medicare - All Products"));
   Thread.sleep(1000);
   
   String pageTitle = objProductsPage.getProductsPageTitle();
   System.out.println(pageTitle);
   Thread.sleep(2000);
   
   objProductsPage.clickLogin();
   objLoginPage = new LoginPage(driver);
   
    }  

}
