/**
 * 
 */
package com.spicerack.testcases;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.BeforeTest;
import com.spicerack.framework.base.DriverContext;
import com.spicerack.framework.base.InitilizeFramework;
import com.spicerack.framework.config.ConfigReader;
import com.spicerack.framework.config.Settings;
import com.spicerack.framework.utilities.ExcelUtil;
import com.spicerack.framework.utilities.LogUtil;
import com.spicerack.framework.utilities.ReportingUtil;

import jxl.read.biff.BiffException;

/**
 * @author Nagesh Phaniraj
 *
 */
public class InitializeTestCase extends InitilizeFramework {
	
	// URL of the page to be navigated
    static final Logger logger = LogManager.getLogger(SampleShoppingTest.class);
    public static ReportingUtil report;
	
	@BeforeTest
	public void initialize() throws IOException {
		
		// Initializing configuration Settings
		ConfigReader.populateSetting();

		// Logging code using logUtil (Framework) & Log4j
		Settings.Logs = new LogUtil();
		Settings.Logs.CreateLogFile();
		Settings.Logs.Write("Framework Initilize");
		
		//Log4j Logger
		logger.trace("Entering initialization.");
		
		// Browser Initialization 
		InitalizeBrowser(Settings.Browser);
		DriverContext.Browser.goToURL(Settings.BaseURL);
	    DriverContext.Browser.goToURL(Settings.BaseURL);

	    // Initialize reporting
	    report = new ReportingUtil("Sample Shopping Test Optimized");
	    report.logInfo("Browser Started");
	    
		// Data driven testing
	    try {
			@SuppressWarnings("unused")
			ExcelUtil util = new ExcelUtil(Settings.ExcelDataSheetPath);
		} catch (BiffException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    
	    // Logging code using  Log4j
	    logger.trace("Exiting initialization.");
	    
	    // Extent Report logging
	    report.logInfo("Initialization Complete");
	    
	    // Log utils log
	    Settings.Logs.Write("Framework Initilization complete");
	    
	} 

}