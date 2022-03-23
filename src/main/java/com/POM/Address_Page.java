package com.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Address_Page {

	public WebDriver driver;
	
	@FindBy(xpath = "(//button[@type=\"submit\"])[2]")
	private WebElement checkout;

	public Address_Page(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getCheckout() {
		return checkout;
	}
}
