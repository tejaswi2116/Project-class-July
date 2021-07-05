package com.selday1;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practise {
	

public static void main(String[] args) throws InterruptedException  {
		
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\HB\\eclipse-workspace\\SelDay1\\Drivers\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://adactin.com/HotelApp/index.php");
	driver.manage().window().maximize();
	
	WebElement x = driver.findElement(By.xpath("//a[text()='New User Register Here']"));
	String x1 = x.getCssValue("font-size");
	System.out.println(x1);
	String x2 = x.getCssValue("color");
	System.out.println(x2);
	String x3 = x.getCssValue("font-weight");
	System.out.println(x3);
	String x4 = x.getCssValue("font-family");
	System.out.println(x4);
	String x5 = x.getCssValue("background");
	System.out.println(x5);
	
	//To get the size of an element; height & width
	Dimension s = x.getSize();
	int h = s.getHeight();
	int w = s.getWidth();
	System.out.println("Height: "+h);
	System.out.println("Width: "+w);
	
	//To get location of an element: x-axis & y-axis
	Point l = x.getLocation();
	int x6 = l.getX();
	int y = l.getY();
	System.out.println("x-axis: "+x6);
	System.out.println("y-axis: "+y);
	Thread.sleep(1000);

}}
