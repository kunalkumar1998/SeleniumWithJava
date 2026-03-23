package SeleniumDataDrivenTesting;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataDrivenTestingReadingExcelFile  {
	
	public static void main(String [] args) throws IOException {
	
	FileInputStream file = new FileInputStream(System.getProperty("user.dir")+"\\testdata\\data.xlsx");
	
	XSSFWorkbook workbook = new XSSFWorkbook(file);
	
	XSSFSheet sheet = workbook.getSheet("Sheet");
	
	int totalRows = sheet.getLastRowNum();
	
	int totalCells = sheet.getRow(1).getLastCellNum();
	
	for(int r =0; r<totalRows ;r++) {
		
		XSSFRow  currentrow =sheet.getRow(r);
		
		for(int c=0 ; c<totalCells;c++) {
			
			
			XSSFCell cell =currentrow.getCell(c);
			System.out.print(cell.toString());
			
		}
		System.out.println();
	}
	
	workbook.close();
	file.close();
	

}

}