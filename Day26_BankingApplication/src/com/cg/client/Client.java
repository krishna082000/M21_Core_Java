package com.cg.client;

import com.cg.application.MMBankFactory;
import com.cg.application.MMCurrentAcc;
import com.cg.application.MMSavingAcc;
import com.cg.framework.BankFactory;
import com.cg.framework.CurrentAcc;
import com.cg.framework.SavingAcc;

public class Client {

	public static void main(String[] args) {
		@SuppressWarnings("unused")
		BankFactory b=new MMBankFactory();
		SavingAcc s=new MMSavingAcc(7341,"Krishna", 70000, true);
		CurrentAcc c=new MMCurrentAcc(1437," Qualia ",20000, 10000);
		//saving account output
		System.out.println(" Saving Account ");
		s.withdraw(1000);
		//current account
		System.out.println(" Current Account ");
		c.withdraw(2000);
		System.out.println(s);
		System.out.println(c);  
		
		
	}

}
