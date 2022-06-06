package com.qa.inheritance;

public class Bird {
//method to inherit
	
	public static String layEgg() {
		return "Laid an egg";
	}
	

	// property to inherit
	private int wingSpan;
	
	// Create a constructor in my Bird class
	public Bird(int wingSpan) {
		super();
		this.wingSpan = wingSpan;
		
	}


	// Getter and setters 
	public int getWingSpan() {
		return wingSpan;
	}
	public void setWingSpan(int wingSpan) {
		this.wingSpan = wingSpan;
	}
}
	
