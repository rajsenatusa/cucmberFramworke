package pageObjects;

import org.openqa.selenium.WebDriver;

public class ObjectManager {
	
	public  LoginPage LoginPage;
	public  HomePage HomePage;
	public  BatchJobsPage BatchJobsPage;
	public  UserManagementPage UserManagementPage;
	public  UserMaintenancePage UserMaintenancePage;
	public  ClaimMaintenancePage ClaimMaintenancePage;
	public  DataBasePage DataBasePage;
	public  WebDriver driver;
	
	public ObjectManager (WebDriver driver) {
		
		this.driver= driver;
	}
	
	public LoginPage getspinLoginPage() {		
		LoginPage = new LoginPage(driver);
		return LoginPage;
	}

	public HomePage getspinHomePage() {		
		HomePage = new HomePage(driver);
		return HomePage;
	}
	
	public BatchJobsPage getdailyjobManualPage() {		
		BatchJobsPage = new BatchJobsPage(driver);
		return BatchJobsPage;
	}
	
	public UserManagementPage getUserManagementPage() {		
		UserManagementPage = new UserManagementPage(driver);
		return UserManagementPage;
	}
	
	public UserMaintenancePage getUserMainteanacePage() {		
		UserMaintenancePage = new UserMaintenancePage(driver);
		return UserMaintenancePage;
	}
	
	public ClaimMaintenancePage getClaimMainteanacePage() {		
		ClaimMaintenancePage = new ClaimMaintenancePage(driver);
		return ClaimMaintenancePage;
	}
	
	public DataBasePage getDataBasePage() {		
		DataBasePage = new DataBasePage(driver);
		return DataBasePage;
	}
}


