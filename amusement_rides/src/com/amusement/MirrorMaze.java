package com.amusement;

import com.ListMenu;

public class MirrorMaze extends AmusementRide{

	private static int counter=0;
	public final static double price=ListMenu.MirrorMaze.getPrice();
	
	public MirrorMaze() {
		this.name="MirrorMaze";
		counter++;
		setTicketCode();
		AmusementRide.totalCounter++;
	}
	public static int getCounter() {
		return counter;
	}
	@Override
	public void sell() {
		System.out.println("selling a MirrorMaze");
		
	}

	
	
	@Override 
	public String toString() {
		return "name of object:"+this.name+"\tPrice of object:"+MirrorMaze.price;
	}
	
	private void setTicketCode() {
		ticketCode+=name+counter;
	}
	

}
