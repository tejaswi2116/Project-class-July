package com.selday1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelctGetOption {
	
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HB\\eclipse-workspace\\SelDay1\\Drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.seleniumeasy.com/test/basic-select-dropdown-demo.html");
		
		driver.manage().window().maximize();
		
		
	WebElement ddCountry= driver.findElement(By.id("multi-select"));
		
		Select s = new Select(ddCountry);
		
	  //getoptions(Select All) in Single  selector//

		//List<WebElement> options = s.getOptions();
				
				//for(int i =0; i < options.size(); i++) {
					
				//	WebElement element = options.get(i);
					
					//String text = element.getAttribute("value");
					
				//	s.selectByValue(text);
		
		
		
		   //  Deselect All//
		
		  boolean b = s.isMultiple();
		  System.out.println(b);
		

			 s.selectByIndex(7);
			 
			s.selectByValue("Pennsylvania");
			
			s.selectByVisibleText("New Jersey");
			

			//Thread.sleep(3000);
			
			//s.deselectAll();
			
		//Get first selected option//
		// WebElement option = s.getFirstSelectedOption();
		 
		//String text1 = option.getText();
		
		//System.out.println(text1);
		
		//Get All selected option//
		//List<WebElement> selectedOptions = s.getAllSelectedOptions();
		
		//for(WebElement option : selectedOptions) {
		 
		//String text2 = option.getText();
		
		//System.out.println(text2);
		
		//Get Selected option---> Doubt as printing all options //
		
		List<WebElement> selectedOption = s.getOptions();
		for(WebElement option : selectedOption) {
				String text3 = option.getText();
				
				System.out.println(text3);
				
		
		}
		 
		
		 
	}}


