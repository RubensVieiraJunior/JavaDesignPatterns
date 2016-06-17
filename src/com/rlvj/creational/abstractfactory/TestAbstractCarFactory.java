package com.rlvj.creational.abstractfactory;

import com.rlvj.creational.factory.Car;

public class TestAbstractCarFactory {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car mini = CarFactory.getCar(new MiniFactory("2", "bmw 2.0", "gasoline"));
		Car bettle = CarFactory.getCar(new BettleFactory("2", "volks 1.3", "gasoline"));
		
		System.out.println("First:" + mini);
		System.out.println("Bettle:" + bettle);
	}

}
