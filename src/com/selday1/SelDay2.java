package com.selday1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


	public class SelDay2 {

public static void main(String[] args) {
		
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\HB\\eclipse-workspace\\SelDay1\\Drivers\\chromedriver.exe");
	
		//Launch the browser//
		
		WebDriver d = new ChromeDriver();
		
		//To Navigate FB url//
		
		d.get("https://www.facebook.com/");
		
		//To maximize the window//
		
		d.manage().window().maximize();
		
		/*//To get FB title//
		
		String title = d.getTitle();
		
		System.out.println(title);
		
		//To get current url//
		
		String CurrentUrl = d.getCurrentUrl();
		
		System.out.println(CurrentUrl);//xpath using attribute Name, use , not = and copy this path and paste in selector path have to get 1 of 1 if 1 of 2 
		//thn error give index of correct path//

		WebElement userNameTxtBox = d.findElement(By.xpath("//input[contains(@aria-label,'Email')]"));
		userNameTxtBox.sendKeys("tejaswi.papu@gmail.com");
		
		WebElement passwordTxtBox = d.findElement(By.xpath("//input[contains(@placeholder,'Password')]"));
		
		passwordTxtBox.sendKeys("Papu@1621");
		
		WebElement btnlogin = d.findElement(By.id("loginbutton"));
		btnlogin.click();*/
	

		
		//To find the locators for username textbox Webelement//
		        d.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
		        WebElement userNameTxtBox= d.findElement(By.xpath("//input[@name='firstname']"));
		        userNameTxtBox.sendKeys("Teju");
}			
}

