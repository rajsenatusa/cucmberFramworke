package spinUtils;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;



public class GenericUtils {
	
	public WebDriver driver;

	
	public GenericUtils(WebDriver driver) {
		
		this.driver = driver;

	}
		
	public void validateLogonText() {
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		String Actual = driver.findElement(By.xpath("//td[contains(text(),'Logon:')]")).getText();
		String Expected = "Logon:";
		Assert.assertTrue(Expected.contains(Actual));
	}
		
		

}
