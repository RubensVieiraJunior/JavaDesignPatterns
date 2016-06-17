package com.rlvj.creational.singleton;

/**
 * -Only one instance;
 * -Public static method to access the instance;
 * -Created at the time of Class loading.
 */
public class EagerResourceClass {

	private static final EagerResourceClass instance = new EagerResourceClass();
	
	private EagerResourceClass() {
		// Creating or using a resource
	}
	
	public static EagerResourceClass getInstance() {
		return instance;
	}
}
