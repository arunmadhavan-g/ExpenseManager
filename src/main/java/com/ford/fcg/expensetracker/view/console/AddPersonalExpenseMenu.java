package com.ford.fcg.expensetracker.view.console;

import com.ford.fcg.expensetracker.action.ExpenseManager;
import com.ford.fcg.expensetracker.domain.Expense;

public class AddPersonalExpenseMenu extends BaseMenu {
	
	private static final String[] INPUTS = new String[]{"Title", "Description", "Amount"};
	private static final String TITLE = "Add Personal Expense";

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
		Expense expense = new Expense(response[0], response[1], Double.parseDouble(response[2]));
		expenseManager.addExpense(false, expense);
		return new ExpenseOperationsSelectionMenu(false);
	}

}
