package com.ford.fcg.expensetracker.action;

import com.ford.fcg.expensetracker.domain.Expense;

public class ExpenseManager {

	private Expense[] expenseArray = new Expense[10];
	private int currentIndex = 0;
	
	public Expense[] expenseArray() {
		return expenseArray;
	}

	public void addExpense(Expense expense) {
		expenseArray[currentIndex] = expense;
		currentIndex++;
	}

	public String getAllExpensesAsString() {
		StringBuilder builder = new StringBuilder();
		for(int i=0;i<10;i++){
			if(expenseArray[i] != null)
				builder.append(expenseArray[i]).append("\n");
		}
		return builder.toString();
	}

}
