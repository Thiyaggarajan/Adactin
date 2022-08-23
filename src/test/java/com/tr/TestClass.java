package com.tr;

import java.io.File;
import java.util.concurrent.TimeUnit;

import javax.tools.ForwardingJavaFileManager;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.pom.BookHotel;
import com.pom.HomePage;
import com.pom.PageObjectManager;
import com.pom.SearchHotel;
import com.pom.SelectHotel;
import com.reader.Configuration_Helper;

import baseclass.BaseClass;

public class TestClass extends BaseClass{
public static WebDriver driver = null;
	public static void main(String[] args) throws Throwable {
        
		String browser = Configuration_Helper.getInstance().getInstanceCR().getbrowser();
		driver=browserLaunch(browser);
		//driver=browserLaunch("chrome");
		PageObjectManager p = new PageObjectManager(driver);
		String url = Configuration_Helper.getInstance().getInstanceCR().geturl();
		geturl(url);
		//geturl("https://adactinhotelapp.com/index.php");
		
		implicity(); 
		// create a object for homepage class 
//		HomePage hp = new HomePage(driver);
		
		
        userInput(p.getHomePage().getUsername(),particulardata("C:\\Users\\LENOVO\\eclipse-workspace\\AdactinHotel\\datadriven\\Book 1.xlsx", 0, 3, 0));
	
        userInput(p.getHomePage().getPassword(),"thiyagarajan");
	
        clickonElement(p.getHomePage().getClicklogin());
        //create a object for SearchHotel Class
//        SearchHotel sh = new SearchHotel(driver);
        
        
        printText(p.getSearchHotel().getPrintText());
        
        location(p.getSearchHotel().getLocation());

       
		hotelName(p.getSearchHotel().getHotel());
        
		
		roomType(p.getSearchHotel().getRoomType());
		
		
		numberOfRoom(p.getSearchHotel().getNumbers());
		
		
		clickonElement(p.getSearchHotel().getInDate());
		clearOnElement(p.getSearchHotel().getInDate());
		Thread.sleep(3000);
		userInput(p.getSearchHotel().getInDate(), "10/02/2022");
		
		
		clickonElement(p.getSearchHotel().getOutDate());
		clearOnElement(p.getSearchHotel().getOutDate());
		Thread.sleep(3000);
		userInput(p.getSearchHotel().getOutDate(), "11/02/2022");
	
		numberOfAdult(p.getSearchHotel().getAdult());
		
		numberOfChildren(p.getSearchHotel().getChild());
		
		clickonElement(p.getSearchHotel().getSubmit());
		
		 Thread.sleep(5000);
		 //create object for SelectHotel class
		 
//		 SelectHotel seh = new SelectHotel(driver);
		 
		 
		
		clickonElement(p.getSelectHotel().getSelectHotel());
		
		clickonElement(p.getSelectHotel().getContinues());
		
		implicity();
		
		//create a object for BookHotel 
//		BookHotel bh = new BookHotel(driver);
		
		String FirstName = Configuration_Helper.getInstance().getInstanceCR().getFirstName();
		userInput(p.getBookHotel().getFirst_Name(),FirstName);
		
		String LastName = Configuration_Helper.getInstance().getInstanceCR().getLsatName();
		userInput(p.getBookHotel().getLast_Name(),LastName);
		
		String Address = Configuration_Helper.getInstance().getInstanceCR().getAddress();
		userInput(p.getBookHotel().getAddress(),Address);
		
		String CCnum = Configuration_Helper.getInstance().getInstanceCR().getCCnum();
		userInput(p.getBookHotel().getCc_num(),CCnum);
		
		
		ccType(p.getBookHotel().getCc_type());
		
		expMonth(p.getBookHotel().getExpMonth());
		
		expYear(p.getBookHotel().getExpYear());
		
		String Cvv = Configuration_Helper.getInstance().getInstanceCR().getCvv();
		userInput(p.getBookHotel().getCvv(),Cvv);
		Thread.sleep(3000);
		
		
		screenShot();
		quit();
        
}
}