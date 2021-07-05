package com.selday1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTble2 {

public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HB\\eclipse-workspace\\SelDay1\\Drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		
		driver.manage().window().maximize();
		
		//To find the element for particular table//
		
		WebElement table = driver.findElement(By.id("customers"));
		
		//To get rows from the table//
		
		List<WebElement> tRows = table.findElements(By.tagName("tr"));
		
		//for(int i=0; i < tRows.size(); i++) {
			//iterate each method//
			for(WebElement tRow : tRows){
			//WebElement tRow = tRows.get(i);
			//String text = tRow.getText();
			//To get row information//
			//System.out.println(text);
			
			
			
			//To get the table header data//
			List<WebElement> theaders = tRow.findElements(By.tagName("th"));		
			
			//for(int k = 0; k < theaders.size(); k++) {
				
				//WebElement th = theaders.get(k);
			
			//2nd method iterate enhanced/each method//
			   for(WebElement th : theaders) {
				String header = th.getText();
				
				//To get the  header inf//
				System.out.println(header);
}
}}}