package com.mn.gof.factory;

public class JavaDeveloperFactory implements DeveloperFactory{

	@Override
	public Developer createDeveloper() {
		return new JavaDeveloper();
	}

	
}
