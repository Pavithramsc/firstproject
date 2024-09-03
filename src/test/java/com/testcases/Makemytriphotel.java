package com.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Makemytriphotel {
 
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
	    driver.manage().window().maximize();
	    driver.findElement(By.xpath("//div[@class=\"imageSlideContainer\"]/section/span")).click();
	    driver.findElement(By.xpath("//li[@class=\"menu_Hotels\"]")).click();
	    driver.findElement(By.xpath("//input[@placeholder=\"Where do you want to stay?\"]")).click();
	    driver.findElement(By.xpath("//span[text()=\"Chennai\"]")).click();
	    driver.findElement(By.xpath("//div[@aria-label=\"Wed Sep 04 2024\"]")).click();
	    driver.findElement(By.xpath("//div[@aria-label=\"Wed Sep 05 2024\"]")).click();
	    driver.findElement(By.xpath("//button[text()=\"Apply\"]")).click();
	    driver.findElement(By.xpath("//input[@aria-label=\"Resort\"]")).click();
	}
}
