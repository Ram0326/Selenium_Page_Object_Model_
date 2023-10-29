package com.leaftaps.pages;

import org.openqa.selenium.By;

import com.leataps.testng.base.ProjectSpecificMethod;

public class CreateLeadPage extends ProjectSpecificMethod{
public CreateLeadPage enterCompanyName(String data) {
	driver.findElement(By.id("createLeadForm_companyName")).sendKeys(data);
	return this;
}
public CreateLeadPage enterFirstName(String data) {
	driver.findElement(By.id("createLeadForm_firstName")).sendKeys(data);
	return this;
}
public CreateLeadPage enterLastName(String data) {
	driver.findElement(By.id("createLeadForm_lastName")).sendKeys(data);
	return this;
}
public ViewLeadPage clickCreateLeadButton() {
	driver.findElement(By.name("submitButton")).click();
	return new ViewLeadPage();
}
}
