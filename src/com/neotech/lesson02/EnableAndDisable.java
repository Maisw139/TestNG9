package com.neotech.lesson02;

import org.testng.annotations.Test;

public class EnableAndDisable {

	@Test(priority = 1)
	public void firstMethod() {
		System.out.println("firstTest");
	}

	@Test(priority = 2, enabled = true)
	public void secondMethod() {
		System.out.println("secondTest");
	}

	@Test(enabled = false)
	public void thirdMethod() {
		System.out.println("thirdTest");
	}

	@Test(priority = 10)
	public void fourthMethod() {
		System.out.println("fourthTest");
	}

}
