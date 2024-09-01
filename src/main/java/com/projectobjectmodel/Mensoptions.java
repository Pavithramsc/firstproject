package com.projectobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Mensoptions {
 
	private WebDriver driver;
	@FindBy (linkText="Men")
	private WebElement Men;
	@FindBy (xpath="//span[text()=\"Men\"]/following::span[text()=\"Tops\"]")
	private WebElement tops;
	@FindBy (xpath="//span[text()=\"Men\"]/following::span[text()=\"Jackets\"]")
	private WebElement jackets;
	@FindBy (xpath="//span[text()=\"Men\"]/following::span[contains(text(),'Hoodies')]")
	private WebElement hoodies;
	@FindBy (xpath="//span[text()=\"Men\"]/following::span[text()=\"Tees\"]")
	private WebElement tees;
	@FindBy (xpath="//span[text()=\"Men\"]/following::span[text()=\"Tanks\"]")
	private WebElement tanks;
	@FindBy (xpath="//span[text()=\"Men\"]/following::span[text()=\"Bottoms\"]")
	private WebElement bottoms;
	@FindBy (xpath="//span[text()=\"Men\"]/following::span[text()=\"Pants\"]")
	private WebElement pants;
	@FindBy (xpath="//span[text()=\"Men\"]/following::span[text()=\"Shorts\"]")
	private WebElement Shorts;
	

	public WebDriver getDriver() {
		return driver;
	}


	public WebElement getMen() {
		return Men;
	}


	public WebElement getTops() {
		return tops;
	}


	public WebElement getJackets() {
		return jackets;
	}


	public WebElement getHoodies() {
		return hoodies;
	}


	public WebElement getTees() {
		return tees;
	}


	public WebElement getTanks() {
		return tanks;
	}


	public WebElement getBottoms() {
		return bottoms;
	}


	public WebElement getPants() {
		return pants;
	}


	public WebElement getShorts() {
		return Shorts;
	}


	public Mensoptions(WebDriver abc) {
		driver=abc;
		PageFactory.initElements(driver, this);
	}
}
