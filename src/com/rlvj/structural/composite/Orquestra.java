package com.rlvj.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Orquestra implements Instrument {

	private List<Instrument> instruments = new ArrayList<Instrument>();
	
	@Override
	public void play(String musicalNote) {

		for (Instrument i : instruments) {
			i.play(musicalNote);
		}	}

	public void add(Instrument instrument) {
		this.instruments.add(instrument);
	}
	
	public void remove(Instrument instrument) {
		this.instruments.remove(instrument);
	}
	
	public void clear() {
		System.out.println("Clearing instruments");
		this.instruments.clear();
	}
}
