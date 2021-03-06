/*
 * 
 */
package com.spicerack.framework.frameworkutilities;

import java.util.Dictionary;
import java.util.Hashtable;
import java.util.List;

import cucumber.api.DataTable;

// TODO: Auto-generated Javadoc
/**
 * The Class CucumberUtil.This is a utility class used to generate BDD tests using cucumber tool
 * It has various methods that helps in converting feature files to usable step definition files
 * To retrieve data from data table in feature files and convert the data table into dictionary 
 * collection and retrieve data based on column names
 */
public class CucumberUtil {
	
	/** The data collection private variable. */
	private static Dictionary<String,DataCollection> _dataCollection = new Hashtable<String,DataCollection>();
	
	/**
	 * This method convert data table in the feature file to dict.
	 *
	 * @param table
	 *            the table
	 * @return the dictionary
	 */
	public static Dictionary<String,DataCollection> ConvertDataTableToDict (DataTable table)
	{
		List<List <String>> data  =  table.raw();
		int rowNumber = 0;
		
		for(List<String> col : data){
			for(int colIndex = 0; colIndex < col.size();colIndex++){
				_dataCollection.put(data.get(0).get(colIndex), new DataCollection(data.get(0).get(colIndex),col.get(colIndex),rowNumber));
			}
			rowNumber++;
		}
		
		return _dataCollection;
	}
	
	/**
	 * Gets the cell value based on column  name.
	 *
	 * @param columnName
	 *            the column name
	 * @return the string
	 */
	// Todo : Passing the rowIndex to get the columnValue based on Row Number
	public static String GetCellValue(String columnName)
	{
		return _dataCollection.get(columnName).ColumnValue;
	}
	
	/**
	 * The Class DataCollection.
	 */
	private static class DataCollection
	{
		
		/** The Column name. */
		@SuppressWarnings("unused")
		private String ColumnName;
		
		/** The Column value. */
		private String ColumnValue;
		
		/** The Row numbers. */
		@SuppressWarnings("unused")
		private int RowNumbers;
		
		/**
		 * Instantiates a new data collection.
		 *
		 * @param columnName
		 *            the column name
		 * @param columnValue
		 *            the column value
		 * @param rowNumbers
		 *            the row numbers
		 */
		public DataCollection(String columnName, String columnValue, int rowNumbers) {
			ColumnName = columnName;
			ColumnValue = columnValue;
			RowNumbers = rowNumbers;
		}
		
		
	}
   
}

