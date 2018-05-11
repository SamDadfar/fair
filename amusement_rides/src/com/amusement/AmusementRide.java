package com.amusement;

import com.Earnable;
import com.Enjoyable;

public abstract class AmusementRide implements Enjoyable {
	public String name;
	public static int totalCounter=0;
	protected String ticketCode="#Ride#";
	
	public void run() {
		sell();
		System.out.println("running a "+name);
		System.out.println(getTicketCode());
	}
	public String getTicketCode() {
		return ticketCode;
	}
	
}
