package spinUtils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class runDatabaseQuery {


	public static void main(String[] args) {
		
//		 try {
//				String url= "jdbc:mysql://100.103.14.13:3306/aiig_dw_model2";
//				String user= "srajendran";
//				String password= "yqoGSml337Q2ma";
//     			
//			 Class.forName("com.mysql.cj.jdbc.Driver");      
//     			
//			 // create a connection to the database
//     		 Connection connection = DriverManager.getConnection(url, user, password);
//     		 System.out.println("Connection is Successful to the database" +url);
//     		 
//     		 
//    		 String query = "Select LoginId FROM aiig_dw_model2.userinfo Where LoginId in ('AAllen')";
//    		 Statement statement = connection.createStatement();
//    		 ResultSet resultset = statement.executeQuery(query);
//    		 	while (resultset.next()) {
//    		 		String LoginID = resultset.getString("LoginId");
//    		 		System.out.println("LoginID retrieved from query String is : " +LoginID);
//    		 	}
//     		 
//		     } catch (ClassNotFoundException e) {
//		    	 e.printStackTrace();
//		     }catch (SQLException throwables) {
//		    	 throwables.printStackTrace();
		  
}
	
	
public Connection getDBConnection () {
		
		String url= "jdbc:mysql://100.103.14.13:3306/aiig_dw_model2";
		String user= "srajendran";
		String password= "yqoGSml337Q2ma";
		
		try {
			 Class.forName("com.mysql.cj.jdbc.Driver");  
		}catch (ClassNotFoundException e) {
		
			e.printStackTrace();		
		}
		
		Connection connection = null;
		try {
			connection = DriverManager.getConnection(url, user, password);
			System.out.println("Connection is Successful to the database" +url);
		}catch (SQLException e) {
			e.printStackTrace();
			
		}
		return connection;
	}
	
	
public ResultSet getResultsetFromSql (String sqlquery) {
		
		Connection connection = getDBConnection ();
		ResultSet resultset = null;
		
		try {
			Statement statement = connection.createStatement();
			resultset = statement.executeQuery(sqlquery);
			
		}catch (SQLException e) {
			e.printStackTrace();
		}
		
		return resultset;
		
	}
	
	
}	
	
	
	

	


