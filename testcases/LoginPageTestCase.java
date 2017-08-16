package com.testcases;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.pages.LoginPage;
import com.pages.SearchHotelPage;

public class LoginPageTestCase {
	LoginPage loginPage;
	SearchHotelPage searchHotelPage;
	
	@BeforeClass
	public void initPage(){
		loginPage = new LoginPage();
		searchHotelPage = new SearchHotelPage();
	}
	
  @Test
  public void emptyUsername() {
	  loginPage.setTxtUsername("");
	  loginPage.setTxtPassword("test");
	  loginPage.setBtnLogin();
	  Assert.assertEquals("Enter Username", loginPage.getEmptyUsernameError());
  }
  
  @Test
  public void emptyPassword() {
//	  loginPage.setTxtUsername("test");
//	  loginPage.setTxtPassword("");
//	  loginPage.setBtnLogin();
//	  Assert.assertEquals("Enter Username", loginPage.getEmptyUsernameError());
  }
  
  @Test
  public void invalidLogin() {
//	  loginPage.setTxtUsername("test");
//	  loginPage.setTxtPassword("test");
//	  loginPage.setBtnLogin();
//	  Assert.assertEquals("Enter Username", loginPage.getEmptyUsernameError());
  }
  
  @Test
  public void validLogin() {
	  loginPage.setTxtUsername("hiamal007");
	  loginPage.setTxtPassword("test");
	  loginPage.setBtnLogin();
	  Assert.assertEquals("Hello hiamal007!", searchHotelPage.getWelcomeMessage());
  }
}
