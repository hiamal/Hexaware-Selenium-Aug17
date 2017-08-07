package com.adactin;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PayTm {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:/Users/Hvuser/Downloads/Selenium/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://paytm.com/");
		driver.findElement(By.xpath("//div[text()='Log In/Sign Up']")).click();
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@src='/v1/api/login?isIframe=true&theme=mp-web']")));
		driver.findElement(By.name("username")).sendKeys("hiamal");
		//driver.quit();
	}

}
