package com.telstra.tse;

public class Average {
	
	public double average(int ...numbers) {
		int sum = 0;
		for(int i:numbers) {
			sum+=i;
		}
		return(sum/numbers.length);
	}
	
	public double average(double d, int ...numbers) {
		double sum = d;
		for(int i:numbers) {
			sum+=i;
		}
		return(sum/numbers.length);
	}

}
