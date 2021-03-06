/*
 * 
 */
package com.normal.tests.test;

import org.testng.annotations.Test;

import com.spicerack.framework.frameworkutilities.DataBaseUtil;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

// TODO: Auto-generated Javadoc
/**
 * The Class DatabaseTest.
 */
public class DatabaseTest {

	/** The query. */
	String query;

	/**
	 * Before class.
	 */
	@BeforeClass
	public void beforeClass() {

		// Open database connection
		DataBaseUtil.openConnection();

	}

	/**
	 * Test.
	 */
	@Test
	public void test() {

		// Execute data base query
		query = "select * from users";
		DataBaseUtil.executeQuery(query);

	}

	/**
	 * After class.
	 */
	@AfterClass
	public void afterClass() {

		// Close database connection
		DataBaseUtil.openConnection();

	}
}