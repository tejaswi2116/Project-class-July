package com.selday1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExe {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HB\\eclipse-workspace\\SelDay1\\Drivers\\chromedriver.exe");
		
			//Launch the browser//
			
			WebDriver driver = new ChromeDriver();
			
			//To Navigate FB url//
			
			driver.get("https://www.facebook.com/");
			
			//To maximize the window//
			
			
			driver.manage().window().maximize();
			
			WebElement textUser = driver.findElement(By.id("email"));
			
			//Type Casting//
			
			JavascriptExecutor jk = (JavascriptExecutor)driver;
			
			//Insert value in Javescriptexe//
			
			jk.executeScript("arguments[0].setAttribute('value', 'tejawi.papu@gmail.com')",textUser);
			
			WebElement txtPass = driver.findElement(By.id("pass"));
			jk.executeScript("arguments[0].setAttribute('value', '12374')",txtPass);
			
			WebElement btnlogin = driver.findElement(By.name("login"));
			jk.executeScript("arguments[0].click()",btnlogin);
			
			 //Get Attribute method for text user//
			
			//GetAttribute method return type is object//
			
			//It prints information of value//
			
			Object obj = jk.executeScript("return arguments[0].getAttribute('value')", textUser);
			String txt =(String)obj;//obj to string convert to fetch o/p//
			System.out.println(txt);
			
			
			//given attribute name and attribute value is printed//
			
			Object obj1 = jk.executeScript("return arguments[0].getAttribute('data-testid')", textUser);
			String txt1 =(String)obj1;
			System.out.println(txt1);
			
}}
