package com.amusement;

import com.ListMenu;

public class JumpAndSmile extends AmusementRide {
	private static int counter=0;
	public final static double price=ListMenu.JumpAndSmile.getPrice();
	
	public JumpAndSmile() {
		this.name="JumpAndSmile";
		counter++;
		setTicketCode();
		AmusementRide.totalCounter++;
	}
	public static int getCounter() {
		return counter;
	}
	
	@Override
	public void sell() {
		System.out.println("selling a JumpAndSmile");
		
	}

	
	@Override 
	public String toString() {
		return "name of object:"+this.name+"\tPrice of object:"+JumpAndSmile.price;
	}
	
	private void setTicketCode() {
		ticketCode+=name+counter;
	}
	

}
