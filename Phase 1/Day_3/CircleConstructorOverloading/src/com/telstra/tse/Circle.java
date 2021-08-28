package com.telstra.tse;

public class Circle {
	private double radius;
	private String colour;
	
	public Circle() {
		this(3.5,"Blue");
	}
	
	public Circle(double radius, String colour) {
		super();
		this.radius = radius;
		this.colour = colour;
	}
	
	public Circle(double radius) {
		this(radius,"Blue");
	}
	
	public Circle(String colour) {
		this(3.5,colour);
	}

	@Override
	public String toString() {
		return "Circle [radius=" + radius + ", colour=" + colour + "]";
	}
	
}
