package com.selday1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTble {
	
public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HB\\eclipse-workspace\\SelDay1\\Drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		
		driver.manage().window().maximize();
		
		//To find the element for particular table//
		
		WebElement table = driver.findElement(By.id("customers"));
		
		//To get rows from the table//
		
		List<WebElement> tRows  = table.findElements(By.tagName("tr"));
		
		for(int i=0; i < tRows.size(); i++) {
			
			WebElement tRow = tRows.get(i);
			//String text = tRow.getText();
			//To get row information//
			//System.out.println(text);
			
			
			
			//To get the table data//
			List<WebElement> tDatas = tRow.findElements(By.tagName("td"));		
			
			for(int k = 0; k < tDatas.size(); k++) {
				
				WebElement tData = tDatas.get(k);
				String data = tData.getText();
				
				//To get the table data only not header inf//
				System.out.println(data);
				
				//To fetch Austria row and coloumn both starts with 1..So i+1 and K+1)//
				if(data.equals("Austria")) {
					
					System.out.println(data);
					System.out.println(i + 1);
					System.out.println(k + 1);
					
				}
				
			}
			
			
		}
}}
