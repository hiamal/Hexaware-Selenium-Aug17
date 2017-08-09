package com.unittests;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.pages.LoginPage;

public class LoginPageTest {
	LoginPage loginPage;
	@BeforeClass
	public void initPage(){
		loginPage = new LoginPage();
	}
	
  @Test
  public void txtUsernameTest() {
	  loginPage.setTxtUsername("hiamal007");
	  Assert.assertEquals("hiamal007", loginPage.getTxtUsername());
  }
  
  @Test
  public void txtPasswordTest() {
  }
}
