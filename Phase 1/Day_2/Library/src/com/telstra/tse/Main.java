package com.telstra.tse;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Books book_1 = new Books(100,"Java",300);
		
		System.out.println(book_1);
		
		System.out.println(book_1.getBookName()+"  "+book_1.getBookPrice());

	}

}
