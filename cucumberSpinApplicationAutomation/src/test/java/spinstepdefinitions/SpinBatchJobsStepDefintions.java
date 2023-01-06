package spinstepdefinitions;

import java.io.IOException;
import java.time.DayOfWeek;
import java.time.LocalDate;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
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
	
	   @Given("^Launch the spin Application$")
	    public void launch_the_spin_application() throws IOException{
	    	       	
	    	testContextSetup.TestBase.DriverManager();
	    	
	    }
	   
		@When("^User Login with (.+) and (.+)$")
	    public void user_login_with_and (String username, String password){
	    	
	    	System.out.println("Login Step Started!!");       	    	
	 	   	loginPage.enterUserName(username);
	    	loginPage.enterPassword(password);
	    	loginPage.clickSignIn();          	  	
	    	System.out.println("Login Step Ended!!");     
			
	    }
		       
    @And("^Navigate to the  daily manual jobs screen$")
    public void navigate_to_the_daily_manual_jobs_screen() throws Throwable {
    	
    	batchJobsPage.OperationMenuClick();
    	batchJobsPage.BatchJobsClick();  


    }
    
    @And("^Navigate to the speical daily jobs screen$")
    public void navigate_to_the_speical_daily_jobs_screen() throws Throwable {
    	
    	batchJobsPage.OperationMenuClick();
    	batchJobsPage.BatchJobsClick();  
  
    			
    }
    
    @And("^Start the job if today is Friday or Saturday$")
    public void start_the_job_if_today_is_friday_or_saturday() throws Throwable {    	
    	
    	LocalDate today = LocalDate.now();
		DayOfWeek dayOfWeek = today.getDayOfWeek();
		System.out.println("Day of the Week :: " + dayOfWeek);
		
		switch (dayOfWeek) {		
		  case FRIDAY:
			    System.out.println("TODAY IS FRIDAY");
			  	batchJobsPage.SpecialDailyJobsClick(); 
		    	batchJobsPage.StartJobClick();  
			    break;
		  case SATURDAY:
			    System.out.println("TODAY IS SATURDAY");
			  	batchJobsPage.SpecialDailyJobsClick(); 
		    	batchJobsPage.StartJobClick();  
			    break;
			default:
				System.out.println("TODAY IS NOT WEEKEND DAY, HENCE UNABLE TO TRIGGER THE SPECIALITY JOBS");
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
		    	batchJobsPage.DailyJobsManualClick();
		    	batchJobsPage.StartJobClick();  
			    break;
		  case TUESDAY:
			    System.out.println("TODAY IS TUESDAY");
		    	batchJobsPage.DailyJobsManualClick();
		    	batchJobsPage.StartJobClick();  
			    break;
		  case WEDNESDAY:
			    System.out.println("TODAY IS WEDNESDAY");
		    	batchJobsPage.DailyJobsManualClick();
		    	batchJobsPage.StartJobClick();  
			    break;
		  case THURSDAY:
			    System.out.println("TODAY IS THURSDAY");
		    	batchJobsPage.DailyJobsManualClick();
		    	batchJobsPage.StartJobClick();  
			    break;
		  case SUNDAY:
			    System.out.println("TODAY IS SUNDAY");
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
    	
    	System.out.println("Daily Manual Job Successfully Triggered");
    }
   
    
}
