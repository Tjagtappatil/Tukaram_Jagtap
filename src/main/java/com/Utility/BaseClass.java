package com.Utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	public static WebDriver driver;
	@BeforeMethod
	public void Baseclass()
	{
		WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();
		driver.get("https://www.saucedemo.com/ ");
		driver.manage().window().maximize();
	}
	
	@AfterMethod
	public void TearDown()
	{
		driver.close();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
