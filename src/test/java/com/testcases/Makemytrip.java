package com.testcases;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.github.bonigarcia.wdm.WebDriverManager;


public class Makemytrip {
 
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	    driver.findElement(By.xpath("//div[@class=\"imageSlideContainer\"]/section/span")).click();
	    driver.findElement(By.id("fromCity")).click();
	    driver.findElement(By.xpath("//input[@placeholder=\"From\"]")).sendKeys("Tuticorin");
	    WebElement from = driver.findElement(By.xpath("(//div[@class=\"react-autosuggest__section-title\"]"
	    		+ "/following::ul[@class=\"react-autosuggest__suggestions-list\"]/li)[1]"));
	    Thread.sleep(500);
	    Actions action =new Actions(driver);
	    action.moveToElement(from).build().perform();
	    action.click(from).build().perform();
	    driver.findElement(By.id("toCity")).sendKeys("Chennai");
	    WebElement to = driver.findElement(By.xpath("(//div[@class=\"react-autosuggest__section-title\"]/"
	    		+ "following::ul[@class=\"react-autosuggest__suggestions-list\"]/li)[1]"));
	    action.moveToElement(to).build().perform();
	    action.click(to).build().perform();	
	    driver.findElement(By.xpath("//div[@class=\"DayPicker-Day DayPicker-Day--selected\"]")).click();
	    driver.findElement(By.xpath("//a[text()=\"Search\"]")).click();
	}
}
