package com.mn.gof.decorator;

public class SeniorJavaDeveloperDecorator extends DeveloperDecorator{
	
	public SeniorJavaDeveloperDecorator(Developer developer) {
		super(developer);
	}
	
	public String makeCodeReview() {
		return "Make code review.";
	}

	@Override
	public String makeJob() {
		return super.makeJob() + " " +  makeCodeReview();
	}
	
	


}
