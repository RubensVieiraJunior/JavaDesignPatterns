package com.rlvj.structural.proxy;

public class SystemAccessImpl implements SystemAccess {

	@Override
	public void access(String menu) throws Exception {
		System.out.println("Accessing menu:" + menu);
	}

}
