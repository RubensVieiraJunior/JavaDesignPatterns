package com.rlvj.structural.proxy;

public class TestProxy {

	public static void main(String[] args) {
		SystemAccessProxy proxy = new SystemAccessProxy("NotUser");
		try {
			proxy.access("/login");
			proxy.access("/admin");
		} catch (Exception e1) {
			e1.printStackTrace();
		}
		
	}
}
