package com.Project_class_Maven;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class Runner_Automation_ACC {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\eclipse-workspace\\Selenium\\Driver1\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("http://automationpractice.com/index.php");
	driver.manage().window().maximize();
	System.out.println("TITLE       : "+driver.getTitle());
	System.out.println("CURRENT URL : "+driver.getCurrentUrl());
	
	WebElement sign_in = driver.findElement(By.xpath("//a[@class=\"login\"]"));
	sign_in.click();

	WebElement email = driver.findElement(By.id("email_create"));
	email.sendKeys("rprakash21@gmail.com");
	
	WebElement acc_create = driver.findElement(By.id("SubmitCreate"));
	acc_create.click();
	
	driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	
	WebElement title = driver.findElement(By.xpath("(//input[@name=\"id_gender\"])[1]"));
	title.click();
	
	WebElement fir_name = driver.findElement(By.id("customer_firstname"));
	fir_name.sendKeys("RGV");
	
	WebElement las_name = driver.findElement(By.id("customer_lastname"));
	las_name.sendKeys("Prakash");
	
	WebElement password = driver.findElement(By.id("passwd"));
	password.sendKeys("12@April21");
	
	WebElement dob_day = driver.findElement(By.id("days"));
	Select day = new Select(dob_day);
	day.selectByValue("12");
	
	WebElement dob_mon = driver.findElement(By.id("months"));
	Select mon = new Select(dob_mon);
	mon.selectByValue("4");
	
	WebElement dob_yr = driver.findElement(By.id("years"));
	Select yr = new Select(dob_yr);
	yr.selectByValue("2021");
	
	WebElement offers = driver.findElement(By.xpath("//label[@for=\"optin\"]"));
	offers.click();
	
	WebElement fir_name1 = driver.findElement(By.id("firstname"));
	fir_name1.sendKeys("RGV");
	
	WebElement las_name1 =driver.findElement(By.id("lastname"));
	las_name1.sendKeys("Prakash");
	
	WebElement company = driver.findElement(By.id("company"));
	company.sendKeys("Prakash Enterprises");
	
	WebElement address1 = driver.findElement(By.name("address1"));
	address1.sendKeys("City Hall Park, Broadway");
	
	WebElement address2 = driver.findElement(By.name("address2"));
	address2.sendKeys("No.300, Jayson Avenue");
	
	WebElement city = driver.findElement(By.name("city"));
	city.sendKeys("NewYork");
	
	WebElement state = driver.findElement(By.name("id_state"));
	Select st = new Select(state);
	st.selectByValue("32");
	
	WebElement zip_code = driver.findElement(By.id("postcode"));
	zip_code.sendKeys("10004");
	
	WebElement country = driver.findElement(By.id("id_country"));
	Select con = new Select(country);
	con.selectByValue("21");
	
	WebElement add_info = driver.findElement(By.id("other"));
	add_info.sendKeys("Opp. to St.Paul's Chruch");
	
	WebElement hm_pho = driver.findElement(By.id("phone"));
	hm_pho.sendKeys("212-674-0971");
	
	WebElement mob_no = driver.findElement(By.id("phone_mobile"));
	mob_no.sendKeys("7299978328");
	
	WebElement assign_add = driver.findElement(By.id("alias"));
	assign_add.sendKeys(" -NewYork-10004.");
	
	WebElement reg = driver.findElement(By.id("submitAccount"));
	reg.click();
	
	
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("window.scrollBy(0,100)", "");
			
			
	TakesScreenshot ts = (TakesScreenshot) driver;
	File source = ts.getScreenshotAs(OutputType.FILE);
	File destination = new File("C:\\Users\\DELL\\eclipse-workspace\\Selenium\\image file//automation_acc.png");
	FileHandler.copy(source, destination);
	}
}
