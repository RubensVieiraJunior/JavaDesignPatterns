package com.rlvj.creational.singleton;

/**
 * -Only one instance;
 * -Public static method to access the instance;
 * -Created only when called;
 * -Thread-safe
 */
public class ThreadSafeResourceClass {

	private static ThreadSafeResourceClass instance;
	
	private ThreadSafeResourceClass() {
		// Creating or using a resource
	}
	
	/**
	 * Thread-safe, but with a little low performance
	 * @return
	 */
	public static synchronized ThreadSafeResourceClass getInstance() {
		if (instance == null) {
			instance = new ThreadSafeResourceClass();
		}
		
		return instance;
	}
	
	/**
	 * Thread-safe, utilizing double check locking
	 * @return
	 */
	public static ThreadSafeResourceClass getInstanceDoubleCheckLocking() {
		if (instance == null) {
			synchronized (ThreadSafeResourceClass.class) {
				if (instance == null) {
					instance = new ThreadSafeResourceClass();
				}
			}
		}
		return instance;
	}
}
