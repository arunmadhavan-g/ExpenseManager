package com.ford.fcg.expensetracker.view.console;

import com.ford.fcg.expensetracker.action.ExpenseManager;
import com.ford.fcg.expensetracker.view.console.helper.ConsoleHelper;

public class ExpenseMainMenu extends BaseMenu{

	private boolean isOfficial;
	
	public ExpenseMainMenu(boolean isOfficial) {
		this.isOfficial = isOfficial;
	}
	
	public ExpenseMainMenu() {
		this(false);
	}
	
	public BaseMenu execute(ExpenseManager expenseManager) {
		System.out.println("Enter (A) to add Expense, (V) to View the Expenses or (B) to go back");
		ConsoleHelper mainMenuConsole = new ConsoleHelper(new String[]{"Choice"});
		String[] response = mainMenuConsole.execute();
		
		if(("A").equalsIgnoreCase(response[0])){
			if(isOfficial)
				return new AddOfficialExpenseMenu();
			return new AddPersonalExpenseMenu();
			
		}
		
		if("V".equalsIgnoreCase(response[0])){
			return new ViewExpensesMenu(isOfficial);
		}
		
		if("B".equalsIgnoreCase(response[0])){
			return new OfficialPersonalSelectionMenu();
		}
		
		return new ExpenseMainMenu(isOfficial);
	}
	
}
