package com.example.designs.flyweight.coffee;

/**
 * Created by krishna_hotha on 6/23/15 2015.
 */
public class Order {

	private final int tableNumber;
	private final CoffeeFlavor flavor;

	public Order(int tableNumber, CoffeeFlavor flavor) {
		this.tableNumber = tableNumber;
		this.flavor = flavor;
	}

	public void serve() {
		System.out.println("serving coffee to table" + tableNumber + " " + flavor);
	}
}
