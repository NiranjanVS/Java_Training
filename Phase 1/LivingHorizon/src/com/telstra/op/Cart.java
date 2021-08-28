package com.telstra.op;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.telstra.ppack.Product;

public class Cart extends Product {


	static List<String> myCart = new ArrayList<>();
	static int finalCartValue=0;
	
	public void addToCart(String prodName,int price,int quantity)
	{
		myCart.add(prodName);
		finalCartValue+= price*quantity;
	}
	
	public void showCart()
	{
		AdminCart();
		System.out.println("\n\n[========================== CART ==========================]");
		for(int i=0;i<myCart.size();i++)
		{
			System.out.println("| =>  " + myCart.get(i));
		}
		System.out.println("|==========================================================|");
		
		System.out.println("|==========================================================|");
		System.out.println("| FINAL CART VALUE : [ " + finalCartValue + "/- ] ");
		System.out.println("|==========================================================|");
		
	}
	
	public void AdminCart()
	{
		FileWriter writer;
		try {
			writer = new FileWriter("src\\com\\telstra\\data\\Billing.txt", true);
			int len = myCart.size();
			writer.write("\n\n\n"+cusEmail+"\n");
			for (int i = 0; i < len; i++) {
				writer.write(myCart.get(i) + "\n");
			}
			writer.write("Final Cart Value:"+finalCartValue);
			writer.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
