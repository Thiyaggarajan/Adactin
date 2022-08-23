package baseclass;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class BaseClass {
	
	public static WebDriver driver=null;
	public static void userInput(WebElement element,String value) {
		
		element.sendKeys(value);

	}
	public static void clickonElement (WebElement element) {
		element.click();

	}
	
	public static void printText(WebElement element) {
		String t = element.getText();
		System.out.println(t);
	}
	
	public static WebDriver browserLaunch(String browser) {
		
		if (browser.equalsIgnoreCase("chrome")) {
			
			System.setProperty("webdriver.chrome.driver","C:\\Users\\LENOVO\\eclipse-workspace\\AdactinHotel\\driver\\chromedriver.exe");
			 driver = new ChromeDriver();
			
		} else if (browser.equalsIgnoreCase("edge")) {
			
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\driver\\chromedriver.exe");
			 driver = new ChromeDriver();
			
		} else {
			
			System.out.println("invalid browser");

		} 
        driver.manage().window().maximize();
		return driver;
	}
	
	public static void geturl(String url) {
		
		driver.get(url);
		}
	public static void implicity() {
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

	}
	
	public static void location (WebElement detail ) {
		Select a = new Select(detail);
		a.selectByValue("Melbourne");
		
		
	}
	public static void hotelName (WebElement detail ) {
		Select a = new Select(detail);
		a.selectByValue("Hotel Sunshine");
		
		
	}
	public static void roomType (WebElement detail ) {
		Select a = new Select(detail);
		a.selectByValue("Super Deluxe");
		
		
	}
	
	public static void numberOfRoom (WebElement detail ) {
		Select a = new Select(detail);
		a.selectByValue("2");
		}
	
    public static void clearOnElement(WebElement element) {
		element.clear();

	}
    
    public static void numberOfAdult (WebElement detail ) {
		Select a = new Select(detail);
		a.selectByValue("2");
		}
    public static void numberOfChildren (WebElement detail ) {
		Select a = new Select(detail);
		a.selectByValue("0");
		}
    public static void ccType (WebElement detail ) {
		Select a = new Select(detail);
		a.selectByValue("AMEX");
		}
    public static void expMonth (WebElement detail ) {
		Select a = new Select(detail);
		a.selectByValue("2");
		}
    public static void expYear (WebElement detail ) {
		Select a = new Select(detail);
		a.selectByValue("2022");
		}
    
    public static void screenShot() throws Throwable {
    	 TakesScreenshot ts = (TakesScreenshot) driver;
		    File src = ts.getScreenshotAs(OutputType.FILE);
			File des = new File("C:\\Users\\LENOVO\\eclipse-workspace\\AdactinHotel\\screenshot\\adactin.png");
			FileUtils.copyFile(src, des);
}
    public static void close() {
	  driver.close();	

	}
    public static void quit() {
		driver.quit();

	}
    public static void navigate(String navigate) {
		if (navigate.equalsIgnoreCase("back")) {
			driver.navigate().back();
			
		} else if (navigate.equalsIgnoreCase("forward")) {
			driver.navigate().forward();
			
		} else if (navigate.equalsIgnoreCase("refersh")) {
			driver.navigate().refresh();
		} else  {
			
			System.out.println("invalid navigation");
			
		} 
		}
    
    public static void alert(String type) {
		
		if (type.equalsIgnoreCase("ok")) {
			
			Alert a = driver.switchTo().alert();
			a.accept();
		} else if (type.equalsIgnoreCase("dismiss")) {
			
			Alert a = driver.switchTo().alert();
			a.dismiss();
			
		}else {
			Alert a = driver.switchTo().alert();
			a.sendKeys("");
			a.accept();
			}
	     }
    
    static String value;
    public static String particulardata(String path,int sheet_index,int row_index,int cell_index) throws FileNotFoundException {
    	
    	File f = new File(path);
    	
    	FileInputStream fis = new FileInputStream(f);
    	
    	Workbook w = new XSSFWorkbook();
    	
    	Sheet s = w.getSheetAt(sheet_index);
    	
    	Row r = s.getRow(row_index);
    	
    	Cell c = r.getCell(cell_index);
    	
    	CellType cellType = c.getCellType();
    	
    	if (cellType.equals(CellType.STRING)) {
    		
    		 value = c.getStringCellValue();
			
		} else if (cellType.equals(CellType.NUMERIC)) {
			
			double val = c.getNumericCellValue();
			int valu = (int) val;
			value = String.valueOf(valu);
		}
    	
    	return value;
	}
    
    
    }
    
    

	


