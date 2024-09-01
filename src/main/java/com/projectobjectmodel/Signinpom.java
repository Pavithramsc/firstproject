package com.projectobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Signinpom {
 
	private WebDriver driver;
	@FindBy (xpath="(//li[@class=\"authorization-link\"]/child::a[contains(text(),\"Sign\")])[1]")
	private WebElement signin;
	@FindBy (id="email")
	private WebElement email;
	@FindBy (id="pass")
	private WebElement pass;
	@FindBy (id="send2")
	private WebElement signinBtn;
	@FindBy (linkText="Forgot Your Password?")
	private WebElement forgotPass;
	@FindBy (id="email_address")
	private WebElement emailAdress;
	@FindBy (className="action submit primary")
	private WebElement resetBtn;
	@FindBy (xpath="//button[@class=\"action switch\"]")
	private WebElement menu;
	@FindBy(xpath="//a[contains(text(),\"Sign\")]")
	private WebElement signout;
	public WebDriver getDriver() {
		return driver;
	}
	public WebElement getSignin() {
		return signin;
	}
	public WebElement getEmail() {
		return email;
	}
	public WebElement getPass() {
		return pass;
	}
	public WebElement getSigninBtn() {
		return signinBtn;
	}
	public WebElement getForgotPass() {
		return forgotPass;
	}
	public WebElement getEmailAdress() {
		return emailAdress;
	}
	public WebElement getResetBtn() {
		return resetBtn;
	}
	public WebElement getMenu() {
		return menu;
	}
	public WebElement getSignout() {
		return signout;
	}
	public Signinpom(WebDriver abc){
		driver=abc;
		PageFactory.initElements(driver, this);
	}
}
