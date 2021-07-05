package com.selday1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Selct {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HB\\eclipse-workspace\\SelDay1\\Drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		WebElement btnCreate = driver.findElement(By.xpath("(//a[@role='button'])[2]"));
		btnCreate.click();
		
		Thread.sleep(2000);
		
		WebElement ddMonth = driver.findElement(By.id("month"));
		
		Select s = new Select(ddMonth);
		s.selectByValue("2");
		
		//Ismultiple//method
		//To check whether dd is single selected or multi selected//
		
		boolean b = s.isMultiple();
		System.out.println(b);
		
		
		 
	}
}
