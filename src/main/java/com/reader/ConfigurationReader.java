package com.reader;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader {
	
	    Properties p;// create a constructor for read a path
	public ConfigurationReader() throws IOException {
		
		File f = new File("C:\\Users\\LENOVO\\eclipse-workspace\\AdactinHotel\\src\\main\\java\\com\\properties\\adatactin.properties");
		FileInputStream fil = new FileInputStream(f);//fileNotFound exception throws
		 p = new Properties();
		p.load(fil);//Io exception 
		
	}
	
	public String getbrowser() {
		   String browser = p.getProperty("browser");
           return browser;
	}
	public String geturl() {
		String url = p.getProperty("url");
        return url;
	}
	
	public String getpath() {
		String path = p.getProperty("writepath");
		return path;

	}
	public String getFirstName() {
		String FirstName = p.getProperty("Firstname");
		return FirstName;

	}
	
	public String getLsatName() {
		String LastName = p.getProperty("Lastname");
		return LastName;

	}
	public String getAddress() {
		String Address = p.getProperty("Adderss");
		return Address;

	}
	public String getCCnum() {
		String CCnum = p.getProperty("CCnum");
		return CCnum;

	}
	public String getCvv() {
		String Cvv = p.getProperty("Cvv");
		return Cvv;

	}
	
	
	
	

}
