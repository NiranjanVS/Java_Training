package com.telstra.tse;

public class Reports implements Showable,Printable {

	@Override
	public String print() {
		return("Welcome to Print !!");
	}

	@Override
	public void show() {
		System.out.println("Welcome to Show !!");
		System.out.println("Count  : "+count);
	}

}
