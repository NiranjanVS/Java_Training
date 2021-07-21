package com.telstra.emp;

public class Programmer extends Employee {
	
	private int NumOfProjects;
	private String Skills;
	public Programmer(int EID, String Name, int Salary, int NumOfProjects, String Skills) {
		super(EID, Name, Salary);
		this.NumOfProjects = NumOfProjects;
		this.Skills = Skills;
	}
	
	public String getDetails(){
		return(super.getDetails()+"  "+this.NumOfProjects+"  "+this.Skills);
	}

}
