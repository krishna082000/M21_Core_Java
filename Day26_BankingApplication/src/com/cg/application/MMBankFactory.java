package com.cg.application;

import com.cg.framework.BankFactory;
import com.cg.framework.CurrentAcc;
import com.cg.framework.SavingAcc;

public class MMBankFactory extends BankFactory
{

	@Override
	public SavingAcc getNewSavingAcc(int AccNo, String accNm, float accBal, boolean isSalaried) {
		//MMSavingAcc s=new MMSavingAcc(AccNo, accNm, accBal, isSalaried);
		return null;
	}

	@Override
	public CurrentAcc getNewCurrentAcc(int AccNo, String accNm, float accBal, float creditLimit) {
	//MMCurrentAcc m=new MMCurrentAcc(AccNo, accNm, creditLimit, creditLimit);
		return null;
	}

}
