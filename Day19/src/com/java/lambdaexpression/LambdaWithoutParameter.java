package com.java.lambdaexpression;
public class LambdaWithoutParameter {

	public static void main(String[] args) {
		Statement s=()-> {return "hello All";};
		System.out.println(s.show());

	}

}