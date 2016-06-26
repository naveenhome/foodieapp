package com.foodie;

import org.junit.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Seltest {
	private WebDriver driver;
	private String baseUrl;

	@Test
	public void testSel() throws Exception {
		driver = new FirefoxDriver();
		baseUrl = "http://ata123456789123456789.appspot.com/";
		driver.get(baseUrl + "/");
		driver.findElement(By.id("ID_nameField1")).clear();
		driver.findElement(By.id("ID_nameField1")).sendKeys("5");
		driver.findElement(By.id("ID_nameField2")).clear();
		driver.findElement(By.id("ID_nameField2")).sendKeys("4");
		driver.findElement(By.id("gwt-uid-2")).click();
		driver.findElement(By.id("ID_calculator")).click();
		String result = driver.findElement(By.id("ID_nameField3")).getAttribute("value");
		Assert.assertEquals("20", result);
	}
}
