package com.foods;

import com.ListMenu;
import com.amusement.BumperCars;

public class Salads extends FoodStands {
	public static final double price = ListMenu.Salads.getPrice();
	private static int counter = 0;

	public Salads() {
		name="Salads";
		counter++;
		setTicketCode();
		FoodStands.TotalCounter++;

	}

	public static int getCounter() {
		return counter;
	}

	@Override
	public void sell() {
		System.out.println("selling a Salads");

	}
	@Override 
	public String toString() {
		return "name of object:"+this.name+"\tPrice of object:"+Salads.price;
	}
	private void setTicketCode() {
		ticketCode+=name+counter;
	}

}
