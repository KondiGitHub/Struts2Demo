package com.simpleprogrammer.actions;

import com.opensymphony.xwork2.Action;

public class EnterProtein implements Action {
	
	private String enteredProtein;
    
	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		return SUCCESS;
	}
	
	public String getEnteredProtein() {
		return enteredProtein;
	}

	public void setEnteredProtein(String enteredProtein) {
		this.enteredProtein = enteredProtein;
	}

}
