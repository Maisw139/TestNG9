package com.neotech.review01;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DemoAnnotations {

	@Test(groups = "regression")
	public void test1() {
		System.out.println("Review test1");
	}

	@Test(groups = "regression")
	public void test2() {
		System.out.println("Review test2");
	}

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("This method runs just before each test method");
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("This method runs just after each test method");
	}

	@BeforeTest
	public void beforeTest() {
		System.out.println("This method runs just once before all the tests in this class");
	}

	@AfterTest
	public void afterTest() {
		System.out.println("This method runs just once after all the tests in this class");
	}

	// @BeforeTest
	// @BeforeMethod
	// @Test 1
	// @AfterMethod
	// @BeforeMethod
	// @Test 2
	// @AfterMethod
	// @AfterTest

}
