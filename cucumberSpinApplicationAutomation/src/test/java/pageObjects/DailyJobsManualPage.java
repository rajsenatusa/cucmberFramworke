package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DailyJobsManualPage {
	
	public WebDriver driver;
	
	public DailyJobsManualPage (WebDriver driver) {		
		this.driver =driver;		
	}
	
	By OperationsMenu = By.linkText("Operations");
	By BatchJobs = By.xpath("//th[@id='Menu_Operations_BatchJobs']");	
	By DailyJobsManual = By.xpath("//a[@id='Daily Manual']");
	By JobSummary = By.xpath("//span[contains(text(),'Job Summary')]");
	By JobSummaryName = By.xpath("//span[@id='Name_text']");
	By StartJob = By.xpath("//a[@id='StartJobAction']");
	
		
	//action methods for spin home page
	
	public void OperationMenuClick () {
		
		driver.findElement(OperationsMenu).click();
	}
	
	public void BatchJobsClick () {
		
		driver.findElement(BatchJobs).click();
	}
	
	public void DailyJobsManualClick () {
		
		driver.findElement(DailyJobsManual).click();
	}
	public void StartJobClick () {
		
		driver.findElement(StartJob).click();
	}

}
