package ExceSheetTest;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ConvertingStringtoIntExcel {

	public static void main(String[] args) throws Throwable {
		//to read the Excel
		FileInputStream fi = new FileInputStream("E://Sras.xls");
		//get wb from file
		Workbook wb = WorkbookFactory.create(fi);		
		//get sheet from wb
		Sheet ws = wb.getSheetAt(0);

		Row row = ws.getRow(0);	
		
		//count the num of rows
		int rc = ws.getLastRowNum();
		//count the num of cells
		int cc = row.getLastCellNum();
		
		System.out.println(rc+"   "+cc);
		
		for(int i=1; i<=rc; i++)
		{
			//get username cell data
			String user=ws.getRow(i).getCell(0).getStringCellValue();
			
			//get password cell data
			if(wb.getSheet("Sras").getRow(i).getCell(1).getCellType()==CellType.NUMERIC)
			{
				//get int type cell
				//celldata :  it is a parameter which is holding password coloumn data and
				//also it is Storing INT Type data
				int celldata = (int) wb.getSheet("Sras").getRow(i).getCell(1).getNumericCellValue();
				// I Want to convert integer Type data into String type data
				//convert celldata cell int into String type data
				//for that we use "java function"
				String pass = String.valueOf(celldata);
		
				System.out.println(user+"    "+pass);
			}
		//	int pass=(int)ws.getRow(i).getCell(1).getNumericCellValue();
				
			ws.getRow(i).createCell(2).setCellValue("Shravs");
			
		}
		fi.close();
		FileOutputStream fo = new FileOutputStream("E://Results.xls");
		wb.write(fo);
		fo.close();
		wb.close();
		}

}
