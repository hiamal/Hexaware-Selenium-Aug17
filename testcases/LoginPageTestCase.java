package com.testcases;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.pages.LoginPage;

public class LoginPageTestCase {
	LoginPage loginPage;
	
	@BeforeClass
	public void initPage(){
		loginPage = new LoginPage();
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
  }
  
  @Test
  public void invalidLogin() {
  }
  
  @Test
  public void validLogin() {
  }
}
