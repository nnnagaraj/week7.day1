package com.leaftaps.UI.pages;

import org.openqa.selenium.By;

import com.leaftaps.UI.base.ProjectSpecificMethods;

public class CreateLead extends ProjectSpecificMethods {
	public void CreateLead() {

	}

	public CreateLead typeCompanyName(String CompanyName) {
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(CompanyName);
	return this;
	}

	public CreateLead typefirstName(String FirstName) {
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(FirstName);
	return this;
	}

	public CreateLead typelastName(String LastName) {
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(LastName);
	return this;
	}

	public ViewLead clickCreateLeadButton() {
		driver.findElement(By.name("submitButton")).click();
	return new ViewLead();
	}

}