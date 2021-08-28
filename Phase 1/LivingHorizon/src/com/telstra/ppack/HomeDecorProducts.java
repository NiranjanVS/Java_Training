package com.telstra.ppack;
import java.util.Map;
import java.io.*;
import java.util.Scanner;
import java.util.TreeMap;

import com.telstra.op.Cart;
public class HomeDecorProducts extends Product {

Map<Integer,String> catalog = new TreeMap<>();
Map<Integer,Integer> price = new TreeMap<>();

	HomeDecorProducts() throws FileNotFoundException
	{
		
		Scanner sc1 = new Scanner(new BufferedReader(new FileReader("src\\com\\telstra\\data\\Products\\HomeDecorProduct.txt")));
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
		
		
		
//		catalog.put(1,"Fancy Wall Clock");
//		catalog.put(2,"Flower Vase");
//		catalog.put(3, "Wall Art");
//		catalog.put(4,"chandelier");
//		
//		price.put(1, 2000);
//		price.put(2, 1800);
//		price.put(3, 5000);
//		price.put(4, 10000);
		
	}
	
	void showBanner() throws FileNotFoundException
	{
		Scanner sc1 = new Scanner(new BufferedReader(new FileReader("src\\com\\telstra\\data\\Products\\HomeDecorProduct.txt")));
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
