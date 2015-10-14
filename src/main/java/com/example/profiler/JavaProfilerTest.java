package com.example.profiler;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by krishna_hotha on 4/2/15.
 */
public class JavaProfilerTest {

	public static void main(String[] args) {

		Map<String, String> mapTest = new HashMap<String, String>();

		int i = 0;
		String key = "hotha";
		while (true) {

			String test = "test1";
			key = key + test + "kk";
			mapTest.put(key, "hhh");
			key = null;

		}

	}

}
