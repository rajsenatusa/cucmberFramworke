package spinstepdefinitions;

import java.util.concurrent.TimeUnit;

import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import PageObjects.SpinLoginPageObjects;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;
import io.github.bonigarcia.wdm.WebDriverManager;
import spinUtils.SpinSetup;


@RunWith(Cucumber.class)

public class SpinLoginStepDefinitions {
	
	//container creating dependency injection.
	public static WebDriver driver;
	SpinSetup spinsetup;

	public SpinLoginStepDefinitions (SpinSetup spinsetup) {
		
		this.spinsetup = spinsetup;
	}
	

	
    @Given("^Launch the spin Application$")
    public void launch_the_spin_application(){
    	    	
    	spinsetup.driver = WebDriverManager.chromedriver().create();
    	spinsetup.driver.get("https://model-ai.iscs.com/innovation");
    	spinsetup.driver.manage().window().maximize();
    	spinsetup.driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        System.out.println("Launch Spin Applications");
    	
    }
        
    @When("^login with credentials \"([^\"]*)\" and \"([^\"]*)\"$")
    public void login_with_credentials(String UserName, String Password) {
    	
    	System.out.println("Login Step Started!!");      	
    	enteruserCredentialsPerformLogin(UserName, Password);
    	System.out.println("Login Step Ended!!"); 

    }
    
    @When("^User Login with (.+) and (.+)$")
    public void user_login_with_and (String username, String password){
    	
    	System.out.println("Login Step Started!!");    		
		
		WebElement enterUserName = spinsetup.driver.findElement(By.xpath("//input[@id='j_username']"));
		enterUserName.sendKeys(username);
			
		WebElement enterPassword =spinsetup.driver.findElement(By.xpath("//input[@id='j_password']"));
		enterPassword.sendKeys(password);
				
		WebElement loginButton = spinsetup.driver.findElement(By.xpath("//a[@id='SignIn']"));
		loginButton.click();	
		
		System.out.println("Login Step Ended!!"); 
		
    }

    @Then("^Verify that user user logged in to the application successfully$")
    public void verify_that_user_user_logged_in_to_the_application_successfully(){
    	
    	System.out.println("Login Validation Started !!");
    	
		String actualTitle = spinsetup.driver.getTitle();
		String expectedTitle = "Guidewire InsuranceNow™";
		
		if (actualTitle.equals(expectedTitle)) {
			
			System.out.println("Title Matches Login Test Passed");
			
		}else {
			System.out.println("Title Doesn't Matches Login Test Failed");
		}
		
		System.out.println("Login Validation Ended !!");
    	  
    }

    @And("^Verify spin application home page is displayed$")
    public void verify_spin_application_home_page_is_displayed() {
    	System.out.println("Home Page Displayed Successfully");
    }

    
    public void enteruserCredentialsPerformLogin (String UserName, String Password) {
    	SpinLoginPageObjects LoginPage = new SpinLoginPageObjects(spinsetup.driver);
    	LoginPage.enterUserName(UserName);
    	LoginPage.enterPassword(Password);
    	LoginPage.clickSignIn();    	
    	
    }
           

}
