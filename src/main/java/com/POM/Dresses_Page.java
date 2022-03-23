package com.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Dresses_Page {
	public WebDriver driver;
	
	@FindBy(xpath = "(//a[@href=\"http://automationpractice.com/index.php?id_category=10&controller=category\"])[4]")
	private WebElement even_dress;
	
	public Dresses_Page(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getEven_dress() {
		return even_dress;
	}
}
