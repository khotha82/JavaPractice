package com.example.clousers;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Stream;

/**
 * Created by krishna_hotha on 6/17/15 2015.
 */
public class TestClousers {

	private Integer b = 2;

	private static Stream calculate(Stream stream, Integer a) {

		Function<Integer, Integer> testFunction = (t) -> {
			return t * a;
		};

		return stream.map(testFunction);

	}

	public static void main(String[] args) {
		List list = Arrays.asList(1, 2, 3, 4, 5, 6);

	}
}
