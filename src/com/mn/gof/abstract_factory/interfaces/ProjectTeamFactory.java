package com.mn.gof.abstract_factory.interfaces;

public interface ProjectTeamFactory {
	
	Developer getDeveloper();
	Tester getTester();
	ProjectManager getProjectManager();

}
