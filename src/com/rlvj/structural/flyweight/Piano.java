package com.rlvj.structural.flyweight;

public class Piano implements Instrument {

	//Intrinsic property
	private boolean twice;
	
	public Piano(boolean twice) {
		this.twice = twice;
		
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
		
		if (twice) {
			System.out.println("Playing " + musicalNote + " with " + this.getClass().getSimpleName() + " again");
		}
	}

}
