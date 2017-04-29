/**
 * 
 */
package com.spicerack.framework.config;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import com.spicerack.framework.base.BrowserType;

/**
 * @author Nagesh Phaniraj
 *
 */
public class ConfigReader {
	
	Properties prop = new Properties();
	InputStream input = null;
	
	public static void populateSetting() throws IOException{
		ConfigReader reader = new ConfigReader();
		reader.ReadProperty();
	}
	
	private void ReadProperty() throws IOException{

		// load a properties file
		input = new FileInputStream("GlobalConfig.properties");
		prop.load(input);
		Settings.DatabaseURL= prop.getProperty("DatabaseURL");
		Settings.DatabaseUsername= prop.getProperty("DatabaseUsername");
		Settings.DatabasePassword= prop.getProperty("DatabasePassword");
		Settings.DatabaseDriver= prop.getProperty("DatabaseDriver");
		Settings.LogFolder= prop.getProperty("LogFolder");
		Settings.ExtentReportPath= prop.getProperty("ExtentReportPath");
		Settings.ScreenshotFolder= prop.getProperty("ScreenshotFolder");
		Settings.ExcelDataSheetPath= prop.getProperty("ExcelDataSheetPath");
		Settings.BaseURL= prop.getProperty("BaseURL");
		Settings.Browser= BrowserType.valueOf(prop.getProperty("Browser"));

	}

}