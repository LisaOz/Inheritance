package com.qa.inheritance;

// if we want our class to inherit Bird
// we write extends Bird

// if we want our class to inherit Bird
// we write extends Bird

public class Penguin  extends Bird {
	
	// property
	private int fishEaten;
	// inherited property - wingspan

	// this constructor takes in wingspan AND fisheaten
	
	
	public Penguin(int wingSpan, int fishEaten) {
		super(wingSpan); // wingspan used to make a bird
		this.fishEaten = fishEaten; //fisheaten used to make a penguin
	}
	
	// Getter and setters

	public int getFishEaten() {
		return fishEaten;
	}

	public void setFishEaten(int fishEaten) {
		this.fishEaten = fishEaten;
	}
	public void swim() {
		System.out.println("just keep swimming...");
		
	}

}
