package com.projectobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Mensteespom {
 
	private WebDriver driver;
	@FindBy (xpath="//a[contains(text(),'Aero')]/ancestor::div[@class=\"product details product-item-details\"]/descendant::div[text()=\"XS\"]")
	private WebElement favTee;
	@FindBy (xpath="//a[contains(text(),'Aero')]/ancestor::div[@class=\"product details product-item-details\"]/descendant::div[@option-label=\"Black\"]")
	private WebElement favTeecolor;
	@FindBy (xpath="//div[@class=\"product-item-info\"]")
	private WebElement tees;
	@FindBy (xpath="//strong[@class=\"product name product-item-name\"]/a[@class=\"product-item-link\"]")
	private WebElement jacRev;
	public WebDriver getDriver() {
		return driver;
	}
	public WebElement getFavTee() {
		return favTee;
	}
	public WebElement getFavTeecolor() {
		return favTeecolor;
	}
	public WebElement getTees() {
		return tees;
	}
	public WebElement getJacRev() {
		return jacRev;
	}
	public Mensteespom(WebDriver abc) {
		driver=abc;
		PageFactory.initElements(driver, this);
	}
	
}
