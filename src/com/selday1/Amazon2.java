package com.selday1;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Amazon2 {
	
public static void main(String[] args) throws AWTException, InterruptedException {
		
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
			
            
			
			WebElement btnFashion = driver.findElement(By.xpath("//a[@data-csa-c-slot-id='nav_cs_2']"));
			btnFashion.click();
			
			
				
				WebElement btnsale = driver.findElement(By.xpath("(//span[@class='nav-a-content'])[7]"));
				btnsale.click();
				
              WebElement btnDress = driver.findElement(By.xpath("(//img[@alt='Shop now'])[3]"));
              c.moveToElement(btnDress).perform();
              btnDress.click();
            
               WebElement btnKurta = driver.findElement(By.xpath("(//img[@class='s-image'])[2]"));
               c.moveToElement(btnKurta).perform();
               btnKurta.click();
               
              String parWindowId1 = driver.getWindowHandle();
   			System.out.println(parWindowId1);
   			
   			//to get all window id//
   			
   			Set<String> allWindowsId = driver.getWindowHandles();
   			System.out.println(allWindowsId);
   			
   			  //To add all values in list
   		      List<String> li  = new LinkedList<>();
   		
   		      li.addAll(allWindowsId);
   		      
   		      //to control child window//
               
   		     driver.switchTo().window(li.get(1));
   		   
               
               
               WebElement btnSize = driver.findElement(By.xpath("//select[@name='dropdown_selected_size_name']"));
             
               Select s = new Select(btnSize);
               s.selectByVisibleText("M");
               
               Thread.sleep(2000);
               
           
                WebElement btnCart = driver.findElement(By.xpath("//input[@name='submit.add-to-cart']"));
               btnCart.click();
     			
               // WebElement btnbuy = driver.findElement(By.id("buy-now-button"));
               //btnbuy.click();
               
               //To add to wishlist//
              // WebElement btnWish = driver.findElement(By.xpath("//a[@title='Add to Wish List']"));
               //btnWish.click();
     			
			}
                                                                                                                 
	 
}
