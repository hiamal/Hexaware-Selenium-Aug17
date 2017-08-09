package com.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Base {
	static WebDriver driver;
	
	static void openBrowser(){
		System.setProperty("webdriver.gecko.driver", "C:/Users/Hvuser/Downloads/Selenium/geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	static void navigateToUrl(){
		driver.get("http://adactin.com/HotelApp/index.php");
	}
}
