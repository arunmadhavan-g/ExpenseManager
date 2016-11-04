package com.ford.fcg.expensetracker.view.console;

import com.ford.fcg.expensetracker.action.ExpenseManager;
import com.ford.fcg.expensetracker.domain.Expense;
import com.ford.fcg.expensetracker.domain.OfficialExpense;


public class AddOfficialExpenseMenu extends BaseMenu {

	private static final String TITLE = "Add Official Expense";
	private static final String[] INPUTS = new String[]{"Title", "Description", "Amount","Reason","Authorizing Department"};

	@Override
	public String title() {
		return TITLE;
	}

	@Override
	public String[] inputs() {
		return INPUTS;
	}

	@Override
	public String footer() {
		return "Official Expense Added Successfully";
	}

	@Override
	public BaseMenu execute(String[] response, ExpenseManager expenseManager) {
		Expense expense = new OfficialExpense(response[0], response[1], Double.parseDouble(response[2]), response[3], response[4]);
		expenseManager.addExpense(true, expense);
		return new ExpenseOperationsSelectionMenu(true);
	}

}
