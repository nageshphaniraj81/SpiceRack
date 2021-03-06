/**
 * 
 */
package com.cucumber.bdd.tests;


import org.junit.runner.RunWith;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.TestNGCucumberRunner;
import cucumber.api.testng.CucumberFeatureWrapper;

// TODO: Auto-generated Javadoc
// Test comment
/**
 * The Class TestRunner.
 */
@RunWith(Cucumber.class)
@CucumberOptions(
		monochrome =true,
		features = "src/test/java/com/cucumber/bdd/features",
		glue={"com/cucumber/bdd/stepdefinition"},
		plugin = {"pretty", "html:target/cucumber"})


public class TestRunner {
	
	/** The test NG cucumber runner. */
	private TestNGCucumberRunner testNGCucumberRunner;
	
	/**
	 * Sets the up class.
	 */
	@BeforeClass(alwaysRun=true)
	public void setUpClass(){
		testNGCucumberRunner = new TestNGCucumberRunner(this.getClass());
	}
	
	/**
	 * Run tests.
	 *
	 * @param cucumberFeatureWrapper
	 *            the cucumber feature wrapper
	 */
	@Test(dataProvider = "features")
	public void runTests(CucumberFeatureWrapper cucumberFeatureWrapper){	
		testNGCucumberRunner.runCucumber(cucumberFeatureWrapper.getCucumberFeature());	
	}
	
	/**
	 * Features.
	 *
	 * @return the object[][]
	 */
	@DataProvider
	public Object[][] features(){
		return testNGCucumberRunner.provideFeatures();
	}
	
	/**
	 * After class.
	 */
	@AfterClass(alwaysRun=true)
	public void afterClass(){
		testNGCucumberRunner.finish();
	}

}


