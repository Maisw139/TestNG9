package com.neotech.review01;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.neotech.utils.ExcelUtility;

public class DataDrivenTest {

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("This method runs just before each test method");
	}

	@Test(dataProvider = "data2")
	public void loginTest(String name, String company, String position) {
		System.out.println("Login test is running");
		System.out.println("Name: " + name + ", Company: " + company);
		System.out.println("Position: " + position);
	}

	@DataProvider(name = "data1")
	public Object[][] createData() {
		return new Object[][] { { "John", "TechCorp", "Developer" }, { "Jane", "BizInc", "Manager" },
				{ "Mike", "WebSolutions", "Designer" } };
	}

	@DataProvider(name = "data2")
	public Object[][] createFromExcel() {
		String filePath = System.getProperty("user.dir") + "/testdata/Excel.xlsx";
		String sheetName = "Position";

		return ExcelUtility.excelIntoArray(filePath, sheetName);
	}
}
