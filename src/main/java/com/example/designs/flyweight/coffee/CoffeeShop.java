package com.example.designs.flyweight.coffee;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by krishna_hotha on 6/23/15 2015.
 */
public class CoffeeShop {

	private List<Order> orderList = new ArrayList<>();
	private final Menu menu=new Menu();

	public void takeOrder(String flavorName,int table) {

		CoffeeFlavor flavour = menu.lookUp(flavorName);
		Order order = new Order(table, flavour);
		orderList.add(order);
	}
	public void service(){

		for(Order order:orderList){
			order.serve();
		}
	}
	String report() {
		return "\ntotal CoffeeFlavour objects made: "
				+ menu.noOfFlavors()+" Total orders made"+orderList.size();
	}


	public static void main(String[] args) {

		CoffeeShop shop = new CoffeeShop();

		shop.takeOrder("Cappuccino", 2);
		shop.takeOrder("Frappe", 1);
		shop.takeOrder("Espresso", 1);
		shop.takeOrder("Frappe", 897);
		shop.takeOrder("Cappuccino", 97);
		shop.takeOrder("Frappe", 3);
		shop.takeOrder("Espresso", 3);
		shop.takeOrder("Cappuccino", 3);
		shop.takeOrder("Espresso", 96);
		shop.takeOrder("Frappe", 552);
		shop.takeOrder("Cappuccino", 121);
		shop.takeOrder("Espresso", 121);

		shop.service();
		System.out.println(shop.report());
	}
}
