package stepDefinations;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.HasFullPageScreenshot;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import io.cucumber.java.Scenario;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.Landingpage;
import utilis.GenericTestsetup;

public class LandingpagestepDefination {
	
public WebDriver driver;
public String LandingProductName;
public String offerpagProductName;
GenericTestsetup  testsetup;
Landingpage landingpage;

public LandingpagestepDefination(GenericTestsetup  testsetup) {
	
	this.testsetup=testsetup;
   this.landingpage =testsetup.pageObjectManager.getLandingpage();
}


     @Given("User lanuch the browser and navigative to GreenCart landing page")
     public void user_lanuch_the_browser_and_navigative_to_green_cart_landing_page() {
    
    	 Assert.assertTrue(landingpage.getTitleLandingpage().contains("Greenkart"));
    	 
	}
	


	@When("^user searched with Shortname \"([^\"]*)\" and extract actual name of product$")
	public void user_searched_with_shortname_and_extract_actual_name_of_product(String ShortName) throws InterruptedException {
	  //  Landingpage landingpage =new Landingpage(testsetup.driver);
	   
	    landingpage.searchItem(ShortName);
		Thread.sleep(2000);
		testsetup.LandingProductName= landingpage.getProductName().split("-")[0].trim();
		System.out.println(testsetup.LandingProductName+ "extracted from the homepage");
		
		
		
	}
	
	 @And("^Add \"([^\"]*)\" items  of selected product  to cart$")
	    public void add_something_items_of_selected_product_to_cart(String quantity) throws Throwable {
		
		    landingpage.incrementQuantity(Integer.parseInt(quantity));
		    
	        
	    }
	 
	

}
