package com.acharya.Application;

import com.acharya.FrameWork.BankFactory;
import com.acharya.FrameWork.CurrentAcc;
import com.acharya.FrameWork.SavingAcc;

public class MMBankFactory extends BankFactory{

	@Override
	public SavingAcc getNewSavingAccount(int AccNo, String accNm, float accBal, boolean isSalaried) {
		MMSavingAcc mmsaving = new MMSavingAcc(AccNo, accNm, accBal, isSalaried);
		return mmsaving;
	}

	@Override
	public CurrentAcc getNewCurrentAccount(int AccNo, String accNm, float accBal, float creditLimit) {
		MMCurrentAcc mmcurrent = new MMCurrentAcc(AccNo, accNm, creditLimit, creditLimit);
		return mmcurrent;
	}

	

	
	}

