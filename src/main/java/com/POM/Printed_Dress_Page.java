package com.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Printed_Dress_Page {
	public WebDriver driver;
	@FindBy(xpath = "//i[@class=\"icon-plus\"]")
	private WebElement quantity;
	
	@FindBy(xpath = "//select[@class=\"form-control attribute_select no-print\"]")
	private WebElement size;
	
	@FindBy(xpath = "//a[@class=\"color_pick selected\"]")
	private WebElement color;
	
	@FindBy(xpath = "(//p[@class=\"buttons_bottom_block no-print\"])[1]")
	private WebElement cart;
	
	@FindBy(xpath = "//span[@class=\"continue btn btn-default button exclusive-medium\"]")
	private WebElement con_shop;
	
	@FindBy(xpath = "(//a[@title=\"T-shirts\"])[2]")
	private WebElement tshirt;
	
	
	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getTshirt() {
		return tshirt;
	}

	public Printed_Dress_Page(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getQuantity() {
		return quantity;
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

	public WebElement getCon_shop() {
		return con_shop;
	}
}
