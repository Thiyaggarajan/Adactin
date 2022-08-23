package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchHotel {
	public static WebDriver driver;
	
	@FindBy(xpath="/html/body/table[2]/tbody/tr/td[3]/table/tbody/tr/td/h4")
    private WebElement printText;
    
   
	@FindBy(id="location")
    private WebElement location;
    
    @FindBy(id="hotels")
    private WebElement hotel;
     
    @FindBy(id="room_type")
    private WebElement roomType;
    
   

	@FindBy(id="room_nos")
    private WebElement numbers;
    
    @FindBy(id="datepick_in")
    private WebElement inDate;
    
    @FindBy(name="datepick_out")
    private WebElement outDate;
    
    @FindBy(id="adult_room")
    private WebElement adult;
    
    @FindBy(id="child_room")
    private WebElement child;
    
    @FindBy(id="Submit")
    private WebElement Submit;
    
    public SearchHotel(WebDriver driver3) {
    	this.driver = driver3;
    	PageFactory.initElements(driver, this);
		
	}

	public WebElement getPrintText() {
		return printText;
	}

	public WebElement getLocation() {
		return location;
	}

	public WebElement getHotel() {
		return hotel;
	}

	public WebElement getRoomType() {
		return roomType;
	}
	
	 public WebElement getNumbers() {
			return numbers;
		}

	public WebElement getInDate() {
		return inDate;
	}

	public WebElement getOutDate() {
		return outDate;
	}

	public WebElement getAdult() {
		return adult;
	}

	public WebElement getChild() {
		return child;
	}

	public WebElement getSubmit() {
		return Submit;
	}

    
    
}
