package com.ford.fcg.expensetracker.view.console;

import java.util.HashMap;
import java.util.Map;

import com.ford.fcg.expensetracker.action.ExpenseManager;

public class ExpenseOperationsSelectionMenu extends BaseMenu{

	private static final String[] INPUTS = new String[]{"Choice"};
	private static final String TITLE = "Enter (A) to add Expense, (V) to View the Expenses, (F) to Find, (D) to Delete or (B) to go back";
	private static final Map<String, BaseMenu> MENU_FACTORY = new HashMap<>();

	static{
		MENU_FACTORY.put("V", new ViewExpensesMenu());
		MENU_FACTORY.put("B", new OfficialPersonalSelectionMenu());
		MENU_FACTORY.put("F", new FindExpenseMenu());
		MENU_FACTORY.put("D", new DeleteExpenseMenu());
	}
	
	
	private BaseMenu menuToReturn(String option, boolean isOfficial){
		BaseMenu menu;
		
		if("A".equalsIgnoreCase(option)){
			if(isOfficial)
				return new AddOfficialExpenseMenu();
			return new AddPersonalExpenseMenu();
		}
		
		menu = MENU_FACTORY.get(option.toUpperCase());
		if(menu != null)
			return menu;

		return new ExpenseOperationsSelectionMenu();
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
		return menuToReturn(response[0], expenseManager.isOfficial());
	}
	
}
