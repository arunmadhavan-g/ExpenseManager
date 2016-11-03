package com.ford.fcg.expensetracker.domain;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Expense {

	private String title;
	private String description;
	private Double amount;
	private Date spentOn;

	public Expense(String title, String description, Double amount) {
		this.title = title;
		this.description = description;
		this.amount = amount;
		this.spentOn = Calendar.getInstance().getTime();
	}

	public Expense(String title, Double amount) {
		this(title, null, amount);
	}

	public Date spentOn() {
		return spentOn;
	}

	public String description() {
		return description;
	}

	public String title() {
		return title;
	}

	public Double amount() {
		return amount;
	}
	
	@Override
	public String toString() {
		SimpleDateFormat formatter = new SimpleDateFormat("dd-MMM-YYYY");
		return String.format("Title: %s, Amount:%f, Description: %s, Spent On: %s",
				title,
				amount,
				description,
				formatter.format(spentOn));
	}

}
