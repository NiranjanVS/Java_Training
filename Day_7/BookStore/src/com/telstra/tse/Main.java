package com.telstra.tse;

import java.util.Scanner;

import com.telstra.service.BookService;

public class Main {


	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		while(true){
			System.out.println("***********Choose a option************");
			System.out.println("1. Add a Book");
			System.out.println("2. Get a Book");
			System.out.println("3. List of Books");
			System.out.println("4. Delete a Book");
			System.out.println("5. Update book value");
			System.out.println("6. Get Inventory Value");
			System.out.println("7. Exit");
			System.out.println("***************************************");
			System.out.println("Enter your choice");
			int choice = sc.nextInt();

			switch(choice){
			case 1:{
				System.out.println("Enter the Details of the Book");
				System.out.println("Book ID:");
				int bookid=sc.nextInt();
				System.out.println("Book Name:");
				String bookname=sc.next();
				System.out.println("Book Price :");
				int bookprice=sc.nextInt();
				System.out.println("Book units");
				int bookunit=sc.nextInt();

				
				System.out.println(BookService.addService(bookid, bookname, bookprice, bookunit));
				break;
			}
			case 2:{
				System.out.println("Enter the bookid");
				int bid=sc.nextInt();
				System.out.println(BookService.getABookService(bid));
				break;
			}
			case 3:{
				System.out.println(BookService.getAllService());
				break;
			}
			case 4:{
				System.out.println("Enter the bookid");
				int bid=sc.nextInt();
				System.out.println(BookService.deleteService(bid));
				break;
			}
			case 5:{
				System.out.println("Enter the bookid");
				int bid=sc.nextInt();
				System.out.println("Enter the update price");
				int bprice=sc.nextInt();
				System.out.println(BookService.updateService(bid, bprice));	
				break;
			}
			case 6:{
				System.out.println(BookService.inventoryValueService());
				break;
			}
			default:
				System.out.println("Bye");
				System.exit(0);
			}
		}
	}
}
