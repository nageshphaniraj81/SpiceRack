/**
 * May 28, 2017
 * @param
 */
package com.spicerack.framework.initialization;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import com.jayway.restassured.RestAssured;

/**
 * @author Nagesh Phaniraj
 *
 */
public class BaseAPI {
	
	// GitHub API uses basic authorization (Provide a valid github username
	// and password here)
	protected static String userName = "nageshphaniraj81";
	protected static String password = "New02$$ton";

	@BeforeClass
	public void beforeClass() {
		// API Base class
		RestAssured.baseURI="https://api.github.com";
		RestAssured.basePath="/user";
	}
	
	@AfterClass
	public void afterClass() {
		// No code as of now
	}
	
}
