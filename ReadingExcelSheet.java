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
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;

/**
 * @author imran ahmad
 * 
 *         this application will read excel sheet
 */
public class ReadingExcelSheet {

	private static final String attendanceFile = "/home/omnitech/Desktop/feb1-7.xls";

	public static void main(String[] args) throws IOException {
		HashMap<Integer, Employee> empMap = readXLSXFile();
	}

	public static HashMap<Integer, Employee> readXLSXFile() throws IOException {
		try {
			HashMap<Integer, Employee> empMap = null;
			Employee emp = null;
			List<String> dateList;
			String code = null;
			String name = null;
			dateList = new ArrayList<String>();
			String shift = null;
			String inTime = null;
			String outTime = null;
			List<String> outTimeList = new ArrayList<>();
			List<String> InTimeList = new ArrayList<>();
			List<String> shiftList = new ArrayList<String>();
			FileInputStream excelFile = new FileInputStream(new File(attendanceFile));
			HSSFWorkbook workBook = new HSSFWorkbook(excelFile);
			HSSFSheet sheet = workBook.getSheetAt(0);
			HSSFRow row;
			HSSFCell cell;
			Iterator<Row> rows = sheet.rowIterator();
			int totalIteration = 0;
			String rowName= "Days";
			int currentIterationNumber = 0;
			while (rows.hasNext()) {
				totalIteration++;
				currentIterationNumber++;
				int cellIndicator = 0;
				row = (HSSFRow) rows.next();
				
				Iterator<Cell> cells = row.cellIterator();
				for(int i=0;i<row.getLastCellNum();i++) {
				while (cells.hasNext()) {
					cellIndicator++;
					cell = (HSSFCell) cells.next();
					// reading days
					if (cell.getRowIndex()==1||cell.getStringCellValue().equalsIgnoreCase("Days")) {
						if (cellIndicator > 2 && cellIndicator != 8 && cellIndicator < 11) {
							String dates = cell.getStringCellValue();
							dateList.add(dates);

						} // if
					} // if
						// reading employee code and employee name
					if (cell.getRowIndex()==6) {
						if (cellIndicator >9&&cellIndicator<17) {
							code = cell.getStringCellValue();
							System.out.print(code+"\t");
							name = cell.getStringCellValue();
							System.out.print(name);
						}
					}
					// reading shift of the employee
					if (cell.getRowIndex() == 8) {
						if (cellIndicator > 2 && cellIndicator < 11) {
							shift = cell.getStringCellValue();
							shiftList.add(shift);
						} // if
					} // if
						// reading intime of the employee
					if (cell.getRowIndex() == 9) {
						if (cellIndicator > 2 && cellIndicator < 11) {
							inTime = cell.getStringCellValue();
							InTimeList.add(inTime);
						} // if
					} // if

					// reading ouTtime of the employee
					if (cell.getRowIndex() == 10) {
						if (cellIndicator > 2 && cellIndicator < 11) {
							outTime = cell.getStringCellValue();
							outTimeList.add(outTime);
						} // if
					} // if

				} // inner while
				}
			} // while
			System.out.println();
			System.out.print(code);
			System.out.print(name);
			System.out.println("out time  " + outTimeList);
			System.out.println("in  time " + InTimeList);
			System.out.println("shift  " + shiftList);

			System.out.println(dateList);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;

	}
}
