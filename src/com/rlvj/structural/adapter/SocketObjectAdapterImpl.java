package com.rlvj.structural.adapter;

public class SocketObjectAdapterImpl implements SocketAdapter {

	private Socket socket = new Socket();
	
	@Override
	public Volt get120Volt() {
		return socket.getVolt();
	}

	@Override
	public Volt get12Volt() {
		Volt v = socket.getVolt();
		return convertVolt(v, 10);
	}

	@Override
	public Volt get3Volt() {
		Volt v = socket.getVolt();
		return convertVolt(v, 40);
	}

	private Volt convertVolt(Volt volt, int v) {
		return new Volt(volt.getVolt() / v);
	}
}
