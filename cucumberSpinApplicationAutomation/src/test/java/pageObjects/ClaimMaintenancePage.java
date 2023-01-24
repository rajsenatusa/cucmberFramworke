	package pageObjects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class ClaimMaintenancePage {
	
	public WebDriver driver;
	
	public ClaimMaintenancePage (WebDriver driver) {		
		this.driver =driver;		
	}
	
	By ClaimsMenu = By.xpath("//li[@id='Menu_Claims']");
	By ClaimMaintenace = By.xpath("//a[@id='Menu_Claims_ClaimMaintenance']");
	By CatastropheMaintenance = By.xpath("//a[contains(text(),'Catastrophe')]");
	By ProviderMaintenace = By.xpath("//a[contains(text(),'Provider')]");
	By NewProvider = By.xpath("//span[contains(text(),'New Provider')]");
	
	By ProviderCode = By.xpath("//input[@id='Provider.ProviderNumber']");
	By ProviderType = By.xpath("//select[@id='Provider.ProviderTypeCd']");
	By ProviderStatus = By.xpath("//select[@id='Provider.StatusCd']");
	By StatusDate = By.xpath("//input[@id='Provider.StatusDt']");
	By BusinessType = By.xpath("//select[@id='ProviderTaxInfo.LegalEntityCd']");
	By AllowCombinedPayments = By.xpath("//select[@id='Provider.CombinePaymentInd']");
	By BusinessName = By.xpath("//input[@id='ProviderName.CommercialName']");
	By ProviderName = By.xpath("//input[@id='ProviderName.GivenName']");
	By DBAName = By.xpath("//input[@id='ProviderName.DBAName']");
	By StreetAddress = By.xpath("//input[@id='ProviderStreetAddr.Addr1']");
	By ProviderCity = By.xpath("//input[@id='ProviderStreetAddr.City']");
	By ProviderState = By.xpath("//select[@id='ProviderStreetAddr.StateProvCd']");
	By ProviderZip = By.xpath("//input[@id='ProviderStreetAddr.PostalCode']");
	By ProviderPrimaryPhone = By.xpath("//select[@id='ProviderPrimaryPhone.PhoneName']");
	By TypeOfProviderPrimaryPhone = By.xpath("//select[@id='ProviderPrimaryPhone.PhoneName']");
	By CopyAddress = By.xpath("//a[@id='CopyAddress']");
	By CopyBillingAddress = By.xpath("//a[@id='CopyBillingAddress']");
	By ProviderEmailAddress = By.xpath("//input[@id='ProviderEmail.EmailAddr']");
	By ReceiveXactAnalysisWork = By.xpath("//select[@id='Provider.ReceiveXactanlysisWork']");
	By OneZeorNineNineRequired = By.xpath("//select[@id='ProviderTaxInfo.Required1099Ind']");
	By PaymentPreference = By.xpath("//select[@id='Provider.PaymentPreferenceCd']");
	
	By SeverityAssignment_Green = By.xpath("//input[@id='Provider.SeverityGreenInd']");
	By SeverityAssignment_Yellow = By.xpath("//input[@id='Provider.SeverityYellowInd']");
	By SeverityAssignment_Orange = By.xpath("//input[@id='Provider.SeverityOrangeInd']");
	By SeverityAssignment_Red = By.xpath("//input[@id='Provider.SeverityRedInd']");
	
	By ClaimMaintenanceSave = By.xpath("//span[contains(text(),'Save')]");
	
	By ProviderNumberSummary = By.xpath("//div[@id='ProviderSummary_ProviderNumber']");
	By ProviderTypeSummary = By.xpath("//div[@id='ProviderSummary_ProviderTypeCd']");
	By ProviderStatusSummary = By.xpath("//div[@id='ProviderSummary_StatusCd']");
	By ProviderStateDate = By.xpath("//div[@id='ProviderSummary_StatusDt']");
				
	//action methods for claim maintenance page.
	
	
	public void clickClaimsMenu () {
		driver.findElement(ClaimsMenu).click();
	}
	
	public void clickClaimMaintenace () {
		driver.findElement(ClaimMaintenace).click();
	}
	
	public void clickCatastropheMaintenance () {
		driver.findElement(CatastropheMaintenance).click();
	}
	
	public void clickProviderMaintenace () {
		driver.findElement(ProviderMaintenace).click();
	}
	
	public void clickNewProvider() {
		driver.findElement(NewProvider).click();
	}
	
	public void enterProviderCode (String providercode) {
		driver.findElement(ProviderCode).sendKeys(providercode);
	}

	public void selectProviderType (String providertype) {
		Select selectProviderType = new Select (driver.findElement(ProviderType));
		selectProviderType.selectByValue(providertype);
			
	}
	
	public void selectProviderStatus (String providerstatus) {
		Select providerStatus = new Select (driver.findElement(ProviderStatus));
		providerStatus.selectByValue(providerstatus);
	}
	
	public void enterStatusDate (String enterstatusdate) {
		driver.findElement(StatusDate).sendKeys(enterstatusdate);
			
	}
	
	public void selectBusinessType (String businesstype) {
		driver.findElement(BusinessType).sendKeys(businesstype);
		
	}
	
	public void selectAllowedCombinedPayments (String alloywedcompayments) {
		Select selectAllowedCombinedPayments = new Select (driver.findElement(AllowCombinedPayments));
		selectAllowedCombinedPayments.selectByValue(alloywedcompayments);
		
	}
	
	public void enterBusinessName (String businessname) {
		
		driver.findElement(BusinessName).sendKeys(businessname);
	
	}
	
	public void enterProviderName (String providername) {
		
		driver.findElement(ProviderName).sendKeys(providername);
	
	}
	
	public void enterDBAName (String dbaname) {
		
		driver.findElement(DBAName).sendKeys(dbaname);
	
	}
	
	public void enterStreetAddress (String streetaddress) {
		
		driver.findElement(StreetAddress).sendKeys(streetaddress);
	
	}
	
	public void enterProviderCity (String providercity) {
		
		driver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);
		System.out.println("Provider City Text is :" +providercity);
		
		driver.findElement(ProviderCity).sendKeys(providercity);
	
	}
	
	public void selectProviderState (String providerstate) {
		
		Select selectProviderState = new Select (driver.findElement(ProviderState));
		selectProviderState.selectByValue(providerstate);
	
	}
	
	public void enterProviderZip (String providerzip) {
		
		driver.findElement(ProviderZip).sendKeys(providerzip);
	
	}
	
	public void clickOnProviderCopyAddress () {
		
		driver.findElement(CopyAddress).click();
	
	}

	public void selectTypeOfProviderPrimaryPhone (String typeofproviderprimaryPhone) {
		
		Select selectTypeOfProvider = new Select (driver.findElement(TypeOfProviderPrimaryPhone));
		selectTypeOfProvider.selectByValue(typeofproviderprimaryPhone);
		
	}

	public void enterPrimaryPhoneNumberOftheProvider (String primaryphonenumber) {
		
		driver.findElement(ProviderPrimaryPhone).sendKeys(primaryphonenumber);
		
	}
	
	public void enterEmailAddressOfTheProvider (String provideremailaddress) {
		
		driver.findElement(ProviderEmailAddress).sendKeys(provideremailaddress);
	
	}
	
	public void selectReceiveXactAnalysisWork (String recievexactanalaysiswork) {
		
		Select selectReceiveXactAnalysisWork = new Select (driver.findElement(ReceiveXactAnalysisWork));
		selectReceiveXactAnalysisWork.selectByValue(recievexactanalaysiswork);
		
	}
	
	//Accounting Information Actions
	
	public void clickOnCopyProviderBillingAddress () {
			
		driver.findElement(CopyBillingAddress).click();
		
	}
	
	
	public void selectOneZeroNineNine (String requiredtax) {
		
		Select selectOneZeroNineNine = new Select (driver.findElement(OneZeorNineNineRequired));
		selectOneZeroNineNine.selectByValue(requiredtax);
		
	}
	
	public void selectPaymentPreference (String selectpaymentpreference) {
		
		Select selectPaymentPreference = new Select (driver.findElement(PaymentPreference));
		selectPaymentPreference.selectByValue(selectpaymentpreference);
		
	}
	
	public void clickOnGreenSeverityAssignment () {
		
		driver.findElement(SeverityAssignment_Green).click();
		
	}
	
	public void clickOnYellowSeverityAssignment () {
		
		driver.findElement(SeverityAssignment_Yellow).click();
		
	}
	
	public void clickOnOrangeSeverityAssignment () {
		
		driver.findElement(SeverityAssignment_Orange).click();
		
	}
	
	public void clickOnRedSeverityAssignment () {
		
		driver.findElement(SeverityAssignment_Red).click();
		
	}
	
	public void clickOnClaimMaintenanceSave () {
		
		driver.findElement(ClaimMaintenanceSave).click();
		
	}
	
	public void verifyProviderCreation () {
		
		WebDriverWait wait = new WebDriverWait(driver, 90);			
		wait.until(ExpectedConditions.visibilityOfElementLocated(ProviderNumberSummary));	
		WebElement ProviderCode = driver.findElement(ProviderNumberSummary);
		String ProviderCodeText = ProviderCode.getAttribute("innerHTML");
		System.out.println("Provider Code : " +ProviderCodeText + " Successfully Created");
		
		WebElement ProviderType = driver.findElement(ProviderTypeSummary);
		String ProviderTypeText = ProviderType.getAttribute("innerHTML");
		System.out.println("Provider Type : " +ProviderTypeText + " Successfully Created");
		
		WebElement ProviderStatus = driver.findElement(ProviderStatusSummary);
		String ProviderStatusText = ProviderStatus.getAttribute("innerHTML");
		System.out.println("Provider Type : " +ProviderStatusText + " Successfully Created");
		
		WebElement ProviderStatusDate = driver.findElement(ProviderStateDate);
		String ProviderStatusDateText = ProviderStatusDate.getAttribute("innerHTML");
		System.out.println("Provider Type : " +ProviderStatusDateText + " Successfully Created");
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	





	
}
