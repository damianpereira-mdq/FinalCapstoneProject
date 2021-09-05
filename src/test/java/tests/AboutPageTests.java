package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.AboutPage;
import pages.ContactPage;

public class AboutPageTests extends TestBase {	
	   
    //WebDriver driver;
    ContactPage objContactPage; 
    AboutPage objAboutPage;
    
    @Test(priority=0)
    public void testAboutPageTitle () throws InterruptedException{
    //Create Home Page object    
    objAboutPage = new AboutPage(driver);
    //Verify home page
   Assert.assertTrue(objAboutPage.getAboutPageTitle().contains("Medicare - About Us"));
   Thread.sleep(1000);
   
   String pageTitle = objAboutPage.getAboutPageTitle();
   System.out.println(pageTitle);
   Thread.sleep(2000);
   
   objAboutPage.clickContact();
   objContactPage = new ContactPage(driver);
   
    }  

}
