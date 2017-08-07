package com.adactin;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Citibank {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:/Users/Hvuser/Downloads/Selenium/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.citibank.co.in");
		new WebDriverWait(driver,10).until(ExpectedConditions.elementToBeClickable(By.xpath("//img[@alt='LOGIN NOW']")));
		driver.findElement(By.xpath("//img[@alt='LOGIN NOW']")).click();
//		new WebDriverWait(driver,10).until(ExpectedConditions.elementToBeClickable(By.className("txtSign")));
//		driver.findElement(By.className("txtSign")).click();
	}

}
