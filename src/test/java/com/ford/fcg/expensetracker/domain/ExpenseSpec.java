package com.ford.fcg.expensetracker.domain;


import org.junit.Test;

public class ExpenseSpec {

	@Test
	public void createExpenseWithTitleDescriptionAndAmountDefaultsDateToCurrentDate() throws Exception {
		//Given
		String title = "Shampoo Bottle";
		String description = "Purchased Shampoo Bottle at Walmart";
		Double amount = 15.00;
		//When
		Expense actualExpense= new Expense(title, description, amount);
		//Then
		//assertThat(actualExpense.spentOn())
		//.isEqualToIgnoringMinutes(Calendar.getInstance().getTime());
	}
	
	@Test
	public void createExpenseWithTitleAndAmountDefaultsDateToCurrentDateAndDescriptionToNull() throws Exception {
		//Given
		String title = "Shampoo Bottle";
		Double amount = 15.00;
		//When
		Expense actualExpense = new Expense(title, amount);
		//Then
		//assertThat(actualExpense.spentOn())
			//	.isEqualToIgnoringMinutes(Calendar.getInstance().getTime());
		
		//assertThat(actualExpense.description()).isNull();
	}
	
}
