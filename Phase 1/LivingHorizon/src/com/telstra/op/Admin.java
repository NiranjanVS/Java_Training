package com.telstra.op;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.telstra.exception.IdNotFound;
import com.telstra.exception.NegativePrice;

public class Admin {
	
	public static void showProducts(String path) throws FileNotFoundException
	{
		Scanner sc1 = new Scanner(new BufferedReader(new FileReader(path)));
		while(sc1.hasNextLine()) 
		{
			String[] line = sc1.nextLine().split("\n");
			for(int i=0;i<line.length;i++)
			{
				String[] prod = line[i].split(":");
				System.out.println("Product Id : [ " + prod[0] + " ] | Product Name : [ " + prod[1]  + " ] | Price : [ " + prod[2] + " ]" );
				System.out.println();
			}
		
		}
	}
	public static void addToFile(String path, int id, String name, int price) throws Exception
	{
		FileOutputStream fout = new FileOutputStream(path,true);
		String toAdd = "\n" + id +":"+name+":"+ price;
		
		char[] ch = toAdd.toCharArray();
		for(char c: ch)
		{
				fout.write(c);
		}
		fout.close();			
	}

	
	public static void addNewProduct() throws Exception 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("|============================================|");
		System.out.println("| [1] LAMP PRODUCTS  | [2] LIGHTING PRODUCTS |");
		System.out.println("|============================================|");
		System.out.println("| [3] HOME DECOR PRODUCTS                    |");
		System.out.println("|============================================|");
		
		System.out.print("\n [*] CHOOSE THE TYPE OF PRODUCT YOU WOULD LIKE TO ADD : ");
		int ch = sc.nextInt();
		System.out.println("[*] ENTER PRODUCT ID : ");
		int id = sc.nextInt();
		
		System.out.println("[*] ENTER PRODUCT NAME : ");
		String name = sc.next();
		int price;
		try {
		System.out.println("[*] ENTER PRODUCT PRICE : ");
		price = sc.nextInt();
		if(price<0)
			throw new NegativePrice("The price cannot be negative");
		}
		catch(NegativePrice np)
		{
			System.out.println(np.getMessage());
			System.out.println("[*] ENTER PRODUCT PRICE : ");
			price = sc.nextInt();
		}
		String path="";
		switch(ch)
		{
			case 1:
				 path = "src\\com\\telstra\\data\\Products\\LampProduct.txt";
				try {
					addToFile(path,id,name,price);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break;
			
			
			case 2:
				 path = "src\\com\\telstra\\data\\Products\\LightingProduct.txt";
				try {
					addToFile(path,id,name,price);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break;
				
			case 3:
				 path = "src\\com\\telstra\\data\\Products\\HomeDecorProduct.txt";
				try {
					addToFile(path,id,name,price);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break;			
		}
		
	}
	
	public static void deleteProduct(String path) throws FileNotFoundException
	{
		List<String> products = new ArrayList<>();
		Scanner sc1 = new Scanner(new BufferedReader(new FileReader(path)));
		Scanner sc = new Scanner(System.in);
		while(sc1.hasNextLine()) 
		{
			String[] line = sc1.nextLine().split("\n");
			for(int i=0;i<line.length;i++)
			{
				products.add(line[i]);
			}
		
		}
		
		for(int i=0;i<products.size();i++)
		{
			int ind = i;
			System.out.println("[ "+ (++ind) + " ]" + "==> " + products.get(i));
		}
		
		System.out.println("[!] ENTER THE PRODUCT ID YOU WISH TO REMOVE : ");
		int prod = sc.nextInt();
		prod = prod-1;
		System.out.println("[!!] REMOVED ==> " + products.get(prod));
		products.remove(prod);
	
		
		System.out.println("\n[->] LIST AFTER REMOVING PRODUCT !! ");
		for(int i=0;i<products.size();i++)
			System.out.println(products.get(i));
		
		FileWriter writer;
		try {
			writer = new FileWriter(path);
			int len = products.size();
			for (int i = 0; i < len; i++) {
				writer.write(products.get(i) + "\n");
			}
			writer.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public static void searchProduct() throws FileNotFoundException, IdNotFound
	{
		try {
		Scanner sc=new Scanner(System.in);
		System.out.println("[*] ENTER PRODUCT ID TO SEARCH: ");
		int id = sc.nextInt();
		boolean PathFlag=true;
		String[] path= {"src\\com\\telstra\\data\\Products\\LampProduct.txt","src\\com\\telstra\\data\\Products\\LightingProduct.txt","src\\com\\telstra\\data\\Products\\HomeDecorProduct.txt"};
		int pathvar=0;
		while(PathFlag && pathvar<3)
		{
			Scanner sc1 = new Scanner(new BufferedReader(new FileReader(path[pathvar])));
			while(sc1.hasNextLine()) 
			{
				String[] line = sc1.nextLine().split("\n");
				for(int i=0;i<line.length;i++)
				{
					String[] prod = line[i].split(":");
					if(Integer.parseInt(prod[0])==id)
					{
						PathFlag=false;
						System.out.println("Product Found!");
						System.out.println("Product Id : [ " + prod[0] + " ] | Product Name : [ " + prod[1]  + " ] | Price : [ " + prod[2] + " ]" );
						System.out.println();
						break;
					}
				}

			}
			pathvar=pathvar+1;
		}
		if (PathFlag==true)
			throw new IdNotFound("ID could not be found!");
		}
		catch(IdNotFound inf)
		{
			System.out.println(inf.getMessage());
		}
	}
	
	public static void showCurrentCart()
	{
		
		try {
			Scanner sc1 = new Scanner(new BufferedReader(new FileReader("src\\com\\telstra\\data\\Billing.txt")));
			while(sc1.hasNextLine()) {
				String line = sc1.nextLine();	
				System.out.println(line);
			}
			sc1.close();
		} 
		catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
