package com.leaftaps.UI.pages;

import org.openqa.selenium.By;

import com.leaftaps.UI.base.ProjectSpecificMethods;

public class MyLeadsPage extends ProjectSpecificMethods {
	public void MyLeadsPage() {
	
}
	public CreateLead clickCreateLead() {
		driver.findElement(By.linkText("Create Lead")).click();
	return new CreateLead();
	}
}