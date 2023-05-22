package com.mn.gof.abstract_factory.website;

import com.mn.gof.abstract_factory.interfaces.Developer;
import com.mn.gof.abstract_factory.interfaces.ProjectManager;
import com.mn.gof.abstract_factory.interfaces.ProjectTeamFactory;
import com.mn.gof.abstract_factory.interfaces.Tester;

public class WebsiteTeamFactory implements ProjectTeamFactory {

	@Override
	public Developer getDeveloper() {
		return new PhpDeveloper();
	}

	@Override
	public Tester getTester() {
		return new ManualTester();
	}

	@Override
	public ProjectManager getProjectManager() {
		return new WebsitePM();
	}

}
