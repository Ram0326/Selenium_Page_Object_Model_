package com.leaftaps.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import com.leataps.testng.base.ProjectSpecificMethod;

public class CreateLeadPage extends ProjectSpecificMethod{
	public CreateLeadPage(ChromeDriver driver) {
		this.driver = driver;
	}
public CreateLeadPage enterCompanyName(String data) {
	driver.findElement(By.id(property.getProperty("createleadpage.companyname.xpath"))).sendKeys(data);
	return this;
}
public CreateLeadPage enterFirstName(String data) {
	driver.findElement(By.id(property.getProperty("createleadpage.firstname.id"))).sendKeys(data);
	return this;
}
public CreateLeadPage enterLastName(String data) {
	driver.findElement(By.id(property.getProperty("createleadpage.lastname.id"))).sendKeys(data);
	return this;
}
public ViewLeadPage clickCreateLeadButton() {
	driver.findElement(By.name(property.getProperty("createleadpage.createlead.name"))).click();
	return new ViewLeadPage(driver);
}
}
