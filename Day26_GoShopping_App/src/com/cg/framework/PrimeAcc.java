package com.cg.framework;

public abstract class PrimeAcc extends ShopAcc
{
	private boolean inPrime;
	static final private float deliveryCharges=0.0f;
	//constructor
	public PrimeAcc(int accNo, String accNm, float charges,boolean isPrime) {
		super(accNo, accNm, charges);
	    this.inPrime=isPrime;
	}
	//method
	public void bookProduct(float charges)
	{
		System.out.println("Account no is "+this.getAccNo()+" Account Name is "+this.getAccNm()+"charges is "+charges);
	}
	@Override
	public String toString() {
		return String.format("PrimeAccount [inPrime=%s]", inPrime);
	}

}
