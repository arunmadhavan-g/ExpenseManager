package com.ford.fcg.expensetracker.action;

import com.ford.fcg.expensetracker.domain.Expense;
import com.ford.fcg.expensetracker.domain.OfficialExpense;

public class ExpenseManager {
	
	private ExpenseStore<Expense> personalExpenseStore = new ExpenseStore<Expense>();
	private ExpenseStore<OfficialExpense> officialExpenseStore = new ExpenseStore<OfficialExpense>();
	
	private boolean isOfficial;
	
	public void officialExpense(){
		isOfficial = true;
	}
	
	public void personalExpense(){
		isOfficial = false;
	}
	
	private ExpenseStore getExpenseStore(){
		if(isOfficial){
			return officialExpenseStore;
		}
		return personalExpenseStore;
	}

	public void addExpense(Expense expense) {
		getExpenseStore().add(expense);
	}

	public void viewExpenses() {
		getExpenseStore().printAll(System.out);
	}

	public void findExpense(String id) {
		getExpenseStore().find(System.out,id);
	}

	public void delete(String id) {
		getExpenseStore().delete(id);
	}

	public boolean isOfficial() {
		return isOfficial;
	}


}

