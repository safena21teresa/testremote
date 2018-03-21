package com.first;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Firsttest {
	
	public static WebDriver driver;
	public static String URL = "https://www.amazon.in/";
	
	@BeforeTest
	public static void brwser_set()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Selenium files\\chromedriver_win32 (1)\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	
	@BeforeClass
	public static void brwsr_open()
	{
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.navigate().to(URL);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
	}
	
	@Test
	public static void verifyingpage()
	{
		System.out.println("Current URL of the web page is "+driver.getCurrentUrl());
		//System.out.println("Page source of the web page is "+driver.getPageSource());
		System.out.println("Title of the web page is "+driver.getTitle());
		System.out.println("Class name is "+driver.getClass());
	}
	
	@AfterClass
	public static void close_brwsr()
	{
		driver.close();
	}
}
