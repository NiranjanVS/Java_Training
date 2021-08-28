package com.telstra.tse;

public class Main {

	public static void main(String[] args) {
		
		int result=0;
		try {
		int n1 = Integer.parseInt(args[0]);
		int n2 = Integer.parseInt(args[1]);
	
		result = n1/n2;
		}catch(ArithmeticException e1) {
			System.out.println("Division By Zero not possible.."+e1.getMessage());
			e1.printStackTrace();
		}catch(NumberFormatException e2) {
			System.out.println("Invalid Inputs.."+e2.getMessage());
			e2.printStackTrace();
		}catch(ArrayIndexOutOfBoundsException e3) {
			System.out.println("No Arguments Passed..."+e3.getMessage());
			e3.printStackTrace();
		}catch(Exception e) {
			System.out.println("Exception Occured..");
		}finally {
			System.out.println("Result : "+result);
		}
		
		System.out.println("Bye Bye..");
	}

}
