package com.mn.gof.abstract_factory;

import com.mn.gof.abstract_factory.banking_app.BankingTeamFactory;
import com.mn.gof.abstract_factory.interfaces.Developer;
import com.mn.gof.abstract_factory.interfaces.ProjectManager;
import com.mn.gof.abstract_factory.interfaces.ProjectTeamFactory;
import com.mn.gof.abstract_factory.interfaces.Tester;

public class BankAppProject {

	public static void main(String[] args) {

		ProjectTeamFactory projectTeamFactory = new BankingTeamFactory();
		
		Developer developer = projectTeamFactory.getDeveloper();
		Tester tester = projectTeamFactory.getTester();
		ProjectManager projectManager = projectTeamFactory.getProjectManager();
		
		developer.writeCode();
		tester.testCode();
		projectManager.manageProject();
		

	}

}
 