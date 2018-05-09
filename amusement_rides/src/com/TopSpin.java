package com;

public class TopSpin extends AmusementRide{

	private static int counter=0;
	public final static double price=2.90;
	
	public TopSpin() {
		this.name="TopSpin";
		counter++;
	}
	
	public static int getCounter() {
		return counter;
	}
	@Override
	public void sell() {
		System.out.println("selling a TopSpin");
	}

	@Override
	public void run() {
		System.out.println("running a TopSpin");

	}
	@Override 
	public String toString() {
		return "name of object:"+this.name+"\tPrice of object:"+TopSpin.price;
	}

}
