/**
 * 
 */
package com.spicerack.framework.config;

import java.io.IOException;
import java.util.Properties;

import com.spicerack.framework.base.BrowserType;

/**
 * @author Nagesh Phaniraj
 *
 */
public class ConfigReader {
	
	public static void populateSetting() throws IOException{
		ConfigReader reader = new ConfigReader();
		reader.ReadProperty();
	}
	
	private void ReadProperty() throws IOException{
		Properties p = new Properties();
		p.load(getClass().getResourceAsStream("GlobalConfig.properties"));
		Settings.DatabaseURL= p.getProperty("DatabaseURL");
		Settings.DatabaseUsername= p.getProperty("DatabaseUsername");
		Settings.DatabasePassword= p.getProperty("DatabasePassword");
		Settings.DatabaseDriver= p.getProperty("DatabaseDriver");
		Settings.LogFolder= p.getProperty("LogFolder");
		Settings.ExtentReportPath= p.getProperty("ExtentReportPath");
		Settings.ScreenshotFolder= p.getProperty("ScreenshotFolder");
		Settings.ExcelDataSheetPath= p.getProperty("ExcelDataSheetPath");
		Settings.BaseURL= p.getProperty("BaseURL");
		Settings.BrowserType=BrowserType.valueOf(p.getProperty("BrowserType"));
	}

}
