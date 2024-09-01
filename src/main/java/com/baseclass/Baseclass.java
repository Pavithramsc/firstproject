package com.baseclass;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;


public class Baseclass {
	
	static WebDriver driver;
	
	public static WebDriver browserLaunch(String options) {
		try {
		if(options.equalsIgnoreCase("chrome")) {
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		}else if(options.equalsIgnoreCase("edge")) {
		WebDriverManager.edgedriver();
		driver=new EdgeDriver();
		}else if(options.equalsIgnoreCase("firefox")) {
		WebDriverManager.firefoxdriver();
		driver=new FirefoxDriver();
		}}catch(Exception e) {
			e.printStackTrace();
		}
		return driver;
	}
	public static void closeWindow() {
		driver.close();
	}
	public static void quitWindow() {
		driver.quit();
	}
	public static void navigateTo(String url) {
		driver.navigate().to(url);
	}
	public static void navigateBff(String options) {
		try {
		if(options.equalsIgnoreCase("back")) {
		driver.navigate().back();
		}
		else if(options.equalsIgnoreCase("forward")) {
		driver.navigate().forward();
		}
		else if(options.equalsIgnoreCase("refresh")) {
		driver.navigate().refresh();
		}}catch(Exception e) {
			e.printStackTrace();
		}
	}
	public static void urlLaunch(String url) {
		driver.get(url);
	}
	public static void alert(String options) {
		try {
		if(options.equalsIgnoreCase("alert")) {
		driver.switchTo().alert();
		}else if(options.equalsIgnoreCase("accept")) {
		driver.switchTo().alert().accept();
		}else if(options.equalsIgnoreCase("dismiss")) {
		driver.switchTo().alert().dismiss();
		}else if(options.equalsIgnoreCase("gettext")) {
		driver.switchTo().alert().getText();
		}}
		catch(Exception e){
			e.printStackTrace();
		}
	}
	public static void alertSendkeys(String value) {
		driver.switchTo().alert().sendKeys(value);
	}
	public static void actionMoveTo(String options,WebElement String) {
		try {
		Actions action =new Actions(driver);
		if(options.equalsIgnoreCase("moveto")) {
		action.moveToElement(String).build().perform();
		}else if(options.equalsIgnoreCase("click")) {
		action.click(String).build().perform();
		}else if(options.equalsIgnoreCase("rightclick")) {
		action.contextClick(String).build().perform();	
		}else if(options.equalsIgnoreCase("doubleclick")) {
		action.doubleClick(String).build().perform();	
		}}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void frameWe(WebElement String) {
		driver.switchTo().frame(String);
	}
	public static void frameIn(int index) {
		driver.switchTo().frame(index);
	}
	public static void frameId(String id) {
		driver.switchTo().frame(id);
	}
	public static void robotKeypress(String options) {
		try {
		Robot kb =new Robot();
		if(options.equalsIgnoreCase("enter")) {
		kb.keyPress(KeyEvent.VK_ENTER);
		}else if(options.equalsIgnoreCase("pagedown")) {
		kb.keyPress(KeyEvent.VK_PAGE_DOWN);
		}else if(options.equalsIgnoreCase("pageup")) {
		kb.keyPress(KeyEvent.VK_PAGE_UP);	
		}else if(options.equalsIgnoreCase("space")) {
		kb.keyPress(KeyEvent.VK_SPACE);	
		}}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	public static void robotKeyRelease(String options) {
		try {
		Robot kb =new Robot();
		if(options.equalsIgnoreCase("enter")) {
		kb.keyRelease(KeyEvent.VK_ENTER);
		}else if(options.equalsIgnoreCase("pagedown")) {
		kb.keyRelease(KeyEvent.VK_PAGE_DOWN);
		}else if(options.equalsIgnoreCase("pageup")) {
		kb.keyRelease(KeyEvent.VK_PAGE_UP);	
		}else if(options.equalsIgnoreCase("space")) {
		kb.keyRelease(KeyEvent.VK_SPACE);	
		}}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	public static void windowHandle(String options) {
		if(options.equalsIgnoreCase("currentwindow")) {
			driver.getWindowHandle();
		}else if(options.equalsIgnoreCase("allwindow")) {
			driver.getWindowHandles();
		}else if(options.equalsIgnoreCase("currenturl")) {
			driver.getCurrentUrl();
		}else if(options.equalsIgnoreCase("title")) {
			driver.getTitle();
		}
	}
	public static void sendKeys(WebElement element,String value) {
		element.sendKeys(value);
	}
	public static void clickElement(WebElement element) {
		element.click();
	}
	
	public static void selectElements(String options,WebElement element,String value) {
		try {
		Select s =new Select(element);
		if(options.equalsIgnoreCase("index")) {
		int index = Integer.parseInt(value);
		s.selectByIndex(index);
		}else if(options.equalsIgnoreCase("value")) {
		s.selectByValue(value);	
		}else if(options.equalsIgnoreCase("visbletext")) {
		s.selectByVisibleText(value);
		}
		}catch(Exception e) {
		e.printStackTrace();
		}
	}
	public static void deSelectElements(String options,WebElement element,String value) {
		try {
		Select s =new Select(element);
		if(options.equalsIgnoreCase("index")) {
		int index = Integer.parseInt(value);
		s.deselectByIndex(index);
		}else if(options.equalsIgnoreCase("value")) {
		s.deselectByValue(value);
		}else if(options.equalsIgnoreCase("visbletext")) {
		s.deselectByVisibleText(value);
		}
		}catch(Exception e) {
		e.printStackTrace();
		}
	}
	public static void selectMethods(String options,WebElement element){
		try {
		Select s =new Select(element);
		if(options.equalsIgnoreCase("allselected")){
		s.getAllSelectedOptions();
		}else if(options.equalsIgnoreCase("firstselectedoption")) {
		s.getFirstSelectedOption();
		}else if(options.equalsIgnoreCase("getoptions")) {
		s.getOptions();
		}else if(options.equalsIgnoreCase("ismultiple")) {
		s.isMultiple();
		}else if(options.equalsIgnoreCase("deselectall")) {
		s.deselectAll();
		}
		}catch(Exception e) {
		e.printStackTrace();
		}
	}
	public static void checkBox(String options,WebElement element) {
		try {
		if(options.equalsIgnoreCase("isenabled")) {
			element.isEnabled();
		}else if(options.equalsIgnoreCase("isdisplayed")) {
			element.isDisplayed();
		}else if(options.equalsIgnoreCase("isselected")) {
			element.isSelected();
		}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	public static void radioButton(String options,WebElement element) {
		try {
		if(options.equalsIgnoreCase("isenabled")) {
			element.isEnabled();
		}else if(options.equalsIgnoreCase("isdisplayed")) {
			element.isDisplayed();
		}else if(options.equalsIgnoreCase("isselected")) {
			element.isSelected();
		}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	public static void getText(WebElement element) {
		element.getText();
	}
	public static void getAttribute(WebElement element,String name) {
		element.getAttribute(name);
	}
	public static void screenshot(String path) {
		try {
			TakesScreenshot ss = (TakesScreenshot)driver;
			File from=ss.getScreenshotAs(OutputType.FILE);
			File to=new File(path);
			FileHandler.copy(from, to);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	public static WebDriverWait explicitWait(int timeDuration) {
		WebDriverWait wait= new WebDriverWait(driver, timeDuration);
		return wait;
	}
	public static void scrollOptions(String options,int x,int y) {
		try {
		JavascriptExecutor JSE = (JavascriptExecutor)driver;
		if(options.equalsIgnoreCase("scrollTo")) {
		String op="window.scrollTo(x,y)";
		JSE.executeScript(op, "");
		}else if(options.equalsIgnoreCase("scrollBy")) {
		String op1="window.scrollBy(x,y)";
		JSE.executeScript(op1, "");
		}else if(options.equalsIgnoreCase("scroll")) {
		String op2="window.scroll(x,y)";
		JSE.executeScript(op2, "");
		}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
