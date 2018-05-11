	package com.amusement;

import com.ListMenu;

public class HauntedHouse extends AmusementRide{
	private static int counter=0;
	public final static double price=ListMenu.HauntedHouse.getPrice();
	
	public HauntedHouse() {
		this.name="HauntedHouse";
		counter++;
		setTicketCode();
		AmusementRide.totalCounter++;
	}
	public static int getCounter() {
		return counter;
	}

	@Override
	public void sell() {
		System.out.println("selling a HauntedHouse");
		
	}

	
	@Override 
	public String toString() {
		return "name of object:"+this.name+"\tPrice of object:"+HauntedHouse.price;
	}
	
	private void setTicketCode() {
		ticketCode+=name+counter;
	}
	

}
