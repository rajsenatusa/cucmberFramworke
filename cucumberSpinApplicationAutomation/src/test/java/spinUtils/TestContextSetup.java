package spinUtils;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import pageObjects.ObjectManager;

//cucumber pico containers dependency injection driver setup
public class TestContextSetup {
	
		public  WebDriver driver;
		public  ObjectManager ObjectManager;
		public  TestBase TestBase;
		public  GenericUtils GenericUtils;
			
		public TestContextSetup() throws IOException {
			
			TestBase = new TestBase(); 
			ObjectManager  = new ObjectManager(TestBase.DriverManager());
			GenericUtils = new GenericUtils(TestBase.DriverManager());
			
		}
}
