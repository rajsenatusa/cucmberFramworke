package spinUtils;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;



public class GenericUtils {
	
	public WebDriver driver;

	
	public GenericUtils(WebDriver driver) {
		
		this.driver = driver;
	}


	public void validateLoginTitile () {
		
		String actualTitle = driver.getTitle();
		String expectedTitle = "Guidewire InsuranceNow™";
		Assert.assertTrue(actualTitle.contains(expectedTitle));
	}

}
