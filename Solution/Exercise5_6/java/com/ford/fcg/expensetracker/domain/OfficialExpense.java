package com.ford.fcg.expensetracker.domain;

import java.util.Date;

import com.ford.fcg.expensetracker.action.ExpenseLookup;

public class OfficialExpense extends Expense{

	private String reason;
	private String department;

	public OfficialExpense(String title, String description, Double amount, int reasonIndex, String department, Date spentOn) {
		super(title, description, amount, spentOn);
		this.reason = ExpenseLookup.expenseTypeValue(reasonIndex);
		this.department = department;
	}

	@Override
	public String toString() {
		return String.format("%s, reason:%s, department: %s", super.toString(), reason, department);
	}
}
