package stepDefinations;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pageObjects.Landingpage;
import pageObjects.OfferPage;
import pageObjects.PageObjectManager;
import utilis.GenericTestsetup;


public class offerpagestepDefination {
	
public String offerpagProductName;
GenericTestsetup  testsetup;
PageObjectManager  pageObjectManager;
	public offerpagestepDefination(GenericTestsetup  testsetup) {
		
		this.testsetup=testsetup;
	}
	
	@Then("^user searched  for \"([^\"]*)\" shortname in offer page$")
	public void user_searched_for_shortname_in_offer_page(String ShortName) throws InterruptedException {
	   
		SwitchToOfferpage();
		OfferPage  offerpage=new OfferPage(testsetup.driver);
		offerpage.searchItem(ShortName);
		Thread.sleep(2000);
		 offerpagProductName=offerpage.getProductName();
		 
	}
	
	public void SwitchToOfferpage() {
		
		//pageObjectManager=new PageObjectManager(testsetup.driver);
		//Landingpage landingpage =new Landingpage(testsetup.driver);
		/*ArrayList<String>tab= new ArrayList<String>(testsetup.driver.getWindowHandles());
		testsetup.driver.switchTo().window(tab.get(1)); */
		Landingpage landingpage =testsetup.pageObjectManager.getLandingpage();
		landingpage.SelectTopdeals();
		testsetup.genericutilis.SwitchWindowTochild();
		}
		
	
	
	 @And("^validate product name in offer page matches with Lanidng page$")
	    public void validate_product_name_in_offer_page_matches_with_lanidng_page() throws Throwable {
		
		 Assert.assertEquals(offerpagProductName, testsetup.LandingProductName);
	}
	
}
