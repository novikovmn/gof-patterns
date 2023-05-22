package com.mn.gof.decorator;

public class Demo {

	public static void main(String[] args) {
		
		Developer developer = 
				new JavaTeamLeadDecocator(new SeniorJavaDeveloperDecorator(new JavaDeveloper()));
;
		System.out.println(developer.makeJob());
		

	}

}
