package com.rlvj.creational.singleton;

/**
 * -Only one instance;
 * -Public static method to access the instance;
 * -Created only when called;
 * -Not Thread-safe
 */
public class LazyResourceClass {

	private static LazyResourceClass instance;
	
	private LazyResourceClass() {
		// Creating or using a resource
	}
	
	public static LazyResourceClass getInstance() {
		if (instance == null) {
			instance = new LazyResourceClass();
		}
		return instance;
	}
}
