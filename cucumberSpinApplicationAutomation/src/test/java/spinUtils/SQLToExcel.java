package spinUtils;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import org.apache.poi.hssf.usermodel.HSSFFont;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.hssf.util.HSSFColor;
import org.apache.poi.ss.usermodel.FillPatternType;

import com.mysql.cj.jdbc.result.ResultSetMetaData;

public class SQLToExcel {
	

	
	public SQLToExcel () {
					
	}
	
	public static void main(String[] args) {
		
		SQLToExcel sqlExcel = new SQLToExcel();
	    String sqlQuery = "Select LoginId FROM aiig_dw_model2.userinfo Where LoginId in ('AAllen')";
	    ResultSet rs = sqlExcel.getResultsetFromSql(sqlQuery);
	    
	
		LocalDateTime now = LocalDateTime.now();  
		String outputExcelFileName="ER_Request_Results-"+now.getYear()+"-"+now.getMonth()+"-"+now.getDayOfMonth()+"-"+now.getHour()+"-"+now.getMinute()+"-"+now.getSecond()+".xls";

	    try {
			
	    	sqlExcel.generateExcel(sqlExcel.ProcesssResultSet(rs), outputExcelFileName);
			System.out.println("ER Query Executed Successfully");
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
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

	@SuppressWarnings("removal")
	public Map <String, LinkedHashMap <String, String>> ProcesssResultSet (ResultSet resultset) {
	
	ArrayList<String> columnNames = new ArrayList<String>();
    LinkedHashMap<String, String> rowDetails = new LinkedHashMap<String, String>();
    Map<String, LinkedHashMap<String, String>> resultMap = new LinkedHashMap<String, LinkedHashMap<String, String>>();
    ResultSetMetaData resultmetadata = null;
    
    if (resultset != null)
    {
            try
            {
            		resultmetadata = (ResultSetMetaData) resultset.getMetaData();
                    for (int i = 1; i <= resultmetadata.getColumnCount(); i++)
                    {
                            System.out.println(i + " -> " + resultmetadata.getColumnName(i));
                            columnNames.add(resultmetadata.getColumnName(i));
                    }
            }
            catch (SQLException e)
            {
                    e.printStackTrace();
            }
    }

    try
    {
            int rowCount = 1;
            while (resultset.next())
            {
                    for (int i = 1; i <= resultmetadata.getColumnCount(); i++)
                    {
                            rowDetails.put(resultmetadata.getColumnName(i), resultset.getString(i));
                    }
                    resultMap.put(new Integer(rowCount).toString(), rowDetails);
                    rowCount++;
                    rowDetails = new LinkedHashMap<String, String>();
            }
    }
    catch (SQLException e)
    {
            e.printStackTrace();
    }
    return resultMap;
}
	
	@SuppressWarnings({ "deprecation", "removal" })
	public void generateExcel(Map<String, LinkedHashMap<String, String>> resultMap, String outputExcelFileName) throws IOException{
		
		FileOutputStream fileOutput = null;
		
		try {
			
				@SuppressWarnings("resource")
				HSSFWorkbook workbook = new HSSFWorkbook();
				HSSFCellStyle headerStyle =workbook.createCellStyle();
				HSSFSheet sheet3 = workbook.createSheet(outputExcelFileName);
				
				HSSFFont headerFont = workbook.createFont();
				headerFont.setBold(true);
				headerStyle.setFillPattern(FillPatternType.SOLID_FOREGROUND);
                headerStyle.setFillForegroundColor(HSSFColor.PALE_BLUE.index);
                headerStyle.setFillBackgroundColor(HSSFColor.WHITE.index);
                headerStyle.setFont(headerFont);
                

        		
                try
                {
                	fileOutput = new FileOutputStream(System.getProperty("user.dir")+"//SQL Results//" + outputExcelFileName + ".xls");
                }
                catch (FileNotFoundException e)
                {
                        e.printStackTrace();
                }
                
                HSSFRow sessionname = sheet3.createRow(2);
                HSSFCell title = sessionname.createCell(3);
                title.setCellStyle(headerStyle);
                title.setCellValue(outputExcelFileName);

                HSSFRow row = sheet3.createRow(5);

                Map<String, LinkedHashMap<String, String>> rMap = resultMap;
                Map<String, String> columnDetails = rMap.get("1");

                Set<String> s = columnDetails.keySet();
                int cellNo = 0;
                for (String s1 : s)
                {
                        HSSFCell cell0 = row.createCell(cellNo);
                        cell0.setCellStyle(headerStyle);
                        cell0.setCellValue(s1);
                        cellNo++;
                }


                for (int i = 1; i <= rMap.size(); i++)
                {
                        columnDetails = rMap.get(new Integer(i).toString());
                        System.out.println(i);
                        HSSFRow nextrow = sheet3.createRow(5 + i);
                        Set<String> set = columnDetails.keySet();
                        int cellNum = 0;
                        for (String s2 : set)
                        {
                                nextrow.createCell(cellNum).setCellValue(columnDetails.get(s2));
                                cellNum++;
                        }
                }

                sheet3.autoSizeColumn(0);
                sheet3.autoSizeColumn(1);
                sheet3.autoSizeColumn(2);
                sheet3.autoSizeColumn(3);
                workbook.write(fileOutput);
                fileOutput.flush();
                fileOutput.close();
                
                
        } catch (FileNotFoundException fe) {
        	fe.printStackTrace();
        }
		
		finally {
			
			try {
				fileOutput.flush();
				fileOutput.close();	
			}catch (IOException e) {
				e.printStackTrace();
			}
			
			
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	



}