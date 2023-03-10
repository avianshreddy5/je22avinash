package com.JDBC;
public class Student {
	int roll;
	String name;
	int yop;
	float cgp;

	public Student(int roll, String name, int yop, float cgp) {
		super();
		this.roll = roll;
		this.name = name;
		this.yop = yop;
		this.cgp = cgp;
	}
}

class StudentApp {
	public static void main(String[] args) throws Exception {
		Student s1 = new Student(101, "avinash", 2022, 7.73f);
		DHandler.insert(s1.roll, s1.name, s1.yop, s1.cgp);
		Student s2 = new Student(102, "ramu", 2022, 8.73f);
		DHandler.insert(s2.roll, s2.name, s2.yop, s2.cgp);
		Student s3 = new Student(103, "karna", 2022, 9.73f);
		DHandler.insert(s3.roll, s3.name, s3.yop, s3.cgp);
	}
}
