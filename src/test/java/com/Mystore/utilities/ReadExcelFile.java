package com.Mystore.utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelFile {
	public static FileInputStream inputstream;
	public static XSSFWorkbook workbook;
	public static XSSFSheet sheet;
	public static XSSFRow row;
	public static XSSFCell cell ;
	
	public static String getcellvalue(String Filename ,String Sheetname ,int rowno,int cellno )
	{
		
		try {
			inputstream = new FileInputStream(Filename);
			workbook = new XSSFWorkbook(inputstream);
			sheet = workbook.getSheet(Sheetname);
			cell = workbook.getSheet(Sheetname).getRow(rowno).getCell(cellno);
			workbook.close();
			return cell.getStringCellValue();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			return "";
		}

	}
	public static int getrowcount(String Filename, String sheetname) {
		
		try {
			inputstream = new FileInputStream(Filename);
			workbook = new XSSFWorkbook(inputstream);
			sheet =workbook.getSheet(sheetname);
			
			int ttlrow = sheet.getLastRowNum() +1;
			workbook.close();
			return ttlrow;
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			return 0;
		}
		
	}
	public static int gecoloumcount(String Filename ,String sheetname) {
		
		try {
			inputstream = new FileInputStream(Filename);
			workbook = new XSSFWorkbook(inputstream);
			sheet = workbook.getSheet(sheetname);
			int ttlcoloum = sheet.getRow(0).getLastCellNum();
			return ttlcoloum;
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			return 0;
		}
		
	}
}
	
	


