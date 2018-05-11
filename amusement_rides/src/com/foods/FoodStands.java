package com.foods;

import com.Enjoyable;

public abstract class FoodStands implements Enjoyable {
	
	public String name;
	public static int TotalCounter=0;
	public String ticketCode="#Food#";
	
	public String getTicketCode() {
		return ticketCode;
	}
	public void run() {
		sell();
		System.out.println("running a "+name);
		System.out.println(getTicketCode());
	}
	
}
