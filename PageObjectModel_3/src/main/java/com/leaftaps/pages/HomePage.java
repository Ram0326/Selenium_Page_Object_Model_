package com.leaftaps.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import com.leataps.testng.base.ProjectSpecificMethod;

public class HomePage extends ProjectSpecificMethod{
public HomePage(ChromeDriver driver) {
	this.driver = driver;
}
public LoginPage clickLogout() {
	driver.findElement(By.className(property.getProperty("homepage.logoutbutton.class"))).click();
	return new LoginPage(driver);
}
public MyHomePage clickCRMSFA() {
	driver.findElement(By.linkText(property.getProperty("homepage.crmsfa.linktext"))).click();
	return new MyHomePage(driver);
}
}
