package com.mn.gof.abstract_factory.website;

import com.mn.gof.abstract_factory.interfaces.Developer;

public class PhpDeveloper implements Developer {

	@Override
	public void writeCode() {
		System.out.println("Php developer writes Php code.");

	}

}
