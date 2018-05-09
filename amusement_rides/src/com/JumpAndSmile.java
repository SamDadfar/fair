package com;

public class JumpAndSmile extends AmusementRide {
	private static int counter=0;
	public final static double price=2.25;
	
	public JumpAndSmile() {
		this.name="JumpAndSmile";
		counter++;
	}
	public static int getCounter() {
		return counter;
	}
	
	@Override
	public void sell() {
		System.out.println("selling a JumpAndSmile");
		
	}

	@Override
	public void run() {
		System.out.println("running a JumpAndSmile");
		
	}
	@Override 
	public String toString() {
		return "name of object:"+this.name+"\tPrice of object:"+JumpAndSmile.price;
	}

}
