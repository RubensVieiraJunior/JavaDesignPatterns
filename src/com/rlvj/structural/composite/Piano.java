package com.rlvj.structural.composite;

public class Piano implements Instrument {

	@Override
	public void play(String musicalNote) {
		System.out.println("Playing " + musicalNote + " with " + this.getClass().getSimpleName());
	}

}
