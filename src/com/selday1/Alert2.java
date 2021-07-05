package com.selday1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert2 {

public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HB\\eclipse-workspace\\SelDay1\\Drivers\\chromedriver.exe");
		
			//Launch the browser//+++
			
			WebDriver driver = new ChromeDriver();
			
			//To Navigate FB url//
			
			driver.get("http://demo.automationtesting.in/Alerts.html");
			
			//To maximize the window//
			
			driver.manage().window().maximize();
			
			

			WebElement btnText = driver.findElement(By.xpath("//a[text()='Alert with OK & Cancel '] "));
			btnText.click();
			
			WebElement btnConfirm = driver.findElement(By.xpath("//button[@class='btn btn-primary']"));
			btnConfirm.click();
			
			Thread.sleep(4000);
			
			Alert a = driver.switchTo().alert();
			a.dismiss();
	
}
}

