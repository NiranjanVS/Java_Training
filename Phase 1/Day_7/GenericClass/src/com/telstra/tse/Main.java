package com.telstra.tse;

import com.telstra.test.*;

public class Main {

	public static void main(String[] args) {
		/*Test<String,String> ob1 = new Test<String,String>();
		ob1.setOb1("Good");
		ob1.setOb2("Evening");
		System.out.println(ob1);*/
		
		Integer[] arr = {3,5,7,9};
		String[] arra = {"N","I","R","A","N"};
		Product[] arrb = {new Product(10,"A"),new Product(11,"B"),new Product(12,"C")};
		
		TestA.printArray(arr);
		TestA.printArray(arra);
		TestA.printArray(arrb);
	}
}
