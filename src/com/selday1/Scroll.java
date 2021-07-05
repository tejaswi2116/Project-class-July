package com.selday1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scroll {
	
public static void main(String[] args) throws InterruptedException  {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HB\\eclipse-workspace\\SelDay1\\Drivers\\chromedriver.exe");
		
			//Launch the browser//
			
		WebDriver driver = new ChromeDriver();
		
			
			//To Navigate FB url//
			
			driver.get("http://greenstech.in/selenium-course-content.html");
			
			//To maximize the window//
			
			driver.manage().window().maximize();
			
			//top/promo or up/down anything we can declare for reference name//
			
			WebElement down = driver.findElement(By.xpath("//a[@title='Selenium Certification Training']"));
	
       JavascriptExecutor jk= (JavascriptExecutor)driver;
       
       jk.executeScript("arguments[0].scrollIntoView(true)", down);
       
       Thread.sleep(4000);
       
       WebElement up = driver.findElement(By.xpath("(//div[@class='promo-content'])[1]"));
       
       for (int j = 0; j < args.length; j++) {
		
    	   
           jk.executeScript("arguments["+j+"].scrollIntoView(false)", down , up);
	}
      
       
}
}