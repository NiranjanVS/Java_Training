package com.telstra.emp;

public class Employee {
	//private type is only accessible within the class
	//If no access specifiers are mentions it is "default" package friendly
	//protected type is package friendly and also accessible for derived classes in different package
	//public type is accessible for all the classes
	protected int EID;
	protected String Name;
	protected int Salary;
	public Employee(int eID, String name, int salary) {
		super();
		EID = eID;
		Name = name;
		Salary = salary;
	}
	
	public String getDetails() {
		return(EID+"  "+Name+"  "+Salary);
	}

}
