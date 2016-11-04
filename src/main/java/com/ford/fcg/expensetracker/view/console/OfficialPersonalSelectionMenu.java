package com.ford.fcg.expensetracker.view.console;

import com.ford.fcg.expensetracker.action.ExpenseManager;

public class OfficialPersonalSelectionMenu extends BaseMenu {

	private static final String[] INPUTS = new String[]{"Choice"};
	private static final String TITLE = "Please Enter (O) for official, (P) for personal Expense or (*) to Exit";

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
		if("O".equalsIgnoreCase(response[0]))
			return new ExpenseOperationsSelectionMenu(true);
		
		if("P".equalsIgnoreCase(response[0]))
			return new ExpenseOperationsSelectionMenu(false);
		
		if("*".equals(response[0])){
			System.exit(0);
		}
		
		return new OfficialPersonalSelectionMenu();
	}

}
