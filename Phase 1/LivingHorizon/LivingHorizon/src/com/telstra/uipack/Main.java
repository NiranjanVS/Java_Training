package com.telstra.uipack;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
import java.util.Map.Entry;

import com.telstra.ppack.LightingProducts;
import com.telstra.ppack.Product;
import com.telstra.op.Admin;

public class Main {

	public static void main(String[] args) throws Exception {

		String banner ="""				
				

 /$$       /$$            /$$                           /$$   /$$                     /$$                              
| $$      |__/           |__/                          | $$  | $$                    |__/                              
| $$       /$$ /$$    /$$ /$$ /$$$$$$$   /$$$$$$       | $$  | $$  /$$$$$$   /$$$$$$  /$$ /$$$$$$$$  /$$$$$$  /$$$$$$$ 
| $$      | $$|  $$  /$$/| $$| $$__  $$ /$$__  $$      | $$$$$$$$ /$$__  $$ /$$__  $$| $$|____ /$$/ /$$__  $$| $$__  $$
| $$      | $$ \\  $$/$$/ | $$| $$  \\ $$| $$  \\ $$      | $$__  $$| $$  \\ $$| $$  \\__/| $$   /$$$$/ | $$  \\ $$| $$  \\ $$
| $$      | $$  \\  $$$/  | $$| $$  | $$| $$  | $$      | $$  | $$| $$  | $$| $$      | $$  /$$__/  | $$  | $$| $$  | $$
| $$$$$$$$| $$   \\  $/   | $$| $$  | $$|  $$$$$$$      | $$  | $$|  $$$$$$/| $$      | $$ /$$$$$$$$|  $$$$$$/| $$  | $$
|________/|__/    \\_/    |__/|__/  |__/ \\____  $$      |__/  |__/ \\______/ |__/      |__/|________/ \\______/ |__/  |__/
                                        /$$  \\ $$                                                                      
                                       |  $$$$$$/                                                                      
                                        \\______/                                                                       

				""";
		
		System.out.println(banner);
		int user, option, flag = 0;
		String email, pwd, name, address;
		while(true) {
			flag = 0;
			System.out.println("\n|--------SELECT USER TYPE--------|");
			System.out.println("|================================|");
			System.out.println("|  [1] CUSTOMER  | [2]  ADMIN    | ");
			System.out.print("|================================|\n==> ");
			Scanner sc = new Scanner(System.in);
			user = sc.nextInt();
			while(true) {
				switch(user) {
				case 1:{
					System.out.println("\n|------SELECT OPERATION TYPE-----|");
					System.out.println("|================================|");
					System.out.println("|   [1] LOGIN    |  [2] SIGN-UP  |");
					System.out.print("|================================|\n==>");
					option = sc.nextInt();
					FileReader fr;
					switch(option) {
					case 1:{
						System.out.println("[!] ENTER E-MAIL ID : ");
						email = sc.next();
						System.out.println("[!] ENTER PASSWORD : ");
						pwd = sc.next();
						flag=CustomerLogin(email,pwd);
						if (flag==1)
								{
								Product p1 = new Product(email);
								try {
									p1.SelectType();
								}
								catch(Exception e)
								{
									System.out.println(e);
								}
								}
						break;
					}
					case 2:{
						
						flag = 1;
						String CusArrSplit[] = new String[4];
						System.out.print("[*] ENTER YOUR NAME : ");
						CusArrSplit[0] = sc.next();
						System.out.print("\n[*] ENTER YOUR E-MAIL ID : ");
						CusArrSplit[1] = sc.next();
						System.out.print("\n[*] ENTER PASSWORD : ");
						CusArrSplit[2] = sc.next();
						System.out.print("\n[*] ENTER YOUR ADDRESS : ");
						CusArrSplit[3] = sc.next();
						CustomerDetailsWrite(CusArrSplit);
						break;
						
						/*flag=AdminLogin(email,pwd);
						AdminControl();
						break;*/
					}
				}
					break;
				}
				case 2:{
					System.out.println("[!] ENTER E-MAIL ID : ");
					email = sc.next();
					System.out.println("[!] ENTER PASSWORD : ");
					pwd = sc.next();
					flag=AdminLogin(email,pwd);
					AdminControl();
					break;
				}
				}
				if(flag == 1) {
					break;
				}
			}
			if(flag == 1) {
				break;
			}
		}

	}

	public static int CustomerLogin(String email, String pwd)
	{
		int flag=0;
		try {
			Scanner sc1 = new Scanner(new BufferedReader(new FileReader("src\\com\\telstra\\data\\CustomerDetails.txt")));
			while(sc1.hasNextLine()) {
				String[] line = sc1.nextLine().split(" ");
				if(email.equals(line[1])) {
					if(pwd.equals(line[2])) {
						System.out.println("Login Successful");
						flag = 1;
						break;
					}
					else {
						System.out.println("Incorrect password");
					}
				}
				else {
					flag = 0;
					continue;
				}
			}	
		}catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return flag;

	}

	public static int AdminLogin(String email, String pwd)
	{
		int flag=0;
		try {
			Scanner sc1 = new Scanner(new BufferedReader(new FileReader("src\\com\\telstra\\data\\AdminDetails.txt")));
			while(sc1.hasNextLine()) {
				String[] line = sc1.nextLine().split(" ");
				if(email.equals(line[1])) {
					if(pwd.equals(line[2])) {
						System.out.println("Login Successful");
						flag = 1;
						break;
					}
					else {
						System.out.println("Incorrect password");
					}
				}
				else {
					flag = 0;
					continue;
				}
			}	
		}catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return flag;
	}

	public static void CustomerDetailsWrite(String[] CusArrSplit)
	{
		FileWriter writer;
		try {
			writer = new FileWriter("src\\com\\telstra\\data\\CustomerDetails.txt");
			int len = CusArrSplit.length;
			for (int i = 0; i < len; i++) {
				writer.write(CusArrSplit[i] + " ");
			}
			writer.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void AdminDetailsWrite(String[] CusArrSplit)
	{
		FileWriter writer;
		try {
			writer = new FileWriter("src\\com\\telstra\\data\\AdminDetails.txt");
			int len = CusArrSplit.length;
			for (int i = 0; i < len; i++) {
				writer.write(CusArrSplit[i] + " ");
			}
			writer.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	
	
	public static void AdminControl() throws Exception
	{
		
		while(true)
		{
		
		String banner ="""
				|================================|
				| [1] SHOW CURRENT PRODUCT LIST  |
				|================================|
				| [2] ADD NEW PRODUCTS           |
				|================================|
				| [3] DELETE PRODUCTS            |
				|================================|
				| [4] SEARCH PRODUCT             |
				|================================|
				| [5] SHOW BILL RECEIPTS         |
				|================================|
				
				""";
		System.out.println(banner);
		System.out.print("\n[*] CHOOSE AN OPTION : ");	
		Scanner sc = new Scanner(System.in);
		int choice = sc.nextInt();
		String path="";
		switch(choice)
		{
			
			case 1:
				System.out.println("|============================================|");
				System.out.println("| [1] LAMP PRODUCTS  | [2] LIGHTING PRODUCTS |");
				System.out.println("|============================================|");
				System.out.println("| [3] HOME DECOR PRODUCTS                    |");
				System.out.println("|============================================|");
				int ch = sc.nextInt();
				switch(ch)
				{
					case 1:
						path="src\\com\\telstra\\data\\Products\\LampProduct.txt";
						Admin.showProducts(path);
						break;
				
					case 2:
						path="src\\com\\telstra\\data\\Products\\LightingProduct.txt";
						Admin.showProducts(path);
						break;
						
					case 3:
						path="src\\com\\telstra\\data\\Products\\HomeDecorProduct.txt";
						Admin.showProducts(path);
						break;
					
					default:
						System.out.println("INVALID OPTION ! ");
						break;
						
				}	
				break;
				
				
			case 2:
				Admin.addNewProduct();
				break;
				
				
				
			case 3:
				System.out.println("|============================================|");
				System.out.println("| [1] LAMP PRODUCTS  | [2] LIGHTING PRODUCTS |");
				System.out.println("|============================================|");
				System.out.println("| [3] HOME DECOR PRODUCTS                    |");
				System.out.println("|============================================|");
				int chh = sc.nextInt();
				switch(chh)
				{
					case 1:
						path="src\\com\\telstra\\data\\Products\\LampProduct.txt";
						Admin.deleteProduct(path);
						break;
				
					case 2:
						path="src\\com\\telstra\\data\\Products\\LightingProduct.txt";
						Admin.deleteProduct(path);
						break;
						
					case 3:
						path="src\\com\\telstra\\data\\Products\\HomeDecorProduct.txt";
						Admin.deleteProduct(path);
						break;
					
					default:
						System.out.println("INVALID OPTION ! ");
						break;
				}
				break;
				
				
				
				
			case 4:
				Admin.searchProduct();
				break;
				
			case 5:
				Admin.showCurrentCart();
				break;
				
			default:
				System.out.println("[*] WRONG OPTION SELECTED !! ");
				break;
		
		}
		
		System.out.println();
	
	}
	}

}