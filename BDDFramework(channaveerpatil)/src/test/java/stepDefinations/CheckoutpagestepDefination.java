package stepDefinations;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.Checkoutpage;
import pageObjects.Landingpage;
import utilis.GenericTestsetup;

public class CheckoutpagestepDefination {
	
public WebDriver driver;
public String LandingProductName;
public String offerpagProductName;
public Checkoutpage  checkoutpage;
GenericTestsetup  testsetup;

public CheckoutpagestepDefination(GenericTestsetup  testsetup) {
	
	this.testsetup=testsetup;
	this.checkoutpage=testsetup.pageObjectManager.getCheckoutpage();
}


 
@Then("^user Proceeds to checkout and  validate \"([^\"]*)\" items in checkout page$")
public void user_proceeds_to_checkout_and_validate_something_imtes_in_checkout_page(String scenario) throws Throwable {

	checkoutpage.CheckouItetm();
}

@And("^verify user has  ability to enter promo code and place the order$")
public void verify_user_has_ability_to_enter_promi_code_and_place_the_order() throws Throwable {
	
	Assert.assertTrue(checkoutpage.Verifypromoapplybutton());
   Assert.assertTrue(checkoutpage.VerifyPlaceorder());
    
}

	

}
