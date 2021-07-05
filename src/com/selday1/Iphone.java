package com.selday1;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Iphone {
	
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
			
			Robot r1 = new Robot();
			//Click //
			
			WebElement btntitle = driver.findElement(By.xpath("//input[@title='Search']"));
			btntitle.sendKeys("amazon.in");
			
			
			r1.keyPress(KeyEvent.VK_ENTER);
			r1.keyRelease(KeyEvent.VK_ENTER);
			
			WebElement btnlink = driver.findElement(By.xpath("//h3[text()='Amazon.in']"));
			c.moveToElement(btnlink).perform();
			btnlink.click();
			
			WebElement btnSearchbx = driver.findElement(By.id("twotabsearchtextbox"));
			btnSearchbx.sendKeys("iphone", Keys.ENTER);//used Ennum
			
			
			WebElement lnkIphone = driver.findElement(By.xpath("(//span[text()='New Apple iPhone 11 (128GB) - Purple'])[1]"));
			lnkIphone.click();
			
			//to get parent window id//return type is -->String
			
			String parWindowId = driver.getWindowHandle();
			System.out.println(parWindowId);
			
			//to get all window id or child window id//return type is set<String>//Set won't accept duplicates//
			
			Set<String> allWindowsId = driver.getWindowHandles();
			System.out.println(allWindowsId);
			
			//To add all values in list
		    List<String> li  = new LinkedList<>();
		
		      li.addAll(allWindowsId);
		
		//To switch window// As list index value---> parentwindow(0),childwindow(1)//
		
	      driver.switchTo().window(li.get(1));
			
	      WebElement btnAddToCart = driver.findElement(By.id("add-to-cart-button"));
	      btnAddToCart.click();
	      
 //To return back to parent window// driver.switchTo.Defaultcontent()--->not works so use same list method --->//
	      
	     
	 driver.switchTo().window(li.get(0));
	      
	      
	      
}
}
