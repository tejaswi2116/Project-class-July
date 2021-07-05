package com.selday1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Amazon {
	
public static void main(String[] args)  {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HB\\eclipse-workspace\\SelDay1\\Drivers\\chromedriver.exe");
		
			//Launch the browser//
			
		WebDriver driver = new ChromeDriver();
		
			
			//To Navigate FB url//
			
			driver.get("https://www.amazon.in/");
			
			//To maximize the window//
			
			driver.manage().window().maximize();
			
			//To Create Obj for  Action Class//
			
			
			
			//To click  link//
			//using text() method in xpath//
			
			WebElement btnPrime = driver.findElement(By.xpath("//span[text()='Prime']"));
			btnPrime.click();
			
			
		    WebElement btnbutton = driver.findElement(By.xpath("//a[@name='submit']"));
			btnbutton.click();	
			
			WebElement userNameTxtBox = driver.findElement(By.xpath("//input[@type='email']"));
			userNameTxtBox.sendKeys("tejaswi.papu@gmail.com");
			
			WebElement btnCont = driver.findElement(By.id("continue"));
			btnCont.click();

			WebElement passwordTxtBox = driver.findElement(By.xpath("//input[@type='password']"));
			passwordTxtBox.sendKeys("Papu@1621");
			
			WebElement btnSign = driver.findElement(By.id("signInSubmit"));
			String t1= btnSign.getText();
			System.out.println(t1); 
			btnSign.click();
			
			
			
			
}}
