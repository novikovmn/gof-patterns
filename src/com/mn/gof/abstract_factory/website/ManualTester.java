package com.mn.gof.abstract_factory.website;

import com.mn.gof.abstract_factory.interfaces.Tester;

public class ManualTester implements Tester{

	@Override
	public void testCode() {
		System.out.println("Manual tester tests website.");
	}



}
