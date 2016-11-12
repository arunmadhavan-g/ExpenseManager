package com.ford.fcg.expensetracker.view.console.helper;

public class ConsoleHelper {

	private String[] inputs;
	
	public ConsoleHelper(String[] inputs) {
		this.inputs = inputs;
	}
	
	public String[] execute(){
		if(inputs != null){
			String[] responses  = new String[inputs.length];
			for(int i=0;i<inputs.length;i++){
				System.out.print(String.format("Enter %s:", inputs[i]));
				responses[i] = System.console().readLine();
			}
			return responses;
		}
		
		return new String[]{};
	} 
	
}
