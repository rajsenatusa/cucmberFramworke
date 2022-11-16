package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
	
	public WebDriver driver;
	
	public HomePage (WebDriver driver) {		
		this.driver =driver;		
	}
	
	By HomeMenu = By.linkText("Home");
	By QuotePolicyMenu = By.linkText("Quote/Policy");
	By BillingMenu = By.linkText("Billing");
	By ClaimsMenu = By.linkText("Claims");
	By PayablesMenu = By.linkText("Payables");
	By CommissionMenu = By.linkText("Commission");
	By CabinetsMenu = By.linkText("Cabinets");
	By AccoutingReports = By.linkText("Accounting Reports");	
	By SupportMenu = By.linkText("Support");
	By AdminMenu = By.linkText("Admin");	
	By SignOutMenu = By.linkText("Sign Out");
	By CurrentUserLogon = By.xpath("//body[1]/div[1]/form[1]/div[2]/div[4]/div[2]/div[2]/span[2]");
	
	
	//action methods for spin home page
	
	public String getUserLoggedOnText (String UserLoggedOnText) {
		
		UserLoggedOnText = driver.findElement(CurrentUserLogon).getText();
		return UserLoggedOnText;
	}
	

}
