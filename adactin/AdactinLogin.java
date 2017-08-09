package com.adactin;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AdactinLogin {
	public WebDriver driver;
	static String Ord;
	
	public void openHotelApp(){
		System.setProperty("webdriver.gecko.driver", "C:/Users/Hvuser/Downloads/Selenium/geckodriver.exe");
		driver = new FirefoxDriver();
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	public void login(String username, String password){
		driver.get("http://adactin.com/HotelApp/index.php");
		driver.findElement(By.id("username")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.id("login")).click();
	}
	
	public void booking(){
		new Select(driver.findElement(By.id("location"))).selectByVisibleText("London");
		new Select(driver.findElement(By.id("hotels"))).selectByVisibleText("Hotel Creek");
		new Select(driver.findElement(By.id("room_type"))).selectByVisibleText("Standard");
		new Select(driver.findElement(By.id("room_nos"))).selectByVisibleText("4 - Four");
		driver.findElement(By.id("datepick_in")).clear();
		driver.findElement(By.id("datepick_in")).sendKeys("03/08/2017");
		driver.findElement(By.id("datepick_out")).clear();
		driver.findElement(By.id("datepick_out")).sendKeys("04/08/2017");
		new Select(driver.findElement(By.id("adult_room"))).selectByVisibleText("1 - One");
		new Select(driver.findElement(By.id("child_room"))).selectByVisibleText("2 - Two");
		driver.findElement(By.id("Submit")).click();
		
		driver.findElement(By.id("radiobutton_0")).click();
		driver.findElement(By.id("continue")).click();
		
		driver.findElement(By.id("first_name")).sendKeys("Aravind");
		driver.findElement(By.id("last_name")).sendKeys("Murthy");
		driver.findElement(By.id("address")).sendKeys("address");
		driver.findElement(By.id("cc_num")).sendKeys("1234567812345678");
		new Select(driver.findElement(By.id("cc_type"))).selectByVisibleText("VISA");
		new Select(driver.findElement(By.id("cc_exp_month"))).selectByVisibleText("February");
		new Select(driver.findElement(By.id("cc_exp_year"))).selectByVisibleText("2020");
		driver.findElement(By.id("cc_cvv")).sendKeys("123");
		driver.findElement(By.id("book_now")).click();
		WebDriverWait wait = new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("order_no")));
		Ord = driver.findElement(By.id("order_no")).getAttribute("value");
		driver.findElement(By.id("my_itinerary")).click();
	}

	public void cancel(){
		driver.findElement(By.id("order_id_text")).sendKeys(Ord);
		driver.findElement(By.id("search_hotel_id")).click();
		driver.findElement(By.id("check_all")).click();
		driver.findElement(By.name("cancelall")).click();
		Alert alert = driver.switchTo().alert();
		alert.accept();
	}
	
	public void logout(){
		driver.findElement(By.linkText("Logout")).click();
	}

//	public static void main(String[] args) {
//		openHotelApp();
//		login("hiamal007", "test");
//		booking();
//		cancel();
//		logout();
//	}

}
