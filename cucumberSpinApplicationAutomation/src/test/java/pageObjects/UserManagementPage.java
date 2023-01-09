package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class UserManagementPage {
	
	public WebDriver driver;
	
	public UserManagementPage (WebDriver driver) {		
		this.driver =driver;		
	}
	
	By Admin = By.xpath("//li[@id='Menu_Admin']");
	By UserManagement = By.xpath("//a[@id='Menu_Admin_UserManagement']");	
	By SearchByTextBox = By.xpath("//input[@id='SearchText']");
	By SearchBySearchButton = By.xpath("//a[@id='Search']");
	By UserCodeTextBox =By.xpath("//input[@id='LoginId']");
	By UserCodeSearchButton = By.xpath("//a[@id='SearchUser']");
	By SystemUserListTable = By.xpath("//div[@id='']");
	By ResetPasswordLink = By.linkText("Reset Password");
	By NewPasswordTextBox = By.xpath("//input[@id='NewPassword']");
	By ConfirmPasswordTextBox = By.xpath("//input[@id='ConfirmNewPassword']");
	By UserMustChangePasswordOnNextLogin = By.xpath("//input[@id='UserInfo.PasswordMustChangeInd']");
	By ChangePasswordButton = By.xpath("//a[@id='ResetPassword']");
	By PasswordChangedSuccess = By.xpath("//div[@id='GenericBusinessError']");
			
	//action methods for spin home page
	
	public void AdminMenuClick () {
		
		driver.findElement(Admin).click();
	}
	
	public void UserManagementClick () {
		
		driver.findElement(UserManagement).click();
	}
	
	public void SearchByTextBox (String username) {
		
		driver.findElement(SearchByTextBox).sendKeys(username);
	}
	public void SearchBySearchButtonClick () {
		
		driver.findElement(SearchBySearchButton).click();
	}
	
	public void resetpasswordLinkClick () {
		driver.findElement(ResetPasswordLink).click();
	}
	
	public void EnterNewPassword (String newpassword) {
		driver.findElement(NewPasswordTextBox).sendKeys(newpassword);
	}
	
	public void EnterConfirmPassword (String newpassword) {
		driver.findElement(NewPasswordTextBox).sendKeys(newpassword);
	}
	
	public void UserMustChangePasswordOnNextLoginCheckBox () {
		driver.findElement(UserMustChangePasswordOnNextLogin).click();
	}
	
	public void ChangePasswordButton () {
		
		driver.findElement(ChangePasswordButton).click();
	}
	
	// Validation Password Change Text
	public void validationPasswordChangeText() {	
		
		WebElement LoggedInUser = driver.findElement(PasswordChangedSuccess);
		String ExpectedUserText = LoggedInUser.getAttribute("innerHTML");
		String LoggedinUserText = ExpectedUserText.trim();		
		System.out.println("Logged in User Text:" +LoggedinUserText);		
										
	}
	
}
