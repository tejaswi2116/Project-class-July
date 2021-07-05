package com.selday1;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Click {
	
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

			//WebElement btnGmail = driver.findElement(By.xpath("//a[text()= 'Images']"));
			
			//To right click button gmail//
			
		    //c.contextClick(btnGmail).perform(); 
			
		    
			//To Double click button(select the word) in gmail//
            WebElement txtSearch = driver.findElement(By.xpath("//input[@title = 'Search']"));
			
		    txtSearch.sendKeys("hello");
		    
		   c.doubleClick(txtSearch).perform(); 
		    
		   //Used robot class to click hello//
		    Robot r1 = new Robot();
		    r1.keyPress(KeyEvent.VK_ENTER);
			r1.keyRelease(KeyEvent.VK_ENTER);
			
			

}


}