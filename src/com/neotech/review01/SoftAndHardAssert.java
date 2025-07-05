package com.neotech.review01;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAndHardAssert {

	@Test
	public void testHardAssert() {
		System.out.println("Hard Assert Test is running");

		System.out.println("Step1");
		System.out.println("Step2");
		System.out.println("Step3");

		String expectedName = "Jacqueline";
		String actualName = "Jackie";

		// Hard Assert
		Assert.assertEquals(actualName, expectedName, "Names do not match!"); // This will stop the test execution if //
																				// the assertion fails

		System.out.println("Step4"); // This line will not execute if the assertion fails
	}

	@Test
	public void testSoftAssert() {
		System.out.println("Soft Assert Test is running");

		SoftAssert softAssert = new SoftAssert(); // Create an instance of SoftAssert

		System.out.println("Step1");

		String expectedName = "Jacqueline";
		String actualName = "Jackie";
		// Soft Assert
		softAssert.assertEquals(actualName, expectedName, "Names do not match!"); // This will NOT stop the test //
																					// execution if the assertion fail

		System.out.println("Step2");

		softAssert.assertTrue(true, "This assertion is true"); // This will NOT stop the test execution if the assertion
																// fails

		System.out.println("Step3");

		softAssert.assertAll(); // This will check all the assertions made with SoftAssert and report any
								// failures

		System.out.println("Step4");

	}
}
