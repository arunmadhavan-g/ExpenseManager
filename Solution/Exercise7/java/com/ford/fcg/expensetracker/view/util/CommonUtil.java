package com.ford.fcg.expensetracker.view.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class CommonUtil {

	public static Date convertToDate(String dateValue) throws ParseException {
		if(dateValue.equals("")){
			return Calendar.getInstance().getTime();
		}
		SimpleDateFormat formatter = new SimpleDateFormat("dd-MMM-yyyy");
		return formatter.parse(dateValue);
	}

	
	
}
