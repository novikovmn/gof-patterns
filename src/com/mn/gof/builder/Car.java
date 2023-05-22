package com.mn.gof.builder;

public class Car {
	private int year;
	private String model;
	private String color;

	public Car(int year, String model, String color) {
		super();
		this.year = year;
		this.model = model;
		this.color = color;
	}

	public static CarBuilder builder() {
		return new CarBuilder();
	}

	///////////////////////////////////////////////////////////////////////////
	public static class CarBuilder {
		private int year;
		private String model;
		private String color;

		public CarBuilder() {
			super();
		}

		public CarBuilder year(int year) {
			this.year = year;
			return this;
		}

		public CarBuilder model(String model) {
			this.model = model;
			return this;
		}

		public CarBuilder color(String color) {
			this.color = color;
			return this;
		}
		
		public Car build() {
			return new Car(year, model, color);
		}

	}
	///////////////////////////////////////////////////////////////////////////

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Car [year=" + year + ", model=" + model + ", color=" + color + "]";
	}

}
