package com.simpleprogrammer.actions;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;

public class EnterProtein extends ActionSupport {
	
	private int enteredProtein;
	private int test;
    
	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		ProteinTrackingService proteinTrackingService = new ProteinTrackingService();
		proteinTrackingService.addProtein(enteredProtein);
		return SUCCESS;
	}
	
	public int getEnteredProtein() {
		return enteredProtein;
	}

	public void setEnteredProtein(int enteredProtein) {
		this.enteredProtein = enteredProtein;
	}
	
	public String getGoalText() {
		return getText("goal.text");
	}

}
