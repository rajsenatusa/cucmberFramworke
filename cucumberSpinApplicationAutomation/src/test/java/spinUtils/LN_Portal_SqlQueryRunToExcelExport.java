package spinUtils;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.time.LocalDateTime;
import java.util.Properties;

import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import org.apache.poi.hssf.usermodel.HSSFFont;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.FillPatternType;
import org.apache.poi.ss.usermodel.Row;

public class LN_Portal_SqlQueryRunToExcelExport {
	
	public static String url= null;
	public static String user= null;
	public static String password= null;		
	public static String resultFileName = null;
	public static String query =null;

	public static void main(String[] args) throws Throwable {
		
		// get the result file name			
			resultFileName = getFilename(resultFileName);	
					
		//Read Query From File
			
			try {
				query = readQueryFromFile(System.getProperty("user.dir")+"\\CommonSQLqueries\\LN_Portal_SQLQuery.sql");
			} catch (Throwable e) {
				
				e.printStackTrace();
			}
			System.out.println( "Query : " +query);
		
	   // connect database and execute query
		
				  Connection connection = getDBConnection ();
			      java.sql.Statement stmt = connection.createStatement();
			      ResultSet rs = stmt.executeQuery(query);
			      
			      // Write result set to Excel sheet
			      HSSFWorkbook workbook = new HSSFWorkbook();
			      HSSFCellStyle headerStyle =workbook.createCellStyle();
			      HSSFSheet sheet = workbook.createSheet("Result");
			      HSSFFont headerFont = workbook.createFont();
				  headerFont.setBold(true);
				  headerStyle.setFillPattern(FillPatternType.SOLID_FOREGROUND);
	              headerStyle.setFont(headerFont);
			           
			      int rowNum = 0;
			      int colNum = 0;
			      Row row = sheet.createRow(rowNum++);
			      while (rs.next()) {
			        if (colNum == 0) {
			          for (int i = 1; i <= rs.getMetaData().getColumnCount(); i++) {
			            Cell cell = row.createCell(colNum++);
			            cell.setCellValue(rs.getMetaData().getColumnName(i));
			          }
			        }
			        colNum = 0;
			        row = sheet.createRow(rowNum++);
			        for (int i = 1; i <= rs.getMetaData().getColumnCount(); i++) {
			          Cell cell = row.createCell(colNum++);
			          cell.setCellValue(rs.getString(i));
			        }
			      }
			
		      
		  // Write the workbook to a file
		      
		      FileOutputStream fileOut = new FileOutputStream(System.getProperty("user.dir")+"\\SQL Results\\"+resultFileName);
		      workbook.write(fileOut);
		      fileOut.close();

		      // Close resources
		      rs.close();
		      stmt.close();
		      workbook.close();
			
}

	
	//this method returns result file name
	
	private static String getFilename(String resultFileName) {
		
		LocalDateTime now = LocalDateTime.now();  
		String returnResultFilename="LN_Portal_Results-"+now.getYear()+"-"+now.getMonth()+"-"+now.getDayOfMonth()+"-"+now.getHour()+"-"+now.getMinute()+"-"+now.getSecond()+".xls";
		return returnResultFilename;
	}

	@SuppressWarnings("resource")
	private static String readQueryFromFile(String filepath) throws IOException  {
		
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

