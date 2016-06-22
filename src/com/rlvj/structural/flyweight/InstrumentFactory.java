package com.rlvj.structural.flyweight;

import java.util.HashMap;

public class InstrumentFactory {

	private static final HashMap<InstrumentType, Instrument> instruments = new HashMap<InstrumentType, Instrument>();
	
	public static Instrument getInstrument(InstrumentType type) {
		Instrument instrument = instruments.get(type);
		if (instrument == null) {
			if (type.equals(InstrumentType.STRINGS)) {
				instrument = new Guitar();
			} else if (type.equals(InstrumentType.STINGS)) {
				instrument = new Piano(false);
			} else if (type.equals(InstrumentType.STINGS_TWICE)) {
				instrument = new Piano(true);
			}
			
			instruments.put(type, instrument);
		}
		
		return instrument;
	}
	
	public static enum InstrumentType {
		STRINGS, STINGS, STINGS_TWICE
	}
}
