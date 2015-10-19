package com.example.java8.lamda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by krishna_hotha on 4/8/15.
 */
public class LamdaTest {

	public static void main(String[] args) {

		List<String> namesList = new ArrayList<String>();
		namesList.add("krishna");
		namesList.add("htoha");
		Collections.sort(namesList, (a, b) -> b.compareTo(a));
	}
}
