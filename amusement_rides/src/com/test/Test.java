package com.test;

import java.util.Scanner;

import com.*;
import com.amusement.*;
import com.cash.CashDesk;
import com.foods.FoodStands;
import com.foods.Salads;
import com.foods.Sandwiche;

public class Test {
	public static void main(String[] args) {
		/*
		 * System.out.println(new BumperCars()); System.out.println(new TopSpin());
		 * 
		 * System.out.println(MenuPrices.Salads.getMenuCode()+"\t"+MenuPrices.Salads.
		 * getPrice());
		 */
		/*
		 * Scanner sc=new Scanner(System.in); while(sc.hasNext()) { String
		 * input=sc.nextLine(); int i=Integer.parseInt(input);
		 * 
		 * System.out.println(i);
		 */
		// ListMenu.showMenu();
	/*	AmusementRide[] a= {new BumperCars(),new JumpAndSmile(),new JumpAndSmile()};
		System.out.println(a.getClass());
		Class<?> aa=a[1].getClass();
		System.out.println(aa.getName());
		if(aa.isInstance(a[0]))
			System.out.println(BumperCars.getCounter());
		else if(aa.isInstance(a[1]))
			System.out.println(JumpAndSmile.getCounter());*/
		AmusementRide ride=null;
		int numRide=0;String strArr[];
		Enjoyable arr[]= {new BumperCars(),new Salads(),new Sandwiche(),new TopSpin(),new BumperCars(),new Tornado(),new TopSpin()};
		
			numRide=((AmusementRide)arr[0]).totalCounter+((FoodStands)arr[1]).TotalCounter;
			
		
		System.out.println(numRide);
		for(Enjoyable aa:arr)
		System.out.println(aa.getTicketCode());
		
	}
}
