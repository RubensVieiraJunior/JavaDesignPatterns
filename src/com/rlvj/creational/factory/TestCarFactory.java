package com.rlvj.creational.factory;

public class TestCarFactory {

	public static void main(String[] args) {
		//Same method returning different instances
		Car mini = CarFactory.getCar("mini", "2", "bmw 2.0", "gasoline");
		Car bettle = CarFactory.getCar("bettle", "2", "volks 1.3", "gasoline");
		
		System.out.println("First:" + mini);
		System.out.println("Second:" + bettle);
	}

}
