package com.qa.inheritance;

public class Runner {
	
public static void main(String[] args) {
	Penguin percy = new Penguin(15, 6);
	percy.swim();
	System.out.println(percy.layEgg());
	System.out.println(percy.getWingSpan());
	
	Pigeon tony = new Pigeon(7, 791);
	tony.fly();
	System.out.println(tony.layEgg());
	System.out.println(tony.getWingSpan());

	Bird pingu = new Penguin(12, 1);
	pingu.layEgg();// do methods connected to bird, not methods connected to penguins
	
	}



}


