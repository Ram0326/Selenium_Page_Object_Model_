package com.leaftaps.pages;

import org.openqa.selenium.By;

import com.leataps.testng.base.ProjectSpecificMethod;

public class MyHomePage extends ProjectSpecificMethod{
public MyLeadsPage clickLeads() {
	driver.findElement(By.linkText("Leads")).click();
	return new MyLeadsPage();
}
}
