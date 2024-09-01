package com.projectobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Createaccountpom {
 
	private WebDriver driver;
	@FindBy (linkText="Create an Account")
	private WebElement createAcbtn;
	
	@FindBy (id="firstname")
	private WebElement firstName;
	
	@FindBy (id="lastname")
	private WebElement lastName;
	
	@FindBy (id="email_address")
	private WebElement emailAddress;
	
	@FindBy (id="password")
	private WebElement password;
	
	@FindBy (id="password-confirmation")
	private WebElement passConfirm;
	
	@FindBy (xpath="//button/child::span[text()=\"Create an Account\"]")
	private WebElement createBtn;

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getCreateAcbtn() {
		return createAcbtn;
	}

	public WebElement getFirstName() {
		return firstName;
	}

	public WebElement getLastName() {
		return lastName;
	}

	public WebElement getEmailAddress() {
		return emailAddress;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getPassConfirm() {
		return passConfirm;
	}

	public WebElement getCreateBtn() {
		return createBtn;
	}
	public Createaccountpom(WebDriver abc){
		driver=abc;
		PageFactory.initElements(driver, this);
	}
}
