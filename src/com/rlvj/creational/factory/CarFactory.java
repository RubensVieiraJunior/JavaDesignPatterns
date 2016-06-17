package com.rlvj.creational.factory;

public class CarFactory {

	public static Car getCar(String type, String doors, String motor, String fuel) {
		
		Car car = null;
		
		if ("Mini".equalsIgnoreCase(type)) car = new Mini(doors, motor, fuel);
		if ("Bettle".equalsIgnoreCase(type)) car = new Bettle(doors, motor, fuel);

		return car;
	}
}
