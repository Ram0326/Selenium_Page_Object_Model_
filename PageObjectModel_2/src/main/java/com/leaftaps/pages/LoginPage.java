package com.leaftaps.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import com.leataps.testng.base.ProjectSpecificMethod;

public class LoginPage extends ProjectSpecificMethod{
	public LoginPage(ChromeDriver driver) {
		this.driver = driver; //driver = 1
	}
	
public LoginPage enterUsername(String data) {
	driver.findElement(By.id("username")).sendKeys(data);//driver = 0
	return this;
	// this = new LoginPage();
}
public LoginPage enterPassword(String data) {
	driver.findElement(By.id("password")).sendKeys(data);
	return this;
}
public HomePage clickLogin() {
	driver.findElement(By.className("decorativeSubmit")).click();
	return new HomePage(driver);
}
}
