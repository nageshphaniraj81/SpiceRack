package com.restassured.apitests;

import org.testng.annotations.Test;
import org.testng.Assert;
import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.response.Response;
import com.spicerack.framework.initialization.BaseAPI;
import static com.jayway.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
import java.util.ArrayList;

public class GitHubAPITests extends BaseAPI {

	// To test the status code of the get request
	@Test
	public void getEmailFields() {

		 given().auth().preemptive().basic(userName, password)
		.when().get("/emails")
		.then().contentType(ContentType.JSON).statusCode(200);
	}

	// To test the status code of the get request
	@Test
	public void getResponseAsString() {

		// GitHub API uses basic authorization (Provide a valid github username
		// and password here)
		Response response = given().auth().preemptive().basic(userName, password).when().get("/emails");
		System.out.println(response.asString());

	}

	// To validate response text using JSON Path: email address
	@Test
	public void validateEmailAddress() {

		// GitHub API uses basic authorization (Provide a valid github username
		// and password here)
		String emailAddress = given().auth().preemptive().basic(userName, password).when().get("/emails")
				.then().extract().path("email[0]");
		Assert.assertEquals(emailAddress, userName+"@gmail.com");

	}
	
	// To validate response text using JSON Path: visibility
	@Test
	public void validateVisibility() {

		// GitHub API uses basic authorization (Provide a valid github username
		// and password here)
		String actualVisibility = given().auth().preemptive().basic(userName, password).when().get("/emails")
				.then().extract().path("visibility[0]");
		 Assert.assertEquals(actualVisibility, "public");

	}
	
	// To get all repositories under user
	@Test
	public void getAllRepositories() {

		// GitHub API uses basic authorization (Provide a valid github username
		// and password here)
		ArrayList<String> repos = given().auth().preemptive().basic(userName, password)
				.when().get("/repos")
				.then().extract().path("name");
		System.out.println(repos);

	}
	
	// To search for specific item using Hamcrestmatchers
	@Test
	public void validateSpecificRepo() {

		// GitHub API uses basic authorization (Provide a valid github username
		// and password here)
		String repoTobeSearched = "BigLeapProject";
		         given().auth().preemptive().basic(userName, password)
				.when().get("/repos")
				.then().body("name", hasItem(repoTobeSearched));
	}
	
}