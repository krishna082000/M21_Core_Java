package com.cg.framework;

public abstract class CurrentAcc extends BankAcc
{
	//fields
	private final float creditLimit;
	//private float accBal;
	//Constructor
	public CurrentAcc(int accNo, String accNm, float accBal,float creditLimit) {
		super(accNo, accNm, accBal);
		this.creditLimit=creditLimit;
	}
	//implimentation to abstract method of shop account here for the normal account 
	public void withdraw(float amount)
	{
		float accBal=this.getAccBal();
		 if(amount<=creditLimit) 
		 {
			if(amount<accBal) 
			{
				accBal-=amount;
				this.setAccBal(accBal);
				System.out.println(" Account Name Is: "+this.getAccNm()+", Withdrowed Amount Is : "+amount+", Account Balance Is : "+accBal);
				
			}
			else 
			{
				System.out.println("Enter less amount:");
			}
			
		}
		else 
		{
			System.out.println("Insufficient balance");
		}
	}
	@Override
	public String toString() {
		return String.format("CurrentAcc [creditLimit=%s]", creditLimit);
	}
	

}
