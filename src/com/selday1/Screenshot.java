package com.selday1;

import java.awt.AWTException;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot {
	
public static void main(String[] args) throws AWTException, Exception {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HB\\eclipse-workspace\\SelDay1\\Drivers\\chromedriver.exe");
		
			//Launch the browser//
			
		WebDriver driver = new ChromeDriver();
		
			
			//To Navigate FB url//
			
			driver.get("https://www.facebook.com/");
			
			//To maximize the window//
			
			driver.manage().window().maximize();
		//Typecast//
			
		TakesScreenshot ts = (TakesScreenshot)driver;
		
		File src = ts.getScreenshotAs(OutputType.FILE);
		
		System.out.println(src);
		
		File dest =  new File("C:\\Users\\HB\\eclipse-workspace\\SelDay1\\Screenshots\\"+"\\fb.png");
		
		FileUtils.copyFile(src, dest);

}
}