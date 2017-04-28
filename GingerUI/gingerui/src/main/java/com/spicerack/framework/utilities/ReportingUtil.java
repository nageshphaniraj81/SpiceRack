package com.spicerack.framework.utilities;

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
import com.spicerack.framework.base.DriverContext;
import com.spicerack.framework.config.ConfigReader;
import com.spicerack.framework.config.Settings;

public class ReportingUtil {

	private static ExtentReports report;
	private static ExtentTest test;

	public ReportingUtil(String testName) throws IOException {
		
		// Initializing configuration Settings
		ConfigReader.populateSetting();
		
		report = new ExtentReports(Settings.ExtentReportPath);
		test = report.startTest(testName);

	}

	public void logInfo(String message) {
		test.log(LogStatus.INFO, message);
	}

	public  void logPass(String message) {
		test.log(LogStatus.PASS, message);
	}

	public  void logFail(String message) {
		test.log(LogStatus.FAIL, message);
	}

	public  void closeReporting() {
		report.endTest(test);
		report.flush();
	}

	public void takeScreenshotOnFailure(ITestResult testResult) throws IOException {
		if (testResult.getStatus() == ITestResult.FAILURE) {
			String path = takeScreenshot(DriverContext.Driver, testResult.getName());
			String imagePath = test.addScreenCapture(path);
			test.log(LogStatus.FAIL, testResult.getName()+"Test Failed", imagePath);
		}
	}
	
	private static String getRandomString(int length) {
		StringBuilder sb = new StringBuilder();
		String characters = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
		for (int i = 0; i < length; i++) {
			int index = (int) (Math.random() * characters.length());
			sb.append(characters.charAt(index));
		}
		return sb.toString();
	}

	private static String takeScreenshot(WebDriver driver, String fileName) throws IOException {
		fileName = fileName+getRandomString(5)+ ".png";
		String directory = Settings.ScreenshotFolder;
		File sourceFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(sourceFile, new File(directory + fileName));
		String destination = directory + fileName;
		return destination;
	}


}
