package com.ford.fcg.expensetracker.action;

import com.ford.fcg.expensetracker.domain.Expense;

public class ExpenseManager {
	
	PersonalExpenseStore personalExpenseStore = new PersonalExpenseStore();
	OfficialExpenseStore officialExpenseStore = new OfficialExpenseStore();
	
	private BaseExpenseStore getExpenseStore(boolean isOfficial){
		if(isOfficial){
			return officialExpenseStore;
		}
		return personalExpenseStore;
	}

	public void addExpense(boolean isOfficial, Expense expense) {
		getExpenseStore(isOfficial).add(expense);
	}

	public void viewExpenses(boolean isOfficial) {
		getExpenseStore(isOfficial).printAll(System.out);
	}

	public void findExpense(boolean isOfficial, String id) {
		getExpenseStore(isOfficial).find(System.out,id);
	}

	public void delete(boolean isOfficial, String id) {
		getExpenseStore(isOfficial).delete(id);
	}


}

