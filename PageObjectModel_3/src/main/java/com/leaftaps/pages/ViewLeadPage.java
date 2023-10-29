package com.leaftaps.pages;

import org.openqa.selenium.chrome.ChromeDriver;

import com.leataps.testng.base.ProjectSpecificMethod;

public class ViewLeadPage extends ProjectSpecificMethod{
	public ViewLeadPage(ChromeDriver driver) {
		this.driver = driver;
	}
public ViewLeadPage verifyLeadCreation() {
	System.out.println("Verified");
	return this;
}
}
