package com.example.designs.builder;

/**
 * Created by krishna_hotha on 4/29/15 2015.
 */
public class DrinkPreference {

	private String drinkName;
	private Boolean sugar;
	private Boolean milk;
	private String size;

	public DrinkPreference(String drinkName, Boolean sugar, Boolean milk, String size) {
		this.drinkName = drinkName;
		this.sugar = sugar;
		this.size = size;
		this.milk = milk;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public String getDrinkName() {
		return drinkName;
	}

	public void setDrinkName(String drinkName) {
		this.drinkName = drinkName;
	}

	public Boolean getSugar() {
		return sugar;
	}

	public void setSugar(Boolean sugar) {
		this.sugar = sugar;
	}

	public Boolean getMilk() {
		return milk;
	}

	public void setMilk(Boolean milk) {
		this.milk = milk;
	}
}
