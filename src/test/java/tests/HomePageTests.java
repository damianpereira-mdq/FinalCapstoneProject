package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.AboutPage;
import pages.HomePage;

public class HomePageTests extends TestBase {

        
    //WebDriver driver;
    HomePage objHomePage; 
    AboutPage objAboutPage;

     

    @Test(priority=0)
    public void testHomePageTitle () throws InterruptedException{
    //Create Home Page object    
    objHomePage = new HomePage(driver);
    //Verify home page
   Assert.assertTrue(objHomePage.getHomePageTitle().contains("Medicare - Home"));
   String pageTitle = objHomePage.getHomePageTitle();
   System.out.println(pageTitle);
   Thread.sleep(2000);
   
   objHomePage.clickAbout();
   objAboutPage = new AboutPage(driver);
   
    }   
    
    

}
