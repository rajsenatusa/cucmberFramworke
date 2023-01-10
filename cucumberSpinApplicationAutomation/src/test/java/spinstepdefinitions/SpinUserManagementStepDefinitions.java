package spinstepdefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pageObjects.LoginPage;
import pageObjects.ObjectManager;
import pageObjects.UserManagementPage;
import pageObjects.BatchJobsPage;
import spinUtils.TestContextSetup;


public class SpinUserManagementStepDefinitions {
	
	//container creating dependency injection.
	public WebDriver driver;
	public ObjectManager ObjectManager;
	public TestContextSetup testContextSetup;
	public LoginPage loginPage;
	public BatchJobsPage batchJobsPage;
	public UserManagementPage userManagementPage;

	public SpinUserManagementStepDefinitions (TestContextSetup testContextSetup) {
		
		this.testContextSetup = testContextSetup;
		this.userManagementPage = testContextSetup.ObjectManager.getUserManagementPage();

	}	       
	   
	    @And("^navigate to admin > user management screen$")
	    public void navigate_to_admin_user_management_screen() throws Throwable {
	    	
	    	userManagementPage.AdminMenuClick();
	    	userManagementPage.UserManagementClick();
	    }

	    @And("^Search the user (.+)$")
	    public void search_the_user(String searchuser) throws Throwable {
	    	
	    	userManagementPage.SearchByTextBox(searchuser);
	    	userManagementPage.SearchBySearchButtonClick();

	    }

	    @And("^Navigate to reset password Screen$")
	    public void navigate_to_reset_password_screen() throws Throwable {
	    	userManagementPage.resetpasswordLinkClick();

	    }

	    @And("^Enter (.+) and click on change password$")
	    public void enter_and_click_on_change_password(String newpassword) throws Throwable {
	    	
	    	userManagementPage.EnterNewPassword(newpassword);
	    	userManagementPage.EnterConfirmPassword(newpassword);
	    	userManagementPage.UserMustChangePasswordOnNextLoginCheckBox();
	    	userManagementPage.ChangePasswordButton();   	
	    	
	    }
   
	    @Then("^Verify password Changed Successfully$")
	    public void verify_password_changed_successfully() throws Throwable {
	    	
	    	userManagementPage.validationPasswordChangeText();	    	
	    	System.out.println("USER PASSWORD CHANGED SUCCESSFULLY");
	    }
	    	
	    	
	    		  
    
}
