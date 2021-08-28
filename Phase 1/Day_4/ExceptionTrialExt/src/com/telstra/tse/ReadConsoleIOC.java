package com.telstra.tse;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadConsoleIOC {

	public String readInput() throws IOException,NumberFormatException,ArithmeticException{
		//using throws
		InputStreamReader ir = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(ir);
		System.out.print("Enter the First Integer : ");
		String str = br.readLine();
		System.out.print("Enter the Second Integer : ");
		String str1 = br.readLine();
		return("Result : "+Integer.parseInt(str)/Integer.parseInt(str1));
	}
}
