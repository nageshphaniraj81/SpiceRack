package com.spicerack.framework.utilities;

import java.util.Dictionary;
import java.util.Hashtable;
import java.util.List;

import cucumber.api.DataTable;

public class CucumberUtil {
	
	private static Dictionary<String,DataCollection> _dataCollection = new Hashtable<String,DataCollection>();
	
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
	
	// Todo : Passing the rowIndex to get the columnValue based on Row Number
	public static String GetCellValue(String columnName)
	{
		return _dataCollection.get(columnName).ColumnValue;
	}
	
	private static class DataCollection
	{
		private String ColumnName;
		private String ColumnValue;
		private int RowNumbers;
		/**
		 * @param columnName
		 * @param columnValue
		 * @param rowNumbers
		 */
		public DataCollection(String columnName, String columnValue, int rowNumbers) {
			ColumnName = columnName;
			ColumnValue = columnValue;
			RowNumbers = rowNumbers;
		}
		
		
	}
   
}

