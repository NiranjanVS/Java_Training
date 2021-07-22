package com.telstra.tse;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadConsoleIOB {
	
	public String readInput(){
		//try auto close option
		try(InputStreamReader ir = new InputStreamReader(System.in);
				BufferedReader br = new BufferedReader(ir);){
			System.out.print("Enter the First Integer : ");
			String str = br.readLine();
			System.out.print("Enter the Second Integer : ");
			String str1 = br.readLine();
			return("Result : "+Integer.parseInt(str)/Integer.parseInt(str1));
			
		}catch(ArithmeticException e1) {
			return("Division By Zero not possible.."+e1.getMessage());
		}catch(NumberFormatException e2) {
			return("Invalid Inputs.."+e2.getMessage());
		}catch(ArrayIndexOutOfBoundsException e3) {
			return("No Arguments Passed..."+e3.getMessage());
		}catch (IOException e) {
			return(e.getMessage());
		}
	}

}
