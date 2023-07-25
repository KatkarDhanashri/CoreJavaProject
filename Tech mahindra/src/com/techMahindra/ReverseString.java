package com.techMahindra;

 public class ReverseString {
	public static void main(String[] args) {
		String str="Dhanashri",nstr="";
		int l=str.length();
		char ch;
		for(int i=0;i<l;i++) {
			ch=str.charAt(i);
			nstr=ch+nstr;
		}
		System.out.println(nstr);
	}
}
