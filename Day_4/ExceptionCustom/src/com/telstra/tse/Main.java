package com.telstra.tse;

import com.telstra.exception.InsufficientLeave;

public class Main {

	public static void main(String[] args) {
		Employee E = new Employee(100,12);
		try {
			System.out.println(E.applyLeave(5));
		}catch(InsufficientLeave IL) {
			System.out.println(IL.getMessage());
		}
	}

}
