package com.ford.fcg.expensetracker.action;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

import com.ford.fcg.expensetracker.domain.Expense;

public class ExpenseStore<T extends Expense>{
	
	private List<T> expenseList;
	
	protected ExpenseStore() {
		this.expenseList = new ArrayList<T>();
	}
	
	public void add(T expense){
		expenseList.add(expense);
	}
	
	public void printAll(PrintStream out){
		for(Expense expense: expenseList)
			out.println(expense);
	}

	public void find(PrintStream out, String id) {
		for(T expense: expenseList){
			if(expense.idEquals(id)){
				out.println(expense);
				break;
			}
		}
	}

	public void delete(String id) {
		for(T expense: expenseList){
			if(expense.idEquals(id))
				expenseList.remove(expense);
		}
	}
}
