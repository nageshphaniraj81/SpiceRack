/*
 * 
 */
package com.spicerack.framework.frameworkutilities;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * The Class DataBaseUtil helps in performing database testing of application
 * under test (AUT). Currently the DB parameters are hardcoded, it can be taken
 * from GlobalConfiguration properties or other external source for actual usage
 */
public class DataBaseUtil {

	/** The conn. */
	static Connection conn = null;

	/** The stmt. */
	private static Statement stmt;

	/** The results. */
	private static ResultSet results = null;

	/** The db url. */
	public static String DB_URL = "jdbc:mysql://localhost:3306/nagesh?useSSL=false";

	/** The db user. */
	public static String DB_USER = "root";

	/** The db password. */
	public static String DB_PASSWORD = "root";

	/** The driver. */
	public static String driver = "com.mysql.jdbc.Driver";

	/**
	 * This method opens up database connection based on DB parameters
	 */
	public static void openConnection() {

		try {

			// STEP 1: Register JDBC driver
			Class.forName(driver).newInstance();

			// STEP 2: Get connection to DB
			System.out.println("Connecting to a selected database...");

			conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);

			// conn = DriverManager.getConnection(DB_URL, props);
			System.out.println("Connected database successfully...");

			// STEP 3: Statement object to send the SQL statement to the
			// Database
			System.out.println("Creating statement...");
			stmt = conn.createStatement();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	/**
	 * Execute query. This query takes any SQL query Currently it displays
	 * entire table once the query is executed (Select * from TABLE) The display
	 * result can be altered based on user needs
	 *
	 * @param query
	 *            the query
	 */
	public static void executeQuery(String query) {

		try {
			// STEP 4: Extract data from result set
			results = stmt.executeQuery(query);

			while (results.next()) {
				int ssn = results.getInt("ssn");
				String first = results.getString("first_name");
				String last = results.getString("last_name");
				String age = results.getString("age");

				// Display Values
				System.out.println("SSN: " + ssn);
				System.out.println("Last Name: " + last);
				System.out.println("First Name: " + first);
				System.out.println("Age: " + age);

			}
			results.close();
		} catch (SQLException se) {

			// Handle errors for JDBC
			se.printStackTrace();

		} catch (Exception e) {

			// Handle errors for Class.forName
			e.printStackTrace();
		}
	}

	/**
	 * This method is used to close DB connection.
	 */
	public static void closeConnection() {
		try {
			if (results != null)
				results.close();
			if (stmt != null)
				conn.close();
			if (conn != null)
				conn.close();
		} catch (SQLException se) {
			se.printStackTrace();
		}
	}

}
