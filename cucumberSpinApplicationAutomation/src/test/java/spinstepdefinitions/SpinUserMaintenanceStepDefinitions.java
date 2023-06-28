package spinstepdefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pageObjects.LoginPage;
import pageObjects.ObjectManager;
import pageObjects.UserMaintenancePage;
import pageObjects.BatchJobsPage;
import spinUtils.TestContextSetup;


public class SpinUserMaintenanceStepDefinitions {
	
	//container creating dependency injection.
	public WebDriver driver;
	public ObjectManager ObjectManager;
	public TestContextSetup testContextSetup;
	public LoginPage loginPage;
	public BatchJobsPage batchJobsPage;
	public UserMaintenancePage userMaintenancePage;

	public SpinUserMaintenanceStepDefinitions (TestContextSetup testContextSetup) {
		
		this.testContextSetup = testContextSetup;
		this.userMaintenancePage = testContextSetup.ObjectManager.getUserMainteanacePage();

	}	       
		
    
	@And("^Enter User Code : (.+)$")
	   public void enter_user_code(String usercode) throws Throwable {	
		userMaintenancePage.enterUserCode(usercode);	
		}
	
	@And("^Select User Type : (.+)$")
	   public void select_user_type(String usertype) throws Throwable {		 
		 userMaintenancePage.selectUserType(usertype);
	 	}

	 @And("^Enter ConcurrentSessions : (.+)$")
	   public void enter_concurrentsessions(String concurrentsessions) throws Throwable {		 
		 userMaintenancePage.enterConcurrentSessions(concurrentsessions);
	 	}	
	 
	   @And("^Select Status : (.+)$")
	   public void select_status(String status) throws Throwable {
		   userMaintenancePage.selectStatus(status);
	   }
	   
	   @And("^Select Language : (.+)$")
	   public void select_language(String language) throws Throwable {
		   userMaintenancePage.selectLanguage(language);
	   }
	   
	   @And("^Enter First Name : (.+)$")
	   public void enter_first_name(String firstname) throws Throwable {
		   userMaintenancePage.enterFirstName(firstname);
	   }
	   
	   @And("^Enter Last Name : (.+)$")
	   public void enter_last_name(String lastname) throws Throwable {
		   userMaintenancePage.enterLastName(lastname);
	   }
	   
	   @And("^Enter City of the the User : (.+)$")
	   public void enter_city_of_the_the_user(String city) throws Throwable {
		   userMaintenancePage.enterCity(city);
	   }
	   
	   @And("^Select the State of the User : (.+)$")
	   public void select_the_state_of_the_user(String state) throws Throwable {
		   userMaintenancePage.selectState(state);
	   }
	   
	   @And("^Select the Country : (.+)$")
	   public void select_the_country(String country) throws Throwable {		   
		   userMaintenancePage.selectCountry(country);
	   }
	   
	   @And("^Enter the Zip Code of the User : (.+)$")
	    public void enter_the_zip_code_of_the_user(String zip) throws Throwable {
		   userMaintenancePage.enterZip(zip);
	   }

	    @And("^Enter Address of the User : (.+)$")
	   public void enter_address_of_the_user(String address) throws Throwable {		   
	    	userMaintenancePage.enterAddress(address);
	   }


	   @And("^Click Verify Address Link$")
	   public void click_verify_address_link() throws Throwable {	
		   userMaintenancePage.clickOnVerifyAddressLink();
	   }
       
        @And("^Select Type of the Primary Phone : (.+)$")
        public void select_type_of_the_primary_phone(String typeofprimaryphone) throws Throwable {

        	userMaintenancePage.selectTypeOfPrimaryPhone(typeofprimaryphone);
        }

        @And("^Enter the Primary Phone Number : (.+)$")
        public void enter_the_primary_phone_number(String primaryphonenumber) throws Throwable {
        	userMaintenancePage.enterPrimaryPhone(primaryphonenumber);        	
        }
        
        @And("^Enter the Email Address : (.+)$")
        public void enter_the_email_address(String emailaddress) throws Throwable {
        	
        	userMaintenancePage.enterEmailAddress(emailaddress);

        }


        @And("^Select Department : (.+)$")
        public void select_department(String department) throws Throwable {        	
        	userMaintenancePage.selectDepartment(department);
        }

        @And("^Enter Supervisor Code : (.+)$")
        public void enter_supervisor_code(String supervisorcode) throws Throwable {
        	userMaintenancePage.enterSupervisorCode(supervisorcode);
        }

        @And("^Select Toolbar Search Mode : (.+)$")
        public void select_toolbar_search_mode(String toolbarsearchmode) throws Throwable {        	
        	userMaintenancePage.selectToolBarSearchMode(toolbarsearchmode);
        }

        @And("^Enter Password for the User : (.+)$")
        public void enter_password_for_the_user(String password) throws Throwable {
        	userMaintenancePage.enterPassword(password);        	
        }

        @And("^Enter Confirm Password for the user : (.+)$")
        public void enter_confirm_password_for_the_user(String confirmpassword) throws Throwable {
        	userMaintenancePage.enterConfirmPassword(confirmpassword);
        }

        @And("^Select User Must Change Password On Next Login$")
        public void select_user_must_change_password_on_next_login() throws Throwable {
         	userMaintenancePage.clickOnUserMuchChangePasswordOnNextLogin();      	
        }
        
   
        @And("^Select Password Policy : (.+)$")
        public void select_password_policy(String passwordpolicy) throws Throwable {
        	userMaintenancePage.selectPasswordPolicy(passwordpolicy);
        }
        
        
        @And("^Add Provider Code : (.+)$")
        public void add_provider_code_(String providercode) throws Throwable {
        	userMaintenancePage.enterProviderCodeNumber(providercode);
        }

        @And("^Select Branch Code : (.+)$")
        public void select_branch_code(String branchcode) throws Throwable {
        	userMaintenancePage.selectBranchCode(branchcode);
        }


        @And("^Click On Save at UserMaintenance Screen$")
        public void click_on_save_at_usermaintenance_screen() throws Throwable {
        	userMaintenancePage.clickOnUserMaintenaceSaveButton();
        }
        

        @Then("^Verify User Successfully Created$")
        public void verify_user_successfully_created() throws Throwable {

     	   userMaintenancePage.verificationOfUserCreation();
        }
        
        @Then("^Add User Role as : (.+)$")
        public void add_user_role_as(String userrole) throws Throwable {
        	
        	userMaintenancePage.addRoleforUser(userrole);
        	
        }
        
        @And("^Search User Existing User Code:(.+)$")
        public void search_existing_user_code(String searchexistinguser) throws Throwable {
        	userMaintenancePage.searchExistingUser(searchexistinguser);
        	userMaintenancePage.clickOnUserCodeSearchBtn();
        }
        
        @And("^Click Copy to add Profile$")
        public void click_copy_to_add_profile() throws Throwable {
        	userMaintenancePage.clickOnCopyUserProfile();
        }

}

