package com.rlvj.creational.builder;

public class TestBuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Car car = new Car.CarBuilder("2", "Volks 1.3", "Gasoline").build();
		System.out.println(car);
	}

}
