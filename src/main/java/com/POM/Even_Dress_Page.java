package com.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Even_Dress_Page {
	public WebDriver driver;
	
	@FindBy(id = "selectProductSort")
	private WebElement sortby;
	
	@FindBy(xpath = "(//img[@class=\"replace-2x img-responsive\"])[2]")
	private WebElement pic;

	
	public Even_Dress_Page(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}

	

	
	public WebElement getSortby() {
		return sortby;
	}

	public WebElement getPic() {
		return pic;
	}
}
