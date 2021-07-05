package com.selday1;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class SelDay1 {
	
public static void main(String[] args)  {
	

System.setProperty("webdriver.chrome.driver", "C:\\Users\\HB\\eclipse-workspace\\SelDay1\\Drivers\\chromedriver.exe");

WebDriver driver=new ChromeDriver();

driver.manage().window().maximize();


driver.get("https://demoqa.com/automation-practice-form");

WebElement element =driver.findElement(By.id("hobbies-checkbox-1"));

JavascriptExecutor executor = (JavascriptExecutor)driver;

executor.executeScript("arguments[0].click();", element);


WebElement element1 =driver.findElement(By.id("hobbies-checkbox-2"));

executor.executeScript("arguments[0].click();", element1);


WebElement element2 =driver.findElement(By.id("hobbies-checkbox-3"));

executor.executeScript("arguments[0].click();", element2);




}
	
}

	
	
	
	
	
	
	//*System.setProperty("webdriver.edge.driver", "C:\\Users\\HB\\eclipse-workspace\\SelDay1\\Drivers\\msedgedriver.exe");
	/*WebDriver d = new EdgeDriver();
	d.get("https://www.google.co.in/");
	boolean logo = d.findElement(By.xpath("//img[@alt='Google']")).isDisplayed();
			if (logo == true) {
			System.out.println("logo is available");
			} else {
			System.out.println("logo is not available");*/
			
		




