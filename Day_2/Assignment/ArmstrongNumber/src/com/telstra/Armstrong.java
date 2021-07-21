package com.telstra;

import java.util.Scanner;  
import java.lang.Math;  

public class Armstrong 
{  
	static boolean isArmstrongNumber(int n)   
	{   
		int temp=n, digits=0, last=0, sum=0;         
		while(temp>0)    
		{   
			temp = temp/10;   
			digits++;   
		}   
		temp = n;   
		while(temp>0){   
			last = temp % 10;   
			sum +=  (Math.pow(last, digits));      
			temp = temp/10;   
		}   
		return n==sum;
	}   

	public static void  main(String args[])     
	{     
		int num;   
		Scanner sc= new Scanner(System.in);  
		System.out.print("Enter the number: ");  
		num = sc.nextInt();  
		if(isArmstrongNumber(num))
			System.out.print("Armstrong ");  
		else   
			System.out.print("Not Armstrong ");  
	}   
}  