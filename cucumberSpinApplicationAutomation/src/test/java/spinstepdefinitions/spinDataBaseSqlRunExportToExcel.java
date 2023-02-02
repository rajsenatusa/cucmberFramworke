package spinstepdefinitions;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.LoginPage;
import pageObjects.ObjectManager;
import pageObjects.DataBasePage;
import spinUtils.TestContextSetup;


public class spinDataBaseSqlRunExportToExcel {
	
	//container creating dependency injection.
	public WebDriver driver;
	public ObjectManager ObjectManager;
	public TestContextSetup testContextSetup;
	public LoginPage loginPage;
	public DataBasePage dataBasePage;
	
	public static String resultFileName = null;

	public spinDataBaseSqlRunExportToExcel (TestContextSetup testContextSetup) {
		
		this.testContextSetup = testContextSetup;
		this.dataBasePage = testContextSetup.ObjectManager.getDataBasePage();

	}
	
		          
	@Given("^Connect the Model Data Base$")
    public void connect_the_model_data_base() throws Throwable {

		dataBasePage.getFilename(resultFileName);
		String query  = dataBasePage.readQueryFromFile(System.getProperty("user.dir")+"\\CommonSQLqueries\\ER_SQLQuery.sql");
		System.out.println( "Query : " +query);

    }

    @When("^Run the ER request SQL Query$")
    public void run_the_er_request_sql_query() throws Throwable {
   
    }

    @Then("^Write the results in to the excel file$")
    public void write_the_results_in_to_the_excel_file() throws Throwable {
  
    }

    @Then("^place the file in a desired location$")
    public void place_the_file_in_a_desired_location() throws Throwable {

    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
   
    
}
