package com.acharya.wrapperclass_Unboxing;

public class Example1 {
	public static void main(String args[]) {
		Integer a = new Integer(3);
		int i = a.intValue(); //converting Integer to int explicitly
		int j = a; //unboxing
		System.out.println(a+ " " + i + " " + j);
	}

}
