package com.cash;

import java.util.List;

import com.*;
import com.amusement.*;
import com.foods.*;

public class CashDesk implements Earnable {
	private int totalTickets = 0;
	private double totalRevenue = 0;
	private List<Enjoyable> mainList;

	public CashDesk(List<Enjoyable> arr) {
		mainList = arr;
		setTotalTickets();
		setTotalRevenue();
	}

	public void showTotal() {
		System.out.println(getTotalTickets());
	}

	public void showRevenue() {
		System.out.println(getTotalRevenue());
	}

	private void setTotalTickets() {
		int countAmusement = 0, countFoodStand = 0;
		for (Enjoyable e : mainList) {
			if (e instanceof AmusementRide)
				countAmusement = ((AmusementRide) e).totalCounter;
			else
				countFoodStand = ((FoodStands) e).TotalCounter;
		}

		totalTickets += countAmusement + countFoodStand;
	}

	private void setTotalRevenue() {
		totalRevenue += BumperCars.getCounter() * BumperCars.price + HauntedHouse.getCounter() * HauntedHouse.price
				+ JumpAndSmile.getCounter() * JumpAndSmile.price + MirrorMaze.getCounter() * MirrorMaze.price
				+ TopSpin.getCounter() * TopSpin.price + Tornado.getCounter() * Tornado.price
				+ Fries.getCounter() * Fries.price + Salads.getCounter() * Salads.price
				+ Sandwiche.getCounter() * Sandwiche.price + Shoarma.getCounter() * Shoarma.price;

	}

	public  int getTotalTickets() {
		return totalTickets;
	}

	
	public  double getTotalRevenue() {
		return totalRevenue;

	}
}
