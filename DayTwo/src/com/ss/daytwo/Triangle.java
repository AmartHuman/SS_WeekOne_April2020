package com.ss.daytwo;

public class Triangle implements Shape{
	
	private Double base;
	private Double hight;
	
	public Triangle(Double base, Double hight) {
		this.base = base;
		this.hight = hight;
	}
	
	public Double getBase() {
		return base;
	}
	public void setBase(Double base) {
		this.base = base;
	}
	public Double getHight() {
		return hight;
	}
	public void setHight(Double hight) {
		this.hight = hight;
	}
	
	
	@Override
	public double calculateArea() {
		Double total = base * hight;
		return total;
	}
	@Override
	public void display() {
		Double total = calculateArea();
		System.out.println("|____________________________");
		System.out.println("|Area of a Triangle: "+ total);
		
	}


}
