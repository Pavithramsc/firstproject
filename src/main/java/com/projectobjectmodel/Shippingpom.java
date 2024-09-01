package com.projectobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Shippingpom {
 
	private WebDriver driver;
	@FindBy (xpath="//div[@class=\"control _with-tooltip\"]/input[@id=\"customer-email\"]")
	private WebElement email;
	@FindBy (name="firstname")
	private WebElement fName;
	@FindBy (name="lastname")
	private WebElement lName;
	@FindBy (name="company")
	private WebElement company;
	@FindBy (name="street[0]")
	private WebElement street0;
	@FindBy (name="street[1]")
	private WebElement street1;
	@FindBy (name="street[2]")
	private WebElement street2;
	@FindBy (name="city")
	private WebElement city;
	@FindBy (name="region_id")
	private WebElement region;
	@FindBy (name="postcode")
	private WebElement postcode;
	@FindBy (name="country_id")
	private WebElement country;
	@FindBy (name="telephone")
	private WebElement ph;
	@FindBy (name="ko_unique_3")
	private WebElement radio1;
	@FindBy (name="ko_unique_4")
	private WebElement radio2;
	@FindBy (xpath="//span[text()=\"Next\"]")
	private WebElement next;
	public WebDriver getDriver() {
		return driver;
	}
	public WebElement getEmail() {
		return email;
	}
	public WebElement getfName() {
		return fName;
	}
	public WebElement getlName() {
		return lName;
	}
	public WebElement getCompany() {
		return company;
	}
	public WebElement getStreet0() {
		return street0;
	}
	public WebElement getStreet1() {
		return street1;
	}
	public WebElement getStreet2() {
		return street2;
	}
	public WebElement getCity() {
		return city;
	}
	public WebElement getRegion() {
		return region;
	}
	public WebElement getPostcode() {
		return postcode;
	}
	public WebElement getCountry() {
		return country;
	}
	public WebElement getPh() {
		return ph;
	}
	public WebElement getRadio1() {
		return radio1;
	}
	public WebElement getRadio2() {
		return radio2;
	}
	public WebElement getNext() {
		return next;
	}
	public Shippingpom(WebDriver abc) {
		driver=abc;
		PageFactory.initElements(driver, this);
	}
	
	
	
}
