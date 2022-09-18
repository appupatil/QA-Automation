package utilis;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.Scenario;
import io.cucumber.plugin.event.TestStep;

public class Genericutilis {
	
	public static WebDriver driver;
	
	
	public Genericutilis(WebDriver webDriverManager) {
		this.driver =driver;
	}

	public void SwitchWindowTochild() {
		
		Set<String>s1=driver.getWindowHandles();
		Iterator<String> i1=s1.iterator();
		String parentWindow=i1.next();
		String childWindow=i1.next();
		driver.switchTo().window(childWindow);
		
	}
	

public static void takeScreenShot(String fileName) throws IOException {
	
	File file=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(file, new File("C:/Users/USER/eclipse-workspace/BDDFramework(channaveerpatil)/test-output/"+fileName+".jpg"));
}
	
}
