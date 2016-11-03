package com.ford.fcg.expensetracker.view.console;

import com.ford.fcg.expensetracker.action.ExpenseManager;
import com.ford.fcg.expensetracker.domain.Expense;
import com.ford.fcg.expensetracker.domain.OfficialExpense;
import com.ford.fcg.expensetracker.view.console.helper.ConsoleHelper;

public class AddOfficialExpenseMenu extends BaseMenu {

	@Override
	public BaseMenu execute(ExpenseManager expenseManager) {
		System.out.println("Add Official Expense");
		System.out.println("----------------------");
		ConsoleHelper addExpenseConsole = new ConsoleHelper(new String[]{"Title", "Description", "Amount","Reason","Authorizing Department"});
		String[] response = addExpenseConsole.execute();
		Expense expense = new OfficialExpense(response[0], response[1], Double.parseDouble(response[2]), response[3], response[4]);
		
		expenseManager.addExpense(true, expense);
		
		System.out.println("Expense Successfully Added");
		
		return new ExpenseMainMenu(true);
	}

}
