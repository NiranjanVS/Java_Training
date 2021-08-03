package com.telstra.ppack;

import java.io.FileNotFoundException;
import java.util.Scanner;
import com.telstra.op.Cart;

public class Product {
	public static String cusEmail;
	

	Scanner sc = new Scanner(System.in);
	
	
	public Product(String email) {
		cusEmail=email;
		// TODO Auto-generated constructor stub
	}
	
	public Product()
	{
	}


	public void SelectType() throws FileNotFoundException
	{
		
		String banner=
				"|=========================================================|\n"+
				"|                      MENU                               |\n"+
				"|=========================================================|\n"+
				"| [1] Lamp Products        |  [2] Lightning Products      |\n"+
				"|=========================================================|\n"+
				"| [3] Home Decor Products  |  [0] SHOW CART !             |\n"+
				"|=========================================================|\n";
		System.out.println("\n\n" + banner);
		
		System.out.print("==> [*] ENTER THE TYPE OF  PRODUCT YOU WISH TO PURCHASE : ");		
		int choice = sc.nextInt();
		switch(choice)	
		{
			case 1:
				LampProducts l1 = new LampProducts();
				l1.showBanner();
				l1.getProduct();
				//l1.showCart();
				SelectType();
				break;
				
			case 2:
				
				LightingProducts l2 = new LightingProducts();
				l2.showBanner();
				l2.getProduct();
				//l2.showCart();
				SelectType();
				break;
			
			case 3:
				HomeDecorProducts l3 = new HomeDecorProducts();
				l3.showBanner();
				l3.getProduct();
				//l3.showCart();
				SelectType();
				break;
			
			case 0:
				System.out.println("\n\n\n\n\n\n---------------------------------- FINAL CART VALUE !! ");
				new Cart().showCart();
				break;
				
			default:
				System.out.println("default block");
				break;
		}
	}
}
