package com.selday1;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Robot1 {

public static void main(String[] args) throws AWTException {
			
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\HB\\eclipse-workspace\\SelDay1\\Drivers\\chromedriver.exe");
			
				//Launch the browser//
				
				WebDriver driver = new ChromeDriver();
				
				//To Navigate FB url//
				
				driver.get("https://www.google.com/");
				
				//To maximize the window//
				
				driver.manage().window().maximize();
				
				//To Create Obj for  Action Class//
				
				Actions c = new Actions(driver);

				WebElement btnGmail = driver.findElement(By.xpath("//a[text()= 'Gmail']"));
			
				//To right click button gmail//
				
			    c.contextClick(btnGmail).perform();
			    
			    //Use Robot Class//
			    
			   Robot r = new Robot();
			
			//to press Down Arrow 3 times to select 3rd option  or //can use normal for loop method 1 time too//
			
			//for(int i =0 ; i <= 3 ;  i++ ) {
			
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
			//}
			
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
			
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
			
      
			//To Click Enter//
			
			r.keyPress(KeyEvent.VK_ENTER);
			r.keyRelease(KeyEvent.VK_ENTER);
			
			
			//For reference to use//
			
			//Ctrl+c
			
			//r.keyPress(KeyEvent.VK_CONTROL);
			//r.keyRelease(KeyEvent.VK_CONTROL);
			
			//r.keyPress(KeyEvent.VK_C);
			//r.keyRelease(KeyEvent.VK_C);
			
			
			
			//Ctrl+V
			
			//r.keyPress(KeyEvent.VK_CONTROL);
			//r.keyRelease(KeyEvent.VK_CONTROL);
			
			//r.keyPress(KeyEvent.VK_V);
			//r.keyRelease(KeyEvent.VK_V);
			
			
}}
