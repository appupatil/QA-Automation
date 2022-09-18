package pageObjects;

import org.openqa.selenium.WebDriver;

public class PageObjectManager {
	
	
	public Landingpage landingpage;
	public OfferPage  offerpage;
	 public WebDriver driver;
	 public Checkoutpage  checkoutpage;
	public PageObjectManager(WebDriver driver) {
		this.driver=driver;
	}
	
	public Landingpage getLandingpage()
	{
		landingpage =new Landingpage(driver);
		return landingpage;
	}
	
	
	public OfferPage OfferPage ()
	{
		
		OfferPage  offerpage=new OfferPage(driver);
		return offerpage;
	}
	
	public Checkoutpage getCheckoutpage ()
	{
		
		Checkoutpage  checkoutpage=new Checkoutpage(driver);
		return checkoutpage;
	}
}
