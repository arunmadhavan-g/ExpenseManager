package com.ford.fcg.expensetracker.action;

import com.ford.fcg.expensetracker.domain.Expense;

public class PersonalExpenseStore extends BaseExpenseStore{

	public PersonalExpenseStore() {
		super(new Expense[10]);
	}

	
}
