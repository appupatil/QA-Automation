package utilis;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import pageObjects.PageObjectManager;

public class GenericTestsetup {
	public WebDriver driver;
	public String LandingProductName;
	public Baseclass testbase;
	public Genericutilis genericutilis;
	public PageObjectManager  pageObjectManager;
	
	public GenericTestsetup() throws IOException {
		
		testbase=new Baseclass();
		 pageObjectManager = new PageObjectManager(testbase.WebDriverManager()); 
		genericutilis=new Genericutilis(testbase.WebDriverManager());
		
	}

}
