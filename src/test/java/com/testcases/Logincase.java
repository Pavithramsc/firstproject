package com.testcases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.baseclass.Baseclass;
import com.helper.DataReaderManager;
import com.projectobjectmanager.Projectobjectmanager;

public class Logincase extends Baseclass {
	WebDriver driver;
	
    @Test (priority = 0)
	public void login() throws IOException {
    	WebDriver driver = browserLaunch("chrome");
    	WebDriverWait wait= new WebDriverWait(driver, 10);
    	//CASE-1
		urlLaunch(DataReaderManager.getInstanceDRM().getInstanceDR().getPropertyUrl());
		Projectobjectmanager pom = new Projectobjectmanager(driver);
        SoftAssert sa =new SoftAssert();
		sa.assertTrue(pom.getInstanceSI().getSignin().isDisplayed());
		clickElement(pom.getInstanceSI().getSignin());
		sendKeys(pom.getInstanceSI().getEmail(),
				DataReaderManager.getInstanceDRM().getInstanceDR().gerPropertyUsername());
		sendKeys(pom.getInstanceSI().getPass(),
				DataReaderManager.getInstanceDRM().getInstanceDR().getPropertyPassword());
		clickElement(pom.getInstanceSI().getSigninBtn());
		
		//sign out CASE-2
//		clickElement(pom.getInstanceSI().getMenu());
//		clickElement(pom.getInstanceSI().getSignout());
		
		//ordering men's tee- CASE -3
//		actionMoveTo("moveto",pom.getInstanceMen().getMen());
//		actionMoveTo("moveto",pom.getInstanceMen().getTops());
//		actionMoveTo("moveto",pom.getInstanceMen().getTees());
//		actionMoveTo("click",pom.getInstanceMen().getTees());
//		clickElement(pom.getInstanceMentee().getTees());
//		clickElement(pom.getInstanceOrderpage().getSizeXs());
//		clickElement(pom.getInstanceOrderpage().getColorB());
//		pom.getInstanceOrderpage().getQty().clear();
//		sendKeys(pom.getInstanceOrderpage().getQty(),"2");
//		clickElement(pom.getInstanceOrderpage().getCart());
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@class=\"action showcart\"]/span[@class=\"counter qty\"]")));
//		clickElement(pom.getInstanceOrderpage().getMyCart());
//		clickElement(pom.getInstanceOrderpage().getCheckoutBtn());
////		scrollOptions("scrollby",0,500);
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("ko_unique_3")));
//		clickElement(pom.getInstanceShippage().getRadio1());
//		clickElement(pom.getInstanceShippage().getNext());
		
		//ordering men's Jacket- CASE -4
		actionMoveTo("moveto",pom.getInstanceMen().getMen());
		actionMoveTo("moveto",pom.getInstanceMen().getTops());
		actionMoveTo("moveto",pom.getInstanceMen().getJackets());
		actionMoveTo("click",pom.getInstanceMen().getJackets());
		clickElement(pom.getInstanceFilter().getStyle());
		clickElement(pom.getInstanceFilter().getReversible());
		clickElement(pom.getInstanceMentee().getJacRev());
		clickElement(pom.getInstanceOrderpage().getSizeXs());
		clickElement(pom.getInstanceOrderpage().getColorR());
		pom.getInstanceOrderpage().getQty().clear();
		sendKeys(pom.getInstanceOrderpage().getQty(),"2");
		clickElement(pom.getInstanceOrderpage().getCart());
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@class=\"action showcart\"]/span[@class=\"counter qty\"]")));
		clickElement(pom.getInstanceOrderpage().getMyCart());
		clickElement(pom.getInstanceOrderpage().getCheckoutBtn());
//		scrollOptions("scrollby",0,500);
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("ko_unique_3")));
//		clickElement(pom.getInstanceShippage().getRadio1());
//		clickElement(pom.getInstanceShippage().getNext());
		
	}
    
}
