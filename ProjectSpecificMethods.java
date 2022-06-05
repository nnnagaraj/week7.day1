package com.leaftaps.UI.base;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import com.leaftaps.UI.Utilities.ReadExcelData;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ProjectSpecificMethods {
	public static RemoteWebDriver driver;
	public String excelFileName;
	
	@Parameters({ "browserName", "URL" })
	@BeforeMethod
	public void startBrowser(String browserName, String url) {
		if (browserName.equals("Chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		} else if (browserName.equals("Edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}

	/*
	 * WebDriverManager.chromedriver().setup(); driver = new ChromeDriver();
	 * driver.manage().window().maximize(); driver.get(url);
	 * driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	 * driver.findElement(By.id("username")).sendKeys(username);
	 * driver.findElement(By.id("password")).sendKeys(password);
	 * driver.findElement(By.className("decorativeSubmit")).click();
	 * driver.findElement(By.linkText("CRM/SFA")).click();
	 * driver.findElement(By.linkText("Leads")).click();
	 */

	@AfterMethod
	public void endBrowser() {
		driver.close();
	}

	@DataProvider
	public String[][] getData() throws IOException {
		return ReadExcelData.readData(excelFileName);
	}

}