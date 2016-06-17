package com.rlvj.creational.abstractfactory;

import com.rlvj.creational.factory.Car;
import com.rlvj.creational.factory.Mini;

public class MiniFactory implements CarAbstractFactory {

	private String doors;
	private String motor;
	private String fuel;
	
	public MiniFactory(String doors, String motor, String fuel) {
		this.doors = doors;
		this.motor = motor;
		this.fuel = fuel;
	}
	
	@Override
	public Car createCar() {
		return new Mini(doors, motor, fuel);
	}

}
