package com.omniwyse.ReadingExcel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
/**
 * 
 * @author imran ahmad
 * this class will parse the data from log in log out file.
 *
 */
public class ParseExcel {
	private static final String fileName = "/home/omnitech/Desktop/feb1-7.xls";

	public static HashMap<String, List<LogInLogOut>> readLogInLogOut(String fileName) {
		try {
			HashMap<String, List<LogInLogOut>> logDetailsMap=null;
			List<LogInLogOut> logInOutList=null;
			LogInLogOut logInLogOut=null;
			String empCode=null;
			FileInputStream fis = new FileInputStream(new File(fileName));
			HSSFWorkbook workbook=new HSSFWorkbook(fis);
			HSSFSheet sheet=workbook.getSheetAt(0);
			HSSFRow row=null;
			HSSFCell cell=null;
			Iterator<Row> rows = sheet.rowIterator();
			while(rows.hasNext()) {
				int cellIndicator=0;
				row=(HSSFRow) rows.next();
				Iterator<Cell> cells = row.cellIterator();
				while(cells.hasNext()) {
					cellIndicator++;
					cell=(HSSFCell) cells.next();
					
				}
				
			}
			
		} catch (FileNotFoundException fnf) {
			fnf.printStackTrace();
		}catch(IOException  io) {
			io.printStackTrace();
		}
		return null;
		
	}
	
	
	public static void main(String[] args) {
		readLogInLogOut(fileName);
	}

}
