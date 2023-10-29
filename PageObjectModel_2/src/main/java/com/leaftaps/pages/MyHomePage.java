package com.leaftaps.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import com.leataps.testng.base.ProjectSpecificMethod;

public class MyHomePage extends ProjectSpecificMethod{
	public MyHomePage(ChromeDriver driver) {
		this.driver = driver;
	}
public MyLeadsPage clickLeads() {
	driver.findElement(By.linkText("Leads")).click();
	return new MyLeadsPage(driver);
}
}
