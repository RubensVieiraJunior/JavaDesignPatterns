package com.rlvj.structural.adapter;

public class TestAdapter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SocketAdapter objectAdapter = new SocketClassAdapterImpl();
		getCorrectVolt(objectAdapter, 3);
		getCorrectVolt(objectAdapter, 12);
		getCorrectVolt(objectAdapter, 120);
		
		SocketAdapter classAdapter = new SocketObjectAdapterImpl();
		getCorrectVolt(classAdapter, 3);
		getCorrectVolt(classAdapter, 12);
		getCorrectVolt(classAdapter, 120);
	}

	private static void getCorrectVolt(SocketAdapter adapter, int volt) {
		switch (volt) {
		case 3 :
			System.out.println(adapter.getClass().getSimpleName() + " for " + volt + " volts:" + adapter.get3Volt().getVolt());
			break;
		case 12 :
			System.out.println(adapter.getClass().getSimpleName() + " for " + volt + " volts:" + adapter.get12Volt().getVolt());
			break;
		case 120 :
			System.out.println(adapter.getClass().getSimpleName() + " for " + volt + " volts:" + adapter.get120Volt().getVolt());
			break;
		default :
			System.out.println(adapter.getClass().getSimpleName() + " for " + volt + " volts:" + adapter.get120Volt().getVolt());
			break;
		}
		
	}
}
