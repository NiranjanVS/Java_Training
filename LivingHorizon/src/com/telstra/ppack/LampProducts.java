package com.telstra.ppack;
import java.io.*;
import java.util.Scanner;
import java.util.Map;
import java.util.TreeMap;

import com.telstra.op.Cart;

public class LampProducts extends Product {
	
	Scanner sc = new Scanner(System.in);
	
	Map<Integer,String> catalog = new TreeMap<>();
	Map<Integer,Integer> price = new TreeMap<>();
	
	LampProducts() throws FileNotFoundException
	{
		
		
		Scanner sc1 = new Scanner(new BufferedReader(new FileReader("src\\com\\telstra\\data\\Products\\LampProduct.txt")));
		while(sc1.hasNextLine()) 
		{
			String[] line = sc1.nextLine().split("\n");
			for(int i=0;i<line.length;i++)
			{
				String[] prod = line[i].split(":");
				for(int j=0;j<prod.length;j++)
				{
					catalog.put(Integer.parseInt(prod[0]),prod[1]);
					price.put(Integer.parseInt(prod[0]),Integer.parseInt(prod[2]));
				}
				System.out.println();
				
			}
		
		}
		
		
//		catalog.put(1,"Study Table Lamp");
//		catalog.put(2,"Swing arm Lamp");
//		catalog.put(3, "Piano Lamp");
//		catalog.put(4,"Vintage Lamp");
//		
//		price.put(1, 1000);
//		price.put(2, 1500);
//		price.put(3, 2300);
//		price.put(4, 3000);
		
	}
	
	void showBanner() throws FileNotFoundException
	{
		Scanner sc1 = new Scanner(new BufferedReader(new FileReader("src\\com\\telstra\\data\\Products\\LampProduct.txt")));
		while(sc1.hasNextLine()) 
		{
			String[] line = sc1.nextLine().split("\n");
			System.out.println("|====================================================================|");
			for(int i=0;i<line.length;i++)
			{
				String[] prod = line[i].split(":");
				System.out.println(" | Product Id : " + prod[0] + " | Product Name : " + prod[1]  + " | Price : " + prod[2]);
				System.out.println("|====================================================================|");
			}
		
		}
	}
	
	void getProduct()
	{
		int flag = 0;
		while(flag==0)
		{
			System.out.print("\n\n==> [*] ENTER THE PRODUCT YOU WISH TO PURCHASE : ");
			int choice = sc.nextInt();
			
			if(choice==0)
				flag=1;
			else
			{
				System.out.print("==> [*] ENTER THE QUANTITY FOR PRODUCT : ");
				int quantity = sc.nextInt();
				new Cart().addToCart(catalog.get(choice),price.get(choice),quantity);
			}
				
		}
	}
	
	
	void showCart()
	{
		new Cart().showCart();
	}
	
	
	
}
