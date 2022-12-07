package spinstepdefinitions;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;
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
	
	@AfterStep
	public void addScreenshot(Scenario scenario) throws IOException{
		
		WebDriver driver = testContextSetup.TestBase.DriverManager();
		
		if (scenario.isFailed()) {
			
			//capture Screenshot
			File sourcePath = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			byte[] fileContent = FileUtils.readFileToByteArray(sourcePath);
			scenario.attach(fileContent, "image/png", "image");
		}
		
	}
	
	
	
	


}
