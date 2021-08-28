package com.telstra.book;

public class Book {
	private int bookId;
	private String Bname;
	private int Bprice;
	private int units;


	public Book(int bookId, String bname, int bprice, int units) {
		super();
		this.bookId = bookId;
		Bname = bname;
		Bprice = bprice;
		this.units = units;
	}

	public int getBookId() {
		return bookId;
	}

	public String getBname() {
		return Bname;
	}

	public int getBprice() {
		return Bprice;
	}
	
	public void setBprice(int bprice) {
		Bprice = bprice;
	}

	public int getUnits() {
		return units;
	}

	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", Bname=" + Bname + ", Bprice=" + Bprice + ", units=" + units + "]";
	}
}
