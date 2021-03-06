package com.testng;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.adactin.AdactinLogin;

public class AdactinLoginTest {
	AdactinLogin adactinLogin;
	
  @BeforeClass
  public void openHotelAppTest() {
	  adactinLogin = new AdactinLogin();
	  adactinLogin.openHotelApp();
	  String expected = "AdactIn.com - Hotel Reservation System";
	  String actual = adactinLogin.driver.getTitle();
//	  Assert.assertEquals(expected, actual );
  }
  
  @BeforeMethod
  @Parameters({ "sUsername", "sPassword" })
  public void loginTest(String sUsername, String sPassword) {
	  adactinLogin.login(sUsername, sPassword);
  }
  
  @Test
  public void bookingTest() {
	  
  }
  
  @Test
  public void cancelTest() {
	  
  }
  
  @AfterMethod
  public void logOutTest(){
	  adactinLogin.logout();
  }
  
  @AfterClass
  public void closeWindowTest(){
	  adactinLogin.driver.quit();
  }
}
