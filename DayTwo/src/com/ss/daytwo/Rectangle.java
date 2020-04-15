package com.ss.daytwo;

public class Rectangle implements Shape{
	
	private Double length;
	private Double width;
	
	public Rectangle(Double length, Double width) {
		
		this.length = length;
		this.width = width;
		
	}



	public Double getLength() {
		return length;
	}

	public void setLength(Double length) {
		this.length = length;
	}

	public Double getWidth() {
		return width;
	}

	public void setWidth(Double width) {
		this.width = width;
	}
	
	@Override
	public double calculateArea() {
		Double total = length * width;
		return total;
	}

	@Override
	public void display() {
		Double total = calculateArea();
		System.out.println("|____________________________");
		System.out.println("|Area of a Rectangle: "+ total);
		
	}

}
