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
				print(out, expenseArray[i]);
		}
	}

	private void print(PrintStream out, Expense expense) {
		out.println(expense);
	}

	public void find(PrintStream out, String id) {
		for(int i=0;i<10;i++){
			if(expenseArray[i].idEquals(id)){
				print(out, expenseArray[i]);
				break;
			}
				
		}
	}

	public void delete(String id) {
		boolean matched = false;
		for(int i=0;i<10;i++){
			if(!matched)
				matched = expenseArray[i].idEquals(id);
			
			if(matched){
				if(i != 9)
					expenseArray[i] = expenseArray[i+1];
				else
					expenseArray[i] = null;
			}
		}
	}
}
