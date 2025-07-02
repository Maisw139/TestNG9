package com.neotech.lesson01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.neotech.utils.CommonMethods;
import com.neotech.utils.ConfigsReader;

public class TitleAndLogoValidation extends CommonMethods {
	/**
	 * Moved these methods to BaseClass
	 * 
	 * @BeforeMethod public void openAndNavigate() { setUp(); }
	 * 
	 * @AfterMethod public void quitBrowser() { tearDown(); }
	 */

	@Test(priority = -1, enabled = false, groups = "smoke")
	public void titleValidation() {
		String expectedTitle = "OrangeHR"; // intentionally incorrect title for demonstration
		String actualTitle = driver.getTitle();

		if (expectedTitle.equals(actualTitle)) {
			System.out.println("Title validation passed: " + actualTitle);
		} else {
			System.out.println("Title validation failed. Expected: " + expectedTitle + ", but got: " + actualTitle);
			throw new RuntimeException("Title validation failed");
			// for now we just throw an exception, later
			// we will use assertions
		}
	}

	@Test
	public void logoValidation() {
		WebElement logo = driver.findElement(By.xpath("//div[@class='orangehrm-logo']/img"));

		if (logo.isDisplayed()) {
			System.out.println("Test passed: Logo is displayed");
		} else {
			System.out.println("Test failed: Logo is not displayed");
		}
	}

	@Test(groups = "smoke")
	public void loginValidation() {
		sendText(driver.findElement(By.id("txtUsername")), ConfigsReader.getProperty("username"));
		sendText(driver.findElement(By.id("txtPassword")), ConfigsReader.getProperty("password"));

		click(driver.findElement(By.xpath("//button")));

		WebElement userImg = driver.findElement(By.xpath("//div[@id='menu-profile']/img"));

		if (userImg.isDisplayed()) {
			System.out.println("Test passed: User is logged in and user image is displayed");
		} else {
			System.out.println("Test failed: User is not logged in or user image is not displayed");
			throw new RuntimeException("Login validation failed");
		}
	}
}
