package com.ford.fcg.expensetracker.view.console;

public abstract  class BaseOfficialMenu extends BaseMenu{

	private boolean isOfficial;

	public BaseOfficialMenu(boolean isOfficial) {
		this.isOfficial = isOfficial;
	}
	
	public boolean isOfficial(){
		return isOfficial;
	}
}
