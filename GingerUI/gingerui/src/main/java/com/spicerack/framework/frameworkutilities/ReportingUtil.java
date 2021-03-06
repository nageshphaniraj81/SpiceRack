/*
 * 
 */
package com.spicerack.framework.frameworkutilities;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import com.spicerack.framework.configuration.ConfigReader;
import com.spicerack.framework.configuration.Settings;
import com.spicerack.framework.initialization.DriverContext;

/**
 * The Class ReportingUtil used to generate Beautiful Extent Reports
 */
public class ReportingUtil {

	/** The report. */
	private static ExtentReports report;
	
	/** The test. */
	private static ExtentTest test;

	/**
	 * Instantiates a new reporting util.
	 *
	 * @param testName
	 *            the test name
	 * @throws IOException
	 *             Signals that an I/O exception has occurred.
	 */
	public ReportingUtil(String testName) throws IOException {
		
		// Initializing configuration Settings
		ConfigReader.populateSetting();
		
		report = new ExtentReports(Settings.ExtentReportPath);
		test = report.startTest(testName);

	}

	/**
	 * Log info.
	 *
	 * @param message
	 *            the message
	 */
	public void logInfo(String message) {
		test.log(LogStatus.INFO, message);
	}

	/**
	 * Log pass.
	 *
	 * @param message
	 *            the message
	 */
	public  void logPass(String message) {
		test.log(LogStatus.PASS, message);
	}

	/**
	 * Log fail.
	 *
	 * @param message
	 *            the message
	 */
	public  void logFail(String message) {
		test.log(LogStatus.FAIL, message);
	}

	/**
	 * Close reporting.
	 */
	public  void closeReporting() {
		report.endTest(test);
		report.flush();
	}

	/**
	 * Take screenshot on failure.
	 *
	 * @param testResult
	 *            the test result
	 * @throws IOException
	 *             Signals that an I/O exception has occurred.
	 */
	public void takeScreenshotOnFailure(ITestResult testResult) throws IOException {
		if (testResult.getStatus() == ITestResult.FAILURE) {
			String path = takeScreenshot(DriverContext.Driver, testResult.getName());
			String imagePath = test.addScreenCapture(path);
			test.log(LogStatus.FAIL, testResult.getName()+"Test Failed", imagePath);
		}
	}
	
	/**
	 * Gets the random string.
	 *
	 * @param length
	 *            the length
	 * @return the random string
	 */
	private static String getRandomString(int length) {
		StringBuilder sb = new StringBuilder();
		String characters = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
		for (int i = 0; i < length; i++) {
			int index = (int) (Math.random() * characters.length());
			sb.append(characters.charAt(index));
		}
		return sb.toString();
	}

	/**
	 * Take screenshot.
	 *
	 * @param driver
	 *            the driver
	 * @param fileName
	 *            the file name
	 * @return the string
	 * @throws IOException
	 *             Signals that an I/O exception has occurred.
	 */
	private static String takeScreenshot(WebDriver driver, String fileName) throws IOException {
		fileName = fileName+getRandomString(5)+ ".png";
		String directory = Settings.ScreenshotFolder;
		File sourceFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(sourceFile, new File(directory + fileName));
		String destination = directory + fileName;
		return destination;
	}


}
