package com.techMahindra;
import java.util.Scanner;

public class ArmStrongNumber {
	public static void main(String[] args) {
		
		int no;
		System.out.println("Enter no to check: ");
		Scanner s=new Scanner(System.in);
		no=s.nextInt();
		
		int t1=no;
		int leng=0;
		
		while(t1!=0) {
			leng=leng+1;
			t1=t1/10;
		}
		
		int t2=no;
		int arm=0;
		while(t2!=0) {
			int mul=1;
			int rem=t2%10;
			for(int i=1;i<=leng;i++) {
				mul=mul*rem;
			}
			arm=arm+mul;
			t2=t2/10;
		}
		if(arm==no) {
			System.out.println(no+" is Armstrong number");
		}
		else
		{
			System.out.println(no+" is not Armstyrong number");
		}
	}
}