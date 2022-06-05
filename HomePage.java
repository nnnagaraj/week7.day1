package com.leaftaps.UI.pages;

import org.openqa.selenium.By;

import com.leaftaps.UI.base.ProjectSpecificMethods;

public class HomePage extends ProjectSpecificMethods {
	public void MyHomePage() {
	
}	
	public MyLeadsPage clickLeads() {
		driver.findElement(By.linkText("Leads")).click();
		return new MyLeadsPage();
	}

}