package ExceSheetTest;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class UserInterface {

	public static void main(String[] args) throws Throwable {

		FileInputStream fi = new FileInputStream("F:\\Book.xls");
		
		Workbook wb = WorkbookFactory.create(fi);
		Sheet ws = wb.getSheetAt(0);
		Row row = ws.getRow(0);
		int rc = ws.getLastRowNum();
		int cc = row.getLastCellNum();
		System.out.println(rc+"   "+cc);
		
		for(int i=1; i<=rc; i++)		
		{
			String user = ws.getRow(i).getCell(0).getStringCellValue();
			String pass = ws.getRow(i).getCell(1).getStringCellValue();
			System.out.println(user+"   "+pass);
			ws.getRow(i).createCell(2).setCellValue("Shravs");

		}
		fi.close();
	   FileOutputStream fo = new FileOutputStream("F:\\Results.xls");
	   wb.write(fo);
	   fo.close(); 
	   wb.close();
}

}
