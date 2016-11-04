package com.ford.fcg.expensetracker.domain;

import org.junit.Test;

public class OfficialExpenseSpec {

	@Test
	public void createOfficialExpenseWithReasonAndAuthorizingDepartment() throws Exception {
		//Given
		String title = "Shampoo Bottle";
		String description = "Purchased Shampoo Bottle at Walmart";
		Double amount = 15.00;
		String reason= "Official Trip";
		String department = "JCOE";
		//When
		OfficialExpense officialExpense = new OfficialExpense(title, description, amount, reason, department ) ;
		//Then
	//	assertThat(officialExpense.spentOn()).isEqualToIgnoringMinutes(Calendar.getInstance().getTime());
	}
	
}
