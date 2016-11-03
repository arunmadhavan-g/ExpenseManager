package com.ford.fcg.expensetracker.domain;

public class OfficialExpense extends Expense{

	private String reason;
	private String department;

	public OfficialExpense(String title, String description, Double amount, String reason, String department) {
		super(title, description, amount);
		this.reason = reason;
		this.department = department;
	}

	@Override
	public String toString() {
		return String.format("%s, reason:%s, department: %s", super.toString(), reason, department);
	}
}
