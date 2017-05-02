/*
 * 
 */
package com.spicerack.framework.frameworkutilities;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

import com.spicerack.framework.configuration.ConfigReader;
import com.spicerack.framework.configuration.Settings;

/**
 * The Class LogUtil used to generate userdefined logs 
 */
public class LogUtil {

	/** The date. */
	// File format for the log file
	ZonedDateTime date = ZonedDateTime.now();
	
	/** The formatter. */
	DateTimeFormatter formatter = DateTimeFormatter.ofPattern("ddMMyyyyHHMMSS");
	
	/** The file name format. */
	String fileNameFormat = date.format(formatter);
    
    /** The buffered writter. */
    private BufferedWriter bufferedWritter = null;
    
    /**
	 * Instantiates a new log util.
	 *
	 * @throws IOException
	 *             Signals that an I/O exception has occurred.
	 */
    public LogUtil() throws IOException{
    	
    	// Initializing configuration Settings
		ConfigReader.populateSetting();
    }

	/**
	 * Creates the log file in the location specified in
	 *  Global Configuration properties file.
	 */
	private void CreateLogFile() {
		try {
			File dir = new File(Settings.LogFolder);
			if (!dir.exists())
				dir.mkdir();
			File logFile = new File(dir + "/" +fileNameFormat+".log");
			FileWriter fileWriter = new FileWriter(logFile.getAbsolutePath());
			bufferedWritter = new BufferedWriter(fileWriter);
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}

	/**
	 * To write the log message in the log.
	 *
	 * @param message
	 *            the message
	 */
	public void Write(String message) {
		 CreateLogFile();
		try {
			formatter = DateTimeFormatter.ofPattern("dd-MM-yy:HH_MM_SS");
			String dateFormat = date.format(formatter);
			bufferedWritter.write(" ["+dateFormat+"] "+message);
			bufferedWritter.newLine();
			bufferedWritter.flush();
		} catch (Exception e) {
			System.out.println(e.toString());
		}

	}

}
