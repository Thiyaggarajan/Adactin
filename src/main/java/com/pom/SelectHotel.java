package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectHotel {
     public static WebDriver driver;
     
   

	@FindBy(xpath="//input[@type='radio']")
     private  WebElement selectHotel;
     
     @FindBy(id="continue")
     private WebElement continues;
     
     public SelectHotel(WebDriver driver4) {
		this.driver=driver4;
		PageFactory.initElements(driver, this);
	}
     
     
     public WebElement getSelectHotel() {
 		return selectHotel;
 	}

 	public WebElement getContinues() {
 		return continues;
 	}  
     
     
     
     
     
     
}
