package com.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.*;
import com.amusement.*;
import com.cash.CashDesk;
import com.foods.Fries;
import com.foods.Salads;
import com.foods.Sandwiche;
import com.foods.Shoarma;

public class Application {
	static AmusementRide game;
	static List<Enjoyable> list=new ArrayList<>();
	static Scanner scan = new Scanner(System.in);
	static CashDesk cash=null;
	static Enjoyable tmp=null;
	
	public static void main(String... args) {
		ListMenu.showMenu();
		while (scan.hasNext()) {
			String input = validInput();

			switch (input) {
			case "1":
				list.add(new BumperCars());
				break;
			case "2":
				list.add(new JumpAndSmile());
				break;
			case "3":
				list.add(new MirrorMaze());
				break;
			case "4":
				list.add(new HauntedHouse());
				break;
			case "5":
				list.add(new TopSpin());
				break;
			case "6":
				list.add(new Tornado());
				break;
			case "11":
				list.add(new Fries());
				break;
			case "22":
				list.add(new Sandwiche());
				break;
			case "33":
				list.add(new Salads());
				break;
			case "44":
				list.add(new Shoarma());
				break;
			case "R":
			case "r":
				cash=new CashDesk(list);
				cash.showRevenue();;
				break;
			case "T":
			case "t":
				cash=new CashDesk(list);
				cash.showTotal();;
				break;
			case "Q":
			case "q":
				System.out.println("thank you. Game has done!");
				scan.close();
				System.exit(0);
			
			}
			
			if(!list.get(list.size()-1).equals(tmp))
				list.get(list.size()-1).run();
			tmp=list.get(list.size()-1);
		}
	}

	public static String validInput() {
		String input = "";
		OUT: while (scan.hasNext()) {
			input = scan.nextLine();
			for (int i = 0; i < ListMenu.values().length; i++) {
				if (input.equalsIgnoreCase(ListMenu.values()[i].getMenu()))
					break OUT;
			}
			if (input != "") {
				try {
					throw new IllegalArgumentException();
				} catch (IllegalArgumentException e) {
					System.out.println("Please choose a right option from menu");
					ListMenu.showMenu();
				}
			}
		}
		return input;
	}

}
