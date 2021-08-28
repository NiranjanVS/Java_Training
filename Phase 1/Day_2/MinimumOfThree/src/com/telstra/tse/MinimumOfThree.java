package com.telstra.tse;

import java.util.Scanner;

public class MinimumOfThree {
	public static void main(String[] args) {
		
		//int n1=5,n2=20,n3=10;
		
		//Input cam be taken in the following way in Java
		//scanner class instance  : collection framework in Java
		//stream class : Java IO classes
		// main (String[] args) command lines arguments
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		double n2 = sc.nextDouble();
		int n3 = sc.nextInt();
		// print the largest of three numbers using ternary operator
		double k = (n1>n2?n1:n2)>n3?(n1>n2?n1:n2):n3;
		System.out.println("Largest number is: "+k);
	}
}
