package com.Project_class_Maven;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Base_Class1 {
	
	public static WebDriver driver;
	public static WebDriver browser_launch(String type) {

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
	
	public static void getUrl(String url) {
		driver.get(url);
		driver.manage().window().maximize();
	}
	
	public static void clickOnElement(WebElement element) {
		element.click();
	}
	
	public static void inputData(WebElement element, String data) {
		element.sendKeys(data);
	}
	
	public static  void close() {
		driver.close();
	}
	
	public static void sleep(int time) throws Throwable{
		Thread.sleep(time);
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
		File dest = new File("C:\\Users\\DELL\\eclipse-workspace\\Project_class_Maven\\ScreenShot\\"+name);
		FileUtils.copyFile(src, dest);
	}
	
	public static void alert(String type) {
		Alert a = driver.switchTo().alert();
		if (type.equalsIgnoreCase("accept")) {
			a.accept();
		}
		else if (type.equalsIgnoreCase("decline")) {
			a.dismiss();
		}
		else if (type.equalsIgnoreCase("sendkeys")) {
			a.sendKeys(null);
		}
	}
	
	public static void frame(String type,  String value) {
		if (type.equalsIgnoreCase("by id")) {
			driver.switchTo().frame(value);
		}
		else if (type.equalsIgnoreCase("by name")) {
			driver.switchTo().frame(value);
		}
		else if (type.equalsIgnoreCase("webelement")) {
			driver.switchTo().frame(value);
		}
		else if (type.equalsIgnoreCase("index")) {
			int index = Integer.parseInt(value);
			driver.switchTo().frame(index);
		}
		else if (type.equalsIgnoreCase("default")) {
			driver.switchTo().defaultContent();
		}
	}
	
	public static void mouseActions(String method, WebElement source, WebElement target) {
		Actions x = new Actions(driver);
		if (method.equalsIgnoreCase("click")) {
			x.click(target).build().perform();
		}
		else if (method.equalsIgnoreCase("rightclick")) {
			x.contextClick(target).build().perform();
		}
		else if (method.equalsIgnoreCase("doubleclick")) {
			x.doubleClick(target).build().perform();
		}
		else if (method.equalsIgnoreCase("draganddrop")) {
			x.clickAndHold(source).moveToElement(target).release(target).build().perform();
			x.dragAndDrop(source, target).build().perform();
		}
	}
	
	public static void pageUpandDown(String event) throws AWTException {
		Robot r = new Robot();
		if (event.equalsIgnoreCase("pageup")) {
			r.keyPress(KeyEvent.VK_PAGE_UP);
			r.keyRelease(KeyEvent.VK_PAGE_UP);
		}
		else if (event.equalsIgnoreCase("pagedown")) {
			r.keyPress(KeyEvent.VK_PAGE_DOWN);
			r.keyRelease(KeyEvent.VK_PAGE_DOWN);
		}
	}
	public static void waitImplicit(int time, TimeUnit format) {
		driver.manage().timeouts().implicitlyWait(time, format);
	}
	
	public static void waitExplicit(int time, WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	
//	public void waitFluent(Duration time) {
//		Wait w = new FluentWait(driver).withTimeout(time);
//		w.pollingEvery
//	}
}
	
	
	
	
	
	
	
	

