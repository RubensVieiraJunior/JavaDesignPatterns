package com.rlvj.creational.builder;

public class Car {

	//Required
	private String doors;
	private String motor;
	private String fuel;
	
	//Optional
	private String gps;
	private String radio;
	
	private Car(CarBuilder builder) {
		this.doors = builder.doors;
		this.motor = builder.motor;
		this.fuel = builder.fuel;
		this.gps = builder.gps;
	}
	
	public String getDoors() {
		return doors;
	}

	public String getMotor() {
		return motor;
	}

	public String getFuel() {
		return fuel;
	}

	public String getGps() {
		return gps;
	}

	public String getRadio() {
		return radio;
	}

	public static class CarBuilder {

		//Required
		private String doors;
		private String motor;
		private String fuel;
		
		//Optional
		private String gps;
		private String radio;
		
		public CarBuilder(String doors, String motor, String fuel) {
			this.doors = doors;
			this.motor = motor;
			this.fuel = fuel;
		}
		
		public Car build() {
			return new Car(this);
		}

		public CarBuilder setGps(String gps) {
			this.gps = gps;
			return this;
		}

		public CarBuilder setRadio(String radio) {
			this.radio = radio;
			return this;
		}
		
	}

}
