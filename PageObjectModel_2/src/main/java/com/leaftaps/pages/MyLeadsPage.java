package com.leaftaps.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import com.leataps.testng.base.ProjectSpecificMethod;

public class MyLeadsPage extends ProjectSpecificMethod{
	public MyLeadsPage(ChromeDriver driver) {
		this.driver = driver;
	}
public CreateLeadPage clickCreateLeadLink() {
	driver.findElement(By.linkText("Create Lead")).click();
	return new CreateLeadPage(driver);
}
}
