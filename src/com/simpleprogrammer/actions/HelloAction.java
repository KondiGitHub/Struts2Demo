package com.simpleprogrammer.actions;

import com.opensymphony.xwork2.Action;

public class HelloAction implements Action {
	
	private String greeting;

	@Override
	@org.apache.struts2.convention.annotation.Action("hi")
	public String execute() throws Exception {
		
		setGreeting("Hello Struts 2!!!!!!");
		
		return "do-more";
	}
	
	@org.apache.struts2.convention.annotation.Action("hi-do-more")
	public String doMore() throws Exception {
		
		setGreeting("Hello Struts ####!!!!!!");
		
		return "hello";
	}
	
	public String getGreeting() {
		return greeting;
	}

	public void setGreeting(String greeting) {
		this.greeting = greeting;
	}

}
