package com.telstra.org;

import com.telstra.emp.*;
import com.telstra.tax.Tax;

public class Main {

	public static void main(String[] args) {
		Employee E = new Employee(1024,"Niranjan V S",50000);
		System.out.println(E.getDetails());
		
		Manager M = new Manager(1025,"Raghavendra",145000,"IT",60);
		System.out.println(M.getDetails());
		
		Programmer P = new Programmer(1026,"Prajwal",55000,7,"Java, NoSQL");
		System.out.println(P.getDetails());
		
		//giving a base class reference to derived class instance
		Employee E2 = new Manager(1027,"Obed",147800,"HR",50);
		System.out.println(E2.getDetails());
		
		//System.out.println(E2.getDepartment()); is not possible
		//cannot access derived class method using base class object
		
		//downcasting
		Manager M2 = (Manager)E2;
		System.out.println(M2.getDepartment());
		
		//Heterogeneous Array but due to IS-A relationship with its Bas class Employee
		Employee[] empArr = new Employee[4];
		empArr[0] = new Manager(1027,"Obed",147800,"HR",50);
		empArr[1] = new Programmer(1026,"Prajwal",55000,7,"Java, NoSQL");;
		empArr[2] = new Manager(1025,"Raghavendra",145000,"IT",60);
		empArr[3] = new Employee(1024,"Niranjan V S",50000);
		
		System.out.println("Details of Employees: ");
		for(Employee e:empArr) {
			System.out.println(e.getDetails()+"  Tax:"+Tax.calculateTax(e));
		}
	}

}
