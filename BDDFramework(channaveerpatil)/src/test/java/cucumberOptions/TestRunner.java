package cucumberOptions;


import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(tags="@placeorder or @offerpage2",
		features="src/test/java/features",
glue="stepDefination",monochrome=true,
plugin = {"html:target/cucumber.html","json:target/cucumber.json"})
public class TestRunner  extends AbstractTestNGCucumberTests{

	@Override
	@DataProvider(parallel=true)
	public Object[][] scenarios()
	{
		return super.scenarios();
	}
}
