package com.projectobjectmanager;

import org.openqa.selenium.WebDriver;

import com.projectobjectmodel.Createaccountpom;
import com.projectobjectmodel.Mensoptions;
import com.projectobjectmodel.Mensteespom;
import com.projectobjectmodel.Orderpagepom;
import com.projectobjectmodel.Shippingpom;
import com.projectobjectmodel.Signinpom;

public class Projectobjectmanager {
 
	WebDriver driver;
	Createaccountpom cap;
	Signinpom si;
	Mensoptions men;
	Mensteespom menTee;
	Orderpagepom orderPage;
	Shippingpom shipPage;
	public Createaccountpom getInstanceCA() {
		if(cap==null) {
			cap=new Createaccountpom(driver);
		}
		return cap;
	}
	public Signinpom getInstanceSI() {
		if(si==null) {
			si= new Signinpom(driver);
		}
		return si;
	}
	public Mensoptions getInstanceMen() {
		if(men==null) {
			men=new Mensoptions(driver);
		}
		return men;
	}
	public Mensteespom getInstanceMentee() {
		if(menTee==null) {
			menTee=new Mensteespom(driver);
		}
		return menTee;
	}
	public Orderpagepom getInstanceOrderpage() {
		if(orderPage==null) {
			orderPage=new Orderpagepom(driver);
		}
		return orderPage;
	}
	public Shippingpom getInstanceShippage() {
		if(shipPage==null) {
			shipPage=new Shippingpom(driver);
		}
		return shipPage;
	}
	public Projectobjectmanager(WebDriver abc) {
		this.driver=abc;
	}
	
	
}
