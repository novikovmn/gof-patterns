package com.mn.gof.abstract_factory.banking_app;

import com.mn.gof.abstract_factory.interfaces.ProjectManager;

public class BankingPM implements ProjectManager {

	@Override
	public void manageProject() {
		System.out.println("BankingPM manages banking project.");
	}
	
	

}
