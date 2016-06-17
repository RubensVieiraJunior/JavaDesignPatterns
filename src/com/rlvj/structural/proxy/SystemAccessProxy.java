package com.rlvj.structural.proxy;

public class SystemAccessProxy implements SystemAccess {

	private boolean admin = false;
	private SystemAccess systemAccess;
	
	public SystemAccessProxy(String user) {
		admin = ("admin".equalsIgnoreCase(user));
		
		systemAccess = new SystemAccessImpl();
	}
	
	@Override
	public void access(String menu) throws Exception {
		if (admin) {
			systemAccess.access(menu);
		} else if (menu.startsWith("/admin")) {
			throw new Exception("Menu admin is not allowed");
		} else {
			systemAccess.access(menu);
		}
	}

}
