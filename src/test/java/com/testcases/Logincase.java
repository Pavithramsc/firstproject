package com.testcases;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.baseclass.Baseclass;
import com.helper.DataReaderManager;
import com.projectobjectmanager.Projectobjectmanager;

public class Logincase extends Baseclass {
    @Test
	public void login() throws IOException {
    	WebDriver driver = browserLaunch("chrome");
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
//		clickElement(pom.getInstanceSI().getMenu());
//		clickElement(pom.getInstanceSI().getSignout());
		
		
	}
}
