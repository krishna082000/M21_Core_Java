package com.cg.framework;

public abstract class ShopFactory
{
	//Abstract class
	abstract public PrimeAcc getNewPrimeAcc(int AccNo, String accNm, float charges, boolean isPrime);
	abstract public NormalAcc getNewNormal(int AccNo, String accNm, float charges, boolean isPrime, float deliveryCharges);
     
}
