package com.java.BankInterface;

public class BankDemo {

	public static void main(String[] args) {
		Bank s=new SBI();
		System.out.println(s.rateOfInterest());
		Bank b=new BOI();
		System.out.println(b.rateOfInterest());
	}

}
