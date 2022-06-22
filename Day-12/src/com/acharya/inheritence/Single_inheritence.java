package com.acharya.inheritence;

class Animal {
	void eat()
	{
		System.out.println("eating.....");
	}
}
class Snake extends Animal {
	void hiss()
	{
		System.out.println("hissing.....");
}
}

public class Single_inheritence {

	public static void main(String[] args) {
		Snake d = new Snake();
		d.hiss();
		d.eat();
		

	}

}
