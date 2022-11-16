package spinUtils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {
	
	//WebDriver Manager give us driver object initialization
		
		public WebDriver driver;
		
		
		public WebDriver DriverManager() throws IOException
		{ 
				
				FileInputStream filename = new FileInputStream (System.getProperty("user.dir")+"//src//test//resources//global.properties");			
				Properties prop = new Properties ();
				prop.load(filename);
				
				String modelURL = prop.getProperty("model");
			
					if (driver == null) 
					{
						if (prop.getProperty("browser").equalsIgnoreCase("chrome")) 
						{
							driver = WebDriverManager.chromedriver().create();
							driver.get(modelURL);
						}
					    			
					}
				  	return driver;
				  	
		}
	
}
