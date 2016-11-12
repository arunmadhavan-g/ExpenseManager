package com.ford.fcg.expensetracker.action;

import com.ford.fcg.expensetracker.domain.OfficialExpense;

public class OfficialExpenseStore extends BaseExpenseStore{

	public OfficialExpenseStore() {
		super(new OfficialExpense[10]);
	}

}
