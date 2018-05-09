	package com;

public class HauntedHouse extends AmusementRide{
	private static int counter=0;
	public final static double price=3.20;
	
	public HauntedHouse() {
		this.name="HauntedHouse";
		counter++;
	}
	public static int getCounter() {
		return counter;
	}

	@Override
	public void sell() {
		System.out.println("selling a HauntedHouse");
		
	}

	@Override
	public void run() {
		System.out.println("running a HauntedHouse");
	}
	@Override 
	public String toString() {
		return "name of object:"+this.name+"\tPrice of object:"+HauntedHouse.price;
	}

}
