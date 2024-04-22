package testRunners;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions (
		features = "src\\test\\java\\features",
		glue = "spinstepdefinitions", 
		tags= "@CopyUsersMirrorAccess", 
		
//		dryRun = true, // step definition implementation check
		monochrome = true, // test results in console formatted
		
		plugin = {"pretty", "html:target/cucumber.html", 
				   			"json:target/cucumber.json", 
				   			"junit:target/cucumber.xml" , 
				   			"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:", "rerun:target/failed_scenarios.txt"
				 }
		
		)

public class TestNGTestRunner extends AbstractTestNGCucumberTests   {
	

	@Override
	@DataProvider (parallel =false)
	public Object[][] scenarios () {
		
		return super.scenarios();
		
	}
	
	

}
