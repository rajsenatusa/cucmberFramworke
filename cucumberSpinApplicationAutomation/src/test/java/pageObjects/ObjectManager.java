package pageObjects;

import org.openqa.selenium.WebDriver;

public class ObjectManager {
	
	public  LoginPage LoginPage;
	public  HomePage HomePage;
	public  DailyJobsManualPage DailyJobManualPage;
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
	
	public DailyJobsManualPage getdailyjobManualPage() {		
		DailyJobManualPage = new DailyJobsManualPage(driver);
		return DailyJobManualPage;
	}
}
