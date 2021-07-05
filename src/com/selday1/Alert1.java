package com.selday1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Alert;

public class Alert1 {
	
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HB\\eclipse-workspace\\SelDay1\\Drivers\\chromedriver.exe");
		
			//Launch the browser//+++
			
			WebDriver driver = new ChromeDriver();
			
			//To Navigate FB url//
			
			driver.get("http://demo.automationtesting.in/Alerts.html");
			
			//To maximize the window//
			
			driver.manage().window().maximize();
			
			//Simple alert--->ok button//
			
			WebElement btnSimple = driver.findElement(By.xpath("//button[@class='btn btn-danger']"));
			btnSimple.click();
			
			Thread.sleep(4000);
		
			Alert a = driver.switchTo().alert();
			a.accept();
}
}

