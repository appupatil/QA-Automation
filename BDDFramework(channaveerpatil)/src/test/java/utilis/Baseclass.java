package utilis;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.cucumber.java.Scenario;

public class Baseclass {
	
	public WebDriver driver;
public WebDriver WebDriverManager() throws IOException
{
	FileInputStream fis= new FileInputStream(System.getProperty("user.dir")+"//src//test//Resources//global.properties");
	Properties pro= new Properties();
	pro.load(fis);
String url=	pro.getProperty("url");
	
	if(driver==null) {
		
		if(pro.getProperty("browser").equalsIgnoreCase("Chrome"))
		{
	System.setProperty("webdriver.chrome.driver", "System.getProperty(\"user.dir\")+\"//src//test//Resources//Drivers//chromedriver.exe");
	driver= new ChromeDriver();
		}
		else if(pro.getProperty("browser").equalsIgnoreCase("Edge")) {
			System.setProperty("webdriver.edge.driver", "System.getProperty(\"user.dir\")+\"//src//test//Resources//Drivers//mseedgedriver.exe");
			driver= new EdgeDriver();
		}
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("url");
	driver.manage().window().maximize();
	}
	return driver;
}

}
