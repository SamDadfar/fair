package com.foods;

import com.ListMenu;
import com.amusement.BumperCars;

public class Fries extends FoodStands {
	public static final double price = ListMenu.Fries.getPrice();
	private static int counter = 0;

	public Fries() {
		name="Fries";
		counter++;
		setTicketCode();
		FoodStands.TotalCounter++;
	}

	public static int getCounter() {
		return counter;
	}

	@Override
	public void sell() {
		System.out.println("selling a Fries");
	}
	@Override 
	public String toString() {
		return "name of object:"+this.name+"\tPrice of object:"+Fries.price;
	}
	private void setTicketCode() {
		ticketCode+=name+counter;
	}
}
