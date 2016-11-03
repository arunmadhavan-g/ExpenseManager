package com.ford.fcg.expensetracker.action;

import static org.assertj.core.api.Assertions.assertThat;
import java.text.SimpleDateFormat;
import org.junit.Test;
import com.ford.fcg.expensetracker.domain.Expense;

public class ExpenseManagerSpec {

	private static final String DESCRIPTION = "Purchased Shampoo Bottle from Walmart";
	private static final String TITLE = "Shampoo Bottle";
	private Expense expense = new Expense(TITLE, DESCRIPTION, 15.00);
	private ExpenseManager expenseManager = new ExpenseManager();
	

	@Test
	public void addExpenseAddsTheExpenseToTheExistingArrayOfExpense() throws Exception {
		//Given
		//When
		expenseManager.addExpense(expense);
		//Then
		assertThat(expenseManager.expenseArray()[0]).isEqualTo(expense);
	}
	
	@Test
	public void allExpensesAsString() throws Exception {
		//Given
		expenseManager.addExpense(expense);
		//When
		String returnedValue = expenseManager.getAllExpensesAsString();
		//Then
		String expectedValue = String.format("Title: %s, Amount:%f, Description: %s, Spent On: %s\n",
												expense.title(),
												expense.amount(),
												expense.description(),
												new SimpleDateFormat("dd-MMM-YYYY").format(expense.spentOn()));
		
		assertThat(returnedValue).isEqualTo(expectedValue);
	}
	
}
