package com.foods;

import com.ListMenu;
import com.amusement.BumperCars;

public class Shoarma extends FoodStands {
	public static final double price=ListMenu.Shoarma.getPrice();
	private static int counter=0;
	
	public Shoarma() {
		name="Shoarma";
		counter++;
		setTicketCode();
		FoodStands.TotalCounter++;

	}
	public static int getCounter() {
		return counter;
	}
	@Override
	public void sell() {
		System.out.println("selling a Shoarma");

	}
	@Override 
	public String toString() {
		return "name of object:"+this.name+"\tPrice of object:"+Shoarma.price;
	}
	private void setTicketCode() {
		ticketCode+=name+counter;
	}

}
