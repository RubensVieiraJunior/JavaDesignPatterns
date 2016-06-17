package com.rlvj.creational.singleton;

/**
 * -Only one instance;
 * -Public static method to access the instance;
 * -Created inside a static block;
 */
public class StaticBlockResourceClass {

	private static final StaticBlockResourceClass instance;
	
	static {
		try {
			instance = new StaticBlockResourceClass();
		} catch (Exception e) {
			throw new RuntimeException("");
		}
	}
	
	private StaticBlockResourceClass() {
		// Creating or using a resource
	}
	
	public static StaticBlockResourceClass getInstance() {
		return instance;
	}
}
