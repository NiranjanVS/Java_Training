package com.telstra.tax;

import com.telstra.emp.*;

public class Tax {
	
	public static double calculateTax(Employee E) {
		if(E instanceof Manager) {
			return 14300;
		}
		else if(E instanceof Programmer) {
			return 6000;
		}
		else {
			return 3000;
		}
	}
}
