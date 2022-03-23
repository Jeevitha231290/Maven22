package com.manager;

import org.openqa.selenium.WebDriver;

import com.POM.Address_Page;
import com.POM.Back_Page;
import com.POM.Confirm_Page;
import com.POM.Dresses_Page;
import com.POM.Even_Dress_Page;
import com.POM.Faded_Tshirt_Page;
import com.POM.Home_Page;
import com.POM.Login_Page;
import com.POM.My_Acc_Page;
import com.POM.Order_Summary_Page;
import com.POM.Payment_Page;
import com.POM.Printed_Dress_Page;
import com.POM.Shipping_Page;
import com.POM.Tshirts_Page;

public class Pom_Manager {
	
	public WebDriver driver;
	
	private  Home_Page hp;
	private  Login_Page lp;
	private  My_Acc_Page ap;
	private Dresses_Page dp;
	private  Even_Dress_Page edp;
	private  Printed_Dress_Page pdp;
	private  Tshirts_Page tp;
	private  Faded_Tshirt_Page ftp;
	private  Order_Summary_Page osp;
	private  Address_Page adp;
	private  Shipping_Page sp;
	private  Payment_Page pp;
	private  Confirm_Page cp;
	private  Back_Page bp;
	
	public Pom_Manager(WebDriver driver2) {
		this.driver = driver2;
	}
	public Home_Page get_Instance_Hp() {
		if(hp==null) {
		hp = new Home_Page(driver);
	}
		return hp;
	}
	public Login_Page get_Instance_Lp() {
		if (lp==null) {
			lp = new Login_Page(driver);
		}
		return lp;
	}
	public My_Acc_Page get_Instance_Ap() {
		if(ap==null) {
		}
		ap = new My_Acc_Page(driver);
		return ap;
	}
	public Dresses_Page get_Instance_Dp() {
		if(dp==null) {
			dp = new Dresses_Page(driver);
		}
		return dp;
	}
	public Even_Dress_Page get_Instance_Edp() {
		if(edp==null) {
		}
		edp = new Even_Dress_Page(driver);
		return edp;
	}
	public Printed_Dress_Page get_Instance_Pdp() {
		if(pdp==null) {
			pdp = new Printed_Dress_Page(driver);
		}
		return pdp;
	}
	public Tshirts_Page get_Instance_Tp() {
		if(tp==null) {
			tp = new Tshirts_Page(driver);
		}
		return tp;
	}
	public Faded_Tshirt_Page get_Instance_Ftp() {
		if(ftp==null) {
			ftp = new Faded_Tshirt_Page(driver);
		}
		return ftp;
	}
	public Order_Summary_Page get_Instance_Osp() {
		if(osp==null) {
			osp = new Order_Summary_Page(driver);
		}
		return osp;
	}
	public Address_Page get_Instance_Adp() {
		if(adp==null) {
			adp = new Address_Page(driver);
		}
		return adp;
	}
	public Shipping_Page get_Instance_Sp() {
		sp = new Shipping_Page(driver);
		return sp;
	}
	public Payment_Page get_Instance_Pp() {
		if(pp==null) {
		pp = new Payment_Page(driver);
		}
		return pp;
	}
	public Confirm_Page get_Instance_Cp() {
		if(cp==null) {
			cp = new Confirm_Page(driver);
		}
		return cp;
	}
	public Back_Page get_Instance_Bp() {
		if(bp==null) {
			bp = new Back_Page(driver);
		}
		return bp;
	}
}
