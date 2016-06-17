package com.rlvj.creational.abstractfactory;

import com.rlvj.creational.factory.Bettle;
import com.rlvj.creational.factory.Car;

public class BettleFactory implements CarAbstractFactory {

	private String doors;
	private String motor;
	private String fuel;
	
	public BettleFactory(String doors, String motor, String fuel) {
		this.doors = doors;
		this.motor = motor;
		this.fuel = fuel;
	}
	
	@Override
	public Car createCar() {
		return new Bettle(doors, motor, fuel);
	}

}
