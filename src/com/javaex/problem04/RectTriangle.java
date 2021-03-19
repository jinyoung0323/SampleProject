package com.javaex.problem04;

public class RectTriangle extends Shape {
	private double width;
	private double height;
	
	public RectTriangle(int countSides, double w, double h) {
		super(countSides);
		this.width = w;
		this.height = h;
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return this.width * this.height / 2.0;
	}

	@Override
	public double getPerimeter() {
		// TODO Auto-generated method stub
		return this.width + this.height + (Math.sqrt(Math.pow(width, 2) + (Math.pow(height, 2))));
	}
	
}
