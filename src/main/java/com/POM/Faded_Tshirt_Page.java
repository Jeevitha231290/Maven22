package com.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Faded_Tshirt_Page {
	
	public WebDriver driver;
 
	@FindBy(id = "group_1")
	private WebElement size;
	
	@FindBy(xpath = "//a[@id=\"color_14\"]")
	private WebElement color;
	
	@FindBy(xpath = "(//button[@type=\"submit\"])[3]")
	private WebElement cart;
	
	@FindBy(xpath = "//a[@class=\"btn btn-default button button-medium\"]")
	private WebElement payment;

	public Faded_Tshirt_Page(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getSize() {
		return size;
	}

	public WebElement getColor() {
		return color;
	}

	public WebElement getCart() {
		return cart;
	}

	public WebElement getPayment() {
		return payment;
	}
	
}
