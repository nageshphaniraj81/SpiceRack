package com.spicerack.framework.configuration;

import com.spicerack.framework.frameworkutilities.LogUtil;
import com.spicerack.framework.initialization.BrowserType;

public class Settings {
	
	// For database connectivity
	public static String DatabaseURL;
	public static String DatabaseUsername;
	public static String DatabasePassword;
	public static String DatabaseDriver;
	// For logging the teest
	public static String LogFolder;
	//For Extent report
	public static String ExtentReportPath;
	// Screenshot for reporting
	public static String ScreenshotFolder;
	//For data driven testing
	public static String ExcelDataSheetPath;
	// URL for AUT
	public static String BaseURL;
    // Browser
	public static BrowserType Browser;
	// Log Utility
	public static LogUtil Logs;
	

}
