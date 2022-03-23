package com.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class My_Acc_Page {

	public WebDriver driver;
	
	@FindBy(xpath = "(//a[@title=\"Dresses\"])[2]")
	private WebElement dresses;
	
	

	public My_Acc_Page(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}

	

	public WebElement getDresses() {
		return dresses;
	}

	
	
}
