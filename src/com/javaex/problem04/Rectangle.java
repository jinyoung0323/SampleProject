package com.javaex.problem04;

public class Rectangle extends Shape implements Resizeable {
	private double width;
	private double height;
	
	public Rectangle(int countSides, double w, double h) {
		super(countSides);
		this.width = w;
		this.height = h;
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return this.width * this.height;
	}

	@Override
	public double getPerimeter() {
		// TODO Auto-generated method stub
		return (this.width + this.height) * 2;
	}

	@Override
	public void resize(double s) {
		// TODO Auto-generated method stub
		this.height = this.height * s;
		this.width = this.width * s;
		
		System.out.println("new area : " + this.width * this.height);
		System.out.println("new perimeter : " + (this.width + this.height) * 2);
	}
}
