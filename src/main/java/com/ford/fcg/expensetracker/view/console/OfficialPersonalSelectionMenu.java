package com.ford.fcg.expensetracker.view.console;

import com.ford.fcg.expensetracker.action.ExpenseManager;
import com.ford.fcg.expensetracker.view.console.helper.ConsoleHelper;

public class OfficialPersonalSelectionMenu extends BaseMenu {

	@Override
	public BaseMenu execute(ExpenseManager expenseManager) {
		System.out.println("Welcome to Expense App");
		System.out.println("-------------------------");
		System.out.println("Please Enter (O) for official, (P) for personal Expense or (*) to Exit");
		
		ConsoleHelper helper = new ConsoleHelper(new String[]{"Choice"});
		String[] response = helper.execute();
		
		if("O".equalsIgnoreCase(response[0]))
			return new ExpenseMainMenu(true);
		
		if("P".equalsIgnoreCase(response[0]))
			return new ExpenseMainMenu();
		
		if("*".equals(response[0])){
			System.exit(0);
		}
		
		return new OfficialPersonalSelectionMenu();
	}

}
