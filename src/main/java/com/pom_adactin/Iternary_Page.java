package com.pom_adactin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Iternary_Page {
	
	public WebDriver driver;
	@FindBy(xpath = "//a[@href=\"BookedItinerary.php\"]")
	private WebElement iternary;

	public Iternary_Page(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getIternary() {
		return iternary;
	}

}
