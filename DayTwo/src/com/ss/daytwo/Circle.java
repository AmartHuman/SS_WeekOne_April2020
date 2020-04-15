package com.ss.daytwo;

public class Circle implements Shape{
	
	private Double radius;
	
	public Circle(Double radius) {
		this.radius = radius;
	}

	public Double getRadius() {
		return radius;
	}

	public void setRadius(Double radius) {
		this.radius = radius;
	}

	@Override
	public double calculateArea() {
		Double total = Math.PI*Math.sqrt(radius);
		return total;
	}

	@Override
	public void display() {
		Double total = calculateArea();
		System.out.println("|____________________________");
		System.out.println("|Area of a Circle: "+ total);
	}

}
