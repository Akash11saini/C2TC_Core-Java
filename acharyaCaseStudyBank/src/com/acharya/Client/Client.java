package com.acharya.Client;

import com.acharya.Application.MMBankFactory;
import com.acharya.Application.MMCurrentAcc;
import com.acharya.Application.MMSavingAcc;
import com.acharya.FrameWork.BankFactory;
import com.acharya.FrameWork.CurrentAcc;
import com.acharya.FrameWork.SavingAcc;

public class Client {

	public static void main(String[] args) {
		BankFactory bf = new MMBankFactory();
		
		SavingAcc sa = new MMSavingAcc(1, "Akash", 10000, true);
		CurrentAcc ca = new MMCurrentAcc(2, "Saini", 20000, 100000);
		sa.withdraw(sa.getAccBal());
		sa.toString();
		ca.withdraw(ca.getCreditLimit());
		ca.toString();
		

	}

}
