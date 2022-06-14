package com.acharya.Continue;

public class ContinueWhileLoop {

	public static void main(String[] args) {
		int i = 1;
		while(i<=10){ //1<=10 6<=10
			if(i==5){ //5==5
				i++; //6
				continue;
			}
		 System.out.println(i); //1 2 3 4 6...10
		 i++;//2 3 5
		}

	}

}
