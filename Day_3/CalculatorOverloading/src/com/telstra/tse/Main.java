package com.telstra.tse;

public class Main {

	public static void main(String[] args) {
		Summation S1 = new Summation();
		System.out.println(S1.add(1, 2));
		System.out.println(S1.add(1, 3, 3.6));
		System.out.println(S1.add("Niranjan","V S"));
		
		Average A = new Average();
		System.out.println(A.average(10,10,10,10,10));
		System.out.println(A.average(15.5,10,10,11));
	}
}
