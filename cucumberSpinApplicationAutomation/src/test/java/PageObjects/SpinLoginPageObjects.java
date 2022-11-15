package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SpinLoginPageObjects {
	
	public WebDriver driver;
	
	public SpinLoginPageObjects (WebDriver driver) {		
		this.driver =driver;		
	}
	
	By UserName = By.xpath("//input[@id='j_username']");
	By Password = By.xpath("//input[@id='j_password']");
	By SignIn = By.xpath("//a[@id='SignIn']");
	By ChangePassword = By.xpath("//a[contains(text(),'Change Password')]");
	By ForgotPassword = By.xpath("//a[contains(text(),'Forgot Password')]");
	
	
	//Action methods
	
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

}
