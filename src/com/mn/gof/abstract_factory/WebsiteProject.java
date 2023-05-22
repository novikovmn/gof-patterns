package com.mn.gof.abstract_factory;

import com.mn.gof.abstract_factory.interfaces.Developer;
import com.mn.gof.abstract_factory.interfaces.ProjectManager;
import com.mn.gof.abstract_factory.interfaces.ProjectTeamFactory;
import com.mn.gof.abstract_factory.interfaces.Tester;
import com.mn.gof.abstract_factory.website.WebsiteTeamFactory;

public class WebsiteProject {

	public static void main(String[] args) {

		ProjectTeamFactory projectTeamFactory = new WebsiteTeamFactory();

		Developer developer = projectTeamFactory.getDeveloper();
		Tester tester = projectTeamFactory.getTester();
		ProjectManager projectManager = projectTeamFactory.getProjectManager();

		developer.writeCode();
		tester.testCode();
		projectManager.manageProject();

	}

}
