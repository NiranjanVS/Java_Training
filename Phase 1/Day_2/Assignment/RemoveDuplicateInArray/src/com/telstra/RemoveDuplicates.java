package com.telstra;
import java.util.Arrays;
import java.util.Scanner;

public class RemoveDuplicates {
	
	public static int removeduplicates(int a[], int n)
	{
		if (n == 0 || n == 1)
			return n;

		int[] temp = new int[n];
		int j = 0;
		for (int i = 0; i < n - 1; i++)
			if (a[i] != a[i + 1]) 
				temp[j++] = a[i];
				
		temp[j++] = a[n - 1];
		for (int i = 0; i < j; i++) 
			a[i] = temp[i];
		
		return j;
	}
	
	public static void main(String[] args)
	{
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of Array : ");
		n = sc.nextInt();
		int arr[] = new int[n];
		System.out.print("Enter the Elements of Array : ");
		for(int i=0;i<n;i++)
			arr[i] = sc.nextInt();

		Arrays.sort(arr);
		n = removeduplicates(arr, n);
		for (int i = 0; i < n; i++)
			System.out.print(arr[i] + " ");
	}
}
