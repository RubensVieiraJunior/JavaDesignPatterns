package com.rlvj.creational.factory;

public abstract class Car {

	public abstract String getDoors();
	public abstract String getMotor();
	public abstract String getFuel();
	
	public String toString() {
		return "Fuel:[" + getFuel() + "] Motor:[" + getMotor() + "] Doors:[" + getDoors() + "]";
	}
}
