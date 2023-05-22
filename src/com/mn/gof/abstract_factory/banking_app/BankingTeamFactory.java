package com.mn.gof.abstract_factory.banking_app;

import com.mn.gof.abstract_factory.interfaces.Developer;
import com.mn.gof.abstract_factory.interfaces.ProjectManager;
import com.mn.gof.abstract_factory.interfaces.ProjectTeamFactory;
import com.mn.gof.abstract_factory.interfaces.Tester;

public class BankingTeamFactory implements ProjectTeamFactory {

	@Override
	public Developer getDeveloper() {
		return new JavaDeveloper();
	}

	@Override
	public Tester getTester() {
		return new QATester();
	}

	@Override
	public ProjectManager getProjectManager() {
		return new BankingPM();
	}

}
