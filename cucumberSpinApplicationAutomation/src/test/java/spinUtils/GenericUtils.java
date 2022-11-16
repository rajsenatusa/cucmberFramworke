package spinUtils;

import org.openqa.selenium.WebDriver;

public class GenericUtils {
	
	public WebDriver driver;

	
	public GenericUtils(WebDriver driver) {
		
		this.driver = driver;
	}

	public void validateLoginTitile () {
		
		String actualTitle = driver.getTitle();
		String expectedTitle = "Guidewire InsuranceNow™";
		
		if (actualTitle.equals(expectedTitle)) {
			
			System.out.println("Title Matches Login Test Passed");
			
		}else {
			System.out.println("Title Doesn't Matches Login Test Failed");
		}
	}

}
