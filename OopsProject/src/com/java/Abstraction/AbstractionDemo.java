package com.java.Abstraction;

public class AbstractionDemo {
public static void main(String[] args) {
	Square s=new Square();
	s.calArea();
	s.show();
	
	Rectangle r=new Rectangle();
	r.calArea();
	r.show();
	
	//dynamic binding//runtime poly//late binding
	
	Shape shape=new Square(3.0f);
	shape.calArea();
	shape.show();
}
}
