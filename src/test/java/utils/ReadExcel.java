package utils;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {
	
	public String[][] readExcel(String fileName) throws IOException {
		
		// Workbook -> Sheet -> Row -> Column(Cell)
		
		// HSSFWorkbook -> for late versions
		
		// the hardcode	for one particular cell
//		XSSFWorkbook wBook = new XSSFWorkbook("C:/Program Files/SeleniumSoft/QAWebAutomation/data/data.xlsx");
//		XSSFSheet sheet = wBook.getSheet("Sheet1");
//		XSSFRow row = sheet.getRow(2);
//		XSSFCell cell = row.getCell(1);
//		String stringCellValue = cell.getStringCellValue();
//		System.out.println(stringCellValue);
		
		// put in the nested loop to read the value from all the rows
		
		XSSFWorkbook wBook = new XSSFWorkbook("./data/"+fileName+".xlsx");
		XSSFSheet sheet = wBook.getSheet("Sheet1");
		
		// get count of rows
		// by default getLastRowNum counts from 1, 
		// it by default neglect the header
		int rowCount = sheet.getLastRowNum();
		
		// get count of columns
		int columnCount = sheet.getRow(0).getLastCellNum();
		
		String[][] data = new String[rowCount][columnCount];
		
		
		// for the rows , start with i = 1 to neglect the header
		for (int i = 1; i <= rowCount; i++) {
			
			XSSFRow row = sheet.getRow(i);
			
			// for the cell 
			for (int j = 0; j < columnCount; j++) {
				XSSFCell cell = row.getCell(j);
				String stringCellValue = cell.getStringCellValue();
				data[i-1][j] = stringCellValue;
			}
		}
		
		return data;
	} 
	
}
