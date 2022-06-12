package com.acharya.constructor;

class Employee {
	int id;
	String name;
	float salary;
	Employee() {
		System.out.println("user defined no-arguement" 
		+ "constructor executed");
	}
	void display() {
		System.out.println(id + " " + name+ " " + salary);
	}
}

public class UserDefined_constructor {

	public static void main(String[] args) {
		
		Employee e1 = new Employee();
		Employee e2 = new Employee();
		
		e1.display();
		e2.display();

	}

}
