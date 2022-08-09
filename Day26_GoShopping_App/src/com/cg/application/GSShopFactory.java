package com.cg.application;

import com.cg.framework.NormalAcc;
import com.cg.framework.PrimeAcc;
import com.cg.framework.ShopFactory;

public class GSShopFactory extends ShopFactory
{

	@Override
	public PrimeAcc getNewPrimeAcc(int AccNo, String accNm, float charges, boolean isPrime) {
	GSPrimeAcc p=new GSPrimeAcc(AccNo,accNm, charges,isPrime);
		return p;
	}

	@Override
	public NormalAcc getNewNormal(int AccNo, String accNm, float charges, boolean isPrime, float deliveryCharges) {
		GSSNormalAcc n=new GSSNormalAcc(AccNo,accNm, charges, deliveryCharges);
		return n;
	}

}
