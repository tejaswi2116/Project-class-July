package com.selday1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Account {
	
public static void main(String[] args) throws InterruptedException  {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HB\\eclipse-workspace\\SelDay1\\Drivers\\chromedriver.exe");
		
			//Launch the browser//
			
			WebDriver d = new ChromeDriver();
			
			//To Navigate FB url//
			
			d.get("https://www.facebook.com/");
			
			//To maximize the window//
			
			d.manage().window().maximize();
			
		   
			//Create an Account//

			WebElement f1 = d.findElement(By.xpath("(//a[@role='button'])[2]"));
		
			
			
		      f1.click();
		      
		      Thread.sleep(2000);
		      
		      WebElement ddmonth = d.findElement(By.id("month"));
	             
              Select s = new Select(ddmonth);
              s.selectByValue("3");
			
			
			}
		
			}
	



