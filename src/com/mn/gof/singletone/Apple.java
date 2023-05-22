package com.mn.gof.singletone;

public class Apple {
	
	private static Apple instance;
	
	private Apple() {}
	
	public static Apple getInstance() {	
		if(instance == null) {
			instance = new Apple();
			return instance;
		}		
		return instance;
	}

}
