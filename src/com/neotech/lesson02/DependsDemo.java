package com.neotech.lesson02;

import org.testng.annotations.Test;

public class DependsDemo {

	@Test
	public void firstMethod() {
		System.out.println("firstTest");
	}

	@Test
	public void secondMethod() {
		System.out.println("secondTest");
	}

	@Test(dependsOnMethods = { "firstMethod", "secondMethod" })
	public void thirdMethod() throws Exception {
		System.out.println("thirdTest");
		throw new Exception(); // We are failing this Test
	}

	@Test(dependsOnMethods = "thirdMethod")
	public void fourthMethod() {
		System.out.println("fourthTest");
	}
	
	// If a test case is dependent on one or more Test methods
	// It will be skipped if one of the Test methods fail

}
