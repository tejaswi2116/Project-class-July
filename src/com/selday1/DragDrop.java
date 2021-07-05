package com.selday1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragDrop {
	
public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HB\\eclipse-workspace\\SelDay1\\Drivers\\chromedriver.exe");
		
			//Launch the browser//
			
			WebDriver driver = new ChromeDriver();
			
			//To Navigate FB url//
			
			driver.get("http://demo.guru99.com/test/drag_drop.html");
			
			//To maximize the window//
			
			driver.manage().window().maximize();
			
			//To Create Obj for  Action Class//
			
			Actions c = new Actions(driver);
			
			//To drag Bank WebElement//
			
			WebElement Source = driver.findElement(By.xpath("(//a[@class='button button-orange'])[5]"));
			
			//To Drop down into Bank WebElement//
			WebElement Destination = driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
			
			c.dragAndDrop(Source,Destination).perform();
			
			WebElement amountSource = driver.findElement(By.id("fourth"));
			
           WebElement amountDestination = driver.findElement(By.id("amt7"));
			
			c.dragAndDrop(amountSource,amountDestination).perform();
}}
