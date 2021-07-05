package com.selday1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame {
	
public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HB\\eclipse-workspace\\SelDay1\\Drivers\\chromedriver.exe");
		
			//Launch the browser//
			
			WebDriver driver = new ChromeDriver();
			
			//To Navigate FB url//
			
			driver.get("https://www.amazon.in/");
			
			//To maximize the window//
			
			driver.manage().window().maximize();	
			
			//To check the particular appln has frame or not-->//iframe-->dom structure
			//To switch into the frame using id or name//
			
			//driver.switchTo().frame()//if particular image action not happened we use this method..//
			
			
			//To click the img//
			
			WebElement btnImg = driver.findElement(By.xpath("//img[@alt='Your language is live']"));
			
			btnImg.click();
			
}
}