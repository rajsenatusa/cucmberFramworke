package cucumberOptions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions (
		features = "src\\test\\java\\features",
		glue = "spinstepdefinitions", 
		tags= "@TriggerDailyManual", 
		
//		dryRun = true, // step definition implementation check
		monochrome = true, // test results in console formatted
		
		plugin = {"pretty", "html:target/cucumber.html", 
				   			"json:target/cucumber.json", 
				   			"junit:target/cucumber.xml" 
				 }
		
		)

public class cucumberTestRunner {
	

}
