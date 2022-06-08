package com.acharya.am1;

public class Test1 {
	
	public int x=5;
	public void display() {
		System.out.println("In display method");
	}

	public static void main(String[] args) {
		Test1 t1 = new Test1();
		System.out.println(t1.x);
		t1.display();

	}

}
