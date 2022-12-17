package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	
	public WebDriver driver;
	
	public LoginPage (WebDriver driver) {		
		this.driver =driver;		
	}
	
	 By UserName = By.xpath("//input[@id='j_username']");
	 By Password = By.xpath("//input[@id='j_password']");
	 By SignIn = By.xpath("//a[@id='SignIn']");
	 By LogOn = By.xpath("//td[contains(text(),'Logon:')]");
	 By ChangePassword = By.xpath("//a[contains(text(),'Change Password')]");
	 By ForgotPassword = By.xpath("//a[contains(text(),'Forgot Password')]");
	
	
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
	


}
