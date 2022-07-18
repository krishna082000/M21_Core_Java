package com.cg.encp.pack4;

import com.cg.encp.pack3.HDFC;

public class Encapsulation {

	public static void main(String[] args) {
		com.cg.encp.pack3.HDFC h=new HDFC();
		h.setATM_PIN(1221);
		System.out.println("The ATM PIN is; "+ h.getATM_PIN());
	}

}
