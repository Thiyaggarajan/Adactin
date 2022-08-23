package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class PageObjectManager {
	
	public WebDriver driver;
	
	private HomePage h;
	private SearchHotel sh;
	private SelectHotel seh;
	private BookHotel bh ;
	
	public PageObjectManager(WebDriver driver2) {
		
		this.driver= driver2;
		PageFactory.initElements(driver, this);
		
	}
	public HomePage getHomePage() {
		
		 h = new HomePage(driver);
		return h;
}
	public SearchHotel getSearchHotel() {
		 sh = new SearchHotel(driver);
        return sh;
	}
	
	public SelectHotel getSelectHotel() {
		 seh = new SelectHotel(driver);
         return seh;
	}
	
	public BookHotel getBookHotel() {
		 bh = new BookHotel(driver);
        return bh;
	}
	
}
