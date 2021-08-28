package com.telstra.tse;

public class Books {
	
	//instance variable , member variable
	// each object/instance will be given the copy of these members to store its state
	
	int bookId;
	String bookName;
	float bookPrice;
	
	//Java provides special function constructor to create instances
	// same name as that of class
	// to give initial state of instances
	//generally public
	//they can be of different type
	// they do not return any value
	
	public Books(int bookId, String bookName, float bookPrice) {
		super();
		this.bookId = bookId;
		this.bookName = bookName;
		this.bookPrice = bookPrice;
	}

	public int getBookId() {
		return bookId;
	}

	public String getBookName() {
		return bookName;
	}

	public float getBookPrice() {
		return bookPrice;
	}

	public void setBookPrice(float bookPrice) {
		this.bookPrice = bookPrice;
	}

	@Override
	public String toString() {
		return "Books [bookId=" + bookId + ", bookName=" + bookName + ", bookPrice=" + bookPrice + "]";
	}

}
