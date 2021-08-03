package com.telstra.tse;

public class Account {

	private final int AccID;
	private String AccType;
	private double AccBalance = 0;
	//private double CreditAmount = 0;
	
	public Account(int accID, String accType, double accBalance) {
		super();
		AccID = accID;
		AccType = accType;
		AccBalance = accBalance;
	}

	public void deposit(double depositAmt) {
		if(depositAmt<=0) 
			System.out.println("Deposit Not Possible because Deposit Amount is zero or less than zero");
		else {
			AccBalance+=depositAmt;
			System.out.println("Deposit Successful");
			System.out.println("Balance Amount - "+AccBalance);
		}
		
	}
	
	public void withdrawal(double withdrawalAmt) {
		if((AccBalance-withdrawalAmt)<0)
			System.out.println("Insufficient Balance - Withdrawal Not possible");
		else {
			AccBalance-=withdrawalAmt;
			System.out.println("Balance Amount - "+AccBalance);
		}
	}
	
}
