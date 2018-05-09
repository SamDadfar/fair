package com.test;
import com.*;

public class Test {
	public static void main(String[] args) {
	System.out.println(new BumperCars());	
	System.out.println(new TopSpin());
	
	
	new BumperCars();
	new BumperCars();
	System.out.println(new CashDesk().getNumOfTicket()+"\t"+new CashDesk().getRevenue());
	}
}
