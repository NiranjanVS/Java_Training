package com.telstra.com;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		// Scanner class instance : Collection framework in Java
		// Stream class : Java IO classes 
		//  main (String[] args)   command line arguments 
		
		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("Enter three numbers values");
//		
//		int n1  = sc.nextInt();
//		double n2 = sc.nextDouble();
//		             
//		int n3 = sc.nextInt();
//		
//		double larg1  = (n1>n2)?n1:n2;
//		double lar = (larg1>n3)?larg1:n3;
//		
//		System.out.println("Largest number:  "+lar);
		
		
		// Type conversion/ casting
		//1. Implicit casting 
		// On default literal are considered as double data type
		
//		float f1 = 13.33F;  // 32 bits
//		// d1 ---> 64 bits 
//		
//		double d1 = f1;  
//		
//		System.out.println("d1 :"+d1);
//		System.out.printf("d1   %.2f", d1);
//		System.out.println();
//		
//		float f2 =(float) d1;  // explicit conversion
//		
//		System.out.println("f2 :"+f2);
		
		// ++i    i++
		
		/*
		 * int i = 10; //int ans1 = ++i; // increment value of i and assign
		 * 
		 * int ans2 = i++ ; // assign and then increment value of i
		 * //System.out.println(ans1+"   "+i); System.out.println(ans2+"   "+i);
		 */
		

		
		/*
		 * for (int i=0;++i<=10;i++) System.out.print("  "+i);
		 */
		
		System.out.println("Enter the number to be reversed:");
		int num = sc.nextInt();
		int revnum = reverseNumber(num);
		System.out.println("Reversed number : "+revnum);
		sc.close();
	}
	
	
	public static int reverseNumber(int n)
	{
		int rem=0,revnum=0;
		
		while(n!=0)
		{
			rem = n%10;
			revnum = revnum*10+rem;
			n = n/10;
		}
		
		return revnum;
	}

}
