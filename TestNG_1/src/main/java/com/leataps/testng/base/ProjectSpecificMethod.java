package com.leataps.testng.base;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import utility.ReadExcel;

public class ProjectSpecificMethod {
	public ChromeDriver driver;
	public String excelFileName;
	
	@Parameters({"url","username","password"})
	@BeforeMethod
	public void openApp(String url, String username, String password) {
		System.out.println("Before Method Started");
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElementById("username").sendKeys(username);
		driver.findElementById("password").sendKeys(password);
		driver.findElementByClassName("decorativeSubmit").click();
		System.out.println("Before Method Ended");
	}
	@AfterMethod
	public void closeApp() {
		System.out.println("After Method Started");
		driver.close();
		System.out.println("After Method Ended");
	}
	
	@DataProvider(name = "ArrayData")
	public String[][] sendData() throws IOException {
		
		String[][] array = ReadExcel.readExcelData(excelFileName);
		return array;
		
		
		/*
		 * // Create a 2-D Array String[][] array = new String[2][3];
		 * 
		 * array[0][0] = "Testleaf"; array[0][1] = "Balaji"; array[0][2] = "C";
		 * 
		 * array[1][0] = "Testleaf"; array[1][1] = "Dhivya"; array[1][2] = "Prabha";
		 * 
		 * return array;
		 */
	}
}
