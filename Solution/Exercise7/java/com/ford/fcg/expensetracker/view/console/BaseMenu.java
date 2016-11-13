package com.ford.fcg.expensetracker.view.console;

import java.text.ParseException;

import com.ford.fcg.expensetracker.action.ExpenseManager;
import com.ford.fcg.expensetracker.view.console.helper.ConsoleHelper;

public abstract class BaseMenu {

	protected abstract String title();
	protected abstract String[] inputs();
	protected abstract String footer();
	protected abstract BaseMenu execute(String[] response, ExpenseManager expenseManager) throws NumberFormatException, ParseException;
	
	public BaseMenu render(ExpenseManager expenseManager){
		System.out.println(title());
		ConsoleHelper addExpenseConsole = new ConsoleHelper(inputs());
		String[] response = addExpenseConsole.execute();
		BaseMenu returnMenu = this;
		try {
			returnMenu = execute(response, expenseManager);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(blankIfNull(footer()));
		return returnMenu;
	}

	private static String blankIfNull(String value) {
		if(value == null)
			return "";
		return value;
	}
}
