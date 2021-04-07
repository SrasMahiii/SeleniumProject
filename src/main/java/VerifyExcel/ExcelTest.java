package VerifyExcel;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.*;
public class ExcelTest {

	public static void main(String[] args) throws IOException {
	
			FileInputStream file = new FileInputStream("C:\\SeleniumPractice\\Excel\\Mahiii ExcelFile.xlsx");
			
			XSSFWorkbook workbook = new XSSFWorkbook(file);
			
			XSSFSheet sheet = workbook.getSheet("Sheet1");
			
			int rowcount = sheet.getLastRowNum();
			
			int cellcount = sheet.getRow(0).getLastCellNum();
			
			for(int i=0; i<rowcount; i++)
			{
				XSSFRow currentrow= sheet.getRow(i);  //Focused on current row
				
				for(int j=0; j<cellcount; j++)
				{
					currentrow.getCell(i).toString();   //read the value from the cell 
				}
				
			}
			
			
		}

	

	}


