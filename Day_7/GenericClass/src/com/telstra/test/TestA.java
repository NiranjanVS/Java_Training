package com.telstra.test;

public class TestA {

	public static <T> void printArray(T[] alist) {
		for(T ele:alist) {
			System.out.print(ele+" ");
		}
	}
}
