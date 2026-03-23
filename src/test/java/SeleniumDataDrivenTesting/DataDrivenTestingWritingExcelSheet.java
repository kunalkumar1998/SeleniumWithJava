package SeleniumDataDrivenTesting;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataDrivenTestingWritingExcelSheet {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		XSSFWorkbook  workbook =new XSSFWorkbook();
		
		XSSFSheet sheet =workbook.createSheet("data");
		
		XSSFRow row = sheet.createRow(0);
           row.createCell(0).setCellValue("Java");
           row.createCell(1).setCellValue(19);
           row.createCell(2).setCellValue("Automation");
           
        XSSFRow row1 = sheet.createRow(1);
        row1.createCell(0).setCellValue("C#");
        row1.createCell(1).setCellValue(19);
        row1.createCell(2).setCellValue("Automation");
        
        FileOutputStream file = new FileOutputStream(System.getProperty("user.dir")+"\\testdata\\myfile.xlsx");
        
        workbook.write(file);
        workbook.close();
        
        file.close();
        
        System.out.println("File Created ...");
        
        
	}

}
