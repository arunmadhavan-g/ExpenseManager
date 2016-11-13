package com.ford.fcg.expensetracker.view.console;

import com.ford.fcg.expensetracker.action.ExpenseManager;

public class FindExpenseMenu extends BaseMenu {

	private static final String[] INPUTS = new String[]{"Expense Id"};
	private static final String TITLE = "Enter the Expense ID to search";
	
	@Override
	protected String title() {
		return TITLE;
	}

	@Override
	protected String[] inputs() {
		return INPUTS;
	}

	@Override
	protected String footer() {
		return null;
	}

	@Override
	protected BaseMenu execute(String[] response, ExpenseManager expenseManager) {
		expenseManager.findExpense(response[0]);
		return new ExpenseOperationsSelectionMenu();
	}

}
