package com.ford.fcg.expensetracker.view.console;

import com.ford.fcg.expensetracker.action.ExpenseManager;

public class ViewExpensesMenu extends BaseMenu {

	@Override
	public BaseMenu execute(ExpenseManager expenseManager) {
		System.out.println("View Expense");
		System.out.println("------------");
		
		System.out.println(expenseManager.getAllExpensesAsString());
		
		return new ExpenseMainMenu();
	}

}
