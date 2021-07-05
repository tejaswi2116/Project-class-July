package com.selday1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Debug {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HB\\eclipse-workspace\\SelDay1\\Drivers\\chromedriver.exe");
		
			//Launch the browser//
			
			WebDriver d = new ChromeDriver();
			
			//To Navigate FB url//
			
			d.get("https://www.facebook.com/");
			
			//To maximize the window//
			
			d.manage().window().maximize();
			
		     //eg:Attribute Name//
			                           
			WebElement userNameTxtBox = d.findElement(By.xpath("//input[@name='email']"));
			userNameTxtBox.sendKeys("tejaswi.papu@gmail.com");
			
			String attribute = userNameTxtBox.getAttribute("name");
			System.out.println("userName value is " + attribute);
			
			//eg:Attribute Value//
			WebElement passwordTxtBox = d.findElement(By.xpath("//input[@name='pass']"));
			passwordTxtBox.sendKeys("Papu@1621");
			
			String attribute2 = passwordTxtBox.getAttribute("value");
		   System.out.println("Password value is " + attribute2);
		   
		   //Forgotten password using text() or contains text//
		   
		   WebElement f = d.findElement(By.xpath("//a[contains(text(),'Forgotten ')]"));
			String t= f.getText();
			System.out.println(t);
			
		//To click login button//
			
			WebElement btnlogin = d.findElement(By.name("login"));
			btnlogin.click();
			
			Thread.sleep(3000);
			
   String currentUrl = d.getCurrentUrl();
   
   System.out.println(currentUrl);
   
  if(currentUrl.contains("login")){
  System.out.println("navigated to login failure page");
   
			}
	else
	{
		
	}System.out.println("Not navigated to login failure page");
		
			}
}


