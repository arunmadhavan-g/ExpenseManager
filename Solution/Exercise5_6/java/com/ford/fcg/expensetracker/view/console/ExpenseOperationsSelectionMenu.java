package com.ford.fcg.expensetracker.view.console;

import com.ford.fcg.expensetracker.action.ExpenseManager;

public class ExpenseOperationsSelectionMenu extends BaseOfficialMenu{

	private static final String[] INPUTS = new String[]{"Choice"};
	private static final String TITLE = "Enter (A) to add Expense, (V) to View the Expenses, (F) to Find, (D) to Delete or (B) to go back";
	
	public ExpenseOperationsSelectionMenu(boolean isOfficial) {
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
		if(("A").equalsIgnoreCase(response[0])){
			if(isOfficial())
				return new AddOfficialExpenseMenu();
			return new AddPersonalExpenseMenu();
		}
		
		if("V".equalsIgnoreCase(response[0]))
			return new ViewExpensesMenu(isOfficial());
		
		
		if("B".equalsIgnoreCase(response[0]))
			return new OfficialPersonalSelectionMenu();
		
		
		if("F".equalsIgnoreCase(response[0]))
			return new FindExpenseMenu(isOfficial());
		
		
		if("D".equalsIgnoreCase(response[0]))
			return new DeleteExpenseMenu(isOfficial());
		
		
		return new ExpenseOperationsSelectionMenu(isOfficial());
	}
	
}
