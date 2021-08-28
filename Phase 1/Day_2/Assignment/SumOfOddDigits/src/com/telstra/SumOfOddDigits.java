package com.telstra;

import java.util.Scanner;

public class SumOfOddDigits{
	
	public static int sumOfOdd(int num) {
		int count=0,temp = num,sum=0;

		while(temp>0) {
			count++;
			temp = temp/10;
		}

		temp = num;
		int arr[] = new int[count];
		for(int i=count-1;i>=0;i--) {
			arr[i] = temp%10;
			temp = temp/10;
		}
		for(int i=0;i<count;i++) {
			if(i%2==0)
				sum+=arr[i];
		}
		
		return sum;
	}
	
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter the Number : ");
		int val = sc.nextInt();
		System.out.print("Sum of Odd Digits : "+sumOfOdd(val));
	}
}
