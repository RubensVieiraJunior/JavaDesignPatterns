package com.rlvj.structural.flyweight;

public class Guitar implements Instrument {

	public Guitar() {
		System.out.println("Creating " + this.getClass().getSimpleName() + " instrument");
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Override
	public void play(String musicalNote) {
		System.out.println("Playing " + musicalNote + " with " + this.getClass().getSimpleName());
	}

}
