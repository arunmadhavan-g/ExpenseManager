package com.ford.fcg.expensetracker.view.console;

import com.ford.fcg.expensetracker.action.ExpenseManager;

public class InfiniteExecute {

	public static void main(String[] args) {
		ExpenseManager expenseManager = new ExpenseManager();
		BaseMenu menu = new ExpenseMainMenu();
		
		while(true){
			menu = menu.execute(expenseManager);
		}
	}
}
