package com.mn.gof.abstract_factory.website;

import com.mn.gof.abstract_factory.interfaces.ProjectManager;

public class WebsitePM  implements ProjectManager{

	@Override
	public void manageProject() {
		System.out.println("WebsitePM manages the project.");
	}

}
 