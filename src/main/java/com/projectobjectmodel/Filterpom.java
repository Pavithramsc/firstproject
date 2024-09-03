package com.projectobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Filterpom {
 
	private WebDriver driver;
	@FindBy (xpath="//div[@id=\"narrow-by-list\"]/descendant::div[text()=\"Style\"]")
	private WebElement style;
	@FindBy (xpath="//a[contains(text(),\"Reversible\")]")
	private WebElement reversible;
	public WebDriver getDriver() {
		return driver;
	}
	public WebElement getStyle() {
		return style;
	}
	public WebElement getReversible() {
		return reversible;
	}
	public Filterpom(WebDriver abc) {
		driver=abc;
		PageFactory.initElements(driver, this);
	}
}
