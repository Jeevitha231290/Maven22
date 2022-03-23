package com.pom_adactin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Select_Page {

	public WebDriver driver;
	@FindBy(id = "radiobutton_0")
	private WebElement sel;
	
	@FindBy(id = "continue")
	private WebElement contin;

	public Select_Page(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getSel() {
		return sel;
	}

	public WebElement getContin() {
		return contin;
	}
	
}
