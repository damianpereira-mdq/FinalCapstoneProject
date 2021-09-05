package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.ContactPage;
import pages.ProductsPage;

public class ContactPageTests extends TestBase {
	
	//WebDriver driver;
    ContactPage objContactPage; 
    ProductsPage objProductsPage;
    
    @Test(priority=0)
    public void testAboutPageTitle () throws InterruptedException{
    //Create Home Page object    
    objContactPage = new ContactPage(driver);
    //Verify home page
   Assert.assertTrue(objContactPage.getContactPageTitle().contains("Medicare - Contact"));
   Thread.sleep(1000);
   
   String pageTitle = objContactPage.getContactPageTitle();
   System.out.println(pageTitle);
   Thread.sleep(2000);
   
   objContactPage.clickProducts();
   objProductsPage = new ProductsPage(driver);
   
    }  

}
