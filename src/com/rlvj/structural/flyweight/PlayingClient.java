package com.rlvj.structural.flyweight;

import com.rlvj.structural.flyweight.InstrumentFactory.InstrumentType;
import com.rlvj.structural.flyweight.InstrumentFactory.MusicalNote;

public class PlayingClient {

	private static final InstrumentType instruments[] = {InstrumentType.STINGS, InstrumentType.STINGS_TWICE, InstrumentType.STRINGS};
	private static final MusicalNote musicalNotes[] = {MusicalNote.DO, MusicalNote.RE, MusicalNote.MI, MusicalNote.FA, MusicalNote.SOL, MusicalNote.LA, MusicalNote.SI};
	
	public PlayingClient() {
		for (int i = 0; i < 3; i++) {
			Instrument instrument = InstrumentFactory.getInstrument(getRandomInstrument());
			instrument.play(getRandomNote().name());
		}
	}
	
	private InstrumentType getRandomInstrument() {
		return instruments[(int) (Math.random() * instruments.length)];
	}
	
	private MusicalNote getRandomNote() {
		return musicalNotes[(int) (Math.random() * musicalNotes.length)];
	}
	
	public static void main(String[] args) {
		new PlayingClient();
	}

}
