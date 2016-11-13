package com.ford.fcg.expensetracker.domain;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.UUID;

public class Expense {

	private String id;
	private String title;
	private String description;
	private Double amount;
	private Date spentOn;

	public Expense(String title, String description, Double amount) {
		this(title, description, amount, Calendar.getInstance().getTime());
	}
	
	public Expense(String title, String description, Double amount, Date spentOn) {
		this.title = title;
		this.description = description;
		this.amount = amount;
		this.id = UUID.randomUUID().toString();
		
		if(spentOn != null)
			this.spentOn = spentOn;
		else
			this.spentOn = Calendar.getInstance().getTime();
	}

	public Expense(String title, Double amount) {
		this(title, null, amount);
	}
	
	@Override
	public String toString() {
		SimpleDateFormat formatter = new SimpleDateFormat("dd-MMM-yyyy");
		return String.format("ID: %s, Title: %s, Amount:%f, Description: %s, Spent On: %s",
				id,
				title,
				amount,
				description,
				formatter.format(spentOn));
	}

	public boolean idEquals(String id) {
		return this.id.equals(id);
	}

}
