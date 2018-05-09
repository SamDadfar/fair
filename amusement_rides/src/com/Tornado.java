package com;

public class Tornado extends AmusementRide{
	private static int counter=0;
	public final static double price=5.00;
	
	public Tornado() {
		this.name="Tornado";
		counter++;
	}
	public static int getCounter() {
		return counter;
	}
	@Override
	public void sell() {
		System.out.println("selling a Tornado");
		
	}

	@Override
	public void run() {
		System.out.println("running a Tornado");
		
	}
	@Override 
	public String toString() {
		return "name of object:"+this.name+"\tPrice of object:"+Tornado.price;
	}
	
	}

