package com.acharya.wrapperclass_Unboxing;

public class Example2 {

	public static void main(String[] args) {
		Byte b = new Byte((byte) 10);
		Short s = new Short((short) 20);
		Integer i = new Integer(30);
		Long l = new Long(40);
		Float f = new Float(50.0F);
		Double d = new Double(60.0D);
		Character c = new Character('a');
		Boolean b2 = new Boolean(true);
		
		byte bytevalue = b;
		short shortvalue = s;
		int intvalue = i;
		long longvalue = l;
		float floatvalue = f;
		double doublevalue = d;
		char charvalue = c;
		boolean boolvalue = b2;
		
		System.out.println("---Printing primitive values---");
		System.out.println("Byte object: " + bytevalue);
		System.out.println("Short object: " + shortvalue);
		System.out.println("Integer object: " + intvalue);
		System.out.println("Long object: " + longvalue);
		System.out.println("Float object: " + floatvalue);
		System.out.println("Double object: " + doublevalue);
		System.out.println("Character object: " + charvalue);
		System.out.println("Boolean object: " + boolvalue);

	}

}
