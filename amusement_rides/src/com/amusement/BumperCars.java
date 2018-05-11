package com.amusement;

import com.ListMenu;

public class BumperCars extends AmusementRide{
	private static int counter=0;
	public final static double price=ListMenu.BumperCars.getPrice();
	
	public BumperCars() {
		this.name="BumperCars";
		counter++;
		setTicketCode();
		AmusementRide.totalCounter++;
	}
	public static int getCounter() {
		return counter;
	}
	
	@Override
	public void sell() {
		System.out.println("selling a BumperCars");
	}
	
	@Override 
	public String toString() {
		return "name of object:"+this.name+"\tPrice of object:"+BumperCars.price;
	}
	
	private void setTicketCode() {
		ticketCode+=name+counter;
	}
	
	
	
}
