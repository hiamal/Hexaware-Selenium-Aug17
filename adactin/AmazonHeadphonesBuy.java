package com.adactin;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class AmazonHeadphonesBuy {
  @Test
  public void amazonHeadphones() {
	  
	  System.setProperty("webdriver.chrome.driver", "C:/Users/Hvuser/Downloads/Selenium/chromedriver.exe");
	  WebDriver driver = new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  driver.get("https://www.amazon.in");
	  Actions actions = new Actions(driver);
	  actions
	  	.moveToElement(driver.findElement(By.xpath("//span[text()='Category']")))
	  	.moveToElement(driver.findElement(By.xpath("//span[text()='TV, Appliances, Electronics']")))
	  	.perform();
	  
  }
}
