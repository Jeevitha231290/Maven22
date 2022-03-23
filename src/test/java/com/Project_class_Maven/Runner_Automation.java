
package com.Project_class_Maven;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.junit.validator.PublicClassValidator;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

import com.POM.Address_Page;
import com.POM.Back_Page;
import com.POM.Confirm_Page;
import com.POM.Dresses_Page;
import com.POM.Even_Dress_Page;
import com.POM.Faded_Tshirt_Page;
import com.POM.Home_Page;
import com.POM.Login_Page;
import com.POM.My_Acc_Page;
import com.POM.Order_Summary_Page;
import com.POM.Payment_Page;
import com.POM.Printed_Dress_Page;
import com.POM.Shipping_Page;
import com.POM.Tshirts_Page;
import com.manager.Pom_Manager;

public class Runner_Automation extends Base_Class {

	public static WebDriver driver = browserConfiguration("chrome");;
	public static Pom_Manager pom = new Pom_Manager(driver);
	public static Logger log = Logger.getLogger(Runner_Automation.class);
	public static String value;

	public static void main(String[] args) throws Throwable {
		PropertyConfigurator.configure("log4j.properties");

		get("http://automationpractice.com/index.php");

		log.info("WebApplication Launched");

		implicitWait(10, TimeUnit.SECONDS);

		clickOnElement(pom.get_Instance_Hp().getSign_in());

		inputData(pom.get_Instance_Lp().getEmail(), particular_Data(
				"C:\\Users\\DELL\\eclipse-workspace\\Project_class_Maven\\AUTOMATION TEST CASES.xlsx",
				 2, 5));

		inputData(pom.get_Instance_Lp().getPassword(), particular_Data(
				"C:\\Users\\DELL\\eclipse-workspace\\Project_class_Maven\\AUTOMATION TEST CASES.xlsx",
				 7, 5));

		clickOnElement(pom.get_Instance_Lp().getSign_in());

		log.info("User Successfully logged in");

		clickOnElement(pom.get_Instance_Ap().getDresses());

		clickOnElement(pom.get_Instance_Dp().getEven_dress());

		dropDown("byValue", pom.get_Instance_Edp().getSortby(), "price:asc");

		clickOnElement(pom.get_Instance_Edp().getPic());

		clickOnElement(pom.get_Instance_Pdp().getQuantity());

		dropDown("byValue", pom.get_Instance_Pdp().getSize(), "2");

		clickOnElement(pom.get_Instance_Pdp().getColor());

		clickOnElement(pom.get_Instance_Pdp().getCart());
		sleep(3000);
		log.info("User add 2 dresses into the cart");

		clickOnElement(pom.get_Instance_Pdp().getCon_shop());
		sleep(3000);

		log.info("User Continues Shopping");
		
		clickOnElement(pom.get_Instance_Pdp().getTshirt());

		dropDown("byValue", pom.get_Instance_Tp().getSortby(), "price:desc");

		clickOnElement(pom.get_Instance_Tp().getPic());

		dropDown("byValue", pom.get_Instance_Ftp().getSize(), "2");

		clickOnElement(pom.get_Instance_Ftp().getColor());

		clickOnElement(pom.get_Instance_Ftp().getCart());
		
		log.info("User add T-shirt to the cart");

		clickOnElement(pom.get_Instance_Ftp().getPayment());

		log.info("User proceeds to payment");
		
		clickOnElement(pom.get_Instance_Osp().getCheckout());

		clickOnElement(pom.get_Instance_Adp().getCheckout());
		
		log.info("User confirms the Delivery Address");

		clickOnElement(pom.get_Instance_Sp().getAgree());

		clickOnElement(pom.get_Instance_Sp().getCheckout());

		clickOnElement(pom.get_Instance_Pp().getBankwire());
		
		log.info("User makes the payment by Bankwire");

		clickOnElement(pom.get_Instance_Cp().getConfirm());
		
		log.info("User confirms the Order Payment");

		screenshot("automation.png");

		scrollBy("window.scrollBy(0,300)", "");

		screenshot("automation1.png");

		clickOnElement(pom.get_Instance_Bp().getBack());
		
		log.info("User goes back to see the Order Histort");

		scrollBy("window.scrollBy(0,400)", "");

	}
}