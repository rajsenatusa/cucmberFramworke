package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.UnhandledAlertException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class LoginPage {
	
	public WebDriver driver;
	public String username;
	
	public LoginPage (WebDriver driver) {		
		this.driver =driver;		
	}
	
	 By UserName = By.xpath("//input[@id='j_username']");
	 By Password = By.xpath("//input[@id='j_password']");
	 By SignIn = By.xpath("//a[@id='SignIn']");
	 //By LogOn = By.xpath("//td[contains(text(),'Logon:')]");	 
	 By ChangePassword = By.xpath("//a[contains(text(),'Change Password')]");
	 By ForgotPassword = By.xpath("//a[contains(text(),'Forgot Password')]");
	 By LogonText = By.xpath("/html[1]/body[1]/main[1]/form[1]/header[1]/nav[1]/div[2]/div[1]/div[1]/div[1]/table[1]/tr[1]/td[2]");
	 

	
	//action spin login pages
	
	public void enterUserName (String username) {
		
		driver.findElement(UserName).sendKeys(username);
	}
	
	public void enterPassword (String password) {
		
		driver.findElement(Password).sendKeys(password);
	}
	
	public void clickSignIn () {
		
		driver.findElement(SignIn).click();
	}
	
	public void clickChangePassowrd () {
			
			driver.findElement(ChangePassword).click();
	}
	
	public void clickForgotPassword () {
		
		driver.findElement(ForgotPassword).click();
	}
	
	public String getTitleLoginPage() {
		
		return driver.getTitle();
	}
	
	// login page validations
	public void validateLogonText(String username) {	
		
	
			WebElement LoggedInUser = driver.findElement(LogonText);
			String ExpectedUserText = LoggedInUser.getAttribute("innerHTML");
			String LoggedinUserText = ExpectedUserText.trim();		
			System.out.println("Logged in User Text:" +LoggedinUserText);		
			Assert.assertTrue(LoggedinUserText.equalsIgnoreCase(username));
			
			
	}
	
}
