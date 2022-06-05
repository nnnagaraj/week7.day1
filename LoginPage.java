package com.leaftaps.UI.pages;

import org.openqa.selenium.By;

import com.leaftaps.UI.base.ProjectSpecificMethods;

public class LoginPage extends ProjectSpecificMethods {

	public void loginPage() {

	}

	public LoginPage typeUsername(String username) {
		driver.findElement(By.id("username")).sendKeys(username);
		//LoginPage page = new LoginPage();
		//return page;
		//return new LoginPage();
		return this;
	}
	
	public LoginPage typePassword(String password) {
		driver.findElement(By.id("password")).sendKeys(password);
        return this;
	}

	public WelcomePage clickLoginButton() {
		driver.findElement(By.className("decorativeSubmit")).click();
		return new WelcomePage();
	}
}