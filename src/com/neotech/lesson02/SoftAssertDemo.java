package com.neotech.lesson02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.neotech.utils.CommonMethods;
import com.neotech.utils.ConfigsReader;

public class SoftAssertDemo extends CommonMethods {

	@BeforeMethod
	public void openAndNavigate() {
		setUp();
	}

	@AfterMethod
	public void quitBrowser() {
		tearDown();
	}

	@Test
	public void logoAndLoginValidation() {
		WebElement logo = driver.findElement(By.xpath("//div[@class='orangehrm-logo']/img"));
		boolean logoDisplayed = logo.isDisplayed();

		// I am manually setting this variable to false, to fail the test
		logoDisplayed = false;

		// Logo is displayed validation
		SoftAssert soft = new SoftAssert();
		soft.assertTrue(logoDisplayed, "Logo is NOT displayed!");

		// Login validation
		sendText(driver.findElement(By.id("txtUsername")), ConfigsReader.getProperty("username"));
		sendText(driver.findElement(By.id("txtPassword")), ConfigsReader.getProperty("password"));
		click(driver.findElement(By.xpath("//button[@type='submit']")));
		wait(2);

		String expected = "Jacqueline White";
		String actual = driver.findElement(By.id("account-name")).getText();

		soft.assertEquals(actual, expected, "Account name is NOT " + expected);

		// This will collect all soft test assertions
		// and will decide whether the test passed or failed
		soft.assertAll();

		// If the test case failed, execution will stop after assertAll()
		// Otherwise, it will continue executing the following code
		System.out.println("After assertAll()");
	}

}
