package org.sample;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	public static WebDriver driver;
	
	public static  void chromebrowser() {
		WebDriverManager.chromedriver().setup();
driver= new ChromeDriver();
	}
	public static void maximize() {
		driver.manage().window().maximize();
	}
	public static void implicitWaits() {
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	}
	public static void url(String url) {
		driver.get(url);
	}
	
	public static void sendText(WebElement element ,String text) {
		element.sendKeys(text);
		
	}
	public static void buttonClick(WebElement element) {
		element.click();
	}
	public static void readExcel() throws IOException {
File file = new File("C:\\Users\\Prithiv\\eclipse-workspace\\TestNg\\data\\fbtestdata.xlsx");
FileInputStream read = new FileInputStream(file);
Workbook book = new XSSFWorkbook(read);
Sheet sheet = book.getSheet("Sheet1");
	}

}
