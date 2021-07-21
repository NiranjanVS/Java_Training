package com.telstra.com;

public class Main {
	public static void main(String[] args) {
		Date D1 = new Date(21,07,2021);
		Date D2 = new Date(21,07,2021);
		Date D3 = D1;
		
		System.out.println(D1.equals(D2));
		System.out.println(D1.equals(D3));
		
		System.out.println(D1==D2);
		System.out.println(D1==D3);
	}

}
