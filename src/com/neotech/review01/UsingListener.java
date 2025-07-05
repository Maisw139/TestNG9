package com.neotech.review01;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(com.neotech.utils.Listener.class) // Specify the listener class to be used
public class UsingListener {

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("This method runs just before each test method");
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("This method runs just after each test method");
	}

	@Test
	public void test1() {
		System.out.println("Test 1 is running");

		Assert.assertTrue(false, "This test is expected to fail");
	}

	@Test
	public void test2() {
		System.out.println("Test 2 is running");

		Assert.assertEquals("A", "A", "This test is expected to pass");
	}
}
