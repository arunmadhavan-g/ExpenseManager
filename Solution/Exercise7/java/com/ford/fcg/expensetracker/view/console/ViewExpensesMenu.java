package com.ford.fcg.expensetracker.view.console;

import com.ford.fcg.expensetracker.action.ExpenseManager;

public class ViewExpensesMenu extends BaseOfficialMenu {

	private static final String TITLE = "View Expense";
	public ViewExpensesMenu(boolean isOfficial) {
		super(isOfficial);
	}

	@Override
	protected String title() {
		return TITLE;
	}

	@Override
	protected String[] inputs() {
		return null;
	}

	@Override
	protected String footer() {
		return null;
	}

	@Override
	protected BaseMenu execute(String[] response, ExpenseManager expenseManager) {
		expenseManager.viewExpenses(isOfficial());
		return new ExpenseOperationsSelectionMenu(isOfficial());
	}

}
