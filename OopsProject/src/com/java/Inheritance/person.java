package com.java.Inheritance;

public class person extends VoterId {
	public static void main(String[] args) {
		//single inheritance
		VoterId v=new VoterId();
		v.setName("Dhanashri");
		v.setAdharNo(123431234432l);
		v.setPANNo(435467986750l);
		v.setAddress("at-Dattawadi,pune");
		
		System.out.println(v);
	}
}
