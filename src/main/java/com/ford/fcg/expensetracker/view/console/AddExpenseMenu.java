package com.ford.fcg.expensetracker.view.console;

import com.ford.fcg.expensetracker.action.ExpenseManager;
import com.ford.fcg.expensetracker.domain.Expense;
import com.ford.fcg.expensetracker.view.console.helper.ConsoleHelper;

public class AddExpenseMenu extends BaseMenu {

	
	
	@Override
	public BaseMenu execute(ExpenseManager expenseManager) {
		
		System.out.println("Add Expense");
		System.out.println("------------");
		ConsoleHelper addExpenseConsole = new ConsoleHelper(new String[]{"Title", "Description", "Amount"});
		String[] response = addExpenseConsole.execute();
		Expense expense = new Expense(response[0], response[1], Double.parseDouble(response[2]));
		
		expenseManager.addExpense(expense);
		
		System.out.println("Expense Successfully Added");
		
		return new ExpenseMainMenu();
	}

}
