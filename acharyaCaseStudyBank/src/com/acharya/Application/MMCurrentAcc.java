package com.acharya.Application;

import com.acharya.FrameWork.CurrentAcc;

public class MMCurrentAcc extends CurrentAcc{
	
	public MMCurrentAcc(int accNo, String accNm, float accBal, float creditLimit) {
		super(accNo, accNm, accBal, creditLimit);
		
	}

	public void withdraw(float creditLimit) {
		System.out.println("Dear Current account holder your account balance is Rs." + getAccBal() + 
				" and credit limit is Rs." + creditLimit);
	}

	@Override
	public String toString() {
		return "MMCurrentAcc [toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + "]";
	}

	
	
	


}
