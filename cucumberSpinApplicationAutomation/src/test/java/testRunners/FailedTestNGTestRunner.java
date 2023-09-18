package testRunners;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;


@io.cucumber.testng.CucumberOptions (
		features = "@target/failed_scenarios.txt",		
		glue = "spinstepdefinitions", 
		
//		dryRun = true, // step definition implementation check
		monochrome = true, // test results in console formatted
		
		plugin = {"pretty", "html:target/cucumber.html", 
				   			"json:target/cucumber.json", 
				   			"junit:target/cucumber.xml" , 
				   			"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
				 }
		
		)

public class FailedTestNGTestRunner extends AbstractTestNGCucumberTests   {
	
	@Override
	@DataProvider(parallel = true)
	public Object[][] scenarios()
	{
		return super.scenarios();
	}
	
	
	

}