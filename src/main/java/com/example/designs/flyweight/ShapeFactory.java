package com.example.designs.flyweight;

import java.util.HashMap;

/**
 * Created by krishna_hotha on 6/23/15 2015.
 */
public class ShapeFactory {

	private static final HashMap<String, Shape> circleMap = new HashMap<>();

	public static Shape getCircle(String color) {

		Shape circle = circleMap.get(color);

		if (circle == null) {

			circle = new Circle(color);
			circleMap.put(color, circle);
			System.out.println("creating color" + color);
		}
		return circle;
	}
}
