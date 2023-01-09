package spinstepdefinitions;

import java.time.DayOfWeek;
import java.time.LocalDate;

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
	
		          
    @And("^Start the job if today is Friday or Saturday$")
    public void start_the_job_if_today_is_friday_or_saturday() throws Throwable {    	
    	
    	LocalDate today = LocalDate.now();
		DayOfWeek dayOfWeek = today.getDayOfWeek();
		System.out.println("Day of the Week :: " + dayOfWeek);
		
		switch (dayOfWeek) {		
		  case FRIDAY:
			    System.out.println("TODAY IS FRIDAY");
		    	batchJobsPage.OperationMenuClick();
		    	batchJobsPage.BatchJobsClick();  
			  	batchJobsPage.SpecialDailyJobsClick(); 
		    	batchJobsPage.StartJobClick();  
			    break;
		  case SATURDAY:
			    System.out.println("TODAY IS SATURDAY");
		    	batchJobsPage.OperationMenuClick();
		    	batchJobsPage.BatchJobsClick();  
			  	batchJobsPage.SpecialDailyJobsClick(); 
		    	batchJobsPage.StartJobClick();  
			    break;
			default:
				System.out.println("TODAY IS NOT WEEKEND DAY, HENCE UNABLE TO TRIGGER THE SPECIAL DAILY JOBS");
				break; 
		}
   
    }
    
    @And("^Start the job if the day is other than Friday or Saturday$")
    public void Start_the_job_if_the_day_is_other_than_Friday_or_Saturday() throws Throwable {    	
    	
    	LocalDate today = LocalDate.now();
		DayOfWeek dayOfWeek = today.getDayOfWeek();
		System.out.println("Day of the Week :: " + dayOfWeek);
		
		switch (dayOfWeek) {		
		  case MONDAY:			    
			    System.out.println("TODAY IS MONDAY");
		    	
		    	batchJobsPage.OperationMenuClick();
		    	batchJobsPage.BatchJobsClick();
		    	batchJobsPage.DailyJobsManualClick();
		    	batchJobsPage.StartJobClick();  
			    break;
		  case TUESDAY:
			    System.out.println("TODAY IS TUESDAY");
				batchJobsPage.OperationMenuClick();
		    	batchJobsPage.BatchJobsClick();
		    	batchJobsPage.DailyJobsManualClick();
		    	batchJobsPage.StartJobClick();  
			    break;
		  case WEDNESDAY:
			    System.out.println("TODAY IS WEDNESDAY");
				batchJobsPage.OperationMenuClick();
		    	batchJobsPage.BatchJobsClick();
		    	batchJobsPage.DailyJobsManualClick();
		    	batchJobsPage.StartJobClick();  
			    break;
		  case THURSDAY:
			    System.out.println("TODAY IS THURSDAY");
				batchJobsPage.OperationMenuClick();
		    	batchJobsPage.BatchJobsClick();
		    	batchJobsPage.DailyJobsManualClick();
		    	batchJobsPage.StartJobClick();  
			    break;
		  case SUNDAY:
			    System.out.println("TODAY IS SUNDAY");
				batchJobsPage.OperationMenuClick();
		    	batchJobsPage.BatchJobsClick();
		    	batchJobsPage.DailyJobsManualClick();
		    	batchJobsPage.StartJobClick();  
			    break;
			default:
				System.out.println("TODAY IS NOT WEEKEND DAY, HENCE UNABLE TO TRIGGER THE SPECIALITY JOBS");
				break; 
		}
   
    }
    
    @Then("^Verify that job successfully running$")
    public void verify_that_job_successfully_running() throws Throwable {    	
    	
    	System.out.println("Daily Jobs Successfully Running");
    }
   
    
}
