package com.neotech.review01;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsOnMethod {

	@Test
	public void firstTest() {
		System.out.println("First test is running");

		Assert.assertEquals("a", "b", "This test is failing intentionally to demonstrate dependsOnMethods");
	}

	@Test(dependsOnMethods = "firstTest")
	public void secondTest() {
		System.out.println("Second test is running");
	}

	// First test will be executed first.
	// First test will fail.
	// Second test will be skipped because it depends on the first test.
	// Results: // First test: FAILED, // Second test: SKIPPED
}
