package com.example.designs.builder;

/**
 * Created by krishna_hotha on 4/29/15 2015.
 */
public class Waiter {

	private StarBuckBuilder builder;

	public void setBuilder(StarBuckBuilder builder) {
		this.builder = builder;
	}

	public StartBucks construct(DrinkPreference drinkPreference) {

		builder.build(drinkPreference);
		return builder.getStartBucks();

	}

}
