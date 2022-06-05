package com.leaftaps.UI.test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.leaftaps.UI.base.ProjectSpecificMethods;
import com.leaftaps.UI.pages.LoginPage;

public class CreateLead_Positive extends ProjectSpecificMethods {
	@BeforeTest
	public void setData() {
		excelFileName = "TestNGInputExcel";
	}
	
	@Test(dataProvider = "getData")
	public void TC001(String username, String password, String CompanyName, String FirstName, String LastName) {
	new LoginPage()
	.typeUsername(username)
	.typePassword(password)
	.clickLoginButton()
	.clickCRMSFA()
	.clickLeads()
	.clickCreateLead()
	.typeCompanyName(CompanyName)
	.typefirstName(FirstName)
	.typelastName(LastName)
	.clickCreateLeadButton()
	.verifyLeadID();
	
	}
 }
