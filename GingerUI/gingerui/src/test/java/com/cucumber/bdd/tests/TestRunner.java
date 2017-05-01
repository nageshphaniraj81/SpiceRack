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

@RunWith(Cucumber.class)
@CucumberOptions(
		monochrome =true,
		features = "src/test/java/com/cucumber/bdd/features",
		glue={"com/cucumber/bdd/stepdefinition"},
		plugin = {"pretty", "html:target/cucumber"})


public class TestRunner {
	
	private TestNGCucumberRunner testNGCucumberRunner;
	@BeforeClass(alwaysRun=true)
	public void setUpClass(){
		testNGCucumberRunner = new TestNGCucumberRunner(this.getClass());
	}
	
	@Test(dataProvider = "features")
	public void runTests(CucumberFeatureWrapper cucumberFeatureWrapper){
		
//		List <CucumberTagStatement> elements = cucumberFeatureWrapper.getCucumberFeature().getFeatureElements();
//		for(Iterator<CucumberTagStatement> element = elements.iterator();element.hasNext();)
//		{
//			// Pass the hardcoaded scenario name
//			CucumberTagStatement scenarioName = element.next();
//			if(!scenarioName.getVisualName().equals("Scenario: Check Dresses page is displayed correctly")){
//				element.remove();
//			}
//		}
			
		testNGCucumberRunner.runCucumber(cucumberFeatureWrapper.getCucumberFeature());	
	}
	
	@DataProvider
	public Object[][] features(){
		return testNGCucumberRunner.provideFeatures();
	}
	
	@AfterClass(alwaysRun=true)
	public void afterClass(){
		testNGCucumberRunner.finish();
	}

}


