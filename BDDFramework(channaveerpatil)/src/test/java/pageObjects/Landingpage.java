package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class Landingpage {
	
public WebDriver driver;
public Landingpage(WebDriver driver) {
	this.driver=driver;
		
	}

private By search=By.xpath("//input[@type='search']");
private By ProductName= By.cssSelector("h4.product-name");
private By TopDeals=By.linkText("Top Deals");
private By increment= By.cssSelector("a.increment");
private By  AddtoCartbutton= By.cssSelector(".product-action button");


public void searchItem(String name)
{
	driver.findElement(search).sendKeys(name);
}

public void getSearchText()
{
	driver.findElement(search).getText();
}

public String getProductName()
{
	return driver.findElement(ProductName).getText();
}

public void SelectTopdeals()
{
	 driver.findElement(TopDeals).click();
}

public String getTitleLandingpage()
{
	return driver.getTitle();
}

public void  incrementQuantity(int quantity) {
	
	int i= quantity-1;
	while(i>0) {
		driver.findElement(increment).click();
	}
}

public void  addtocartbutton() {
	
driver.findElement(AddtoCartbutton).click();
}


}
