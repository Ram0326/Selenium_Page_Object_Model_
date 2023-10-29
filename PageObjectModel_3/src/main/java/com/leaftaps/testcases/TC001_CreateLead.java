package com.leaftaps.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.leaftaps.pages.LoginPage;
import com.leataps.testng.base.ProjectSpecificMethod;

public class TC001_CreateLead extends ProjectSpecificMethod {
	@BeforeTest
	public void setData() {
		excelFileName = "TC001";
	}
	@Test(dataProvider = "ArrayData")
	public void runCreateLead(String username, String password, String cname, String fname, String lname) {
		// LoginPage page = new LoginPage();
		//driver = 1
		new LoginPage(driver).enterUsername(username)
		.enterPassword(password)
		.clickLogin()
		.clickCRMSFA()
		.clickLeads()
		.clickCreateLeadLink()
		.enterCompanyName(cname)
		.enterFirstName(fname)
		.enterLastName(lname)
		.clickCreateLeadButton()
		.verifyLeadCreation();

	}
}
