package week4.day4;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadDataSF {
	
	public static String[][] read (String datafile) throws IOException{
		
				XSSFWorkbook wb= new XSSFWorkbook("./Data/"+datafile+".xlsx");
				
				XSSFSheet sheet = wb.getSheetAt(0);
				
				//read row count
				int rowCount = sheet.getLastRowNum();
				
				System.out.println("total no of row : "+rowCount);
				//read cell count
				int cellNum = sheet.getRow(0).getLastCellNum();
				
				System.out.println("total no of col :"+cellNum);
				
				//how read data and print in consle
				
//				XSSFRow firstdata = sheet.getRow(2);
				
//				XSSFCell cell = firstdata.getCell(2);
//				System.out.println(cell.getStringCellValue());
				
				String[][] data=new String[rowCount][cellNum];
				
				for (int i = 1; i <=rowCount; i++) {
					
				XSSFRow firstdata1 = sheet.getRow(i);
				
				for (int j = 0; j < cellNum; j++) {
					XSSFCell cell2 = firstdata1.getCell(j);
					
					data[i-1][j]=cell2.getStringCellValue();
					
					
				}
				
				}
			wb.close();
			return data;
				
				}
	
	
	
	
	
	
	

}
