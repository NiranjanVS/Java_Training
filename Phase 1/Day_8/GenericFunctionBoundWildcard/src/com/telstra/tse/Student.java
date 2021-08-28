package com.telstra.tse;

public class Student implements Comparable<Student>{

	private int d;
	private String name;
	private int marks;


	public Student(int d, String name, int marks) {
		super();
		this.d = d;
		this.name = name;
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Student [d=" + d + ", name=" + name + ", marks=" + marks + "]";
	}

	@Override
	public int compareTo(Student o) {
		if (marks>o.marks) {
			return 1;
		}
		else {
			if(marks==o.marks) {
				return 2;
			}
		}
		return -1;
	}
	
	
}
