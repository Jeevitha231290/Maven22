package com.pom_adactin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BooK_Hotel_Page {

	public WebDriver driver;
	
	@FindBy(id = "first_name")
	private WebElement firname;
	
	@FindBy(id = "last_name")
	private WebElement lasname;
	
	@FindBy(id = "address")
	private WebElement address;
	
	@FindBy(id = "cc_num")
	private WebElement cardno;
	
	@FindBy(id = "cc_type")
	private WebElement cardtype;
	
	@FindBy(id = "cc_exp_month")
	private WebElement expmon;
	
	@FindBy(id = "cc_exp_year")
	private WebElement expyr;
	
	@FindBy(id = "cc_cvv")
	private WebElement cvv;
	
	@FindBy(id = "book_now")
	private WebElement book;
	
	public BooK_Hotel_Page(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getFirname() {
		return firname;
	}

	public WebElement getLasname() {
		return lasname;
	}

	public WebElement getAddress() {
		return address;
	}

	public WebElement getCardno() {
		return cardno;
	}

	public WebElement getCardtype() {
		return cardtype;
	}

	public WebElement getExpmon() {
		return expmon;
	}

	public WebElement getExpyr() {
		return expyr;
	}

	public WebElement getCvv() {
		return cvv;
	}

	public WebElement getBook() {
		return book;
	}
	
	
		
	}

