package com.mn.gof.factory;

public class Demo {
	public static void main(String[] args) {

		DeveloperFactory developerFactory = createDeveloperFactory("java");
		Developer developer = developerFactory.createDeveloper();
		developer.writeCode();
		

	}
	
	static DeveloperFactory createDeveloperFactory(String language) {
		if (language.equalsIgnoreCase("java")) {
			return new JavaDeveloperFactory();
		}else if (language.equalsIgnoreCase("cpp")) {
			return new CppDeveloperFactory();
		}else {
			throw new RuntimeException(language + " is unknown");
		}
	}

}
