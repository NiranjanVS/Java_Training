package com.telstra.tse;

import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		//ReadConsoleIOA RIA = new ReadConsoleIO();
		//RI.readInput();
		//ReadConsoleIOB RIB = new ReadConsoleIOB();
		//System.out.println(RIB.readInput());
		
		ReadConsoleIOC RIC = new ReadConsoleIOC();
		try {
			System.out.println(RIC.readInput());
		}catch(ArithmeticException e1) {
			System.out.println("Division By Zero not possible.."+e1.getMessage());
		}catch(NumberFormatException e2) {
			System.out.println("Invalid Inputs.."+e2.getMessage());
		}catch(ArrayIndexOutOfBoundsException e3) {
			System.out.println("No Arguments Passed..."+e3.getMessage());
		}catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}

}
