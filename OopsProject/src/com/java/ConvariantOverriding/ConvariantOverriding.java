package com.java.ConvariantOverriding;
//parent class
class Color{
	
	protected Color getcolor() {
		Color c=new Color();
		return c;
	}
}
//child class
class Red extends Color{
	protected Red getcolor() {
		Red c=new Red();
	return c;
	}
}
//child class
class Green extends Color{
	protected Green getcolor() {
		Green c=new Green();
	return c;
	}
}
public class ConvariantOverriding {
	public static void main(String[] args) {
		Color c=new Color();
		System.out.println(c.getcolor());
		Red r=new Red();
		System.out.println(r.getcolor());
		Green g=new Green();
		System.out.println(g.getcolor());
	}
}
