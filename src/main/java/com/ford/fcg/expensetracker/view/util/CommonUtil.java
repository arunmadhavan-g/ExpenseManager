package com.ford.fcg.expensetracker.view.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CommonUtil {

	public static Date convertToDate(String dateValue) {
		SimpleDateFormat formatter = new SimpleDateFormat("dd-MMM-yyyy");
		try {
			return formatter.parse(dateValue);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return null;
	}

	
	
}
