package com.foods;

import com.ListMenu;
import com.amusement.BumperCars;

public class Sandwiche extends FoodStands {
	public static final double price = ListMenu.Sandwiches.getPrice();
	private static int counter = 0;

	public Sandwiche() {
		name="Sandwiche";
		counter++;
		setTicketCode();
		FoodStands.TotalCounter++;

	}

	public static int getCounter() {
		return counter;
	}

	@Override
	public void sell() {
		System.out.println("selling a Sandwiche");
	}
	@Override 
	public String toString() {
		return "name of object:"+this.name+"\tPrice of object:"+Sandwiche.price;
	}
	private void setTicketCode() {
		ticketCode+=name+counter;
	}
}
