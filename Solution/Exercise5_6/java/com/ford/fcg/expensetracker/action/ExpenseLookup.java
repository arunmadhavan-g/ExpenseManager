package com.ford.fcg.expensetracker.action;

public class ExpenseLookup {

	private static final String[] EXPENSE_TYPES= {"Food/Beverage", 
												"Transport",
												"Gifts",
												"Computer/Equipments", 
												"Others"};
	
	public static String expenseTypeValue(int index){
		return EXPENSE_TYPES[index];
	}

	public static String menuDisplayValue() {
		StringBuilder builder= new StringBuilder("Reason Code \n");
		int index = 0;
		for(String expenseType: EXPENSE_TYPES){
			builder.append(index++)
					.append(" - ")
					.append(expenseType)
					.append(", ");
		}
		return builder.toString();
	}
	
}
