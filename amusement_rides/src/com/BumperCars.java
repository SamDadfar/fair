package com;

public class BumperCars extends AmusementRide{
	private static int counter=0;
	public final static double price=2.50;
	
	
	public BumperCars() {
		this.name="BumperCars";
		counter++;
	}
	public static int getCounter() {
		return counter;
	}
	
	@Override
	public void sell() {
		System.out.println("selling a BumperCars");
	}

	@Override
	public void run() {
		System.out.println("running a BumperCars");
	}
	
	@Override 
	public String toString() {
		return "name of object:"+this.name+"\tPrice of object:"+BumperCars.price;
	}
	
}
