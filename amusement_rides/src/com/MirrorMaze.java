package com;

public class MirrorMaze extends AmusementRide{

	private static int counter=0;
	public final static double price=2.75;
	
	public MirrorMaze() {
		this.name="MirrorMaze";
		counter++;
	}
	public static int getCounter() {
		return counter;
	}
	@Override
	public void sell() {
		System.out.println("selling a MirrorMaze");
		
	}

	@Override
	public void run() {
		System.out.println("running a MirrorMaze");
		
	}
	
	@Override 
	public String toString() {
		return "name of object:"+this.name+"\tPrice of object:"+MirrorMaze.price;
	}

}
