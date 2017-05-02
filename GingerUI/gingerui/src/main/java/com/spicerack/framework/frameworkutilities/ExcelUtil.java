/*
 * 
 */
package com.spicerack.framework.frameworkutilities;

import java.io.File;
import java.io.IOException;
import java.util.Hashtable;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

/**
 * The Class ExcelUtil is used to retrieve data from excel File for Data Driven testing
 */
public class ExcelUtil {

	/** The wrksheet. */
	static Sheet wrksheet;
	
	/** The wrkbook. */
	static Workbook wrkbook = null;
	
	/** The dict. */
	@SuppressWarnings("rawtypes")
	static Hashtable dict = new Hashtable();

	/**
	 * Instantiates a new excel util.
	 *
	 * @param ExcelSheetPath
	 *            the excel sheet path
	 * @throws BiffException
	 *             the biff exception
	 * @throws IOException
	 *             Signals that an I/O exception has occurred.
	 */
	// Create a Constructor
	public ExcelUtil(String ExcelSheetPath) throws BiffException, IOException {
		// Initialize
		wrkbook = Workbook.getWorkbook(new File(ExcelSheetPath));

		// For Demo purpose the excel sheet name is hardcoded, but not
		// recommended :)
		wrksheet = wrkbook.getSheet("Sheet1");

		// Colum dictionary to store column names
		ColumnDictionary();

	}

	/**
	 * Returns the Number of Rows.
	 *
	 * @return the int
	 */
	public static int RowCount() {
		return wrksheet.getRows();
	}

	/**
	 *  Returns the Cell value by taking row and Column values as argument.
	 *
	 * @param column
	 *            the column
	 * @param row
	 *            the row
	 * @return the string
	 */
	private static String ReadCell(int column, int row) {
		return wrksheet.getCell(column, row).getContents();
	}
	
	/**
	 * Read cell.
	 *
	 * @param columnName
	 *            the column name
	 * @param rowNumber
	 *            the row number
	 * @return the string
	 */
	public static String ReadCell(String columnName, int rowNumber){
		return ReadCell(GetCell(columnName),rowNumber);
	}

	/**
	 * Column dictionary.
	 */
	// Create Column Dictionary to hold all the Column Names
	@SuppressWarnings("unchecked")
	private static void ColumnDictionary() {
		// Iterate through all the columns in the Excel sheet and store the
		// value in Hashtable
		for (int col = 0; col < wrksheet.getColumns(); col++) {
			dict.put(ReadCell(col, 0), col);
		}
	}

	/**
	 * Read Column Names.
	 *
	 * @param colName
	 *            the col name
	 * @return the int
	 */
	public static int GetCell(String colName) {
		try {
			int value;
			value = ((Integer) dict.get(colName)).intValue();
			return value;
		} catch (NullPointerException e) {
			return (0);

		}
	}

}
