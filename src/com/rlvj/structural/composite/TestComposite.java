package com.rlvj.structural.composite;

public class TestComposite {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Guitar guitar = new Guitar();
		Piano piano = new Piano();
		
		Orquestra orquestra = new Orquestra();
		orquestra.add(guitar);
		orquestra.add(piano);
		
		orquestra.play("Do");
		orquestra.clear();
		
		orquestra.add(new Violin());
		orquestra.play("Re");
	}

}
