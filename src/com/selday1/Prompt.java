package com.selday1;

import java.awt.AWTException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Prompt {

public static void main(String[] args) throws InterruptedException  {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HB\\eclipse-workspace\\SelDay1\\Drivers\\chromedriver.exe");
		
			//Launch the browser//+++
			
			WebDriver driver = new ChromeDriver();
			
			//To Navigate FB url//
			
			driver.get("http://demo.automationtesting.in/Alerts.html");
			
			//To maximize the window//
			
			driver.manage().window().maximize();
			
			

			WebElement btnText = driver.findElement(By.xpath("//a[text()='Alert with Textbox '] "));
			btnText.click();
			
			WebElement btnConfirm = driver.findElement(By.xpath("//button[@class='btn btn-info']"));
			btnConfirm.click();
			
			
			Alert a = driver.switchTo().alert();
			
			a.sendKeys("Divashi");
			
			Thread.sleep(3000);
			
			a.accept();
}
}