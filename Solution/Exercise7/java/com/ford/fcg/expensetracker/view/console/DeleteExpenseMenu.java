package com.ford.fcg.expensetracker.view.console;

import com.ford.fcg.expensetracker.action.ExpenseManager;

public class DeleteExpenseMenu extends BaseOfficialMenu {

	private static final String[] INPUTS = new String[]{"Expense ID"};
	private static final String TITLE = "Enter the Expense ID to delete";
	
	public DeleteExpenseMenu(boolean isOfficial) {
		super(isOfficial);
	}
	
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
		expenseManager.delete(isOfficial(), response[0]);
		return new ExpenseOperationsSelectionMenu(isOfficial());
	}

}
