package com.data_driven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Read_Data_Dummy {

	public static void particular_cell_data() throws IOException {

		File f = new File(
				"C:\\Users\\DELL\\eclipse-workspace\\Project_class_Maven\\Test Cases\\Adactin Test Cases.xlsx");

		FileInputStream fis = new FileInputStream(f);

		Workbook wb = new XSSFWorkbook(fis);

		Sheet s = wb.getSheetAt(1);

		Row r = s.getRow(3);

		Cell c = r.getCell(1);

		CellType type = c.getCellType();

		if (type.equals(CellType.STRING)) {

			String str = c.getStringCellValue();

			System.out.println(str);
		}

		else if (type.equals(CellType.NUMERIC)) {

			double d = c.getNumericCellValue();

			int a = (int) d;

			System.out.println(a);

		}

		wb.close();

	}

	public static void all_Data() throws IOException {

		File f = new File(
				"C:\\Users\\DELL\\eclipse-workspace\\Project_class_Maven\\Test Cases\\Adactin Test Cases.xlsx");
		FileInputStream fis = new FileInputStream(f);

		Workbook wb = new XSSFWorkbook(fis);

		Sheet s = wb.getSheetAt(1);

		for (int i = 0; i < s.getPhysicalNumberOfRows(); i++) {
			Row r = s.getRow(i);

			for (int j = 0; j < r.getPhysicalNumberOfCells(); j++) {
				Cell c = r.getCell(j);

				CellType type = c.getCellType();

				if (type.equals(CellType.STRING)) {

					String value = c.getStringCellValue();

					System.out.println(value);
				} else if (type.equals(CellType.NUMERIC)) {

					double d = c.getNumericCellValue();

					int a = (int) d;

					String value = Integer.toString(a);

					System.out.println(value);

				}
			}
		}

		wb.close();
	}

	public static void particular_Row_Data() throws IOException {

		File f = new File(
				"C:\\Users\\DELL\\eclipse-workspace\\Project_class_Maven\\Test Cases\\Adactin Test Cases.xlsx");

		FileInputStream fis = new FileInputStream(f);

		Workbook wb = new XSSFWorkbook(fis);

		Sheet s = wb.getSheetAt(1);

		Row r = s.getRow(2);

		for (int i = 0; i < r.getPhysicalNumberOfCells(); i++) {

			Cell c = r.getCell(i);

			CellType type = c.getCellType();

			if (type.equals(CellType.STRING)) {

				String value = c.getStringCellValue();

				System.out.println(value);
			} else if (type.equals(CellType.NUMERIC)) {

				double d = c.getNumericCellValue();

				int a = (int) d;

				String value = String.valueOf(a);

				System.out.println(value);

			}

		}

		wb.close();

	}

	public static void particular_Column_Data() throws IOException {

		File f = new File(
				"C:\\Users\\DELL\\eclipse-workspace\\Project_class_Maven\\Test Cases\\Adactin Test Cases.xlsx");

		FileInputStream fis = new FileInputStream(f);

		Workbook wb = new XSSFWorkbook(fis);

		Sheet s = wb.getSheetAt(1);

		for (int i = 0; i < s.getPhysicalNumberOfRows(); i++) {

			Row r = s.getRow(i);

			Cell c = r.getCell(0);

			CellType type = c.getCellType();

			if (type.equals(CellType.STRING)) {

				String value = c.getStringCellValue();

				System.out.println(value);
			} else if (type.equals(CellType.NUMERIC)) {

				double d = c.getNumericCellValue();

				int a = (int) d;

				String value = String.valueOf(a);

				System.out.println(value);

			}

		}
		
		wb.close();

	}

	public static void main(String[] args) throws IOException {

		particular_Column_Data();

	}

}
