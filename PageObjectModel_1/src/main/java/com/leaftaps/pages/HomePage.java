package com.leaftaps.pages;

import org.openqa.selenium.By;

import com.leataps.testng.base.ProjectSpecificMethod;

public class HomePage extends ProjectSpecificMethod{

public LoginPage clickLogout() {
	driver.findElement(By.className("decorativeSubmit")).click();
	return new LoginPage();
}
public MyHomePage clickCRMSFA() {
	driver.findElement(By.linkText("CRM/SFA")).click();
	return new MyHomePage();
}
}
