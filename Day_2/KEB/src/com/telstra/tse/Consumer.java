package com.telstra.tse;

public class Consumer {
	private int mtNo;
	private int unitConsumed;
	private  int unitPrice;
	
	
	public Consumer(int mtNo, int unitConsumed, int unitPrice) {
		super();
		this.mtNo = mtNo;
		this.unitConsumed = unitConsumed;
		this.unitPrice = unitPrice;
	}

	
	private int calcBill()
	{
		return unitConsumed*unitPrice;
	}

	@Override
	public String toString() {
		return "Consumer [mtNo=" + mtNo + ", unitConsumed=" + unitConsumed + ", unitPrice=" + unitPrice +" Billl amount: "+calcBill()+ "]";
	}
	

}
