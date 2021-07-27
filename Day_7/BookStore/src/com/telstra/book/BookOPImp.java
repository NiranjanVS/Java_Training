package com.telstra.book;

import java.util.ArrayList;
import java.util.HashMap;

public class BookOPImp implements BookOP {

	ArrayList<Book> blist= new ArrayList<Book>();
	
	HashMap<Integer,Integer> bmap = new HashMap<Integer,Integer>();

	@Override
	public String Addbook(Book book) {

		blist.add(book);
		bmap.put(book.getBookId(),book.getBprice()*book.getUnits());
		return "Book added succesfully";
	}

	@Override
	public Book getAbook(int bookid) {

		for(Book book:blist) {
			if(book.getBookId()==bookid) {
				return book;
			}
		}
		return null;
	}

	@Override
	public ArrayList<Book> getAllBook() {
		return blist;
	}

	@Override
	public String deleteBook(int bookid) {
		Book b=getAbook(bookid);
		
		if(b!=null) {
			blist.remove(b);
			bmap.remove(b.getBookId());
			return "Book deleted succesfully";
		}
		return "Book not found for deletion";
	}

	@Override
	public long getInventoryValue() {
		long total =0;
		for(Integer i:bmap.keySet()) {
			total += bmap.get(i);
		}
		return total;
	}

	@Override
	public String updateBook(int bid, int bprice) {
		Book b=getAbook(bid);

		if(b!=null) {
			b.setBprice(bprice);
			bmap.put(b.getBookId(),b.getBprice()*b.getUnits());
			return "Book update succesfully";
		}
		return "Book not found for updation";
	}
}
