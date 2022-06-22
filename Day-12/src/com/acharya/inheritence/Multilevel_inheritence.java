package com.acharya.inheritence;

class Animal1 {
	void eat()
	{
		System.out.println("eating.....");
	}
}
class lion extends Animal1 {
	void bark()
	{
		System.out.println("roaring.....");
	}
}
class BabyDog extends Dog {
	void weep()
	{
		System.out.println("weeping.....");
	}
}
public class Multilevel_inheritence {

	public static void main(String[] args) {
		BabyDog b = new BabyDog();
		b.bark();
		b.eat();
		b.weep();
	}

}
