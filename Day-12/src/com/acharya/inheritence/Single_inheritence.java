package com.acharya.inheritence;

class Animal {
	void eat()
	{
		System.out.println("eating.....");
	}
}
class Dog extends Animal {
	void bark()
	{
		System.out.println("barking.....");
}
}

public class Single_inheritence {

	public static void main(String[] args) {
		Dog d = new Dog();
		d.bark();
		d.eat();
		

	}

}
