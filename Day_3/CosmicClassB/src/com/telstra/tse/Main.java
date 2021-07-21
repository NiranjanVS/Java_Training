package com.telstra.tse;

public class Main {
	public static void main(String[] args) {
		Date D1 = new Date(21,07,2021);
		Date D2 = new Date(21,07,2021);
		Date D3 = D1; //copying the reference of D1 to D3
		
		//comparing the address location (References)
		System.out.println(D1.equals(D2)); 
		System.out.println(D1.equals(D3));
		
		System.out.println(D1.hashCode());
		System.out.println(D2.hashCode());
		System.out.println(D3.hashCode());
		
		//== always compares only references or addresses
		System.out.println(D1==D2);
		System.out.println(D1==D3);
	}

}
