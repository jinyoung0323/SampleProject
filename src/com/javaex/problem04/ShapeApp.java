package com.javaex.problem04;

import java.util.ArrayList;

public class ShapeApp {

	public static void main(String[] args) {
		ArrayList<Shape> arrayList = new ArrayList<Shape>();
		Rectangle rectangle = new Rectangle(4, 5.0, 6.0);
		RectTriangle rectTriangle = new RectTriangle(3, 6.0, 2.0);
	
		arrayList.add(rectangle);
		arrayList.add(rectTriangle);
		
		for(Shape shape : arrayList) {
			System.out.println("area : " + shape.getArea());
			System.out.println("perimeter : " + shape.getPerimeter());
		}
		System.out.println();
		rectangle.resize(0.5);
		
		
		
	}

}
