package com.acharya.ThisKeyword; //invoke current class constructor

class Employee{
	
	Employee() {
		this(4,6);
		System.out.println("In employee no-arg");
	}
	Employee(int x){
		this();
		System.out.println(x);
	}
	Employee(int y, int z){
		System.out.println(y + " " + z);
	}
}

public class ConstructorCall {

	public static void main(String[] args) {
		Employee e = new Employee(5);

	}

}