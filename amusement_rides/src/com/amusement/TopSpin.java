package com.amusement;

import com.ListMenu;

public class TopSpin extends AmusementRide{

	private static int counter=0;
	public final static double price=ListMenu.TopSpin.getPrice();
	
	public TopSpin() {
		this.name="TopSpin";
		counter++;
		setTicketCode();
		AmusementRide.totalCounter++;
	}
	
	public static int getCounter() {
		return counter;
	}
	@Override
	public void sell() {
		System.out.println("selling a TopSpin");
	}


	@Override 
	public String toString() {
		return "name of object:"+this.name+"\tPrice of object:"+TopSpin.price;
	}
	
	private void setTicketCode() {
		ticketCode+=name+counter;
	}
	

}
