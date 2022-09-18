package stepDefinations;

import java.io.IOException;

import io.cucumber.java.After;
import utilis.GenericTestsetup;

public class Hooks {
	
GenericTestsetup  testsetup;

public Hooks(GenericTestsetup  testsetup)
{
	this.testsetup=testsetup;
}

@After
public void AfterScvenario() throws IOException {
	
	testsetup.testbase.WebDriverManager().quit();
}
}
