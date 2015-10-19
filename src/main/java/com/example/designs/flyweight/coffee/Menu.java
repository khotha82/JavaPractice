package com.example.designs.flyweight.coffee;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by krishna_hotha on 6/23/15 2015.
 */
public class Menu {

	private Map<String, CoffeeFlavor> stringCoffeeFlavorMap = new HashMap<>();

	public CoffeeFlavor lookUp(String flavorName) {

		if (!stringCoffeeFlavorMap.containsKey(flavorName)) {

			stringCoffeeFlavorMap.put(flavorName, new CoffeeFlavor(flavorName));
		}
		return stringCoffeeFlavorMap.get(flavorName);
	}

	public int noOfFlavors() {
		return stringCoffeeFlavorMap.size();
	}
}
