package spinUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;


public class GenericUtils {
	
	public WebDriver driver;
	
	public GenericUtils(WebDriver driver) {
		
		this.driver = driver;

	}
	
	public void GetValueFromTableText () {
		
		
		
			
		
	}
		

	
	public void validateDailyMnaualJobStatusText () {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		String Actual = driver.findElement(By.xpath("//td[contains(text(),'Running')]")).getText();
		String Expected = "Running:";
		Assert.assertTrue(Expected.contains(Actual));
	}
		

}
