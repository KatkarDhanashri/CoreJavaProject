package com.java.Polymoephism;
class Animl {
    void eat()
    {
        System.out.println("eat() method of base class");
        System.out.println("eating.");
    }
}
class Dogg extends Animl{
	 void eat()
	    {
	        System.out.println("eat() method of driver class");
	        System.out.println("Dogg is eating.");
	    }
}
public class MethodOverriding {
	public static void main(String[] args) {
		Dogg d1=new Dogg();
		Animl a=new Animl();
		d1.eat();
		a.eat();
		
		Animl animl=new Dogg();
		animl.eat();
		
	}
}
