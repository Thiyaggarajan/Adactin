package com.data;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.reader.Configuration_Helper;

public class Write {
	 
	public static void write() throws IOException {
		String writepath = Configuration_Helper.getInstance().getInstanceCR().getpath();
		File f = new File(writepath);//path
		FileInputStream fi = new FileInputStream(f);//for read a file
		
		Workbook w = new XSSFWorkbook(fi);//open a work book
		
		w.createSheet("Tr").createRow(0).createCell(0).setCellValue("name");
		w.getSheet("Tr").getRow(0).createCell(1).setCellValue("phone");
		
		FileOutputStream fo = new FileOutputStream(f);
		w.write(fo);// which operation done in a sheet (read or write)
		w.close();// close a wookbook
		System.out.println("jhhvjv");
		}
	
	
	public static void main(String[] args) throws IOException {
		write();
	}
	

}
