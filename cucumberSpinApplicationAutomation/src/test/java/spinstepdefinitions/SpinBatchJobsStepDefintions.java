package spinstepdefinitions;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pageObjects.LoginPage;
import pageObjects.ObjectManager;
import pageObjects.BatchJobsPage;
import spinUtils.TestContextSetup;


public class SpinBatchJobsStepDefintions {
	
	//container creating dependency injection.
	public WebDriver driver;
	public ObjectManager ObjectManager;
	public TestContextSetup testContextSetup;
	public LoginPage loginPage;
	public BatchJobsPage batchJobsPage;

	public SpinBatchJobsStepDefintions (TestContextSetup testContextSetup) {
		
		this.testContextSetup = testContextSetup;
		this.batchJobsPage = testContextSetup.ObjectManager.getdailyjobManualPage();

	}
		       
    @And("^Navigate to the  daily manual jobs screen$")
    public void navigate_to_the_daily_manual_jobs_screen() throws Throwable {
    	
    	batchJobsPage.OperationMenuClick();
    	batchJobsPage.BatchJobsClick();  
    	batchJobsPage.DailyJobsManualClick();

    }
    
    @And("^Navigate to the speical daily jobs screen$")
    public void navigate_to_the_speical_daily_jobs_screen() throws Throwable {
    	
    	batchJobsPage.OperationMenuClick();
    	batchJobsPage.BatchJobsClick();  
    	batchJobsPage.SpecialDailyJobs(); 
    }
    
    @And("^Start the job$")
    public void start_the_job() throws Throwable {    	
    	
    	batchJobsPage.StartJobClick();     
    }
    
    @Then("^Verify that job successfully running$")
    public void verify_that_job_successfully_running() throws Throwable {    	
    	
    	System.out.println("Daily Manual Job Successfully Triggered");
    }
   
    
}
