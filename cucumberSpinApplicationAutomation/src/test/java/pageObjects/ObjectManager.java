package pageObjects;

import org.openqa.selenium.WebDriver;

public class ObjectManager {
	
	public  LoginPage LoginPage;
	public  HomePage HomePage;
	public  BatchJobsPage BatchJobsPage;
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
}
