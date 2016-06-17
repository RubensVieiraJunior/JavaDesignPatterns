package com.rlvj.creational.singleton;

/**
 * -Only one instance;
 * -Public static method to access the instance;
 * -Created only when called;
 * -Thread-safe guaranteed by JLS
 */
public class InnerSingletonResourceClass {

	private InnerSingletonResourceClass() {}
	
	private static class SingletonHelper {
		private static final InnerSingletonResourceClass INSTANCE = new InnerSingletonResourceClass();
	}
	
	public static final InnerSingletonResourceClass getInstance() {
		return SingletonHelper.INSTANCE;
	}
}
