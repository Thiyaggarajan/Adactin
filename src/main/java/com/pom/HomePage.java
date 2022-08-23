package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	public static WebDriver driver;//null
	
	@FindBy(id="username")
	private WebElement username;
	


	@FindBy(id="password")
	private WebElement password;
	
	@FindBy(id="login")
	private WebElement clicklogin;
	//create a constructor for webdriver
	public HomePage(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getUsername() {
		return username;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getClicklogin() {
		return clicklogin;
	}	

}
