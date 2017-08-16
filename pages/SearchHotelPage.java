package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchHotelPage {
	@FindBy(id="username_show")
	WebElement welcomeMessage;
	
	public SearchHotelPage(){
		PageFactory.initElements(Base.driver, this);
	}
	
	public String getWelcomeMessage(){
		return welcomeMessage.getAttribute("value");
	}
}
