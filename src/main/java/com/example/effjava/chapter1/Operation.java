package com.example.effjava.chapter1;

/**
 * Created by krishna_hotha on 6/22/15 2015.
 */
public class Operation {

	public Operation typeOperation(String name) {

		if (name.equals("Krishna")) {

			return new SmallOperation();
		}

		return new BigOperation();

	}

	public void operate() {

	}

}

class SmallOperation extends Operation {

	@Override
	public void operate() {
		System.out.println("small operation nothing to worry");
	}
}

class BigOperation extends Operation {

	@Override
	public void operate() {
		System.out.println("big operation something to worry");
	}

}