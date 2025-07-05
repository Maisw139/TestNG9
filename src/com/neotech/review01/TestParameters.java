package com.neotech.review01;

import org.testng.annotations.Test;

public class TestParameters {

	@Test(priority = 4, groups = "regression")
	public void MethodA() {
		System.out.println("Method A is running");
	}

	@Test(priority = 1, enabled = false, groups = "regression")
	public void MethodB() {
		System.out.println("Method B is running");
	}
}
