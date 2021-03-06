package com.rlvj.creational.factory;

public class Mini extends Car {
	
	private String doors;
	private String motor;
	private String fuel;
	
	public Mini(String doors, String motor, String fuel) {
		this.doors = doors;
		this.motor = motor;
		this.fuel = fuel;
	}

	@Override
	public String getDoors() {
		return this.doors;
	}

	@Override
	public String getMotor() {
		return this.motor;
	}

	@Override
	public String getFuel() {
		return this.fuel;
	}

}
