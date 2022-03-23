package com.manager;

import org.openqa.selenium.WebDriver;

import com.pom_adactin.BooK_Hotel_Page;
import com.pom_adactin.Home_Page;
import com.pom_adactin.Iternary_Page;
import com.pom_adactin.Search_Hotel_Page;
import com.pom_adactin.Select_Page;

public class Adac_Pom_Manager {

	public WebDriver driver;
	
	private Home_Page hp;
	private Search_Hotel_Page shp;
	private Select_Page sp;
	private BooK_Hotel_Page bhp;
	private Iternary_Page ip;
	
	public Adac_Pom_Manager(WebDriver driver2) {
		this.driver=driver2;
	}
	
	public Home_Page get_Instance_Hp() {
		if(hp==null) {
			hp = new Home_Page(driver);
		}
		return hp;
	}
	
	public Search_Hotel_Page get_Instanca_Shp() {
		if(shp==null) {shp = new Search_Hotel_Page(driver);
		
		}
		return shp;
	}
	
	public Select_Page get_Instance_Sp() {
		if(sp==null) {
			sp = new Select_Page(driver);
		}
		return sp;
	}
	
	public BooK_Hotel_Page get_Instance_Bhp() {
		if(bhp==null) {
			bhp = new BooK_Hotel_Page(driver);
		}
		return bhp;
	}
	
	public Iternary_Page get_Instance_Ip() {
		if(ip==null) {
			ip = new Iternary_Page(driver);
		}
		return ip;
	}
	

}
