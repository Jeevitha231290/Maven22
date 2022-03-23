package com.Project_class_Maven;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

import com.manager.Adac_Pom_Manager;
import com.pom_adactin.BooK_Hotel_Page;
import com.pom_adactin.Home_Page;
import com.pom_adactin.Iternary_Page;
import com.pom_adactin.Search_Hotel_Page;
import com.pom_adactin.Select_Page;

public class Runner_Class extends Base_Class{
	
	public static WebDriver driver = browserConfiguration("chrome");;

	public static Adac_Pom_Manager apom = new Adac_Pom_Manager(driver);
	
	public static Logger log = Logger.getLogger(Runner_Class.class);
	
	public static void main(String[] args) throws Throwable{
		
		PropertyConfigurator.configure("log4j.properties");
		
		get("https://adactin.com/HotelApp/index.php");

		implicitWait(30, TimeUnit.SECONDS);
		
		inputData(apom.get_Instance_Hp().getUser(), particular_Data("C:\\Users\\DELL\\eclipse-workspace\\Project_class_Maven\\Adactin Test Cases.xlsx",18,5));
		
		inputData(apom.get_Instance_Hp().getPass(), particular_Data("C:\\Users\\DELL\\eclipse-workspace\\Project_class_Maven\\Adactin Test Cases.xlsx", 19, 5));
		
		clickOnElement(apom.get_Instance_Hp().getLogin());
		
		log.info("User Succefully Loggedin");
		
		dropDown("byValue", apom.get_Instanca_Shp().getLocation(), "Paris");
		
		dropDown("byValue", apom.get_Instanca_Shp().getHotel(), "Hotel Sunshine");
		
		dropDown("byValue", apom.get_Instanca_Shp().getRoomtype(), "Double");
		
		dropDown("byValue", apom.get_Instanca_Shp().getRoomno(), "3");
		
		inputData(apom.get_Instanca_Shp().getCheckin(), "09/03/2022");

		inputData(apom.get_Instanca_Shp().getCheckout(), "11/03/22");
		
		dropDown("byValue", apom.get_Instanca_Shp().getAdult(), "2");
		
		dropDown("byValue", apom.get_Instanca_Shp().getChild(), "2");
		
		log.info("User Provides all Credentials for booking a hotel");
		
		clickOnElement(apom.get_Instanca_Shp().getSearch());
			
		clickOnElement(apom.get_Instance_Sp().getSel());
		
		clickOnElement(apom.get_Instance_Sp().getContin());
		
		log.info("User select the searched hotel and continues to payment");
		
		inputData(apom.get_Instance_Bhp().getFirname(), particular_Data( "C:\\Users\\DELL\\eclipse-workspace\\Project_class_Maven\\Adactin Test Cases.xlsx", 34, 5));		
		
		inputData(apom.get_Instance_Bhp().getLasname(),particular_Data("C:\\Users\\DELL\\eclipse-workspace\\Project_class_Maven\\Adactin Test Cases.xlsx", 35, 5));
		
		inputData(apom.get_Instance_Bhp().getAddress(), particular_Data("C:\\Users\\DELL\\eclipse-workspace\\Project_class_Maven\\Adactin Test Cases.xlsx", 36, 5));
		
		inputData(apom.get_Instance_Bhp().getCardno(), particular_Data("C:\\Users\\DELL\\eclipse-workspace\\Project_class_Maven\\Adactin Test Cases.xlsx", 37, 5));
		
		inputData(apom.get_Instance_Bhp().getCardtype(), particular_Data("C:\\Users\\DELL\\eclipse-workspace\\Project_class_Maven\\Adactin Test Cases.xlsx", 38, 5));
		
		inputData(apom.get_Instance_Bhp().getExpmon(), particular_Data("C:\\Users\\DELL\\eclipse-workspace\\Project_class_Maven\\Adactin Test Cases.xlsx", 39, 5));
		
		inputData(apom.get_Instance_Bhp().getExpyr(), particular_Data("C:\\Users\\DELL\\eclipse-workspace\\Project_class_Maven\\Adactin Test Cases.xlsx", 40, 5));
		
		inputData(apom.get_Instance_Bhp().getCvv(), particular_Data("C:\\Users\\DELL\\eclipse-workspace\\Project_class_Maven\\Adactin Test Cases.xlsx", 41, 5));
		
		log.info("User Provides all the information for payment");
		
		clickOnElement(apom.get_Instance_Bhp().getBook());
		
		log.info("User Booked a Hotel");
		
		clickOnElement(apom.get_Instance_Ip().getIternary());
		
		screenshot("automation_acc.png");
		
 	}
}
