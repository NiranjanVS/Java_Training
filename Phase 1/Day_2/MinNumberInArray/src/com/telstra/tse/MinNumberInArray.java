package com.telstra.tse;

import java.util.Scanner;

public class MinNumberInArray {
	public int minimumNumber(int arr[]) {
		int min = arr[0];
		for(int i=1;i<arr.length;i++) {
			if(arr[i]<min) {
				min = arr[i];
			}
		}
		return min;
	}
	
	public static void main(String[] args) {
		//command line arguments
		Scanner sc = new Scanner(System.in);
		
		int len = Integer.parseInt(args[0]);
		int[] arr = new int[len];
		System.out.println("Enter the element of an array : ");
		for (int i=0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}
		MinNumberInArray m = new MinNumberInArray();
		int x = m.minimumNumber(arr);
		System.out.println("minimum number in a array is "+x);
	}
}
