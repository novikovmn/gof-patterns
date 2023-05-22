package com.mn.gof.builder;

public class Main {

	public static void main(String[] args) {

		Car car = Car.builder()
				.model("Audi")
				.year(1996)
				.color("Blue")
				.build();

		System.out.println(car);

	}

}
