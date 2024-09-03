package com.projectobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Orderpagepom {
   
	private WebDriver driver;
	@FindBy (xpath="//div[text()=\"XS\"]")
	private WebElement sizeXs;
	@FindBy (xpath="//div[@option-label=\"Black\"]")
	private WebElement colorB;
	@FindBy (xpath="//div[@option-label=\"Red\"]")
	private WebElement colorR;
	@FindBy (name="qty")
	private WebElement qty;
	@FindBy (xpath="//span[text()=\"Add to Cart\"]")
	private WebElement cart;
	@FindBy (xpath="//a[@class=\"action showcart\"]")
	private WebElement myCart;
	@FindBy (xpath="/a[@class=\\\"action showcart\\\"]/span[@class=\\\"counter qty\\\"]")
	private WebElement counterQty;
	@FindBy (id="top-cart-btn-checkout")
	private WebElement checkoutBtn;
	@FindBy (xpath="//a[@title=\"Remove item\"]")
	private WebElement delete;
	@FindBy (xpath="//span[text()=\"OK\"]")
	private WebElement deleteOk;
	@FindBy (xpath="//span[text()=\"Cancel\"]")
	private WebElement deleteCancel;
	@FindBy (xpath="//div[@class=\"modal-inner-wrap\"]/following::button[@class=\"action-close\"]")
	private WebElement deleteClose;
	@FindBy (xpath="//a[@class=\"action edit\"]")
	private WebElement editIcon;
	public WebDriver getDriver() {
		return driver;
	}
	public WebElement getSizeXs() {
		return sizeXs;
	}
	public WebElement getColorB() {
		return colorB;
	}
	public WebElement getQty() {
		return qty;
	}
	public WebElement getCart() {
		return cart;
	}
	public WebElement getMyCart() {
		return myCart;
	}
	public WebElement getCounterQty() {
		return counterQty;
	}
	public WebElement getCheckoutBtn() {
		return checkoutBtn;
	}
	public WebElement getDelete() {
		return delete;
	}
	public WebElement getDeleteOk() {
		return deleteOk;
	}
	public WebElement getDeleteCancel() {
		return deleteCancel;
	}
	public WebElement getDeleteClose() {
		return deleteClose;
	}
	public WebElement getEditIcon() {
		return editIcon;
	}
	public WebElement getColorR() {
		return colorR;
	}
	public Orderpagepom(WebDriver abc) {
		driver=abc;
		PageFactory.initElements(driver, this);
	}
}
