package com.Project_class_Maven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Base_Class {
	
	public static WebDriver driver;
	public static String value;
	public static WebDriver browserConfiguration(String type) {
		if (type.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir")+"\\Driver\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		else if (type.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", 
					System.getProperty("user.dir")+"\\Driver\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		return driver;
	}

	public static void get(String url) {
		driver.get(url);
		driver.manage().window().maximize();
	}
	
	public static void close() {
		driver.close();
	}
		
	public static void inputData(WebElement element, String data) {
		element.sendKeys(data);
	}
	
	public static void clickOnElement(WebElement element) {
		element.click();
	}
	
	public static  void sleep(int value) throws Throwable  {
		Thread.sleep(value);
	}
	
	public static void dropDown(String type, WebElement element, String value) {
		Select s = new Select(element);
		
		if (type.equalsIgnoreCase("byValue")) {
			s.selectByValue(value);
		}
		
		else if (type.equalsIgnoreCase("byVisibleText")) {
			s.selectByVisibleText(value);
		}
		
		else if (type.equalsIgnoreCase("byIndex")) {
			int index = Integer.parseInt(value);
			s.selectByIndex(index);
		}
	}
	
	public static void scrollJs( WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView()", element );
	}
	
	public static void screenshot(String name) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("C:\\Users\\DELL\\eclipse-workspace\\Project_class_Maven\\ScreenShot//"+name);
		FileUtils.copyFile(src, dest);
	}
	
	public static void scrollBy(String value1, String value2) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript(value1, value2);
	}

	public static void implicitWait(int time, TimeUnit format) {
		driver.manage().timeouts().implicitlyWait(time, format);
	}
	
	public static String particular_Data(String path,  int rowindex, int cellindex) throws IOException {
		
		File f = new File(path);
		
		FileInputStream fis = new FileInputStream(f);
		
		Workbook wb = new XSSFWorkbook(fis);
		
		Sheet s = wb.getSheetAt(0);
		
		Row r = s.getRow(rowindex);
		
		Cell c = r.getCell(cellindex);
		
		CellType type = c.getCellType();
		
		if(type.equals(CellType.STRING)) {
			
			 value = c.getStringCellValue();
		}
		
		else if (type.equals(CellType.NUMERIC)) {

			double d = c.getNumericCellValue();
			
			int a = (int) d;
			
			value = Integer.toString(a);
		}
		
		return value;
		
	}
}
