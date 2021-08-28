package com.telstra.tse;

public class Main {

	public static void main(String[] args) {
		
		Circle C1 = new Circle();
		System.out.println(C1);
		
		Circle C2 = new Circle(4.5,"Red");
		System.out.println(C2);
		
		Circle C3 = new Circle("Brown");
		System.out.println(C3);
		
		Circle C4 = new Circle(6.0);
		System.out.println(C4);
	}

}
