package com.ford.fcg.expensetracker.view.console;

import com.ford.fcg.expensetracker.action.ExpenseManager;
import com.ford.fcg.expensetracker.view.console.helper.ConsoleHelper;

public class ExpenseMainMenu extends BaseMenu{

	public BaseMenu execute(ExpenseManager expenseManager) {
		System.out.println("Welcome to Expense Manager");
		System.out.println("--------------------------");
		System.out.println("Enter (A) to add Expense or (V) to View the Expenses, (*) to Exit");
		ConsoleHelper mainMenuConsole = new ConsoleHelper(new String[]{"Choice"});
		String[] response = mainMenuConsole.execute();
		
		if(("A").equalsIgnoreCase(response[0])){
			return new AddExpenseMenu(); 
		}
		
		if("V".equalsIgnoreCase(response[0])){
			return new ViewExpensesMenu();
		}
		
		if("*".equals(response[0])){
			System.exit(0);
		}
		
		return new ExpenseMainMenu();
	}
	
}
