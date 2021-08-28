package com.telstra.emp;

public class Manager extends Employee{
	
	private String Department;
	private int EmployeeCount;
	
	public Manager(int EID, String Name, int Salary, String Department, int ECount) {
		super(EID,Name,Salary); //super() constructor chaining : base class constructor evoked 
		this.Department = Department;
		this.EmployeeCount = ECount;
	}

	public String getDetails(){
		return(super.getDetails()+"  "+this.Department+"  "+this.EmployeeCount);
	}

	public String getDepartment() {
		return Department;
	}

	public int getEmployeeCount() {
		return EmployeeCount;
	}

}
