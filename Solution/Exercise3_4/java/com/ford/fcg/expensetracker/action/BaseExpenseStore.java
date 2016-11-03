package com.ford.fcg.expensetracker.action;

import java.io.PrintStream;

import com.ford.fcg.expensetracker.domain.Expense;

public class BaseExpenseStore {
	private Expense[] expenseArray;
	private int currentPosition;
	
	protected BaseExpenseStore(Expense[] expenseArray) {
		this.expenseArray = expenseArray;
	}
	
	public void add(Expense expense){
		expenseArray[currentPosition] = expense;
		currentPosition++;
	}
	
	public void printAll(PrintStream out){
		for(int i=0;i<10;i++){
			if(expenseArray[i] != null)
				out.println(expenseArray[i].toString());
		}
	}
}
