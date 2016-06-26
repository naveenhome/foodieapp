package com.foodie;

import junit.framework.TestCase;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CalcSteps extends TestCase {
	private WebDriver driver;
	private String baseUrl;
	
	@Given("^user enter (\\d+) and (\\d+)$")
	public void user_enter_and(int arg1, int arg2) throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    //throw new PendingException();
		driver = new FirefoxDriver();
		baseUrl = "http://ata123456789123456789.appspot.com/";
		driver.get(baseUrl + "/");
		driver.findElement(By.id("ID_nameField1")).clear();
		driver.findElement(By.id("ID_nameField1")).sendKeys(String.valueOf(arg1));
		driver.findElement(By.id("ID_nameField2")).clear();
		driver.findElement(By.id("ID_nameField2")).sendKeys(String.valueOf(arg2));
	}

	@Given("^select \"([^\"]*)\"$")
	public void select(String arg1) throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    //throw new PendingException();
		if(arg1.equals("Mul"))
		{
			driver.findElement(By.id("gwt-uid-2")).click();
		}
	}

	@When("^click on Calculate$")
	public void click_on_Calculate() throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    //throw new PendingException();
		driver.findElement(By.id("ID_calculator")).click();
	}

	@Then("^result should be (\\d+)$")
	public void result_should_be(int arg1) throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    //throw new PendingException();
		String result = driver.findElement(By.id("ID_nameField3")).getAttribute("value");
		assertEquals(arg1, Integer.parseInt(result));
	}


}
