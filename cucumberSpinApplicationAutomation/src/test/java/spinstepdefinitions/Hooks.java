package spinstepdefinitions;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.After;
import spinUtils.TestContextSetup;

public class Hooks {
	
	public WebDriver driver;
	TestContextSetup testContextSetup;

	public Hooks (TestContextSetup testContextSetup) {
		
		this.testContextSetup = testContextSetup;
	}
	

	
	@After
	public void afterScenario() throws IOException {
		
		testContextSetup.TestBase.DriverManager().close();
		
	}
	


}
