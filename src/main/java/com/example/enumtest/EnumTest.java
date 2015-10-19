package com.example.enumtest;

/**
 * Created by krishna_hotha on 6/3/15 2015.
 */
public class EnumTest {

	public static void main(String[] args) {

		for (Role r : Role.values())
			System.out.println(r.toString());
	}

	private enum Role {
		S("STUDENT"), I("INSTRUCTOR");
		String type;

		Role(String type) {
			this.type = type;
		}

		public String getType() {
			return type;
		}

		@Override
		public String toString() {
			return type;
		}
	}


}
