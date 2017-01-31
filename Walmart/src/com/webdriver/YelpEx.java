package com.webdriver;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class YelpEx {
	@Test 
	public static void findMaxRevRestaurant()
	{
	 System.setProperty("Webdriver.chrome.driver","chromedriver.exe");
	 WebDriver driver = new ChromeDriver();
	 driver.get("https://www.yelp.com/");
	driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	driver.findElement(By.cssSelector("#find_desc")).sendKeys("Restaurants");
	driver.findElement(By.cssSelector("#find_desc")).sendKeys(Keys.ENTER);
	 
	/* WebElement element = driver.findElement(By.cssSelector("#find_desc"));
	 Select sc = new Select(element);
	 sc.selectByValue("Restaurants");*/
	 WebElement near =driver.findElement(By.cssSelector("#dropperText_Mast"));
	 near.clear();
	 
	 driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	driver.findElement(By.cssSelector("#dropperText_Mast")).sendKeys("Dublin, CA");
	driver.findElement(By.cssSelector("#header-search-submit")).click();
	
	
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	driver.findElement(By.cssSelector("")).click();	
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    driver.findElement(By.xpath("//div[@class='filter-set sort-filters']/ul/li[3]"));
	 
	 
	
	}
	
	
	
	
}	

