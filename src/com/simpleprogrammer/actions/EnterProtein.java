package com.simpleprogrammer.actions;

import com.opensymphony.xwork2.Action;

public class EnterProtein implements Action {
	
	private int enteredProtein;
    
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

}
