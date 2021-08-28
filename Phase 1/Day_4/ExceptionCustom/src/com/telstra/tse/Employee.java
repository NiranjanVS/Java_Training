package com.telstra.tse;

import com.telstra.exception.InsufficientLeave;

public class Employee {

	private int EID;
	private int LeaveBalance;
	
	public Employee(int EID, int leaveBalance) {
		super();
		this.EID = EID;
		this.LeaveBalance = leaveBalance;
	}
	
	public String applyLeave(int AppliedLeave) throws InsufficientLeave {
		if(LeaveBalance < AppliedLeave)
			throw new InsufficientLeave("Leave not sanctioned : Insufficient leave balanace");
		else
			return("leave sanctioned : Happy Time");
	}
	
}
