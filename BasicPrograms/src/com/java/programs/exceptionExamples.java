package com.java.programs;
class myexception extends Exception{
	int detail;
	myexception(int a){
		detail=a;
	}
	public String toString() {
		return "detail";
	}
}
public class exceptionExamples {
	  static void compute (int a) throws myexception{

        	  throw new myexception(a);
          }
	  public static void main(String[] args) {
		  try {
			  compute(3);
		  }
      catch(myexception e){
          System.out.print("Exception");
      }
}
}
