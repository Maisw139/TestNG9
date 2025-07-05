package com.neotech.review01;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GroupsDemo {

	@Test(groups = "smoke")
	public void smokeTest() {
		System.out.println("Smoke test is running");
	}

	@Test(groups = "regression")
	public void regressionTest() {
		System.out.println("Regression test is running");
	}

	@BeforeMethod(alwaysRun = true)
	public void beforeMethod() {
		System.out.println("This method runs just before each test method");
	}
}
