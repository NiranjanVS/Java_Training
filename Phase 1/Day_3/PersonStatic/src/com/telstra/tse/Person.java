package com.telstra.tse;

public class Person {
	
	//final : once given a value cannot be changed
	private final int PID;
	private String PName;
	private int pAge;
	
	private static int count;
	
	static {
		count=0;
	}
	
	//Non static method cannot be accessed inside a static method, where static methods can be accessed.
	private static int getCount() {
		return(++count);
	}

	public Person(String pName, int pAge) {
		super();
		PID = getCount();
		PName = pName;
		this.pAge = pAge;
	}

	@Override
	public String toString() {
		return "Person [PID=" + PID + ", PName=" + PName + ", pAge=" + pAge + "]";
	}	
	
}
