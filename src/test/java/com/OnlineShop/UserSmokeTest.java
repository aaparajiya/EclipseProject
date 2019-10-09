package com.OnlineShop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class UserSmokeTest {
public WebDriver driver;

@BeforeMethod
public void launchBroswer() {
	System.setProperty("webdriver.chorme.driver","c:/chromedriver.exe");
	driver = new ChromeDriver();
}
@Test (priority =1)
public void veryifyLaunchApp() {
	driver.get("http://www.google.co.uk");
	Assert.assertEquals(driver.getTitle(), "Google");
}
@Test (priority = 2)
public void veryifyElements() {
	driver.get("http://www.google.co.uk");
	Assert.assertEquals(driver.findElement(By.linkText("Gmail")).isDisplayed(), true);
}
	
@AfterMethod
public void closeBrowser() {
	driver.close();
	//close browser
}
}
