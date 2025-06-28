package com.neotech.lesson01;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGAnnotations {

	@Test
	public void test1() {
		System.out.println("This is test method 1");
	}

	@Test
	public void test2() {
		System.out.println("This is test method 2");
	}

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("This method runs before each test method");
		System.out.println("It is used for setup tasks");
		System.out.println("For example, opening a browser or initializing variables");
		System.out.println();
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("This method runs after each test method");
		System.out.println("It is used for cleanup tasks");
		System.out.println("For example, closing a browser or resetting variables");
		System.out.println();
	}

	@Test
	public void test3() {
		System.out.println("This is test method 3");
		System.out.println("It is a separate test method");
		System.out.println("It can be used to test different functionality");
		System.out.println();
	}

	// WRONG:
	// @BeforeMethod
	// Test1
	// Test2
	// Test3
	// @AfterMethod

	// RIGHT:
	// @BeforeMethod
	// Test1
	// @AfterMethod
	// @BeforeMethod
	// Test2
	// @AfterMethod
	// @BeforeMethod
	// Test3
	// @AfterMethod
}
