	package pageObjects;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.util.Properties;

import org.openqa.selenium.WebDriver;

public class DataBasePage {
	
	public static String url= null;
	public static String user= null;
	public static String password= null;		
	public static String resultFileName = null;
	public static String query =null;
	public WebDriver driver;
	
	public DataBasePage (WebDriver driver) {		
		this.driver =driver;		
	}
	
	
			
	//action methods for spin home page
	public String getFilename(String resultFileName) {
		
		LocalDateTime now = LocalDateTime.now();  
		String returnResultFilename="ER_Request_Results-"+now.getYear()+"-"+now.getMonth()+"-"+now.getDayOfMonth()+"-"+now.getHour()+"-"+now.getMinute()+"-"+now.getSecond()+".xls";
		return returnResultFilename;
	}
	

	public String readQueryFromFile(String filepath) throws IOException  {
		
		@SuppressWarnings("resource")
		BufferedReader br = new BufferedReader (new FileReader(filepath));
		StringBuilder sb = new StringBuilder();
		String line = br.readLine();
		while (line != null) {
			sb.append(line);
			sb.append(System.lineSeparator());
			line = br.readLine();
		}
		String query = sb.toString();

		return query;
	}
	
	
	public void connectAndRunSqlQuery () throws Throwable {
		
		  Connection connection = getDBConnection ();
	      java.sql.Statement stmt = connection.createStatement();
	      ResultSet rs = stmt.executeQuery(query);
	}
	
	public static Connection getDBConnection () throws Throwable {
		
		Properties config = new Properties();
		config.load(new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\resources\\db.properties"));
		url = config.getProperty("url");
		System.out.println("URL :" +url);
		user = config.getProperty("user");
		System.out.println("User : " +user);
		password = config.getProperty("password");	
		System.out.println("Password : " +password);
		Connection connection = null;
		Class.forName("com.mysql.cj.jdbc.Driver");  
		connection = DriverManager.getConnection(url, user, password);
		System.out.println("Connection is Successful to the database" +url);
		
		return connection;
	}
	
	
	
}
