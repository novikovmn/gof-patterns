package com.mn.gof.factory;

public class CppDeveloperFactory implements DeveloperFactory{

	@Override
	public Developer createDeveloper() {
		return new CppDeveloper();
	}

	
}
