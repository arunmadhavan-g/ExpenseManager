package com.ford.fcg.expensetracker.view.console;

import java.text.ParseException;

import com.ford.fcg.expensetracker.action.ExpenseManager;
import com.ford.fcg.expensetracker.domain.Expense;
import com.ford.fcg.expensetracker.view.util.CommonUtil;

public class AddPersonalExpenseMenu extends BaseMenu {
	
	private static final String[] INPUTS = new String[]{"Title", "Description", "Amount","Spent On(dd-MMM-YYYY)"};
	private static final String TITLE = "Add Personal Expense";

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
	protected BaseMenu execute(String[] response, ExpenseManager expenseManager){
		Expense expense;
		try {
			expense = new Expense(response[0], response[1], Double.parseDouble(response[2]), CommonUtil.convertToDate(response[3]));
			expenseManager.addExpense(expense);
		}  catch (NumberFormatException e) {
			System.out.println("The Amount is not properly entered, Please correct the same");
		} catch (ParseException e) {
			System.out.println("The Date entered does not follow the dd-MMM-yyyy format. Please correct the same");
		}
		return new ExpenseOperationsSelectionMenu();
	}

}
