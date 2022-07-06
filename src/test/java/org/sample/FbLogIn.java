package org.sample;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.interactions.SendKeysAction;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class FbLogIn extends PojoClass {
	public static	PojoClass p;
	@BeforeSuite
	private void browserLaunch() {
		chromebrowser();
		maximize();
		implicitWaits();
		url("https:www.facebook.com/");
	}
	@Test
	private void Invalid__userName_password() {
		p=new PojoClass();
		sendText(p.getEmail(), "Hello");
		sendText(p.getPassword(), "12345");
		buttonClick(p.getLogIn());
	}
	
	@AfterSuite
	private void closeBrowser() {
		driver.quit();
	}





}
