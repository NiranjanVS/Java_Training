package com.telstra.tse;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		List<Integer> ilist = new ArrayList<Integer>();
		ilist.add(10);
		ilist.add(20);
		ilist.add(30);
		
		System.out.println(Test.sumOfList(ilist));
		
		List<Object> olist = new ArrayList<Object>();
		olist.add(10);
		olist.add(20);
		olist.add(30);
		
		System.out.println(Test.sumOfListA(olist));
		
		System.out.println(Test.printList(olist));
		
		System.out.println(Test.maximum(21,19,15));
		
		Student s1=new Student(10,"xyz",78);
        Student s2=new Student(11,"abc",789);
        Student s3=new Student(13,"pqr",768);
       
        System.out.println(Test.maximum(s1,s2,s3));
	}
}
