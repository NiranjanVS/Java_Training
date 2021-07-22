package com.telstra.tse;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadConsoleIOA {
	
	public void readInput(){
		InputStreamReader ir = null;
		BufferedReader br = null;
		String str,str1;
		int result = 0;
		
		ir = new InputStreamReader(System.in);
		br = new BufferedReader(ir);
		
		try {
			System.out.print("Enter the First Integer : ");
			str = br.readLine();
			System.out.print("Enter the Second Integer : ");
			str1 = br.readLine();
			result = Integer.parseInt(str)/Integer.parseInt(str1);
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				System.out.println("Result : "+result);
				ir.close();
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
