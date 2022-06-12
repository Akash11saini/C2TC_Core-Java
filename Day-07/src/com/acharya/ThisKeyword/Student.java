package com.acharya.ThisKeyword; //instance variable

public class Student {
	int rollno;
	String name;
	float fees;
	
	

	public Student(int rollno, String name, float fees) {
		
		this.rollno = rollno;
		this.name = name;
		this.fees = fees;
	}
	void display() {
		System.out.println(rollno + " " + name+ " " + fees);
	}
	

	public static void main(String[] args) {
		Student s1 = new Student(001,"Akash",5000f);
		Student s2 = new Student(002,"Saini",5000f);
		s1.display();
		s2.display();

	}

}
