package com.rlvj.creational.abstractfactory;

import com.rlvj.creational.factory.Car;

public class CarFactory {

	public static Car getCar(CarAbstractFactory factory) {
		return factory.createCar();
	}
}
