package ExceSheetTest;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadWriteExcel {

	public static void main(String[] args) throws Throwable {	
 
		FileInputStream fi = new FileInputStream("F:\\Excelbook.xlsx");
		
		XSSFWorkbook wb = new XSSFWorkbook(fi);
		
		XSSFSheet ws = wb.getSheet("Login");
		
		int rc = ws.getLastRowNum();
		System.out.println(rc);
		for(int i=0; i<=rc; i++)
		{
			String un = ws.getRow(i).getCell(0).getStringCellValue();
			
			String ps = ws.getRow(i).getCell(1).getStringCellValue();
			
			System.out.println(un+" "+ps);
			ws.getRow(i).createCell(2).setCellValue("Shravaniii");

		}
		fi.close();
		FileOutputStream fo = new FileOutputStream("F:\\Results.xlsx");
		wb.write(fo);
		fo.close();
		wb.close();
	}

}
