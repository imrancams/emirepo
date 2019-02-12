package com.omniwyse.ReadingExcel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;

/**
 * @author imran ahmad
 * 
 *         this application will read excel sheet
 */
public class ReadingExcelSheetModified {

	private static final String attendanceFile = "/home/omnitech/Desktop/feb1-7.xls";

	public static void main(String[] args) throws IOException {
		HashMap<Integer, Employee> empMap = readXLSXFile();
	}

	//this 
	public static HashMap<Integer, Employee> readXLSXFile() throws IOException {
		try {
			FileInputStream fis=new FileInputStream(attendanceFile);
			Workbook workbook=new HSSFWorkbook(fis);
			Sheet sheet = workbook.getSheetAt(0);
			for(Row row:sheet) {
				for(Cell cell:row) {
					

					if(cell.getStringCellValue().equalsIgnoreCase("Days")) {
						System.out.println(cell.getStringCellValue());
					}
					if(cell.getStringCellValue().equalsIgnoreCase("Employee Code:-")) {
						System.out.println(cell.getStringCellValue());
					}
					if(cell.getStringCellValue().equalsIgnoreCase("Employee Name:-")) {
						System.out.println(cell.getStringCellValue());
					}
					if(cell.getStringCellValue().equalsIgnoreCase("shift")) {
						System.out.println(cell.getStringCellValue());
					}
					if(cell.getStringCellValue().equalsIgnoreCase("in time")) {
						System.out.println(cell.getStringCellValue());
					}
					if(cell.getStringCellValue().equalsIgnoreCase("out time")) {
						System.out.println(cell.getStringCellValue()+" \n");
					}
					
				}
				
			}
		}catch(FileNotFoundException e)
	{
		e.printStackTrace();
	}catch(IOException e)
	{
			e.printStackTrace();
		}return null;
}

}
