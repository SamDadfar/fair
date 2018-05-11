package com;

public enum ListMenu {
BumperCars ("1",2.50),
JumpAndSmile ("2",2.25),
MirrorMaze ("3",2.75),
HauntedHouse("4",3.20),
TopSpin("5",2.90),
Tornado("6",5.00),
Fries("11",4.00),
Sandwiches("22",3.45),
Salads ("33",9.00),
Shoarma ("44",5.15),
Total_Tickets("T"),
Revenue("R"),
Exit("Q")
;
	
private double price;;
private String menu;

private ListMenu(String str,double price) {
	this.menu=str;
	this.price=price;
}
private ListMenu(String str) {
	this(str,0);
}
public String getMenu() {
	return menu;
}
public double getPrice() {
	return price;
}

public static void showMenu(){
	String strMenu="MAIN MENU\n\n";
		for(ListMenu m:ListMenu.values()) {
			if(m.getPrice()!=0)
				strMenu+=String.format("Press %1$-2s >>    %2$-15s Price: %3$-4s\n", m.getMenu(),m,m.getPrice());
			else
				strMenu+=String.format("Press %1$-2s >>    %2$-15s\n", m.getMenu(),m);
		}
		System.out.println(strMenu);
	}
}
