package com.mn.gof.singletone;

public class Main {

	public static void main(String[] args) {
		
		Apple apple1 = Apple.getInstance();
		Apple apple2 = Apple.getInstance();
		
		System.out.println(apple1);
		System.out.println(apple2);
		System.out.println(apple1 == apple2);

	}

}
