package com.telstra.tse;
import com.telstra.thread.*;

public class Main {

	public static void main(String[] args) {

		ThreadA TA=new ThreadA();
		Thread ta=new Thread(TA);
		ta.setName("ThreadAA");
		ta.start();
		
		ThreadB TB = new ThreadB();
		TB.setName("ThreadBA");
		TB.start();
		
	}
}
