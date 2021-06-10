package Tests;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader {
	File file;
	FileInputStream fis;
	XSSFWorkbook wb;
	XSSFSheet sheet;
	XSSFRow row;
	XSSFCell cell;
	
	public ExcelReader (String filePath) throws IOException {
		file = new File(filePath);
		fis = new FileInputStream(file);
		wb = new XSSFWorkbook(fis);
	}
	public String getStringData(String sheetName, int rowNumber, int colNumber) {
		sheet = wb.getSheet(sheetName);
		row = sheet.getRow(rowNumber);
		cell = row.getCell(colNumber);
		return cell.getStringCellValue();
		
	}
	public int getIntegerData(String sheetName, int rowNumber, int colNumber) {
		sheet = wb.getSheet(sheetName);
		row = sheet.getRow(rowNumber);
		cell = row.getCell(colNumber);
		
		return (int)cell.getNumericCellValue();
		
	}

}
