package com.ford.fcg.expensetracker.view.console;

import com.ford.fcg.expensetracker.action.ExpenseManager;

public class ViewExpensesMenu extends BaseMenu {

	private boolean isOfficial;

	public ViewExpensesMenu(boolean isOfficial) {
		this.isOfficial = isOfficial;
	}

	@Override
	public BaseMenu execute(ExpenseManager expenseManager) {
		System.out.println("View Expense");
		System.out.println("------------");
		
		expenseManager.viewExpenses(isOfficial);
		
		return new ExpenseMainMenu();
	}

}
