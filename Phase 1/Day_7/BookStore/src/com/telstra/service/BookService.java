package com.telstra.service;

import java.util.ArrayList;

import com.telstra.book.Book;
import com.telstra.book.BookOPImp;

public class BookService {

	public static BookOPImp bop1=new BookOPImp();
	
	public static String addService(int bookId, String bookName, int bookPrice, int units) {
		Book book=new Book(bookId,bookName,bookPrice,units);
		return(bop1.Addbook(book));
	}
	
	public static String getABookService(int bookId) {
		Book book1=bop1.getAbook(bookId);
		if(book1!=null) {
			return(book1.toString());
		}else {
			return("Book not found");    
		}
	}
	
	public static String getAllService(){
		ArrayList<Book> blist=bop1.getAllBook();
		String op = "";
		for(Book book:blist) {
			op=op+"\n"+book.toString();
		}
		return op;
	}
	
	public static String updateService(int bookId, int bookPrice) {
		return(bop1.updateBook(bookId,bookPrice));
	}
	
	public static String deleteService(int bookId) {
		return(bop1.deleteBook(bookId));
	}
	
	public static long inventoryValueService() {
		return bop1.getInventoryValue();
	}
}
