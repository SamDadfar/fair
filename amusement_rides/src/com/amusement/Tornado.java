package com.amusement;

import com.ListMenu;

public class Tornado extends AmusementRide{
	private static int counter=0;
	public final static double price=ListMenu.Tornado.getPrice();
	
	public Tornado() {
		this.name="Tornado";
		counter++;
		setTicketCode();
		AmusementRide.totalCounter++;
	}
	public static int getCounter() {
		return counter;
	}
	@Override
	public void sell() {
		System.out.println("selling a Tornado");
		
	}

	
	@Override 
	public String toString() {
		return "name of object:"+this.name+"\tPrice of object:"+Tornado.price;
	}
	
	private void setTicketCode() {
		ticketCode+=name+counter;
	}
	}

