package com.cg.client;

import com.cg.application.GSPrimeAcc;
import com.cg.application.GSSNormalAcc;
import com.cg.application.GSShopFactory;
import com.cg.framework.NormalAcc;
import com.cg.framework.PrimeAcc;
import com.cg.framework.ShopFactory;

public class Client {

	public static void main(String[] args) {
		ShopFactory k=new GSShopFactory();
		PrimeAcc p=new GSPrimeAcc(1234," Krishna ", 1000, true);
		NormalAcc n=new GSSNormalAcc(4321," Queque ", 200, 50);
		//the prime account output
		System.out.println(" Prime Account ");
		p.bookProduct(p.getCharges());
		//the normal account
		System.out.println(" Normal Account ");
		n.bookProduct(n.getCharges());
		System.out.println(p);
		System.out.println(n);  
	}

}
