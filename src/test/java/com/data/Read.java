package com.data;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.reader.Configuration_Helper;

public class Read {
	
	public static void particularDate(int row ,int cell) throws IOException {
		//String readpath = Configuration_Helper.getInstance().getInstanceCR().getpath();
		File f = new File("C:\\Users\\LENOVO\\eclipse-workspace\\AdactinHotel\\datadriven\\Book 1.xlsx");
	//	File f = new File(readpath);
		FileInputStream fis = new FileInputStream(f);
		Workbook w = new XSSFWorkbook(fis);// class casting
		
		Sheet s = w.getSheet("Sheet1");
		Row r = s.getRow(row);
		
		Cell c = r.getCell(cell);
		CellType ct = c.getCellType();
		
		if (ct.equals(CellType.STRING)) {
			
			String sv = c.getStringCellValue();
			System.out.println(sv);
			
		} else {
			
			double sn = c.getNumericCellValue();
            int i = (int) sn;  // narrow casting//type casting
            System.out.println(i);
           
            
		}
		}
	
	public static void allData() throws IOException {
		

		File f = new File("C:\\Users\\LENOVO\\eclipse-workspace\\AdactinHotel\\datadriven\\Book 1.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook w = new XSSFWorkbook(fis);// class casting
		
		Sheet s = w.getSheet("Sheet1");
		
		//active row
		int nr = s.getPhysicalNumberOfRows();
		//System.out.println("no.of.rows"+ nr);
		for (int i = 0; i < nr; i++) {
			Row row = s.getRow(i);
			
			int nc = row.getPhysicalNumberOfCells();
			//System.out.println("no of cells"+nc);
			
			for (int j = 0; j <nc; j++) {
				
				Cell cell = row.getCell(j);
				
				CellType ct = cell.getCellType();
				if (ct.equals(CellType.STRING)) {
					
					String sv = cell.getStringCellValue();
					System.out.println(sv);
					
				} else {
					
					double sn = cell.getNumericCellValue();
		            int in = (int) sn;  // narrow casting//type casting
		            System.out.println(in);
		           
		            
				}
				System.out.print(" | ");
				
			}
			System.out.println("");
		}
		

	}
	
	public static void main(String[] args) throws IOException {
		particularDate(3,0);
		
		
		
		particularDate(3,1);
	//allData();	
		
	}
	
	
	
	

}
