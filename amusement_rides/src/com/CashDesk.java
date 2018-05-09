package com;
import com.*;

public class CashDesk {
	private int numOfTicket;
	private double revenue;
	public CashDesk() {
		setNumOfTicket();
		setRevenue();
	}
	public int getCountOfTickets() {
		return numOfTicket;
	}

	public void setNumOfTicket() {
		numOfTicket=BumperCars.getCounter()+HauntedHouse.getCounter()+JumpAndSmile.getCounter()+
				MirrorMaze.getCounter()+TopSpin.getCounter()+Tornado.getCounter();
	}
	public int getNumOfTicket() {
		return numOfTicket;
	}
	public void setRevenue() {
		revenue=BumperCars.getCounter()*BumperCars.price+HauntedHouse.getCounter()*HauntedHouse.price+
				Tornado.getCounter()*Tornado.price+TopSpin.getCounter()*TopSpin.getCounter()*TopSpin.price+
				JumpAndSmile.getCounter()*JumpAndSmile.price+MirrorMaze.getCounter()*MirrorMaze.price;
	}
	public double getRevenue() {
		return revenue;
	}

}
