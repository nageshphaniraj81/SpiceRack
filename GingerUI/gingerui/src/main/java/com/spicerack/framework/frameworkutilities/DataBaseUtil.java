package com.spicerack.framework.frameworkutilities;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DataBaseUtil {
	
	static Connection conn = null;
	private static Statement stmt;
	private static ResultSet results = null;
	public static String DB_URL = "jdbc:mysql://localhost:3306/nagesh";
	public static String DB_USER = "root";
	public static String DB_PASSWORD = "root";
	public static String driver ="com.mysql.jdbc.Driver";
	

	public static void openConnection(){
	    
		try {
			
			// STEP 1: Register JDBC driver
			Class.forName(driver).newInstance();
			
			// STEP 2: Get connection to DB
			System.out.println("Connecting to a selected database...");
			
			conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
			
			// conn = DriverManager.getConnection(DB_URL, props);		
			System.out.println("Connected database successfully...");
			
			// STEP 3: Statement object to send the SQL statement to the Database
			System.out.println("Creating statement...");
			stmt = conn.createStatement();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
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
	
	
	public static void closeConnection(){
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
