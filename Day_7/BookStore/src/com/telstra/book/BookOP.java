package com.telstra.book;

import java.util.ArrayList;

public interface BookOP {

    String Addbook(Book book);
    Book getAbook(int bookid);
    ArrayList<Book> getAllBook();
    String deleteBook(int bookid);
    long getInventoryValue();
    String updateBook(int bid, int bprice);
}
