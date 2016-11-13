package com.ford.fcg.expensetracker.action;

import java.io.PrintStream;

import com.ford.fcg.expensetracker.domain.Expense;

public class BaseExpenseStore {
	private static final int MAX_EXPENSES =  10;
	
	private Expense[] expenseArray;
	private int currentPosition;
	
	protected BaseExpenseStore(Expense[] expenseArray) {
		this.expenseArray = expenseArray;
		currentPosition = -1;
	}
	
	public void add(Expense expense){
		if(currentPosition < MAX_EXPENSES){
			currentPosition++;
			expenseArray[currentPosition] = expense;
		}
	}
	
	public void printAll(PrintStream out){
		for(int i=0;i<=currentPosition;i++){
			if(expenseArray[i] != null)
				print(out, expenseArray[i]);
		}
	}

	private void print(PrintStream out, Expense expense) {
		out.println(expense);
	}

	public void find(PrintStream out, String id) {
		for(int i=0;i<=currentPosition;i++){
			if(expenseArray[i].idEquals(id)){
				print(out, expenseArray[i]);
				break;
			}
		}
	}

	public void delete(String id) {
		boolean matched = false;
		for(int i=0;i<=currentPosition;i++){
			if(!matched)
				matched = expenseArray[i].idEquals(id);
			
			if(matched && i != currentPosition)
				expenseArray[i] = expenseArray[i+1];
		}
		if(matched){
			expenseArray[currentPosition] = null;
			currentPosition--;
		}
	}
}
