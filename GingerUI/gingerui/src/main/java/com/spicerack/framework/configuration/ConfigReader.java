/**
 * 
 */
package com.spicerack.framework.configuration;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import com.spicerack.framework.initialization.BrowserType;

/**
 * The Class ConfigReader - This class sets the global configuration properties
 * from GlobalConfig.properties to Static variables declared in Settings.java
 * file
 * 
 * @author Nagesh Phaniraj
 */
public class ConfigReader {

	/** Declare varaible of type properties. */
	Properties prop = new Properties();

	/** Declare varaible of type InputStream. */
	InputStream input = null;

	/**
	 * Populate setting. This method creates an instance of the class and calls
	 * ReadProperty method
	 * 
	 * @throws IOException
	 *             Signals that an I/O exception has occurred.
	 */
	public static void populateSetting() throws IOException {
		ConfigReader reader = new ConfigReader();
		reader.ReadProperty();
	}

	/**
	 * Read property.This method sets configuration properties to static
	 * varibles declared in Settings.java
	 *
	 * @throws IOException
	 *             Signals that an I/O exception has occurred.
	 */
	private void ReadProperty() throws IOException {

		// load a properties file
		input = new FileInputStream("GlobalConfig.properties");
		prop.load(input);
		Settings.DatabaseURL = prop.getProperty("DatabaseURL");
		Settings.DatabaseUsername = prop.getProperty("DatabaseUsername");
		Settings.DatabasePassword = prop.getProperty("DatabasePassword");
		Settings.DatabaseDriver = prop.getProperty("DatabaseDriver");
		Settings.LogFolder = prop.getProperty("LogFolder");
		Settings.ExtentReportPath = prop.getProperty("ExtentReportPath");
		Settings.ScreenshotFolder = prop.getProperty("ScreenshotFolder");
		Settings.ExcelDataSheetPath = prop.getProperty("ExcelDataSheetPath");
		Settings.BaseURL = prop.getProperty("BaseURL");
		Settings.Browser = BrowserType.valueOf(prop.getProperty("Browser"));

	}

}
