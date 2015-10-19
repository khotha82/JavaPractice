package com.example.designs.builder;

/**
 * Created by krishna_hotha on 4/29/15 2015.
 */
public class BuilderTest {

	public static void main(String[] args) {

		Waiter waiter = new Waiter();
		waiter.setBuilder(new CoffeeBuilder());
		StartBucks startBucks = waiter.construct(new DrinkPreference("Coffee", true, true, "medium"));
		System.out.println(startBucks);

		waiter.setBuilder(new TeaBuilder());

		StartBucks startBucks1 = waiter.construct(new DrinkPreference("Tea", false, true, "large"));
		System.out.println(startBucks1);

	}
}
