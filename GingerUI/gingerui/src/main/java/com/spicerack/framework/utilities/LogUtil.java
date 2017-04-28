package com.spicerack.framework.utilities;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

import com.spicerack.framework.config.ConfigReader;
import com.spicerack.framework.config.Settings;

public class LogUtil {

	// File format for the log file
	ZonedDateTime date = ZonedDateTime.now();
	DateTimeFormatter formatter = DateTimeFormatter.ofPattern("ddMMyyyyHHMMSS");
	String fileNameFormat = date.format(formatter);
    private BufferedWriter bufferedWritter = null;
    
    public LogUtil() throws IOException{
    	
    	// Initializing configuration Settings
		ConfigReader.populateSetting();
    }

	// Create a log file
	public void CreateLogFile() {
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

	// Write message within the log
	public void Write(String message) {
		try {
			bufferedWritter.write(message);
			bufferedWritter.close();
		} catch (Exception e) {
			System.out.println(e.toString());
		}

	}

}
