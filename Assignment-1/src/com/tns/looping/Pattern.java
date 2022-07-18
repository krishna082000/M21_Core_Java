package com.tns.looping;

public class Pattern {

	public static void main(String[] args) {
		 int a,b,n=5;
	        for (a = 0; a < n; a++) {     
	            for (b = 0; b <= a; b++) {
	                System.out.print("* ");
	            }
	            System.out.println();
	        }
	    }  
	}
