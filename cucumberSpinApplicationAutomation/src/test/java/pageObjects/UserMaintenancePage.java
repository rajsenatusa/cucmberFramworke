	package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class UserMaintenancePage {
	
	public WebDriver driver;
	
	public UserMaintenancePage (WebDriver driver) {		
		this.driver =driver;		
	}
	
	By Copy = By.xpath("//span[contains(text(),'Copy')]");
	By UserCode = By.xpath("//input[@id='UserInfo.LoginId']");
	By UserCode_SearchBtn = By.xpath("//a[@id='SearchUser']");
	By AddUser = By.xpath("//span[contains(text(),'Add User')]");
	
	By UserCodeLoginId = By.xpath("//input[@id='UserInfo.LoginId']");	
	By UserType = By.xpath("//select[@id='UserInfo.TypeCd']");	
	By ConcurrentSessions = By.xpath("//input[@id='UserInfo.ConcurrentSessions']");
	By Status = By.xpath("//select[@id='UserInfo.StatusCd']");
	By Language =By.xpath("//select[@id='UserInfo.DefaultLanguageCd']");
	By FirstName = By.xpath("//input[@id='UserInfo.FirstName']");
	By LastName = By.xpath("//input[@id='UserInfo.LastName']");
	By Address = By.xpath("//input[@id='UserInfoWorkAddr.Addr1']");
	By City = By.xpath("//input[@id='UserInfoWorkAddr.City']");
	By State = By.xpath("//select[@id='UserInfoWorkAddr.StateProvCd']");
	By Zip = By.xpath("//input[@id='UserInfoWorkAddr.PostalCode']");
	By Country = By.xpath("//select[@id='UserInfoWorkAddr.RegionCd']");
	By VerifyAddress = By.xpath("//i[@id='UserInfoWorkAddr.addrVerifyImg']");
	By UserInfoPhoneName = By.xpath("//select[@id='UserInfoPhoneOne.PhoneName']");
	By UserInfoPhoneOne = By.xpath("//input[@id='UserInfoPhoneOne.PhoneNumber']");
	By EmailAddres = By.xpath("//input[@id='UserInfo.EmailAddr']");
	By ManagedGroup = By.xpath("//select[@id='UserInfo.UserManagementGroupCd']");
	By Department = By.xpath("//select[@id='UserInfo.DepartmentCd']");
	By SupervisorCode = By.xpath("//input[@id='UserInfo.Supervisor']");
	
	By SupervisorName = By.xpath("//td[@id='ajaxReplaceForm']");
	By ToolBarSearchMode = By.xpath("//select[@id='UserInfo.ToolbarSearchMode']");
	By Password = By.xpath("//input[@id='ChangePassword']");
	By ConfirmPassword = By.xpath("//input[@id='ConfirmPassword']");
	By PasswordPolicy = By.xpath("//select[@id='PasswordInfo.PasswordRequirementTemplateId']");
	By BranchCode = By.xpath("//select[@id='UserInfo.BranchCd']");	
	By SaveBtn = By.xpath("//a[@id='Save']");
	By UserMustChagePasswordOnNextLogin = By.xpath("//input[@id='UserInfo.PasswordMustChangeInd']");
	By addRole = By.xpath("//a[@id='AddRole']");
	By SelectRole = By.xpath("//select[@id='UserRole.AuthorityRoleIdRef']");
	By VerifiedStatusImgText = By.xpath("//tbody/tr[1]/td[1]/i[2]/span[1]");
	
	By MissingInfo = By.xpath("//div[@id='MissingFieldError']");
	By UserInfoText = By.xpath("//span[@id='UserInfo.LoginId_text']");
	By UserAuthRole = By.xpath("//select[@id='UserRole.AuthorityRoleIdRef']");
	
	By InformationMsg = By.xpath("//div[@id='FieldConstraintError']");
	
	
	
				
	//action methods for spin home page
	
		public void clickOnAddUser () {
				
				driver.findElement(AddUser).click();
			}
		
		public void enterUserCode (String usercode) {
			
			driver.findElement(UserCode).sendKeys(usercode);
				
		}
		
		public void selectUserType (String usertype) {
			

			Select SelectUserType = new Select (driver.findElement(UserType));
			SelectUserType.selectByValue(usertype);
				
		}
		
		public void enterConcurrentSessions (String concurrentsessions) {
			
			driver.findElement(ConcurrentSessions).clear();
			driver.findElement(ConcurrentSessions).sendKeys(concurrentsessions);
		}
		
		public void selectStatus (String status) {
			

			Select SelectStatus = new Select (driver.findElement(Status));
			SelectStatus.selectByValue(status);
				
		}
		
		public void selectLanguage (String language) {
			

			Select SelectLanguage = new Select (driver.findElement(Language));
			SelectLanguage.selectByValue(language);
				
		}
		
		public void enterFirstName (String firstname) {

			driver.findElement(FirstName).sendKeys(firstname);
		}
		
		public void enterLastName (String lastname) {

			driver.findElement(LastName).sendKeys(lastname);
		}
		
		public void enterAddress (String address) {

			driver.findElement(Address).sendKeys(address);
		}

		public void enterCity (String city) {

			driver.findElement(City).sendKeys(city);
		}

		public void selectState (String state) {

			Select SelectState = new Select (driver.findElement(State));
			SelectState.selectByValue(state);
		}

		public void enterZip (String zip) {

			driver.findElement(Zip).sendKeys(zip);
		}
		
		public void selectCountry (String country) {

			Select SelectCountry = new Select (driver.findElement(Country));
			SelectCountry.selectByValue(country);
		}

		public void clickOnVerifyAddressLink () {

			driver.findElement(VerifyAddress).click();				
			WebDriverWait wait = new WebDriverWait(driver, 90);
			wait.until(ExpectedConditions.visibilityOfElementLocated(VerifiedStatusImgText));
			
		}

		public void selectTypeOfPrimaryPhone (String typeofprimaryphone) {
						
			Select SelectTypeOfPrimaryPhone = new Select (driver.findElement(UserInfoPhoneName));			
			SelectTypeOfPrimaryPhone.selectByValue(typeofprimaryphone);
		}

		public void enterPrimaryPhone (String primaryphonenumber) {
				
			driver.findElement(UserInfoPhoneOne).sendKeys(primaryphonenumber);
		}

		public void enterEmailAddress(String emailaddress ) {
			
			driver.findElement(EmailAddres).sendKeys(emailaddress);
			
		}
		
		public void selectDepartment (String department) {
			
			
			Select selectDepartment = new Select (driver.findElement(Department));
			
			selectDepartment.selectByValue(department);
		}

		public void enterSupervisorCode (String supervisorcode) {
			
			WebDriverWait wait = new WebDriverWait(driver, 90);
			wait.until(ExpectedConditions.visibilityOfElementLocated(SupervisorCode));	
			driver.findElement(SupervisorCode).sendKeys(supervisorcode);
			wait.until(ExpectedConditions.visibilityOfElementLocated(SupervisorName));	
			
		}

		public void selectToolBarSearchMode (String toolbarsearchmode) {
			

			Select selectToolBarSearchMode = new Select (driver.findElement(ToolBarSearchMode));
			
			selectToolBarSearchMode.selectByVisibleText(toolbarsearchmode);
		}

		public void enterPassword (String password) {
			

			driver.findElement(Password).sendKeys(password);
		}
		
		public void enterConfirmPassword(String confirmpassword) {
			
				
			driver.findElement(ConfirmPassword).sendKeys(confirmpassword);
		}
		
		public void clickOnUserMuchChangePasswordOnNextLogin() {
			
			
			driver.findElement(UserMustChagePasswordOnNextLogin).click();
		}


		public void selectPasswordPolicy (String passwordpolicy) {
	
			Select SelectPassPolicy = new Select  (driver.findElement(PasswordPolicy));
			SelectPassPolicy.selectByValue(passwordpolicy);
		}
		
		public void selectBranchCode (String branchcode) {
			
			WebDriverWait wait = new WebDriverWait(driver, 90);
			wait.until(ExpectedConditions.visibilityOfElementLocated(BranchCode));	
			Select SelectBranchCode = new Select  (driver.findElement(BranchCode));
			SelectBranchCode.selectByValue(branchcode);
		}

		
		public void clickOnSaveButton() {
			

			driver.findElement(SaveBtn).click();
			WebDriverWait wait = new WebDriverWait(driver, 90);
			wait.until(ExpectedConditions.visibilityOfElementLocated(UserInfoText));	
		
		}
		
		
		public void clickAddRole () {
			
			driver.findElement(addRole).click();
			
		}
		
		public void userSuccessValidation () {
			
			WebElement createdUser = driver.findElement(UserInfoText);
			String ExpectedUserText = createdUser.getAttribute("innerHTML");
			String createdUserText = ExpectedUserText.trim();		
			System.out.println("Logged in User Text:" +createdUserText);		
			Assert.assertTrue(ExpectedUserText.equalsIgnoreCase(createdUserText));
			
					
		}

		public void addRoleforUser(String userrole) {
			driver.findElement(addRole).click();
			WebDriverWait wait = new WebDriverWait(driver, 90);
			wait.until(ExpectedConditions.visibilityOfElementLocated(UserAuthRole));	
			Select SelectAuthorityRole = new Select (driver.findElement(UserAuthRole));
			SelectAuthorityRole.selectByValue(userrole);
			driver.findElement(SaveBtn).click();	
			wait.until(ExpectedConditions.visibilityOfElementLocated(UserInfoText));
			System.out.println("User" +UserInfoText+ "Succesfully Created" +userrole+ "Access Given Successfully" );
			
		}

		
			





















	
}
