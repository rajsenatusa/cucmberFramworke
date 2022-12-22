package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DailyJobsManualPage {
	
	public WebDriver driver;
	
	public DailyJobsManualPage (WebDriver driver) {		
		this.driver =driver;		
	}
	
	By OperationsMenu = By.xpath("//li[@id='Menu_Operations']");
	By BatchJobs = By.xpath("//a[@id='Menu_Operations_BatchJobs']");	
	By DailyJobsManual = By.xpath("//a[@id='Daily Manual']");
	By JobSummary = By.xpath("//span[contains(text(),'Job Summary')]");
	By JobSummaryName = By.xpath("//span[@id='Name_text']");
	By StartJob = By.xpath("//span[contains(text(),'Start Job')]");
	By History = By.xpath("//a[@id='Tab_JobHistoryList']");
	By JobStatus = By.xpath("//td[contains(text(),'Running')]");
	
	//*[@id="Menu_Operations"]
	//*[@id="Menu_Operations_BatchJobs"]
	
		
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
	
	public void history () {
		driver.findElement(History).click();
		
	}

}
