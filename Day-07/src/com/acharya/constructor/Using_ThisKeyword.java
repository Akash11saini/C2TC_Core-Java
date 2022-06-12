package com.acharya.constructor;

class Student{
	void display() {
		System.out.println(this);
		
	}
}

public class Using_ThisKeyword {

	public static void main(String[] args) {
		Student s1 = new Student();
		Student s2 = new Student();
		System.out.println("the object reference of s1" + s1);
		System.out.println("the object reference of s1" + s2);
		s1.display();
		s2.display();

	}

}
