package com.selday1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Selct1 {
	

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HB\\eclipse-workspace\\SelDay1\\Drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.seleniumeasy.com/test/basic-select-dropdown-demo.html");
		
		driver.manage().window().maximize();
		
		
		
		Thread.sleep(2000);
		
		WebElement ddWeekday = driver.findElement(By.id("select-demo"));
		
		Select s = new Select(ddWeekday);
		
		
		s.selectByVisibleText("Sunday");
		
		//s.selectByValue("2");
		
		
		 
	}

}
