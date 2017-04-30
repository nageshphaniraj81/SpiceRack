package com.normal.tests.test;

import org.testng.annotations.Test;

import com.spicerack.framework.utilities.DataBaseUtil;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class DatabaseTest {

	String query;

	@BeforeClass
	public void beforeClass() {

		// Open database connection
		DataBaseUtil.openConnection();

	}

	@Test
	public void test() {

		// Execute data base query
		query = "select * from users";
		DataBaseUtil.executeQuery(query);

	}

	@AfterClass
	public void afterClass() {

		// Close database connection
		DataBaseUtil.openConnection();

	}
}