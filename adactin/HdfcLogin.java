package com.adactin;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HdfcLogin {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:/Users/Hvuser/Downloads/Selenium/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.hdfcbank.com/");
		driver.findElement(By.xpath("//img[@alt='HDFC Bank logo']")).click();
		driver.findElement(By.id("loginsubmit")).click();
		System.out.println("Current window handle: " + driver.getWindowHandle());
		System.out.println("*** Set of Window Handles ***");
		for(String handle:driver.getWindowHandles()){
			System.out.println(handle);
			driver.switchTo().window(handle);
		}
		new WebDriverWait(driver,5).until(ExpectedConditions.elementToBeClickable(By.xpath("(//a[text()='Continue to NetBanking'])[2]")));
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//a[text()='Continue to NetBanking'])[2]")).click();
		driver.switchTo().frame("login_page");
		driver.findElement(By.className("input_password")).sendKeys("48474847");
	}
}
