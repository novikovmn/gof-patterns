package com.mn.gof.decorator;

public class JavaTeamLeadDecocator extends DeveloperDecorator{

	public JavaTeamLeadDecocator(Developer developer) {
		super(developer);
	}
	
	public String sendWeekReport() {
		return "Send week report to customer.";
	}

	@Override
	public String makeJob() {
		return super.makeJob() + " " + sendWeekReport();
	}
	
	

}
