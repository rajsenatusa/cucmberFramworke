package spinUtils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {
	
	//WebDriver Manager give us driver object initialization
		
		public WebDriver driver;
		
		
		public WebDriver DriverManager() throws IOException
		{ 
				
				FileInputStream filename = new FileInputStream (System.getProperty("user.dir")+"//src//test//resources//global.properties");			
				Properties prop = new Properties ();
				prop.load(filename);
				
				String appUrL = prop.getProperty("model2");
				String browser_properties = prop.getProperty("browser");
				String browser_mvn = System.getProperty("browser");
				String browser = browser_mvn!=null ? browser_mvn:browser_properties;
			
					if (driver == null) 
					{
						if (browser.equalsIgnoreCase("chrome")) 
							
						{
							ChromeOptions option = new ChromeOptions();
							option.addArguments("--remote-allow-origins=*");
							WebDriverManager.chromedriver().clearDriverCache().setup();
//							WebDriverManager.chromedriver().clearResolutionCache().setup();
//							WebDriverManager.chromedriver().setup();
							driver = new ChromeDriver(option);
//							driver = WebDriverManager.chromedriver().create();
							driver.get(appUrL);
							driver.manage().window().maximize();
						}
					    			
					}
				  	return driver;
				  	
		}
	
}
