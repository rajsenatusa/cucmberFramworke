package spinstepdefinitions;

import java.io.IOException;

import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;
import pageObjects.LoginPage;
import pageObjects.ObjectManager;
import spinUtils.TestContextSetup;

@RunWith(Cucumber.class)
public class LoginStepDefinitions {
	
	//container creating dependency injection.
	public WebDriver driver;
	public ObjectManager ObjectManager;
	public TestContextSetup testContextSetup;
	public LoginPage loginPage;

	public LoginStepDefinitions (TestContextSetup testContextSetup) {
		
		this.testContextSetup = testContextSetup;
		this.loginPage = testContextSetup.ObjectManager.getspinLoginPage();

	}
		
    @Given("^Launch the spin Application$")
    public void launch_the_spin_application() throws IOException{
    	       	
    	testContextSetup.TestBase.DriverManager();
    	
    }
        
    @When("^login with credentials \"([^\"]*)\" and \"([^\"]*)\"$")
    public void login_with_credentials(String UserName, String Password) {
    	
    	System.out.println("Login Step Started!!");      	
      	loginPage.enterUserName(UserName);
    	loginPage.enterPassword(Password);
    	loginPage.clickSignIn();        	
    	System.out.println("Login Step Ended!!"); 

    }
    
    @When("^User Login with (.+) and (.+)$")
    public void user_login_with_and (String username, String password){
    	
    	System.out.println("Login Step Started!!");       	    	
 	   	loginPage.enterUserName(username);
    	loginPage.enterPassword(password);
    	loginPage.clickSignIn();    			
		System.out.println("Login Step Ended!!"); 
		
    }

    @Then("^Verify that user user logged in to the application successfully$")
    public void verify_that_user_user_logged_in_to_the_application_successfully(){
    	
    	System.out.println("Login Validation Started !!");      	
    	testContextSetup.GenericUtils.validateLoginTitile();    	
    	System.out.println("Login Validation Ended !!");
    	  
    }

    @And("^Verify spin application home page is displayed$")
    public void verify_spin_application_home_page_is_displayed() {
    
    	System.out.println("Home Page Displayed Successfully");
    }

      
}
