package spinstepdefinitions;

import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.junit.Cucumber;
import pageObjects.DailyJobsManualPage;
import pageObjects.LoginPage;
import pageObjects.ObjectManager;
import spinUtils.TestContextSetup;


@RunWith(Cucumber.class)

public class DailyJobsManualStepDefinitions {
	
	//container creating dependency injection.
	public WebDriver driver;
	public ObjectManager ObjectManager;
	public TestContextSetup testContextSetup;
	public LoginPage loginPage;
	public DailyJobsManualPage dailyJobsManualPage;

	public DailyJobsManualStepDefinitions (TestContextSetup testContextSetup) {
		
		this.testContextSetup = testContextSetup;
		this.dailyJobsManualPage = testContextSetup.ObjectManager.getdailyjobManualPage();

	}
		       
    @And("^Navigate to the  daily manual jobs screen$")
    public void navigate_to_the_daily_manual_jobs_screen()  {
    	
    	dailyJobsManualPage.OperationMenuClick();
    	dailyJobsManualPage.BatchJobsClick();  
    	dailyJobsManualPage.DailyJobsManualClick();
    }
    
    @And("^Start the job$")
    public void start_the_job()  {
    	
    	dailyJobsManualPage.StartJobClick();     
    }
    
    @Then("^Verify that job successfully running$")
    public void verify_that_job_successfully_running() {
    	System.out.println("Daily Manual Job Successfully Triggered");
    }
   
    
}
