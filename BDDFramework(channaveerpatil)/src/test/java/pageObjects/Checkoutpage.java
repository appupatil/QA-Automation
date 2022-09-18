package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Checkoutpage {

	
	
	public WebDriver driver;
	public Checkoutpage(WebDriver driver) {
		this.driver=driver;
			
		}

	private By cartBag=By.cssSelector("img[alt='Cart']");
	private By Checkoutbutton= By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT'])");
	private By promoapplybutton=By.xpath("//button[@class='promoBtn']");
    private By Placeorder=By.xpath("//button[contains(text(),'Place Order')]");

	public void CheckouItetm() {
	driver.findElement(cartBag).click();
	driver.findElement(Checkoutbutton).click();
	
	}
	
	public  boolean Verifypromoapplybutton() {
		
	 return driver.findElement(promoapplybutton).isDisplayed();
      
	 
}
	public  boolean VerifyPlaceorder() {
		
		 return driver.findElement(Placeorder).isDisplayed();
	 
}
}
