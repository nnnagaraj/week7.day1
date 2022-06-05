package com.leaftaps.UI.Utilities;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelData {
	//public String excelFileName;
	public static String[][] readData(String excelFileName) throws IOException {
	//public static String[][] excel(String excelFileName) throws IOException {
	    //XSSFWorkbook book=new XSSFWorkbook("./Data/TestNGInputExcel.xlsx");
		XSSFWorkbook book=new XSSFWorkbook("./TestData/" +excelFileName + ".xlsx");
		
	    
	    //XSSFSheet sheet = book.getSheetAt(0);
	    XSSFSheet sheet = book.getSheet("Sheet1");
	    
	    //int rowCount = sheet.getLastRowNum();
	    int lastRowNum = sheet.getLastRowNum();
	    System.out.println("RowCount: " +lastRowNum);
	    
	    //XSSFRow headerRow = sheet.getRow(0);
	    //short colCount =headerRow.getLastCellNum();
	    
	    short lastCellNum = sheet.getRow(0).getLastCellNum();
	    System.out.println("Column Count: " +lastCellNum);
	    
	    //For sorting and sending to dataProvider, creating 2D array
	    //String[][] data = new String[rowCount][colCount];
	    String[][] data=new String[lastRowNum][lastCellNum];
	    
	    for (int i = 1; i <= lastRowNum; i++) {
	    	//XSSFRow eachRow = sheet.getRow(i);
	        for (int j = 0; j < lastCellNum; j++) {
	        	//XSSFCell eachCell = eachRow.getCell(j)
	        	//String stringCellValue = eachCell.getStringCellValue();
	            String stringCellValue = sheet.getRow(i).getCell(j).getStringCellValue();
	       // System.out.println(stringCellValue);
	        data[i-1][j]=stringCellValue;
	        }
	    }
	    book.close();
	    return data;
	}
	}
