/*
 * 
 */
package com.spicerack.framework.configuration;

import com.spicerack.framework.frameworkutilities.LogUtil;
import com.spicerack.framework.initialization.BrowserType;

/**
 * The Class Settings. This class is used to declare static varible that will
 * hold the values of Global config properties file
 */
public class Settings {

	/** The Database URL. For database connectivity */
	public static String DatabaseURL;

	/** The Database username. */
	public static String DatabaseUsername;

	/** The Database password. */
	public static String DatabasePassword;

	/** The Database driver. */
	public static String DatabaseDriver;

	/** The Log folder. */
	public static String LogFolder;

	/** The Extent report path. */
	public static String ExtentReportPath;

	/** The Screenshot folder. */
	public static String ScreenshotFolder;

	/** The Excel data sheet path. */
	public static String ExcelDataSheetPath;

	/** The Base URL for Application under test. */
	public static String BaseURL;

	/** The Browser. */
	public static BrowserType Browser;

	/** The Logs location. */
	public static LogUtil Logs;

}
