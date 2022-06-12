package com.acharya.constructor;

class Employee1 {
	int id;
	String name;
	float salary;
	
	//User Defined no-arg Constructor
	Employee1() {
		System.out.println("user defined no-arguement" 
		+ "constructor executed");
	}
	
	//User Defined parametrized
	Employee1(int i, String n, float s) {
		
		id = i;
		name = n;
		salary = s;
	}

//method
	void display() {
		System.out.println(id + " " + name+ " " + salary);
	}
}

public class UserDefines_parameterizedConstructor {

	public static void main(String[] args) {
		
		Employee1 e1 = new Employee1(111,"Akash",10000f);
		Employee1 e2 = new Employee1();
		
		e1.display();
		e2.display();

	}

}
