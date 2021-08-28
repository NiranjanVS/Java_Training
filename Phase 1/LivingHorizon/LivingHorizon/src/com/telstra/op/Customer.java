package com.telstra.op;

public class Customer {
	private String name;
	private String pwd;
	private String address;
	
	Customer(String n, String pass){
		name = n;
		pwd = pass;
	}

	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
}

