package com.neotech.lesson01;

import org.testng.annotations.Test;

public class TestNGDemo {

	@Test
	public void testOne() {
		System.out.println("This is test method 1");
	}

	@Test(groups = "smoke")
	public void testTwo() {
		System.out.println("This is test method 2");
	}

	@Test(groups = { "regression", "smoke" })
	public void testThree() {
		System.out.println("This is test method 3");
	}

}
