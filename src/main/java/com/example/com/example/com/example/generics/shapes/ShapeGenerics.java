package com.example.com.example.com.example.generics.shapes;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by krishna_hotha on 3/27/15.
 */
public class ShapeGenerics {

	public static void main(String[] args) {

        ShapeGenerics s=new ShapeGenerics();

        List<Shape> listShapes=new ArrayList<>();
        listShapes.add(new Circle());
        listShapes.add(new Rectangle());

        s.drawShape(listShapes);

        List<Circle> circleList=new ArrayList<>();
        listShapes.add(new Circle());
        listShapes.add(new Circle());

        s.drawShape(circleList);
    }

	public void drawShape(List<? extends Shape> list) {

		for (Shape s : list) {
			s.draw();
		}
	}
}
