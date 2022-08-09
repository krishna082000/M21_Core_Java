package com.cg.framework;

public abstract class NormalAcc extends ShopAcc
{
	//fields
	private final float deliveryCharges;
	//constructor
	public NormalAcc(int accNo, String accNm, float charges,float deliveryCharges) {
		super(accNo, accNm, charges);
		this.deliveryCharges=deliveryCharges;
	}
	//implimentation to abstract method of shop account here for the normal account 
	public void bookProduct(float charges)
	{
		System.out.println("Account no is "+this.getAccNo()+" Account Name is "+this.getAccNm()+"charges is "+(charges+deliveryCharges));
	}
	@Override
	public String toString() {
		return String.format("NormalAcc [deliveryCharges=%s]", deliveryCharges);
	}

	
}
