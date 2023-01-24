package spinstepdefinitions;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pageObjects.ObjectManager;
import pageObjects.ClaimMaintenancePage;
import spinUtils.TestContextSetup;


public class SpinClaimMaintenanceStepDefinitions {
	
	//container creating dependency injection.
	public WebDriver driver;
	public ObjectManager ObjectManager;
	public TestContextSetup testContextSetup;
	public ClaimMaintenancePage claimMaintenancePage;
	
	
	public SpinClaimMaintenanceStepDefinitions (TestContextSetup testContextSetup) {
		
		this.testContextSetup = testContextSetup;
		this.claimMaintenancePage = testContextSetup.ObjectManager.getClaimMainteanacePage();

	}	 

	
	    @And("^Navigate to Claims > Claims Maintenance Screen > Provider > New Provider$")
	    public void navigate_to_claims_claims_maintenance_screen_provider_new_provider() throws Throwable {
	    	
	    	claimMaintenancePage.clickClaimsMenu();
	    	claimMaintenancePage.clickClaimMaintenace();
	    	claimMaintenancePage.clickProviderMaintenace();
	    	claimMaintenancePage.clickNewProvider();

	    }

	    @And("^Enter Provider Code (.+)$")
	    public void enter_provider_code(String providercode) throws Throwable {
	    	claimMaintenancePage.enterProviderCode(providercode);
	
	    }

	    @And("^Select Provider Type (.+)$")
	    public void select_provider_type(String providertype) throws Throwable {
	    	claimMaintenancePage.selectProviderType(providertype);
	    }
	    
//	    @And("^Select Provider Status(.+)$")
//	    public void select_provider_status(String providerstatus) throws Throwable {
//	    	
//	    	claimMaintenancePage.selectProviderStatus(providerstatus);
//	    }

	    @And("^Enter Status Date (.+)$")
	    public void enter_status_date(String statusdate) throws Throwable {
	    	claimMaintenancePage.enterStatusDate(statusdate);

	    }

	    @And("^Select Business Type (.+)$")
	    public void select_business_type(String businesstype) throws Throwable {
	    	claimMaintenancePage.selectBusinessType(businesstype);
	    }

	    @And("^Select Allowed Combined Payments (.+)$")
	    public void select_allowed_combined_payments(String alloywedcompayments) throws Throwable {
	    	claimMaintenancePage.selectAllowedCombinedPayments(alloywedcompayments);

	    }

	    @And("^Enter Business Name (.+)$")
	    public void enter_business_name(String businessname) throws Throwable {
	    	claimMaintenancePage.enterBusinessName(businessname);

	    }

	    @And("^Enter Provider Name (.+)$")
	    public void enter_name(String providername) throws Throwable {
	    	claimMaintenancePage.enterProviderName(providername);

	    }

	    @And("^Enter DBA Name (.+)$")
	    public void enter_dba_name(String dbaname) throws Throwable {
	    	
	    	claimMaintenancePage.enterDBAName(dbaname);
	    }

	    @And("^Enter Street Address (.+)$")
	    public void enter_street_address(String streetaddress) throws Throwable {
	    	
	    	claimMaintenancePage.enterStreetAddress(streetaddress);

	    }

	    @And("^Enter City of the the provider (.+)$")
	    public void enter_city_of_the_the_provider(String providercity) throws Throwable {
	    	claimMaintenancePage.enterProviderCity(providercity);
	 
	    }

	    @And("^Select the State of the provider (.+)$")
	    public void select_the_state_of_the_provider(String providerstate) throws Throwable {
	    	claimMaintenancePage.selectProviderState(providerstate);

	    }

	    @And("^Enter the Zip Code of the provider (.+)$")
	    public void enter_the_zip_code_of_the_provider(String providerzip) throws Throwable {
	    	claimMaintenancePage.enterProviderZip(providerzip);
	    }

	    @And("^Select Type of the Provider Primary Phone (.+)$")
	    public void select_type_of_the_provider_primary_phone(String typeofproviderprimaryPhone) throws Throwable {
	    	claimMaintenancePage.selectTypeOfProviderPrimaryPhone(typeofproviderprimaryPhone);

	    }

	    @And("^Enter the Provider Primary Phone Number (.+)$")
	    public void enter_the_provider_primary_phone_number(String primaryphonenumber) throws Throwable {
	    	claimMaintenancePage.enterPrimaryPhoneNumberOftheProvider(primaryphonenumber);

	    }

	    @And("^Enter Email Address of The Provider (.+)$")
	    public void enter_email_address_of_the_provider(String provideremailaddress) throws Throwable {
	    	claimMaintenancePage.enterEmailAddressOfTheProvider(provideremailaddress);

	    }

	    @And("^Select Recieve Xactanalysis Work (.+)$")
	    public void select_recieve_xactanalysis_work(String recievexactanalaysiswork) throws Throwable {
	    	
	    	claimMaintenancePage.selectReceiveXactAnalysisWork(recievexactanalaysiswork);
	    	claimMaintenancePage.clickOnProviderCopyAddress();
	    }

	    @And("^Copy Accounting Information$")
	    public void copy_accounting_information() throws Throwable {
	    	claimMaintenancePage.clickOnCopyProviderBillingAddress();
	
	    }

	    @And("^Select Required TaxInformation_OneZeroNineNine (.+)$")
	    public void select_required_taxinformationonezeroninenine(String requiredtax) throws Throwable {
	    	claimMaintenancePage.selectOneZeroNineNine(requiredtax);

	    }
	    
	    @And("^Select Payment Preference (.+)$")
	    public void select_payment_preference(String selectpaymentpreference) throws Throwable {
	    	claimMaintenancePage.selectPaymentPreference(selectpaymentpreference);

	    }

	    @And("^Select Severity Assignment Green$")
	    public void select_severity_assignment_green() throws Throwable {
	    	claimMaintenancePage.clickOnGreenSeverityAssignment();

	    }

	    @And("^Select Severity Assignment Yellow$")
	    public void select_severity_assignment_yellow() throws Throwable {
	    	
	    	claimMaintenancePage.clickOnYellowSeverityAssignment();
	    }

	    @And("^Select Severity Assignment Orange$")
	    public void select_severity_assignment_orange() throws Throwable {
	    	claimMaintenancePage.clickOnOrangeSeverityAssignment();

	    }

	    @And("^Select Severity Assignment Red$")
	    public void select_severity_assignment_red() throws Throwable {
	    	claimMaintenancePage.clickOnRedSeverityAssignment();

	    }

	    @And("^Save Provider Information$")
	    public void save_provider_information() throws Throwable {
	    	claimMaintenancePage.clickOnClaimMaintenanceSave();

	    }
	   
	    @Then("^Verify the Provider Successfuly Created$")
	    public void verify_the_provider_successfuly_created() throws Throwable {
	    	
	    	claimMaintenancePage.verifyProviderCreation();
	    }


}

