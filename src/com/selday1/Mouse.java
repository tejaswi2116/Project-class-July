package com.selday1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HB\\eclipse-workspace\\SelDay1\\Drivers\\chromedriver.exe");
		
			//Launch the browser//
			
			WebDriver driver = new ChromeDriver();
			
			//To Navigate FB url//
			
			driver.get("http://greenstech.in/selenium-course-content.html");
			
			//To maximize the window//
			
			driver.manage().window().maximize();
			
			//To Create Obj for  Action Class//(webdriver ref driver or d)
			
			Actions c = new Actions(driver);
			
			//To mouse hover to course WebElement//
			
			
			WebElement btnCourses = driver.findElement(By.xpath("//div[@title ='Courses']"));
			c.moveToElement(btnCourses).perform();
			
			
			//To mouse hover to Java WebElement//
			
			WebElement btnJava = driver.findElement((By.xpath("//div[@title ='Java']")));
			
			c.moveToElement(btnJava).perform();
			
		
			//To click J2EE certification link//
			//using text() method in xpath//
			
			WebElement btnJ2EE = driver.findElement(By.xpath("//span[text()='J2EE Certification Training']"));
			btnJ2EE.click();
}
	}
