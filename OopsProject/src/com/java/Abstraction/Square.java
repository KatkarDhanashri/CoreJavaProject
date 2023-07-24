package com.java.Abstraction;

public class Square extends Shape{

	float side;
	public Square() {
		side=2.0f;
	}
	public Square(float side) {
		super();
		this.side = side;
	}

	public void calArea() {
		 this.area=side*side;
	}

}
